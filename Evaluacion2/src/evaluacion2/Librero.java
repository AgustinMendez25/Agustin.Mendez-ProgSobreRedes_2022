/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion2;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author Redes05
 */
public class Librero implements Serializable{
    private static final long serialVersionUID = -1000L;
    private LinkedList<Articulo> articulos;

    public Librero() {
        articulos = new LinkedList<>();
    }
    
    public void agregarArticulo(Articulo a){
        if (a != null) {
            articulos.add(a);
        }
    }
    
    public Articulo devolverArticulo(int i){
        Articulo aux = articulos.get(i);
        return aux;
    }

    public LinkedList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(LinkedList<Articulo> articulos) {
        this.articulos = articulos;
    }
    
    
    
}
