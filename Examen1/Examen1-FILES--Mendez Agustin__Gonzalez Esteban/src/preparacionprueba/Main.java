/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparacionprueba;

import java.io.File;
import java.util.logging.Logger;

/**
 *
 * @author 
 */
public class Main {
    
    private static final Logger LOG = Logger.getLogger(Main.class.getName());
    
    
    /**
     * SOLO PREPARAR EL ARCHIVO (CON ORIENCION A OBJETOS) Y LUEGO LLAMAR AL FUNCIONAMIENTO DEL PROGRAMA
     * @param args 
     */
    public static void main(String[] args) {
        
        Programa p = new Programa();
        
        p.iniciar();
    }
    
    
    
}
