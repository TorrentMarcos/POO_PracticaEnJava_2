/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Marcos
 */
public class PruebaFactura {
    
    public static void main(String[] args) {
        
        // CREAMOS LOS ARTÍCULOS QUE IRÁN EN LA FACTURA.
        
        System.out.println("---------");
        
        Articulo articulo1 = new Articulo(1, "JABÓN PARA ROPA 1 LITRO", 500); // TODO BIEN.
        Articulo articulo2 = new Articulo(2, "SHAMPOO PANTENE 500 ML", -350); // TIENE QUE ARROJAR MENSAJE.
        Articulo articulo3 = new Articulo(3, "GILLETTE PRESTOBARBA x10u", 0); // TIENE QUE ARROJAR MENSAJE.
        
        System.out.println("---------");
        
        // CREAMOS LOS ITEMS QUE ALOJARÁN A LOS ARTÍCULOS JUNTO A SUS RESPECTIVAS CANTIDADES.
        
        ItemFactura item1 = new ItemFactura(articulo1, 2);  // CANTIDAD = 2.  TODO BIEN.
        ItemFactura item2 = new ItemFactura(articulo2, 0);  // CANTIDAD = 0.  TIENE QUE ARROJAR MENSAJE.
        ItemFactura item3 = new ItemFactura(articulo3, -1); // CANTIDAD = -1. TIENE QUE ARROJAR MENSAJE.
        
        System.out.println("---------");
        
        // CREAMOS EL ARRAY LIST DE ITEMS QUE IRÁ EN LA FACTURA Y, A SU VEZ, AGREGAMOS LOS ITEMS QUE TENEMOS.

        ArrayList<ItemFactura> articulos = new ArrayList<>();
        
        articulos.add(item1);
        articulos.add(item2);
        articulos.add(item3);
        
        // CREAMOS UNA SIMPLE FECHA PARA NUESTRA FACTURA.
        
        Date fecha1 = new Date();
        
        // CREAMOS LA FACTURA YA TENIENDO TODOS LOS COMPONENTES NECESARIOS PARA LA MISMA.
        
        Factura factura1 = new Factura (1, "ALMACÉN PEPITO", fecha1, articulos);
        
        // TESTEAMOS LA CONSTRUCCIÓN
        
        System.out.println("\n" + factura1.toString() + "\n");
 
    }
    
}
