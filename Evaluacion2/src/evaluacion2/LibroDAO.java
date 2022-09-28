/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Redes05
 */
public class LibroDAO {

    public void agregar( Libro registro) {
        PreparedStatement ps = null;
        Connection con = null;
        
        try {
            //rs.getDate("fecha"), rs.getString("autor"), rs.getInt("paginas"), rs.getInt("codigo"), rs.getString("nombre"), rs.getString("genero")
            String consulta = "INSERT INTO libros(fecha,autor,paginas,codigo,nombre,genero) VALUES (?,?,?,?,?,?)";
            
            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement(consulta); 
            
            ps.setDate(1, registro.getFechaDeIngreso() );
            ps.setString(2, registro.getAutor());
            ps.setInt(3, registro.getPaginas());
            ps.setInt(4, registro.getCodigo());
            ps.setString(5, registro.getNombre());
            ps.setString(6, registro.getGenero());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
            
    }

    public void borrar( int id) {
        PreparedStatement ps = null;
        Connection con = null;
        
        try {
            String consulta = "DELETE FROM libros WHERE codigo = ? ";
            
            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement(consulta); 
            
            ps.setInt(1, id);
            
            ps.executeUpdate(); 
        } catch (SQLException ex) {
            Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }              
    }

    public void actualizar( Libro registro) {
        PreparedStatement ps = null;
        Connection con = null;
        
        try {
            
            String consulta = "UPDATE libros SET fecha=? , autor=? , paginas=?, nombre=?, genero=? WHERE codigo=?";
            
            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement(consulta); 
            
            ps.setDate(1, registro.getFechaDeIngreso() );
            ps.setString(2, registro.getAutor());
            ps.setInt(3, registro.getPaginas());
            ps.setString(4, registro.getNombre());
            ps.setString(5, registro.getGenero());
            ps.setInt(6, registro.getCodigo());
            
            ps.executeUpdate();  
        } catch (SQLException ex) {
            Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }        
    }

    public ArrayList<Libro> obtenerTodo() {      
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Libro> listAux = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM libros";
            
            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement( sql );
            
            rs = ps.executeQuery();
            
            while( rs.next() )
            {             
                listAux.add( (Libro)DTOFactory.getInstance().getDTO("cliente", rs) );
            }
            
        }catch(SQLException ex){
            
        }finally{
            try {
            if( rs != null)
                rs.close();
                    
            if( ps != null )
                ps.close();
            
            if( con != null)
                con.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        return listAux;
    }

    public Libro obtener(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            String sql = "SELECT * FROM libros WHERE codigo=?";
            
            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement( sql );
            
            ps.setInt(1, id);
            
            rs = ps.executeQuery();
            
            while( rs.next() )
            {             
                return (Libro)DTOFactory.getInstance().getDTO( "cliente" , rs ) ;
            }   
        }catch(SQLException ex){
            
        }finally{
            try {
            if( rs != null)
                rs.close();
                    
            if( ps != null )
                ps.close();
            
            if( con != null)
                con.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(LibroDAO.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        return null;        
    }
    
    public void cargarNuevoLibro(){
        Utilidades.mostrarPorPantalla("Ingrese el codigo: ");
        int codigo = Utilidades.leerNumero();
        Utilidades.mostrarPorPantalla("Ingrese el Nombre: ");
        String nombre = Utilidades.leerTexto();
        Utilidades.mostrarPorPantalla("Ingrese el genero: ");
        String genero = Utilidades.leerTexto();
        Utilidades.mostrarPorPantalla("Ingrese el autor: ");
        String autor = Utilidades.leerTexto();
        Utilidades.mostrarPorPantalla("Ingrese las paginas: ");
        int paginas = Utilidades.leerNumero();
        /*Utilidades.mostrarPorPantalla("Ingrese la fecha: ");
        Date fechaDeIngreso = Utilidades.leerFecha();*/

        //Date fechaDeIngreso, String autor, int paginas, int codigo, String nombre, String gener
        Libro l = new Libro(new Date(2020,10,10), autor, paginas, codigo, nombre, genero);

        this.agregar(l);
    }
    
    public void actualizarLibro(){
        Utilidades.mostrarPorPantalla("Ingrese el codigo: ");
        int codigo = Utilidades.leerNumero();
        Utilidades.mostrarPorPantalla("Ingrese el Nombre: ");
        String nombre = Utilidades.leerTexto();
        Utilidades.mostrarPorPantalla("Ingrese el genero: ");
        String genero = Utilidades.leerTexto();
        Utilidades.mostrarPorPantalla("Ingrese el autor: ");
        String autor = Utilidades.leerTexto();
        Utilidades.mostrarPorPantalla("Ingrese las paginas: ");
        int paginas = Utilidades.leerNumero();
        /*Utilidades.mostrarPorPantalla("Ingrese la fecha: ");
        Date fechaDeIngreso = (Date) Utilidades.leerFecha();*/

        //Date fechaDeIngreso, String autor, int paginas, int codigo, String nombre, String gener
        Libro l = new Libro(new Date(2020,10,10), autor, paginas, codigo, nombre, genero);

        this.actualizar(l);
    }
    
    public void borrarLibro(){
        Utilidades.mostrarPorPantalla("Ingrese el codigo: ");
        int codigo = Utilidades.leerNumero();

        this.borrar(codigo);
    }
    
    public void mostrarLibros(){
        for(Libro l : this.obtenerTodo()){
            l.mostrarDatos();
        }
    }
    
    public boolean mostrarMenu() {
        boolean cerrar = false, continuar = true;
        while (!cerrar) {
            char op;
            do {
                Utilidades.mostrarPorPantalla(
                        "\tMENÚ LIBROS\n\n"
                        + "\t[1] Cargar un Libro\n"
                        + "\t[2] Actualizar un Libro\n"
                        + "\t[3] Borrar un Libro\n"
                        + "\t[4] Mostrar Libros\n"
                        + "\t[5] Volver\n"
                );
                op = Utilidades.obtenerOpcion();
            } while (op < '1' || op > '5');

            switch (op) {
                case '1':
                    this.cargarNuevoLibro();
                    break;
                case '2':
                    this.actualizarLibro();
                    break;
                case '3':
                    this.borrarLibro();
                    break;
                case '4':
                    this.mostrarLibros();
                    break;
                case '5':
                    cerrar = true;
                    continuar = false;
                    break;
            }
        }
        return continuar;
    }
}
