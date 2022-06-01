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
 * ACA UTILIZAR COLECCIONES PARA ALMACENAR LOS DATOS Y PODER TRABAJAR CON ELLOS
 * ADEMAS PEDIR LOS DATOS UEVOS A LOS USUARIO Y CALCULAR EL MES DE MAYOR
 * VICTORIAS
 *
 * @author
 */
public class Datos {

    private static final Logger LOG = Logger.getLogger(Datos.class.getName());
    //List<Object> a
    Utilidades u = new Utilidades();
    Archivos a = new Archivos();

    public Datos() {
    }
    
    /**
     * Carga un nuevo registro
     */
    public void cargarNuevo(File f) {
        //date+hasWon+isFirstTower+isFirstBlood+kills+deaths+assists;
        
        
        u.leerTexto();
        
        u.mostrarMensaje("Ingrese el dia de la partida: ");
        int dia = u.leerNumero();
        
        u.mostrarMensaje("Ingrese el mes de la partida: ");
        int mes = u.leerNumero();
        
        int gano = 2;
        do{
            u.mostrarMensaje("¿Ganó la partida?\n[0] Sí\n[1] No");
            gano = u.leerNumero();
        } while(gano > 1 || gano < 0);
        
        int torre = 2;
        do{
            u.mostrarMensaje("¿Derribó la primera torreta?\n[0] Sí\n[1] No");
            torre = u.leerNumero();
        } while(torre > 1 || torre < 0);
        
        int sangre = 2;
        do{
            u.mostrarMensaje("¿Obtuvo la primera sangre?\n[0] Sí\n[1] No");
            sangre = u.leerNumero();
        } while(sangre > 1 || sangre < 0);
        
        u.mostrarMensaje("Ingrese las kills de la partida: ");
        int kills = u.leerNumero();
        
        u.mostrarMensaje("Ingrese las muertes de la partida: ");
        int muertes = u.leerNumero();
        
        u.mostrarMensaje("Ingrese las asistencias de la partida: ");
        int asistencias = u.leerNumero();
        
        String texto = "" + dia + "/" + mes + ";"
                + gano + ";"
                + torre + ";"
                + sangre + ";"
                + kills + ";"
                + muertes + ";"
                + asistencias;
        
        a.escribir(f, texto);
    }

    /**
     *
     */
    public void almacenar() {

    }

    /**
     *
     */
    public void calcularVictorias() {

    }
}
