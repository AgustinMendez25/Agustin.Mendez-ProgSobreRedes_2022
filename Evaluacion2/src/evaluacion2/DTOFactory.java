/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Software-Notebook
 */
public class DTOFactory {
    
    private static DTOFactory fabrica = null;
    private Libro dto = null;
    
    private DTOFactory()
    {
        
    }
    
    public static DTOFactory getInstance(){
        if( fabrica == null)
            fabrica = new DTOFactory();
        
        return fabrica;
    }
    
    public Libro getDTO( String tipo , ResultSet rs ) throws SQLException{
        
        dto = new Libro(rs.getDate("fecha"), rs.getString("autor"), rs.getInt("paginas"), rs.getInt("codigo"), rs.getString("nombre"), rs.getString("genero") );
         
        return dto;
    }

    
}
