/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author Marcos
 */

public class ItemResumenSemanal {
    
    // » ATRIBUTOS
    
    private Articulo articulo;
    private int cantidad;
    private double subtotal;
    
    // » CONSTRUCTORES
    
    public ItemResumenSemanal(){    // CONSTRUCTOR GENERAL
        
    }
                                    // CONSTRUCTOR C/ 2 PARÁMETROS.
    public ItemResumenSemanal(Articulo articulo, int cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.subtotal = (articulo.getPrecio() * cantidad);
    }
    
    // » GETTERS & SETTERS

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    // » TO STRING ()

    @Override
    public String toString() {
        return "\n\tArtículo: " + articulo + " || Cantidad: " + cantidad + " || Subtotal: $" + subtotal;
    }

}
