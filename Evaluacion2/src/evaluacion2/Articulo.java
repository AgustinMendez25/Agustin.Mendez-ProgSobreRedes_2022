/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion2;

import java.io.Serializable;

/**
 *
 * @author Redes05
 */
public abstract class Articulo implements Serializable{
    private static final long serialVersionUID = -1000L;
    protected int codigo;
    protected String nombre;
    protected String genero;

    public Articulo(int codigo, String nombre, String genero) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.genero = genero;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
}
