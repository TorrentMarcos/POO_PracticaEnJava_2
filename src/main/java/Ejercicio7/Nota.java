/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author Marcos
 */

public class Nota {
    
    // » ATRIBUTOS
    
    int numVendedor;
    int numProducto;
    double precioProd;
    
    // » CONSTRUCTORES

    public Nota() {          // CONSTRUCTOR GENERAL
    }

                             // CONSTRUCTOR C/ TODOS LOS PARÁMETROS
    public Nota(int numVendedor, int numProducto, double precioProd) {
        this.numVendedor = numVendedor;
        this.numProducto = numProducto;
        this.precioProd = precioProd;
    }
    
    // » GETTERS & SETTERS

    public int getNumVendedor() {
        return numVendedor;
    }

    public void setNumVendedor(int numVendedor) {
        this.numVendedor = numVendedor;
    }

    public int getNumProducto() {
        return numProducto;
    }

    public void setNumProducto(int numProducto) {
        this.numProducto = numProducto;
    }

    public double getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(double precioProd) {
        this.precioProd = precioProd;
    }
    
    // » TO STRING ()

    @Override
    public String toString() {
        return "N° Vendedor: " + numVendedor + " || N° Producto: " + numProducto + " || Precio: $" + precioProd;
    }
    
    
    
    
    
    
    
}
