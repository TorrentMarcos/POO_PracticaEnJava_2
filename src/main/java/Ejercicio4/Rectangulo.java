/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Marcos
 */

public class Rectangulo {
    
    // » ATRIBUTOS 
    
    private float largo = 1;
    private float ancho = 1;
    
    // » CONSTRUCTORES

    public Rectangulo() { // CONSTRUCTOR GENERAL
    }
    
    public Rectangulo(float largo, float ancho){ // CONSTRUCTOR 2 PARÁMETROS.
        setLargo(largo);
        setAncho(ancho);
    }
    
    // GETTERS & SETTERS

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        
        if ((largo > 0.0) && (largo < 20.0)){
            this.largo = largo;
        }
        else {
            System.out.println("El largo debe estar en 0.0 y 20.0 (sin comprender"
                    + " extremos). Valor de largo por default: " + getLargo());
        }
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        
        if ((ancho > 0.0) && (ancho < 20.0)){
            this.ancho = ancho;
        }
        else {
            System.out.println("El ancho debe estar en 0.0 y 20.0 (sin comprender"
                    + " extremos). Valor de ancho por default: " + getAncho());
        }
    }
    
    // OTROS MÉTODOS DEFINIDOS POR EL DESARROLLADOR
    
    public float calcularPerimetro(){
        return ((largo + ancho) * 2);
    }
    
    public float calcularArea(){
        return (largo * ancho);
    }
    
    // TO STRING ()

    @Override
    public String toString() {
        return "Rectángulo [" + "Largo: " + largo + " || Ancho: " + ancho + ']';
    }
    
}
