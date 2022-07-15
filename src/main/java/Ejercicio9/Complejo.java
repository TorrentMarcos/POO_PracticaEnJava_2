/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author Marcos
 */

public class Complejo { // Fórmula -> C = {a + bi: a ∈ R, b ∈ R}
    
    // » ATRIBUTOS
    
    private float parteReal;
    private float parteImaginaria;
    
    // » CONSTRUCTORES

    public Complejo() { // Básicamente, creará el número "i". (0 + 1*i) = i 
        parteReal = 0;
        parteImaginaria = 1;
    }
    
    public Complejo(float parteReal, float parteImaginaria){
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }
    
    // » GETTERS & SETTERS

    public float getParteReal() {
        return parteReal;
    }

    public void setParteReal(float parteReal) {
        this.parteReal = parteReal;
    }

    public float getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(float parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }
    
    // » OTROS MÉTODOS DEFINIDOS POR EL DESARROLLADOR
    
    public Complejo sumarleComplejo(Complejo c){ // También podría simplemente tirar un 'sout'.
        
        float parteRealAux = 0;
        float parteImaginariaAux = 0;
       
        parteRealAux = parteReal;
        parteImaginariaAux = parteImaginaria;
        
        /* SUMO LA PARTE REAL DE UNO CON LA PARTE REAL DEL OTRO.
        APLICO LA MISMA LÓGICA PARA LAS PARTES IMAGINARIAS. */
        
        parteRealAux += c.getParteReal();
        parteImaginariaAux += c.getParteImaginaria();
        
        // CREO UN NUEVO 'COMPLEJO' FRUTO DE LA SUMA DE LOS OPERANDOS PREVIOS.
        Complejo s = new Complejo(parteRealAux, parteImaginariaAux);
        return s;
    }
    
    public Complejo restarleComplejo(Complejo c){ // Mismo caso que el método anterior respecto al 'sout'.
        
        float parteRealAux = 0;
        float parteImaginariaAux = 0;
       
        parteRealAux = parteReal;
        parteImaginariaAux = parteImaginaria;
        
        /* RESTO LA PARTE REAL DEL OP. DERECHO DE LA PARTE REAL DEL OP.
        IZQUIERDO. APLICO LA MISMA LÓGICA PARA LAS PARTES IMAGINARIAS. */
        
        parteRealAux -= c.getParteReal();
        parteImaginariaAux -= c.getParteImaginaria();
        
        // CREO UN NUEVO 'COMPLEJO' FRUTO DE LA RESTA DE LOS OPERANDOS PREVIOS.
        Complejo s = new Complejo(parteRealAux, parteImaginariaAux);
        return s;
    }
    
    public String imprimirNumeroComplejo(){ // Impresión bastante simplista.
        
        if (parteImaginaria >= 0){
            return (parteReal + " + " + parteImaginaria + "i");
        }
        else{
            return (parteReal + " " + parteImaginaria + "i");
        } 
    }
    
    // » TO STRING ()

    @Override
    public String toString() {
        return "Complejo{" + "parteReal=" + parteReal + ", parteImaginaria=" + parteImaginaria + '}';
    }

}
