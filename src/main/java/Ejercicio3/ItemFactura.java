/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Marcos
 */

public class ItemFactura {
    
    // » ATRIBUTOS 
    
    private Articulo articulo;
    private int cantidad;
    private double subtotal;
    
    // » CONSTRUCTORES
    
    public ItemFactura(){ // CONSTRUCTOR GENERAL
        
    }

    public ItemFactura(Articulo articulo, int cantidad) { // CONSTRUCTOR C/ 2 PARÁMETROS. 
        
        this.articulo = articulo;
        
        setCantidad(cantidad);
        // Esto lo controlo directa e internamente a través del método.
        
        this.subtotal = (articulo.getPrecio() * this.cantidad);
        /* Voy a calcularlo directamente acá y dejar el método setSubtotal(double subTotal)
        para cuestiones de "emergencia". Ahora bien, también podría haberse aplicado polimorfismo
        y tener un setSubtotal() que realice un 'this.subtotal = articulo.getPrecio() * this.cantidad'
        */
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
        
        // Realizamos un breve control para la cantidad.
        
        if (cantidad > 0){
            this.cantidad = cantidad;
        }
        else {
            System.out.println("Cantidad menor o igual a '0'. En caso de haberse introducido"
                              + " un valor negativo, la cantidad quedará auto-seteada en '0'");
            this.cantidad = 0;
        }
        
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    // »  TO STRING ()

    @Override
    public String toString() {
        return "\n\t" + articulo + " || Cantidad: " + cantidad + " || Subtotal: " + subtotal;
    }

}
