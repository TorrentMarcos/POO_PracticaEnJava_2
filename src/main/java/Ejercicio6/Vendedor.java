/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author Marcos
 */

public class Vendedor {
    
    // » ATRIBUTOS
    
    // Simplificando:
    
    private int codVendedor;
    private double sueldoSemanal = 2000;
    private double comisionVentaSemanal = 6;
    
    // También podría poner el nombre, el DNI, el teléfono, etc.
    
    // » CONSTRUCTORES

    public Vendedor() { // CONSTRUCTOR GENERAL
    }

    public Vendedor(int codVendedor) { // CONSTRUCTOR C/ 1 PARÁMETRO
        this.codVendedor = codVendedor;
    }
    
                                       // CONSTRUCTOR C/ TODOS LOS PARÁMETROS
                                       // (Para algún caso "excepcional").
    public Vendedor (int codVendedor, double sueldoSemanal, double comisionVentaSemanal){
        
        this.codVendedor = codVendedor;
        this.sueldoSemanal = sueldoSemanal;
        this.comisionVentaSemanal = comisionVentaSemanal;
    }
    
    // » GETTERS & SETTERS
    
    /* Nota: Nuevamente, se obviarán los chequeos de variables a fin de
    simplificar un poco la resolución de la consigna. */

    public int getCodVendedor() {
        return codVendedor;
    }

    public void setCodVendedor(int codVendedor) {
        this.codVendedor = codVendedor;
    }

    public double getSueldoSemanal() {
        return sueldoSemanal;
    }

    public void setSueldoSemanal(double sueldoSemanal) {
        this.sueldoSemanal = sueldoSemanal;
    }

    public double getComisionVentaSemanal() {
        return comisionVentaSemanal;
    }

    public void setComisionVentaSemanal(double comisionVentaSemanal) {
        this.comisionVentaSemanal = comisionVentaSemanal;
    }
    
    // » TO STRING ()

    @Override
    public String toString() {
        return "Cód. vendedor: " + codVendedor + " || Sueldo semanal: $" + sueldoSemanal + " || Comisión semanal p/ventas: %" + comisionVentaSemanal;
    }

}
