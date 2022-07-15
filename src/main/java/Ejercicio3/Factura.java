/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Marcos
 */

public class Factura { /* NOTA: SE HAN REALIZADO LEVES MODIFICACIONES PERSONALES SOBRE LA
                        CONSIGNA DADO QUE LA FORMA DE RESOLUCIÓN SUGERIDA ES OTRA. */
    
    // » ATRIBUTOS
    
    private int numeroFactura;                // ¿Y el tipo de factura? ¡También podría estar si se quiere!
    private String razonSocial;               // Acá, incluso, podríamos tener una clase para el 'Cliente'.
    private Date fecha;                       // Agregamos el atributo fecha dado que se considera importante.          
    private ArrayList<ItemFactura> articulos; // Voy a trabajar la factura con un ArrayList basado en su "Detalle".
    private double total;                     // Atributo que se calculará con los subtotales de cada ItemFactura.
    
    // » CONSTRUCTORES
    
    public Factura(){ // CONSTRUCTOR GENERAL
        
    }

    public Factura(int numeroFactura, String razonSocial, Date fecha,
            ArrayList<ItemFactura> articulos) {    // CONSTRUCTOR C / 4 PARÁMETROS
        this.numeroFactura = numeroFactura;
        this.razonSocial = razonSocial;
        this.fecha = fecha;
        this.articulos = articulos;
        this.total = obtenerMontoFactura();

        /* Nota: Si bien uno podría calcular el total dentro del mismo constructor,
        se prefiere derivar este código a un método aparte a raíz de su extensión */
    }
    
    // » GETTERS & SETTERS
    
    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        // Nota: Se le podría aplicar un control para evitar números < o = que '0'.
        this.numeroFactura = numeroFactura;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<ItemFactura> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<ItemFactura> articulos) {
        this.articulos = articulos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    // » OTROS MÉTODOS DEFINIDOS POR EL DESARROLLADOR »
    
    public double obtenerMontoFactura(){
        
        total = 0; /* Inicializo el total dado que, al aplicar el método 2 veces, se
                   sumaría el total dos veces (obteniéndose un valor erróneo). A lo
                   sumo, lo que podría hacer para sacar esta línea es convertir el
                   método en PRIVATE y que éste sólo pueda ejecutarse internamente
                   mediante el constructor. (el cual sólo lo ejecuta 1 vez) */
    
        for (int i=0; i<articulos.size(); i++){
            total += articulos.get(i).getSubtotal();
        }
        
        return total;
        
    }
    
    // » TO STRING ()

    @Override
    public String toString() {
        return "Factura " + "N°: " + numeroFactura + "\nRazón Social: " + razonSocial +
                "\nFecha: " + fecha + "\nArticulos: " + articulos + "\nTotal: $" + total;
    }

}
