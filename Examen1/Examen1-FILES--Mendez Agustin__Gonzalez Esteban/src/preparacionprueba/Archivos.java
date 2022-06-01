/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparacionprueba;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ACA TODO LO QUE TENGA QUE VER CON LEER DATOS DE UN ARCHIVO, ESCRIBIR, BORRAR
 * FUNCIONALIDAD DE ARREGLADO DE FORMATO, Y OJO!! ACA DEBE ESTAR LA
 * DUNCIONALIDAD DE MOSTRAR LOS DATOS DEL ARCHIVO
 *
 * @author
 */
public class Archivos {

    private static final Logger LOG = Logger.getLogger(Archivos.class.getName());

    public Archivos() {
    }

    /**
     * Lee un archivo utilizando el método leer y los muestra por consola
     * @param f archivo
     */
    public void mostrar(File f) {
        Utilidades u = new Utilidades();
        u.mostrarMensaje(leer(f));
    }

    /**
     * Arregla el archivo reemplazando los caracteres '+' por ';'
     * @param f Archivo
     */
    public void arreglar(File f) {
        File nuevoArchivo = new File("temp.dat");
        
        String texto = leer(f);
        texto = texto.replace('+', ';');
        
        escribir(nuevoArchivo,texto);
        
        File ArchivoFinal = new File(f.getPath());
        
        eliminar(f);
        
        nuevoArchivo.renameTo(ArchivoFinal);
    }

    /**
     * Lee un archivo utilizando un buffer
     * @param f archivo a leer
     * @return texto del archivo
     */
    public String leer(File f) {
        String texto = "";
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            String linea = "";
            while ((linea = br.readLine()) != null) {
                texto += "\n" + linea;
            }

            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return texto;
    }

    /**
     * Elimina un archivo
     * @param f archivo
     */
    public void eliminar(File f) {
         if (f.exists()) {
             f.delete();
        }
    }

    /**
     * Escribe texto en un archivo
     * @param f archivo
     * @param texto texto a escribir
     */
    public void escribir(File f, String texto) {
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            if (!f.exists()) {
                try {
                    f.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            fw = new FileWriter(f, true);
            pw = new PrintWriter(fw);
            
            pw.println(texto);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (pw != null) {
                    pw.close();
                }

                if (fw != null) {
                    fw.close();
                }

            } catch (IOException ex) {
                Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
