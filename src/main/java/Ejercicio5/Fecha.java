/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author Marcos
 */

public class Fecha {
    
    // » ATRIBUTOS
    
    private int dia;
    private int mes;
    private int anio;
    
    // » CONSTRUCTORES
    
    public Fecha(){ // CONSTRUCTOR GENERAL
        
    }

                   // CONST. P/ INSTANCIACIONES TIPO '(10,2,2022)'.   
    public Fecha(int dia, int mes, int anio) {      
        setDia(dia);
        setMes(mes);
        this.anio = anio;
    }
                  // CONST. P/ INSTANCIACIONES TIPO '(Marzo, 3, 2022)'.
    public Fecha(String mes, int dia, int anio) {   
        setDia(dia);
        setMes(mes);
        this.anio = anio;
    }
                 // CONST. P/ INSTANCIACIONES  TIPO '(14, Marzo, 2022)'.
    public Fecha(int dia, String mes, int anio) {
        setDia(dia);
        setMes(mes);
        this.anio = anio;
    }
    
    // » GETTERS & SETTERS

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        
    /* Nota: Me limitaré a realizar una revisión MUY SIMPLISTA donde:
        
        • DÍA ----> (> 0 y < 32)
        
        Lo mismo haré con: 
        
        • MES ----> (> 0 y < 13) 
        • AÑO ----> ¡Puede haber años negativos! '(a.C)'. Por otra parte, 
        tampoco veo mal que, en este caso particular, permitamos crear fechas
        futuras (ej. '10/12/2030'). Al año, entonces, sí daré "rienda suelta".
        
    Nótese que una revisión COMPLETA debería verificar si, dependiendo del mes
    y/o el año, podemos poner hasta el día '28' (feb, normal), '29' (feb,
    bisiesto), '30' (Abril, junio, septiembre y noviembre) o '31' (Enero, marzo,
    mayo, julio, agosto, octubre y diciembre). Aún así, lo normal sería trabajar
    con la clase 'Date' o 'GregorianCalendar' que ya controlan todo esto.
    */
    
        if ((dia > 0) && (dia < 32)){
            this.dia = dia; 
        }
        else {
            System.out.println("Día inválido. Límite mín: 1 || Límite máx: 31."
                    + " « Se auto-seteará el valor del día en '1'");
            this.dia = 1;
        }
        
    /* Volviendo a la aclaración de siempre, dentro de este método también
    podría tener un WHILE que pregunte indefinidamente el 'día' hasta que el
    usuario ingrese un valor válido */
        
    }

    public int getMes() {
        return mes;
    }
    
    public void setMes(int mes) {
        
        if ((mes > 0) && (mes < 13)){
            this.mes = mes;
        }
        else {
            System.out.println("Mes inválido. Límite mín: 1 || Límite máx: 12."
                    + " « Se auto-seteará en valor del mes en '1'");
            this.mes = 1;
        }
    }
    
    public void setMes(String mes){          //Sobrecarga del método setMes().
        
        mes = mes.toUpperCase(); // Así evito compareToIgnoreCase(String str).
        
        switch (mes){
            
            case "ENERO":
                this.mes = 1;
            break;
            
            case "FEBRERO":
                this.mes = 2;
            break;
            
            case "MARZO":
                this.mes = 3;
            break;
            
            case "ABRIL":
                this.mes = 4;
            break;
            
            case "MAYO":
                this.mes = 5;
            break;
            
            case "JUNIO":
                this.mes = 6;
            break;
            
            case "JULIO":
                this.mes = 7;
            break;
            
            case "AGOSTO":
                this.mes = 8;
            break;
            
            case "SEPTIEMBRE":
                this.mes = 9;
            break;
            
            case "OCTUBRE":
                this.mes = 10;
            break;
            
            case "NOVIEMBRE":
                this.mes = 11;
            break;
            
            case "DICIEMBRE":
                this.mes = 12;
            break;
            
            default:
                System.out.println("Mes inválido. « Se auto-seteará el mes en"
                    + " 'ENERO' (mes '1')");
                this.mes = 1;
        }

    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    // » OTROS MÉTODOS DEFINIDOS POR EL DESARROLLADOR.
    
    public void mostrarFechaEnteros(){                       // Ej. '05/21/2010'
        System.out.println(dia + "/" + mes + "/" + anio);
    }
    
    public void mostrarFechaMesTextualPrimero(){         // Ej. 'Junio 14, 2012' 
        String mesAux = "";
        mesAux = obtenerMesTextual();
        
        System.out.println(mesAux + " " + dia + ", " + anio);
    }
    
    public void mostrarFechaMesTextualMedio(){             // Ej. '20 Agosto 11'
        
        String mesAux = "";
        mesAux = obtenerMesTextual();
         
        /* Como también tenemos que mostrar sólo los dos últimos dígitos del
        año, pudiendo además éste ser negativo (a.C) o positivo (d.C), proce-
        damos a jugar con algunas cuestiones. */
        
        /* Nota: A nivel "constructor", aunque yo pueda pasar directamente
        el entero '22' y no habría problema, podría pasar que, si instancio
        el objeto así, nunca sepa si '22' refiere a 1822, 1922, 2022, etc.
        Sin embargo, si sólo trabajamos esto a nivel "visual", nuestro año 
        original no se vería afectado y habría forma de saber qué año es. */
        
        String anioAux = "";    // Necesitaré convertir mi año(int) a String...
        char anioSigno = ' ';   // Necesitaré guardar si es negativo / positivo.
        anioAux = String.valueOf(anio); // Convierto mi año.
        
        if (anioAux.contains("-")){    // ¿Positivo o negativo?
            anioSigno = '-';                
        }
        
        // DEPENDIENDO DEL LARGO DEL AÑO, CONSIDERARÉ LO SIGUIENTE:
        
        if (anioAux.length() > 2){ // Casos posibles: "-10", "200", "4501"...
            anioAux = anioAux.substring(anioAux.length() - 2); // Guardo las 2 últimas posiciones. 
        }
        else { // Casos posibles: "1", "-5", "23"....
            
               // ¿A quién pertenece el primer char? ¿Número o signo?
               
            if (anioSigno == '-'){ // Signo.
                anioAux = anioAux.substring(anioAux.length() - 1); // Guardo sólo el núm.
            }
            else{                  // Numero. Guardo todo.
                anioAux = anioAux.substring(anioAux.length() - 2);
            }
        }
        
        if (anioSigno == '-'){    // ¿Tengo que representar el año con '-'?
            anioAux = anioSigno + anioAux; // Sí. CONCATENO.
        }
        
        // A tener en cuenta: Este método representaría un '-200' como '-00'.
        
        // IMPRIMO. 
        System.out.println(dia + " " + mesAux + " " + anioAux);
    }
    
    public String obtenerMesTextual(){           // "Convierte" el mes a String.
        
        String mesAux = "";
        
        switch(mes){
            
            case 1: mesAux = "Enero";
            break;
            
            case 2: mesAux = "Febrero";
            break;
            
            case 3: mesAux = "Marzo";
            break;
            
            case 4: mesAux = "Abril";
            break;
            
            case 5: mesAux = "Mayo";
            break;
            
            case 6: mesAux = "Junio";
            break;
            
            case 7: mesAux = "Julio";
            break;
            
            case 8: mesAux = "Agosto";
            break;
            
            case 9: mesAux = "Septiembre";
            break;
            
            case 10: mesAux = "Octubre";
            break;
            
            case 11: mesAux = "Noviembre";
            break;
            
            case 12: mesAux = "Diciembre";
            break;
            
            default:

        }
        
        return mesAux;

    }

}
