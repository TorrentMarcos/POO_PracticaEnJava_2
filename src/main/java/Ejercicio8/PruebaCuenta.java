/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Marcos
 */

public class PruebaCuenta { // VER COMENTARIOS SOBRE INTERÉS NOMINAL VS EFECTIVO.
    
    public static void main(String[] args) {
        
        // » CREAMOS LAS DOS CUENTAS DE AHORRO.
        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(20000);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(30000);
        
        // ESTABLECEMOS LA TASA DE INTERÉS ANUAL EN 4%
        CuentaDeAhorros.setTasaInteresAnual(4);    /* ESTO, EN REALIDAD, 
        VENDRÍA A SER LO QUE SE CONOCE COMO 'TASA DE INTERÉS NOMINAL' */
        
        // Mostramos los datos base referidos a nuestras cuentas.
        System.out.println("** MOSTRAMOS LAS CUENTAS EN SU 'ESTADO BASE' **");
        System.out.println("\n--- CUENTA 1: ");
        System.out.println(ahorrador1.mostrarCuentaAhorros());
        System.out.println(" --- CUENTA 2: ");
        System.out.println(ahorrador2.mostrarCuentaAhorros());
        System.out.println("");
        
        /* SI VOY APLICANDO EL INTERÉS MENSUAL DURANTE TODO EL AÑO, ESTO -
        SIN EMBARGO - REFLEJARÁ LA 'TASA EFECTIVA' (MAYOR A LA NOMINAL) */
        System.out.println("------------------------- APLICACIÓN INT. MENSUAL");
        for (int i = 0; i < 12; i++){ 
            System.out.println(" * MES: " + (i+1));
            ahorrador1.calcularInteresMensual();
            System.out.println("\t» CUENTA 1: " + ahorrador1.toString());
            ahorrador2.calcularInteresMensual();
            System.out.println("\t» CUENTA 2: " + ahorrador2.toString());
        } // TASA NOMINAL: 4.0 || TASA EFECTIVA: 4.07415429%
        System.out.println("-------------------------");
          
        /* "Ambos tipos de tasa de interés coinciden si se establece que los
        intereses generados se abonan únicamente al finalizar la vida del
        producto financiero; en cambio, si se realiza más de un pago, la
        nominal es inevitablemente inferior a la efectiva." 
        
        Fuente: https://definicion.de/tasa-nominal/ */
        
        // MOSTRAMOS CÓMO QUEDARON LAS CUENTAS
        System.out.println("\n** MOSTRAMOS CÓMO QUEDARON LAS CUENTAS **");
        System.out.println("\n --- CUENTA 1: ");
        System.out.println(ahorrador1.mostrarCuentaAhorros());
        System.out.println(" --- CUENTA 2: ");
        System.out.println(ahorrador2.mostrarCuentaAhorros());
        
        // MODIFICAMOS LA TASA DE INTERÉS ANUAL EN 5%
        CuentaDeAhorros.setTasaInteresAnual(5);
        
        // MOSTRAMOS LAS CUENTAS SÓLO PARA NOTAR EL CAMBIO DE TASA SOBRE AMBAS.
        System.out.println("\n** CAMBIAMOS LA TASA DE INTERÉS EN NUESTRA CLASE **");
        System.out.println("\n --- CUENTA 1: ");
        System.out.println(ahorrador1.mostrarCuentaAhorros());
        System.out.println(" --- CUENTA 2: ");
        System.out.println(ahorrador2.mostrarCuentaAhorros());
        
        
        // CÁLCULAMOS EL PRÓXIMO INTERÉS MENSUAL PARA AMBAS Y LAS MOSTRAMOS.
        System.out.println("\n** APLICAMOS EL INTERÉS MENSUAL PARA EL PRÓXIMO MES **");
        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();
        System.out.println("\n --- CUENTA 1: ");
        System.out.println(ahorrador1.toString());
        System.out.println(" --- CUENTA 2: ");
        System.out.println(ahorrador2.toString());

    }
    
}
