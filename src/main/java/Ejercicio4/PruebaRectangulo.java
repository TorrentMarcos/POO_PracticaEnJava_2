/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Marcos
 */

public class PruebaRectangulo {
    
    public static void main(String[] args){
        
        // INSTANCIAMOS TRES RECTÁNGULOS PARA PROBAR LOS CONSTRUCTORES Y SUS MÉTODOS ASOCIADOS.
        
        Rectangulo rectangulo1 = new Rectangulo();          // SUS ATRIBUTOS VAN A SER IGUALES A '1'
        Rectangulo rectangulo2 = new Rectangulo(10,15);     // NO SE TENDRÍA QUE "ROMPER". VALORES VÁLIDOS.
        Rectangulo rectangulo3 = new Rectangulo(25,22);     // TENDRÍA QUE ARROJAR UN MENSAJE. VALORES INVÁLIDOS.
        
        System.out.println("\n" + rectangulo1.toString());
        System.out.println(rectangulo2.toString());
        System.out.println(rectangulo3.toString());         // AL "ROMPERSE", EL RECTÁNGULO CONSERVÓ SUS VALORES EN '1'.
        
        // TOMO EL 'RECTÁNGULO 2' (10 x 15) Y PRUEBO CALCULAR EL PERÍMETRO Y EL ÁREA.
        
        System.out.println("\nCÁLCULO DEL PERÍMETRO Y ÁREA DEL 'RECTÁNGULO 2' (10x15)");
        System.out.println("\t• PERÍMETRO: " + rectangulo2.calcularPerimetro());
        System.out.println("\t• ÁREA: " + rectangulo2.calcularArea() + " (u² - en unidades cuadradas)");
        
    }
    
}
