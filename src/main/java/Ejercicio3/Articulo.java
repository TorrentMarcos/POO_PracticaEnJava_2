/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author Marcos
 */

public class Articulo {
    
    // » ATRIBUTOS
    
    private int codArticulo;
    private String nombre;
    private double precio;
    
    // » CONSTRUCTORES
    
    public Articulo(){ // CONSTRUCTOR GENERAL

    }

    public Articulo(int codArticulo, String nombre, double precio) { // CONSTRUCTOR C/TODOS LOS PARÁMETROS
        this.codArticulo = codArticulo;
        this.nombre = nombre;
        setPrecio(precio);
    }
    
    // » GETTERS Y SETTERS

    public int getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(int codArticulo) {
        this.codArticulo = codArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        
        // Realizamos un simple control para evitar aquellos valores inválidos:
        
        if (precio > 0){
            this.precio = precio;
        }
        else{
            this.precio = 0.0;
            System.out.println("El precio debe ser un valor positivo. Valor provisorio auto-seteado: $0");
        }
        
        /* Nuevamente, se remarca la posibilidad de un while indefinido hasta dar con un valor válido.
        En un caso así, podríamos incluso establecer al '0' como un valor válido de 'presunción temporal'
        (que lo admitimos a priori dado que, por ejemplo, todavía el dueño podría no saber el valor real) */
        
    }
    
    // » TO STRING ()

    @Override
    public String toString() {
        return "Cod Artículo: " + codArticulo + " || Nombre: " + nombre + " || Precio: $" + precio;
    }

}
