/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

import java.util.ArrayList;

/**
 *
 * @author Marcos
 */

public class PruebaResumen {
    
    public static void main(String[] args) {
        
        // CREAMOS LOS ELEMENTOS NECESARIOS PARA PROBAR NUESTRO 'RESUMEN SEMANAL'
        
        // Un vendedor.
        
        Vendedor vendedor1 = new Vendedor(1); // Cód. vendedor = 1. El sueldo y la comisión ya están seteadas.
        
        // Algunos artículos.
        
        Articulo articulo1 = new Articulo(1, "NOTEBOOK LENOVO 4212-X", 7239.99);
        Articulo articulo2 = new Articulo(2, "NOTEBOOK LENOVO 133-C", 9129.75);
        Articulo articulo3 = new Articulo(3, "NOTEBOOK LENOVO i500", 6899.95);
        Articulo articulo4 = new Articulo(4, "NOTEBOOK LENOVO k4500", 13150.89);
        
        // Los ítems del resumen que contendrán los artículos y sus cantidades vendidas.
        
        ItemResumenSemanal item1 = new ItemResumenSemanal(articulo1, 2); // Subtotal = $14479.98
        ItemResumenSemanal item2 = new ItemResumenSemanal(articulo2, 1); // Subtotal = $9129.75
        ItemResumenSemanal item3 = new ItemResumenSemanal(articulo3, 4); // Subtotal = $27599.8
        ItemResumenSemanal item4 = new ItemResumenSemanal(articulo4, 1); // Subtotal = $13150.89
        
                                                                         // Total = $64360.42
        
        // El ArrayList que contendrá a todos estos ítems (básicamente, el detalle del resumen).                                                                          
                                                                                    
        ArrayList <ItemResumenSemanal> detalle = new ArrayList();
        detalle.add(item1);
        detalle.add(item2);
        detalle.add(item3);
        detalle.add(item4);
        
        // Finalmente, el 'RESUMEN SEMANAL'.
        
        ResumenSemanal resumen1 = new ResumenSemanal(vendedor1, detalle);
        System.out.println(resumen1.toString());

    }
    
}
