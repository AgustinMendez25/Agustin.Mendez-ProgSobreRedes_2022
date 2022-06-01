/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparacionprueba;

import java.io.File;
import java.util.logging.Logger;

/**
 * REALIZAR EL MENU INFINITO CON LAS OPCIONES PARA EL USUARIO QUE LLEVEN A CADA ACCION 
 * 
 * @author 
 */
public class Programa {
    
    private static final Logger LOG = Logger.getLogger(Programa.class.getName());
    Datos d = new Datos();
    Archivos a = new Archivos();
    Utilidades u = new Utilidades();
    File f = new File("juegos.dat");
    
    /**
     * 
     */
    public Programa() {
    }
    
    /**
     * 
     */
    public void iniciar()
    {        
        char op = ' ';
        while(op != '0'){
            op = Utilidades.menu(); 
            switch (op) {
            case '1':
                d.cargarNuevo(f);
                break;
            case '2':
                a.mostrar(f);
                break;
            case '3':
                u.mostrarMensaje("Muestra el mes en el que tuvo mayor cantidad de victorias");
                break;
            }    
        }
           
             
        
    }
    
    
    
}
