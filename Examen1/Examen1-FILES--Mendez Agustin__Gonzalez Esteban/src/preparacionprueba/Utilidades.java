/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparacionprueba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * FUNCIONALIDADES PARA LEER Y ESCRIBIR POR LA CONSOLA O POR ARCHIVOS
 * FUNCIONALADES DE VALIDADCION DE DATOS FUNCIONALIDADES EXTRAS QUE SEAAN
 * GENERALES
 *
 * @author
 */
public class Utilidades {

    private static final Logger LOG = Logger.getLogger(Utilidades.class.getName());
        
    /**
     * Muestra el menu y lee la opción
     * @return opcion
     */
    public static char menu() {
        char op;
        do {
            mostrarMensaje(
                    "MENÚ PRINCIPAL\n\n"
                    + "[1] Cargar una partida \n"
                    + "[2] Ver partidas\n"
                    + "[3] Mes con mayor cantidad de victorias\n"
                    + "[0] Cerrar el programa\n"
            );
            op = Utilidades.obtenerOpcion();
        } while (op < '0' || op > '3');

        return op;
    }

    /**
     * Muestra un mensaje por la consola utilizando PrintStream
     * @param texto 
     */
    public static void mostrarMensaje(String texto){
        PrintStream ps;
        ps = new PrintStream(System.out);
        ps.println( texto );
    }
    
    /**
     * Lee un numero ingresado por la consola
     * @return numero
     */
    public static int leerNumero() {
        int n = 0;
        try {
            
            int Byte = -1;
            String texto = "";
            
            while(  (Byte = System.in.read()) != '\n'  )
            {
                texto = texto + (char)Byte;
            }
            
            n = Integer.parseInt(texto);
            
        } catch (IOException ex) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return n;
    }
    
    /**
     * Lee texto ingresado por la consola
     * @return texto
     */
    public static String leerTexto()
    {
        String texto = "";
        try {
            
            int Byte = -1;
            
            while(  (Byte = System.in.read()) != '\n'  )
            {
                texto = texto + (char)Byte;
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return texto;
    }
    
    public static char obtenerOpcion(){
        char dato = ' ';
        try {
            dato = (char)System.in.read();
        } catch (IOException ex) {
            Logger.getLogger(Utilidades.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dato;
    }
    
    /**
     * Valida si un dato es nulo
     * @param dato
     * @return false si es nulo y true si no lo es
     */
    public static boolean validar(Object dato)
    {
        if(dato == null)
            return false;
        else
            return true;
    }
}
