/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Marcos
 */

public class Empleado {
    
    // « ATRIBUTOS »
    
    private String nombre;
    private String apellido;
    private double salarioMensual;
    
    // « CONSTRUCTORES »

    public Empleado() { // CONSTRUCTOR GENERAL

    }

    public Empleado(String nombre, String apellido, double salarioMensual) { // CONSTRUCTOR TODOS LOS PARÁMETROS
    
        this.nombre = nombre;
        this.apellido = apellido;
        
        /* "[...] Si el salario mensual no es positivo, no establezca su valor. [...]" */
        
        setSalarioMensual(salarioMensual);  // Aprovecho y controlo esto desde un setter ().
        /* Nota: Dado que los datos primitivos de Java no pueden ser "null", sólo colocaré
        - en caso de éste ser negativo - el valor del salario en '0' informándole, a su vez,
        lo sucedido al usuario */
        
    }
    
    // « GETTERS & SETTERS »

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        
        if (salarioMensual > 0){ // ¿EL SALARIO ES VÁLIDO?
            this.salarioMensual = salarioMensual; // Sí. Pasamos el valor directamente.
        }
        else {  
            this.salarioMensual = 0; // No. Seteamos su valor en 0 y, a su vez, lo informamos.
            System.out.println("El empleado no puede tener un salario negativo.\n\t» Salario auto-seteado = 0");
        }
        
        /* Nota: También hubiesemos podido utilizar un WHILE que pida indefinidamente el salario
        hasta que éste sea válido. De esta forma, no haría falta auto-setear el atributo en 0. */

    }
    
    // « OTROS MÉTODOS DEFINIDOS POR EL DESARROLLADOR »
    
    public double calcularSalarioAnual(){ 
        return (salarioMensual * 12); 
    }
    
    public void aumentarSalario (double porcentaje){
        salarioMensual+= (salarioMensual * porcentaje) / 100;
    }

    // « TO STRING () »
    
    @Override
    public String toString() {
        return " Empleado [" + "Nombre: " + nombre + " || Apellido: " + apellido + " || Salario mensual: $" + salarioMensual + ']';
    }
    
}
