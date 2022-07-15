/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Marcos
 */

public class CuentaDeAhorros {
    
    // » ATRIBUTOS
    
    // 'DE CLASE' (1 p/todos).
    private static float tasaInteresAnual; 
    // 'DE INSTANCIA' (1 copia p/cada instancia u objeto).
    private float saldoAhorros;            
    
    // » CONSTRUCTORES
    
    public CuentaDeAhorros(){   // CONSTRUCTOR GENERAL.
        
    }

                                // CONSTRUCTOR P/ ATRIBUTOS DE INSTANCIA.
    public CuentaDeAhorros(float saldoAhorros) {  
        this.saldoAhorros = saldoAhorros;
    }
    
    // » GETTERS & SETTERS

    public static float getTasaInteresAnual() {
        return tasaInteresAnual;
    }
    
          // EQUIVALENTE al modificarTasalnteres() de la consigna.
    public static void setTasaInteresAnual(float tasaInteresAnual) {
        CuentaDeAhorros.tasaInteresAnual = tasaInteresAnual;
    }

    public float getSaldoAhorros() {
        return saldoAhorros;
    }

    public void setSaldoAhorros(float saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }
    
    // » OTROS MÉTODOS DEFINIDOS POR EL DESARROLLADOR
    
    public void calcularInteresMensual(){
        
        float interesMensual = 0;
        interesMensual = saldoAhorros * ((tasaInteresAnual / 12) / 100);
        saldoAhorros += interesMensual;  
    }
    
    public String mostrarCuentaAhorros(){
        return "» Saldo (ahorros): $" + saldoAhorros
               + "\n\t•Tasa Interés Anual: " + tasaInteresAnual + "%"
               + "\n\t•Tasa Interés Mensual: " + (tasaInteresAnual / 12) + "%"
               + "\n\t•Próximo Interés Mensual: $" + (saldoAhorros * ((tasaInteresAnual / 12) / 100));
    }
    
    // » TO STRING()

    @Override
    public String toString() {
        return "Saldo (ahorros): $" + saldoAhorros;
    }
    
}
