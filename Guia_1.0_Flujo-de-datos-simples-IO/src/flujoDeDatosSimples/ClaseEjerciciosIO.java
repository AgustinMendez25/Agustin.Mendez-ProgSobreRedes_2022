/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flujoDeDatosSimples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agust
 */
public class ClaseEjerciciosIO {
    
    InputStreamReader is;
    BufferedReader br;
    PrintStream ps;
    
    /**
     * Este método lee la consola con un buffer de lectura y devuelve el texto.
     * @return texto leído.
     */
    public String leerConBuffer() {
        is = new InputStreamReader( System.in );
        br = new BufferedReader( is );
        String texto = "";
        
        try {
            texto = br.readLine();
            return texto;
        } catch (IOException ex) {
            Logger.getLogger(ClaseEjerciciosIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return texto;
    }
    
    /**
     * Este método lee la consola utilizando únicamente la clase system.
     * @return texto leído.
     */
    public String leerConSystem(){
        String texto = "";
        int Byte = -1;
        
        try {
            while(  (Byte = System.in.read()) != '\n'  )
            {
                texto = texto + (char)Byte;
            }
        } catch (IOException ex) {
            Logger.getLogger(ClaseEjerciciosIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return texto;
    }
    
    /**
     * Este método escribe un texto mediante PrintStream.
     * @param texto texto a escribir.
     */
    public void escribirConPrintStream(String texto){
        ps = new PrintStream(System.out);
        ps.println( texto );
    }
    
    /**
     * Ej 1a: Dados el valor de una hora de trabajo y la cantidad de horas trabajadas, la computadora muestra el valor del sueldo bruto.
     */
    public void ej1a(){
        escribirConPrintStream("Ingrese el valor de la hora de trabajo: ");
        float vh = Float.parseFloat(leerConSystem());
        escribirConPrintStream("Ingrese la cantidad de horas trabajadas: ");
        int ch = Integer.parseInt(leerConSystem());
        
        float vf = vh*ch;
        
        escribirConPrintStream("Sueldo bruto: " + vf);
    }
    
    /**
     * Ej 1b: Dados los valores de dos de los ángulos interiores de un triángulo, la computadora muestra el valor del restante.
     */
    public void ej1b(){
        escribirConPrintStream("Ingrese el valor del primer ángulo del rectángulo: ");
        int a1 = Integer.parseInt(leerConSystem());
        escribirConPrintStream("Ingrese el valor del segundo ángulo del rectángulo: ");
        int a2 = Integer.parseInt(leerConSystem());
        
        int vf = 180 - a1 - a2;
        
        escribirConPrintStream("Ángulo restante: " + vf);
    }
    
    /**
     * Ej 1c: Dada la superficie de un cuadrado (en m2), la computadora muestra su perímetro.
     */
    public void ej1c(){
        escribirConPrintStream("Ingrese el valor de la superficie del cuadrado: ");
        int s = Integer.parseInt(leerConSystem());
        
        double vf = Math.sqrt(s);
        
        escribirConPrintStream("Perímetro del cuadrado: " + vf);
    }
    
    /**
     * Ej 1d: Dada una temperatura en grados Fahrenheit, la computadora la muestra en grados centígrados.
     */
    public void ej1d(){
        escribirConPrintStream("Ingrese la temperatura en Fahrenheit: ");
        float tf = Float.parseFloat(leerConSystem());
        
        double vf = (tf - 32) * 0.5556;
        
        escribirConPrintStream("La temperatura en celsius es: " + vf);
    }
    
    /**
     * Ej 1d: Dado un tiempo en segundos, la computadora lo muestra expresado en días, horas, minutos y segundos.
     */
    public void ej1e(){
        escribirConPrintStream("Ingrese el tiempo en segundos: ");
        int s = Integer.parseInt(leerConSystem());
        
        int dia = (int)TimeUnit.SECONDS.toDays(s);
        long horas = TimeUnit.SECONDS.toHours(s) - (dia *24);
        long minutos = TimeUnit.SECONDS.toMinutes(s) - (TimeUnit.SECONDS.toHours(s)* 60);
        long segundos = TimeUnit.SECONDS.toSeconds(s) - (TimeUnit.SECONDS.toMinutes(s) *60);
        
        escribirConPrintStream(dia + " días / Hora = " + horas + ":" + minutos + ":" + segundos);
    }
    
    /**
     * Ej 1f: Dado el precio de un artículo, la computadora muestra los valores a
     * pagar según cada plan. Una casa de artículos para el hogar ofrece a sus clientes los siguientes planes de pago:
     * i. Plan 1: 100% al contado. Se hace el 10% de descuento sobre el precio publicado.
     * ii. Plan 2: 50% al contado y el resto en 2 cuotas iguales. El precio publicado se incrementa en un 10%.
     * iii. Plan 3: 25% al contado y el resto en 5 cuotas iguales. El precio publicado se incrementa en un 15%.
     * iv. Plan 4: Totalmente financiado en 8 cuotas. El 60% se reparte en partes iguales en las primeras 4 cuotas
     * y el resto se reparte en partes iguales en las últimas 4 cuotas. El precio publicado se incrementa en un 25%.
     */
    public void ej1f(){
        escribirConPrintStream("Ingrese el precio: ");
        float precio = Float.parseFloat(leerConSystem());
        
        /*Plan 1*/
        double resultado1 = precio - precio*0.1;
        
        /*Plan 2*/
        double resultado2 = (precio + precio*0.1);
        double contado2 = resultado2/2;
        double cuotaPlan2 = resultado2/4;
        
        /*Plan 3*/
        double resultado3 = (precio + precio*0.15);
        double contado3 = resultado2/4;
        double cuotaPlan3 = (resultado3*0.75)/5;
        
        /*Plan 4*/
        double resultado4 = (precio + precio*0.25);
        double cuotaPlan4 = (resultado4*0.60)/4;
        double cuota2Plan4 = (resultado4*0.40)/4;
        
        escribirConPrintStream("Plan 1: " + resultado1);
        
        escribirConPrintStream("Plan 2: "
                + "\n - Contado: " + contado2
                + "\n - Cuota 1: " + cuotaPlan2
                + "\n - Cuota 2: " + cuotaPlan2
                + "\n - Total: " + resultado2);
        
        escribirConPrintStream("Plan 3: "
                + "\n - Contado: " + contado3
                + "\n - 5 cuotas de: " + cuotaPlan3
                + "\n - Total: " + resultado3);
        
        
        escribirConPrintStream("Plan 4: "
                + "\n - Primeras 4 cuotas de: " + cuotaPlan4
                + "\n - Restantes 4 cuotas de: " + cuota2Plan4
                + "\n - Total: " + resultado4);
         
        
    }
    
    /**
     * Ej 1g: Dado el signo zodiacal del usuario, la computadora muestra su mes de nacimiento aproximado.
     */
    public void ej1g(){
        escribirConPrintStream("Ingrese su signo zodiacal: ");
        String signo = leerConSystem();
        signo = signo.toLowerCase();
        
        switch(signo){
            case "aries":
                escribirConPrintStream("Naciste en marzo o abril");
                break;
            case "tauro":
                escribirConPrintStream("Naciste en abril o mayo");
                break;
            case "geminis":
                escribirConPrintStream("Naciste en mayo o junio");
                break;
            case "cancer":
                escribirConPrintStream("Naciste en junio o julio");
                break;
            case "leo":
                escribirConPrintStream("Naciste en julio o agosto");
                break;
            case "virgo":
                escribirConPrintStream("Naciste en agosto o septiembre");
                break;
            case "libra":
                escribirConPrintStream("Naciste en septiembre u octubre");
                break;
            case "escorpio":
                escribirConPrintStream("Naciste en octubre o noviembre");
                break;
            case "sagitario":
                escribirConPrintStream("Naciste en noviembre o diciembre");
                break;
            case "capricornio":
                escribirConPrintStream("Naciste en diciembre o enero");
                break;
            case "acuario":
                escribirConPrintStream("Naciste en enero o febrero");
                break;
            case "piscis":
                escribirConPrintStream("Naciste en febrero o marzo");
                break;
            
        }
        
    }
    
    /**
     * Dados tres apellidos, la computadora los muestra ordenados alfabéticamente.
     */
    public void Ej2a(){
        String[] apellidos = new String[3];
        
        escribirConPrintStream("Ingrese el 1er apellido: ");
        apellidos[0] = leerConBuffer();
        escribirConPrintStream("Ingrese el 2do apellido: ");
        apellidos[1] = leerConBuffer();
        escribirConPrintStream("Ingrese el 3er apellido: ");
        apellidos[2] = leerConBuffer();
        
        int i, j;
        String aux;
        for (i = 0; i < apellidos.length - 1; i++) {
            for (j = 0; j < apellidos.length - i - 1; j++) {                                                              
                if (apellidos[j + 1].compareTo(apellidos[j]) < 0) {
                    aux = apellidos[j+1];
                    apellidos[j + 1] = apellidos[j];
                    apellidos[j] = aux;
                }
            }
        }
        
        escribirConPrintStream("Apellido 1: " + apellidos[0]);
        escribirConPrintStream("Apellido 2: " + apellidos[1]);
        escribirConPrintStream("Apellido 3: " + apellidos[2]);
    }
    
    /**
     * Dados cuatro números reales, la computadora indica cuál es el menor.
     */
    public void Ej2b(){
        
        double[] lista = new double[4];
        
        for(int i=0;i<4;i++){
            escribirConPrintStream("Ingrese el N° " + i + ": ");
            lista[i] = Double.parseDouble(leerConBuffer());
        }
    }
    
}
