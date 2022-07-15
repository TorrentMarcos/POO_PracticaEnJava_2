/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

import java.util.ArrayList;

/**
 *
 * @author Marcos
 */

public class ResumenSemanal {
    
    // » ATRIBUTOS (simplificadamente).
    
    private Vendedor vendedor;
    private ArrayList<ItemResumenSemanal> detalle;
    private double total;
    
    // » CONSTRUCTORES

    public ResumenSemanal() { // CONSTRUCTOR GENERAL
    }

                              // CONSTRUCTOR C/ 2 PARÁMETROS
    public ResumenSemanal(Vendedor vendedor, ArrayList<ItemResumenSemanal> detalle) {
        this.vendedor = vendedor;
        this.detalle = detalle;
        this.total = calcularTotal(detalle);
    }
    
    // » GETTERS & SETTERS

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<ItemResumenSemanal> getDetalle() {
        return detalle;
    }

    public void setDetalle(ArrayList<ItemResumenSemanal> detalle) {
        this.detalle = detalle;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    // » OTROS MÉTODOS DEFINIDOS POR EL DESARROLLADOR
    
    public double calcularTotal(ArrayList<ItemResumenSemanal> detalle){
        double totalAux = 0;
    
        // Calculamos el puro total vendido (osea, lo basado en el detalle).
            totalAux = totalDetalle(detalle);
        
        // Guardamos, ahora, únicamente las comisiones sobre ese valor.
            totalAux = totalComisiones(totalAux);
            
        // Cerramos el total (sueldo básico + comisiones)
            totalAux += vendedor.getSueldoSemanal();
        
        return totalAux;
    }
    
    private double totalDetalle(ArrayList<ItemResumenSemanal> detalle){ 
        
        double totalDetalle = 0;
        
        for (int i=0; i<detalle.size(); i++){
            totalDetalle+= detalle.get(i).getSubtotal();
        }

        return totalDetalle;
    }
    
    private double totalComisiones(double totalVendido) { 
                                                        
        double totalComisiones = 0;
        totalComisiones = totalVendido * (vendedor.getComisionVentaSemanal() / 100);
        
        return totalComisiones;
    }
    
    // » TO STRING()
    
    /* Nota: La "anomalía" del siguiente método - sobre todo por la sobrecarga
    de procesamiento que éste realiza - es únicamente a efectos de mostrar un
    Resumen más "completo" en el TEST. Otra alternativa hubiese sido agregar
    atributos en la clase como 'totalDetalle' y 'totalComisiones' */

    @Override
    public String toString() {
        return "-- RESUMEN SEMANAL -- \n• Vendedor: " + vendedor +
                "\n• Detalle: " + detalle + "\n\t» Total detalle: $" + totalDetalle(detalle) +
                "\n\t» Comisiones correspondientes: $" + totalComisiones(totalDetalle(detalle)) +
                "\n• Total a cobrar (básico + comisiones): $" + total;
    }

}
