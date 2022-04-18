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
    
}
