/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Marcos
 */
public class PruebaFecha {
    
    public static void main(String[] args){
        
         // ■ PROBAMOS CREAR FECHAS PARA EL PRIMER CONSTRUCTOR || Fecha(int dia, int mes, int anio)
         Fecha fecha1 = new Fecha(10,2,2022);   // Todo bien.
         Fecha fecha2 = new Fecha(0, 2, 2022);  // Tendría que tirar aviso. || DÍA INVÁLIDO.
         Fecha fecha3 = new Fecha(1, -1, 2022); // Tendría que tirar aviso. || MES INVÁLIDO.
         
         /* VOY A UTILIZAR TAMBIÉN ESTAS FECHAS PARA PROBAR EL PRIMER "ToString() personalizado" que hicimos.
         Sea de paso, estoy revisando si los valores fueron bien asignados por los métodos y el constructor.*/

         System.out.println("\nFECHAS EN FORMATO DE SALIDA '(dd/mm/aaaa)': ");
         fecha1.mostrarFechaEnteros();
         fecha2.mostrarFechaEnteros();
         fecha3.mostrarFechaEnteros();
         System.out.println("\n");
         
         /* Nota: Lo de "ToString() personalizado" no es literal dado que no se hace un @Override del ToString()
         sino un método totalmente distinto con un comportamiento bastante similar a lo que haría un 'ToString()'*/
         
         // ■ PROBAMOS CREAR FECHAS PARA EL SEGUNDO CONSTRUCTOR || Fecha(String mes, int dia, int anio)
         Fecha fecha4 = new Fecha("Enero", 20, 2005);         // Todo bien.
         Fecha fecha5 = new Fecha ("Marzo", -10, 2014);       // Aviso. Día inválido.
         Fecha fecha6 = new Fecha ("Harry Potter", 12, 2023); // Aviso. Mes inválido.
         
         /* CHEQUEAMOS SEGUNDO "ToString() personalizado" E - IMPLÍCITAMENTE - EL RESULTADO FINAL DEL 
         SEGUNDO CONSTRUCTOR Y SUS MÉTODOS. */
         System.out.println("\nFECHAS EN FORMATO DE SALIDA '('MES' dd, aaaa)': ");
         fecha4.mostrarFechaMesTextualPrimero();
         fecha5.mostrarFechaMesTextualPrimero();
         fecha6.mostrarFechaMesTextualPrimero();
         System.out.println("\n");
         
         // ■ PROBAMOS CREAR FECHAS PARA EL TERCER CONSTRUCTOR || Fecha(int dia, String mes, int anio)
         Fecha fecha7 = new Fecha(10, "Marzo", -22);   // Todo bien.
         Fecha fecha8 = new Fecha(-2, "Junio", 2023);  // Aviso. Día inválido.
         Fecha fecha9 = new Fecha(1, "JAPÓN", -8);     // Aviso. Mes inválido.
         
         /* CHEQUEAMOS TERCER "ToString() personalizado" E - IMPLÍCITAMENTE - EL RESULTADO FINAL DEL 
         TERCER CONSTRUCTOR Y SUS MÉTODOS. */
         System.out.println("\nFECHAS EN FORMATO DE SALIDA '(dd 'MES' aa)': ");
         fecha7.mostrarFechaMesTextualMedio();
         fecha8.mostrarFechaMesTextualMedio();
         fecha9.mostrarFechaMesTextualMedio();

    }
    
}
