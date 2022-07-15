/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Marcos
 */
public class PruebaCuenta {
    
    public static void main(String[] args) {
        
        // PROBAMOS LOS DIFERENTES CONSTRUCTORES
        
        CuentaBancaria cuenta1 = new CuentaBancaria();
        CuentaBancaria cuenta2 = new CuentaBancaria(2);
        CuentaBancaria cuenta3 = new CuentaBancaria (2000, 3);
        
        System.out.println("**** CUENTAS CREADAS ****");
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println(cuenta3.toString());
        System.out.println("********\n");
        
        // PROBAMOS INGRESAR DINERO
        cuenta1.ingresarDinero(4000);
        cuenta2.ingresarDinero(-1000); // TIENE QUE ARROJAR UN MENSAJE.
        cuenta3.ingresarDinero(0);     // TIENE QUE ARROJAR UN MENSAJE.
        
        System.out.println("\n **** POST-INGRESO DE DINERO ****");
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println(cuenta3.toString());
        System.out.println("********\n");
        
        // PROBAMOS RETIRAR DINERO
        cuenta1.retirarDinero(0);       // SALDO = 4000 || RETIRA = 0 || TODO BIEN, pese a que esto puede pulirse.
        cuenta2.retirarDinero(100);     // SALDO = 0 || RETIRA = 100 || TIENE QUE ARROJAR UN MENSAJE.
        cuenta3.retirarDinero(1500);    // SALDO = 2000 || RETIRA = 1500 || TODO BIEN.
        
        System.out.println("\n **** POST-RETIRO DE DINERO ****");
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println(cuenta3.toString());
        System.out.println("********\n"); 
        
        // PROBAMOS ABONAR INTERESES
        
        cuenta1.abonarInteres();    // 0% DE INTERESES
        cuenta2.abonarInteres();    // 3% DE INTERESES
        cuenta3.abonarInteres();    // 7% DE INTERESES
        
        System.out.println("\n **** POST-ABONO DE INTERESES ****");
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());
        System.out.println(cuenta3.toString());
        System.out.println("********\n"); 

    }
    
}
