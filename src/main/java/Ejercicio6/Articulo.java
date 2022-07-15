/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author Marcos
 */

public class Articulo {
    
    // » ATRIBUTOS
    
    private int codArticulo;
    private String descripcion;  // No se solicita, pero se considera relevante.
    private double precio;
    
    // » CONSTRUCTORES

    public Articulo() { // CONSTRUCTOR GENERAL
    }
                        // CONSTRUCTOR C/ TODOS LOS PARÁMETROS.
    public Articulo(int codArticulo, String descripcion, double precio) {
        this.codArticulo = codArticulo;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    // » GETTERS & SETTERS
    
    /* Nota: Con intención de simplificar un poco, se han obviado todos los
    "verificadores" y/o controles potencialmente realizables a través de
    estos métodos. Ejemplo: verificar que el código de artículo sea > 0.*/

    public int getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(int codArticulo) {
        this.codArticulo = codArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    // » TO STRING ()

    @Override
    public String toString() {
        return "Cód. Artículo: " + codArticulo + " || Descripcion: " + descripcion + " || Precio: $" + precio;
    }

}
