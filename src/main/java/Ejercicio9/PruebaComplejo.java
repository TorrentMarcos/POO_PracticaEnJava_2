/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author Marcos
 */

public class PruebaComplejo {
    
    public static void main(String[] args) {
        
        Complejo complejo1 = new Complejo();
        Complejo complejo2 = new Complejo(3,2);
        Complejo resultado = new Complejo();
        
        System.out.println("COMPLEJO 1:");
        System.out.println(complejo1.imprimirNumeroComplejo());
        System.out.println("COMPLEJO 2: ");
        System.out.println(complejo2.imprimirNumeroComplejo());

        // SUMA
        System.out.println("\n** SUMA DE COMPLEJOS ALTERANDO EL ORDEN « MISMOS RESULTADOS » ** ");
        System.out.println("\n\t• A) COMPLEJO 1 + COMPLEJO 2:");
        resultado = complejo1.sumarleComplejo(complejo2);
        System.out.println("\t\t» RESULTADO: " + resultado.imprimirNumeroComplejo());
        System.out.println("\n\t• B) COMPLEJO 2 + COMPLEJO 1:");
        resultado = complejo2.sumarleComplejo(complejo1);
        System.out.println("\t\t» RESULTADO: " + resultado.imprimirNumeroComplejo());
        
        // RESTA
        System.out.println("\n** RESTA DE COMPLEJOS ALTERANDO EL ORDEN « DIFERENTES RESULTADOS » ** ");
        System.out.println("\n\t• A) COMPLEJO 1 - COMPLEJO 2:");
        resultado = complejo1.restarleComplejo(complejo2);
        System.out.println("\t\t» RESULTADO: " + resultado.imprimirNumeroComplejo());
        System.out.println("\n\t• B) COMPLEJO 2 - COMPLEJO 1:");
        resultado = complejo2.restarleComplejo(complejo1);
        System.out.println("\t\t» RESULTADO: " + resultado.imprimirNumeroComplejo());

    }
    
}
