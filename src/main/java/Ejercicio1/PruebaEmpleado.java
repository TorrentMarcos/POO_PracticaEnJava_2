/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Marcos
 */

public class PruebaEmpleado {
    
    public static void main(String[] args) {
        
        // SALARIO POSITIVO (lo seteará directo).
        Empleado empleado1 = new Empleado("Harry", "Potter", 100000);     
        // SALARIO NEGATIVO (informará la invalidez del valor y, a su vez, que lo seteará en 0).
        Empleado empleado2 = new Empleado("Albus", "Dumbledore", -72000); 
        
        // Aprovecho para mostrarlos y ver, de paso, cómo respondió el constructor.
        System.out.println("\n ***** EMPLEADOS *****");
        System.out.println(empleado1.toString());
        System.out.println("---");
        System.out.println(empleado2.toString());
        System.out.println("******************\n");

        // Aumentamos los salarios de los empleados en un 10%.
        empleado1.aumentarSalario(10);
        empleado2.aumentarSalario(10);
        
        // Mostramos, ahora sí, el salario anual de cada empleado (de paso mostramos el mensual para verificar todo).
        System.out.println("SALARIO MENSUAL: " + empleado1.getSalarioMensual() + "|| SALARIO ANUAL: " + empleado1.calcularSalarioAnual());
        System.out.println("SALARIO MENSUAL: " + empleado2.getSalarioMensual() + "|| SALARIO ANUAL: " + empleado2.calcularSalarioAnual());

    }
    
}
