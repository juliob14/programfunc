/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juliobitar
 */
public class Conexion {
       private static Conexion conexion;
    private Connection connection;
    
    private Conexion(){
    
    
    }
    
    public Conexion getInstance(){
        if(conexion == null){
            conexion = new Conexion();
        
        }
    return conexion;
    
    }
    
    public Connection getConexion() throws SQLException{
        if(this.connection == null){
            String driver ="org.postgresql.Driver";
            String cadenaConexion="jdbc: mysql://localhost/productos";
            String user = "root";
            String password= "assassinpoint09";
            
            try {
                Class.forName(driver);
                this.connection = DriverManager.getConnection(cadenaConexion, 
                        user, password);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName())
                        .log(Level.SEVERE,null, ex);
            }
        }
    return this.connection;
    
    }
    
}
