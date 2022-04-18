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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author agust
 */
public class Main {
    static ClaseEjerciciosIO s = new ClaseEjerciciosIO();
    
    public static void main(String[] args) {
        int opcion = -1;
        
        while (opcion != 0){
            mostrarMenu();
            s.escribirConPrintStream("Ingrese una opción");
            opcion = Integer.parseInt(s.leerConSystem());
            
            switch(opcion){
                case 0:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 1:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 2:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 3:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 4:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 5:
                    s.ej1e();
                    break;
                case 6:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 7:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 8:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 9:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 10:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 11:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 12:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 13:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 14:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 15:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 16:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 17:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 18:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 19:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 20:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 21:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                case 22:
                    s.escribirConPrintStream("Programa finalizado");
                    break;
                default:
                    s.escribirConPrintStream("Número no válido");
                    break;
            }
        }
    }
    
    public static void mostrarMenu(){
        s.escribirConPrintStream("-----------------MENÚ-----------------");
        s.escribirConPrintStream("---------Ejercicio 1---------");
        s.escribirConPrintStream("1 - Ejercicio 1A");
        s.escribirConPrintStream("2 - Ejercicio 1B");
        s.escribirConPrintStream("3 - Ejercicio 1C");
        s.escribirConPrintStream("4 - Ejercicio 1D");
        s.escribirConPrintStream("5 - Ejercicio 1E");
        s.escribirConPrintStream("6 - Ejercicio 1F");
        s.escribirConPrintStream("7 - Ejercicio 1G");
        s.escribirConPrintStream("---------Ejercicio 2---------");
        s.escribirConPrintStream("8 - Ejercicio 2A");
        s.escribirConPrintStream("9 - Ejercicio 2B");
        s.escribirConPrintStream("10 - Ejercicio 2C");
        s.escribirConPrintStream("11 - Ejercicio 2D");
        s.escribirConPrintStream("12 - Ejercicio 2F");
        s.escribirConPrintStream("13 - Ejercicio 2G");
        s.escribirConPrintStream("14 - Ejercicio 2H");
        s.escribirConPrintStream("---------Ejercicio 2---------");
        s.escribirConPrintStream("15 - Ejercicio 3A");
        s.escribirConPrintStream("16 - Ejercicio 3B");
        s.escribirConPrintStream("17 - Ejercicio 3C");
        s.escribirConPrintStream("18 - Ejercicio 3D");
        s.escribirConPrintStream("19 - Ejercicio 3E");
        s.escribirConPrintStream("20 - Ejercicio 3F");
        s.escribirConPrintStream("21 - Ejercicio 3G");
        s.escribirConPrintStream("22 - Ejercicio 3H");
    }
    
}
