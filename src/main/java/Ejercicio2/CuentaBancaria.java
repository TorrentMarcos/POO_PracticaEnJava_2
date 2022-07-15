/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Marcos
 */

public class CuentaBancaria {
    
    // » ATRIBUTOS
    
    private double saldo;
    private int tipoDeInteres; // Que también lo podría entender como "tipo de cuenta".
    
    /* NOTACIONES PARA 'tipoDeInteres' (los siguientes valores definidos han
    sido inventados sólo con la finalidad de abordar este ejercicio):
    
       ■ 1 - Cuenta Universal Gratuita (CUG) | 0% de interés.
       ■ 2 - Caja de Ahorros                 | 3% de interés.
       ■ 3 - Cuenta corriente                | 7% de interés
       ■ 4 - Cuenta sueldo / cuenta de la seguridad social. | 0% de interés
    */
    
    // » CONSTRUCTORES
    
    public CuentaBancaria(){ // CONSTRUCTOR GENERAL
        
    }
    
    public CuentaBancaria(int tipoDeInteres){ // CUENTA NUEVA S/SALDO.
        this.saldo = 0;
        this.tipoDeInteres = tipoDeInteres;
    }

    public CuentaBancaria(double saldo, int tipoDeInteres) { // CUENTA NUEVA C/SALDO.
        this.saldo = saldo;
        this.tipoDeInteres = tipoDeInteres;
        /* Nota: Ambas variables podrían realizar un control interno
        en sus SETTERS para evitar datos inválidos. */
    }
    
    // » GETTERS & SETTERS

    // ¿No vendría a ser el equivalente de SaldoActual () (método sugerido en la consigna)?
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getTipoDeInteres() {
        return tipoDeInteres;
    }

    // ¿No vendría a ser el equivalente de EstablecerTipoInteres() (método sugerido en la consigna)?
    public void setTipoDeInteres(int tipoDeInteres) { 
        this.tipoDeInteres = tipoDeInteres;
    }
    
    // « OTROS MÉTODOS DEFINIDOS POR EL DESARROLLADOR »
    
    public void ingresarDinero(double dinero){
        
        if (dinero > 0) {
            saldo+= dinero; 
        }
        else{
            System.out.println("No puede ingresar cantidades menores o iguales a '0'");
        }
        
        /* También podríamos crear un while que pida indefinidamente el monto
        de dinero a ingresar hasta que éste sea válido (supongamos > = 0) */ 
        
    }
    
    public void retirarDinero(double dinero){
        
        if (dinero <= saldo){
            saldo -= dinero; 
        }
        else{
            System.out.println("El monto que intenta retirar es superior al total de su saldo");
            System.out.println("\t Saldo actual: $" + getSaldo());
        }
        
        /* Nuevamente, acá podríamos haber hecho un while que pida indefindamente
        el monto a retirar hasta que éste sea válido (< = saldo). Ni hablar si,
        además, hubiese un límite de extracción diario regido por el tipo de
        cuenta. Ahí nuestro 'if' tendría una doble condición. */
        
        /* Nota: Otra cuestión es que también hubiesemos podido concebir todo este proceso
        como una función y no como un void dado que, podría ser perfectamente posible,
        que se "devuelva" un valor a retirar en base a lo que sucedió. Por ejemplo,
        return dinero; (si salió todo bien) o return 0; (sí se quiere sacar más de lo
        disponible). 
        */
        
    }
    
    public void abonarInteres(){ 
        
        /* Por 'intereses', yo entiendo que hacemos referencia a:
        
            “El precio por el uso de una unidad de capital, en una unidad de tiempo” 
                (Definición de: https://www.wina.com.ar/)

            Por lo tanto, se entendería como una "bonificación" del banco hacia
            el cliente por hacer uso del propio dinero en beneficio de la entidad. */
        
        switch (tipoDeInteres){
            
            case 2:
                saldo += saldo * 0.03;
                break;

            case 3:
                saldo += saldo * 0.07;
                break;
                
            default: // Abarcaría, entre otros, los casos 1 y 4 que no reciben intereses.

        }
      
    }
    
    // » TO STRING()

    @Override
    public String toString() {
        return "Cuenta Bancaria [" + "Saldo= $" + saldo + " || Tipo de interés= " + tipoDeInteres + ']';
    }
 
}
