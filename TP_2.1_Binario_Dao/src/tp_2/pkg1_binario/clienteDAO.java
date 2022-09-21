/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_2.pkg1_binario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * En las Class con patron de diseño DAO vamos a implemetar la capa de negocios
 * especifica (la logica) para cada tabla de datos (o DTO) en este caso lo
 * aplicamos con el CRUD de cada tabla en particular.
 *
 * @author conso
 */
public class clienteDAO implements GeneralDAO<Cliente>{

    @Override
    public void agregar( Cliente registro) {
        registro.getUsuarios().agregarUsuario(registro);
    }

    @Override
    public void borrar( Cliente registro) {
        registro.getUsuarios().borrarCliente(registro);
    }

    @Override
    public void actualizar(Cliente registro) {
        registro.getUsuarios().actualizarUsuario(registro);
    }

    @Override
    public ArrayList<Cliente> obtenerTodo() {      
        
    }

    @Override
    public Cliente obtener(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            String sql = "SELECT * FROM cliente WHERE id=?";
            
            con = ConexionesFactory.getInstance().getConection();
            ps = con.prepareStatement( sql );
            
            ps.setInt(1, id);
            
            rs = ps.executeQuery();
            
            while( rs.next() )
            {             
                return (clienteDTO)DTOFactory.getInstance().getDTO( "cliente" , rs ) ;
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
                Logger.getLogger(clienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }   
        }
        return null;        
    }
     
}
