/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Yojans Cid
 */
public class Conexion {
    
    //JDBC driver nombre y base de datos URL
        
    //Distingue que base de datos vamos a utilizar
    private final String JDBC_DRIVER = "org.postgresql.Driver"; //com.mysql.jdbc.Driver

    //Ruta en la cual se hace la conexion a la BD llamada "Clientes"
    private final String DB_URL = "jdbc:postgresql://localhost:5432/Clientes"; //com.mysql.jdbc.Driver

    //----------------------------------------------------------------------
    //Base de datos credenciales

    //usuario de la BD
    private final String USER = "postgres";
    //password de la BD
    private final String PASS = "postgres123";
    
    protected Connection conexion;
    
    /*Se crea un metodo que use las credenciales entregadas y se conecte a la 
    base de datos*/
    public void conectar() throws Exception{
        
        try {
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
           
             
        }catch (Exception e) {
            throw e;
        }
        
    }
    
    /*Se crea un metodo que cierre la conexion de la BD*/
    public void cerrar() throws SQLException{
        
        if(conexion != null){//si la conexion es diferente de nula, osea, existe
            if(!conexion.isClosed()){//...y no esta cerrada
                conexion.close();//se cierra la conexion
            }
        }
        
    }
    
    
    
}
