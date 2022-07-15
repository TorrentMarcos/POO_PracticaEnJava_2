/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

import java.util.ArrayList;

/**
 *
 * @author Marcos
 */

public class LeerNotasMes {
    
    public static void main(String[] args) {
        
        // ALERTA: CÓDIGO SUPER RUDIMENTARIO.
        // Ideal: Crear una clase con métodos static y simplificar el 'main'.
        
        // ------ DEFINICIÓN DE VARIABLES
        
        // ArrayList para simular una lista amplia de Notas.
        ArrayList<Nota> notasMes = new ArrayList();

        // Matriz dónde guardaré y ordenaré la relación producto / vendedor.
        double[][] ventas = new double[6][5]; // Agrego una fila y columna extra para guardar los totales.
        double totalFila = 0;                 // Auxiliar para ir calculando el total de una fila.
        double totalColumna = 0;              // Auxiliar para ir calculando el total de una columna.
        
        // ------ CREACIÓN "RANDOM" DE Notas.
            /* Cod. vendedor = Gestionado por 'i' || Cod. Prod = Gestionado por 'j' || Precio = (i*j).
            Nota: Se está dando por hecho que todos los códigos arrancan en '1' y se incrementan en 1 unidad.*/
            
        for (int i = 0; i < 4; i++){        // Por cada uno de los 4 vendedores.
            for (int j = 0; j < 5; j++){    // Hago una nota de cada uno de los 5 productos.
                notasMes.add(new Nota(i+1, j+1, (i+1)*(j+1)));
                System.out.println("VEND: " + (i+1) + " || PROD: " + (j+1) + " || PRECIO (i*j): " + ((i+1)*(j+1)));
            }
        }
        
        // ------ YA TENEMOS LA ENTRADA - LA LISTA - CON TODAS LAS Notas. 
            // Las acomodo en la matriz. PATRÓN CLAVE: VENTAS [NUMPROD - 1] [NUM VENDEDOR - 1] = PRECIO.
        
        for (int i = 0; i < notasMes.size(); i++){
            ventas[notasMes.get(i).getNumProducto() -1][notasMes.get(i).getNumVendedor() -1] = notasMes.get(i).getPrecioProd();
        }
        
        // ------ TENIENDO LA MATRIZ ORGANIZADA, SERÁ AHORA DE CALCULAR LOS TOTALES.
        
        // Totales por fila.
        
        for (int i = 0; i < 5 ; i++){
            for (int j = 0; j < 4; j++){   
                totalFila+= ventas[i][j];
            }
            ventas[i][4] = totalFila;
            totalFila = 0;
        }
        
        // Totales por columna.
        
        for (int j = 0; j < 4; j++){
            for (int i = 0; i < 5; i++){
               totalColumna+= ventas[i][j]; 
            }
            ventas[5][j] = totalColumna;
            totalColumna = 0;
        }
        
        // ------ MATRIZ LLENA Y ORGANIZADA. AHORA INTENTAREMOS REPRESENTARLA "TABULARMENTE".
        
        System.out.println("-------------------------------------------------"); // ENCABEZADO DE TABLA.
        System.out.printf("%1s %6s %7s %7s %7s %8s", "P/V", "V1", "V2", "V3", "V4", "TOT");
        
        for (int i = 0; i < 6; i++){        // PARA TODAS LAS FILAS
            System.out.println();           // Línea nueva.
            for (int j = 0; j < 5; j++){    // PARA LAS COLUMNAS.
                if ((j == 0) && (i < 5)){           // ¿PRIMER COLUMNA DE FILAS QUE NO SON LA ÚLTIMA?
                    System.out.printf("P"+(i+1)+"\t" + ventas[i][j]); // También mostramos el N° de producto.
                }
                else if ((j == 0) && (i == 5)){     // ¿PRIMER COLUMNA DE LA ÚLTIMA FILA? 
                    System.out.printf("TOT \t" + ventas[i][j]); // También mostramos la palabra "TOT".
                }
                else{                          
                    if ((j == 4) && (i == 5)){      // ¿ÚLTIMA COLUMNA DE LA ÚLTIMA FILA?
                        System.out.println("\tX");      // Ocultamos el número y, en su lugar, ponemos "X".
                    }
                    else{                           // RESTO DE LAS COLUMNAS
                        System.out.printf("\t" + ventas[i][j]);
                    }
                }
            }
        }
        System.out.println("-------------------------------------------------"); // PIE DE TABLA.
        
    }
    
}