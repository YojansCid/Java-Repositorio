/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*Se integra el paquete "dao a la clase"*/
package dao;

import Ejemplo.Persona;
import Interfaces.DAOPersona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yojans Cid
 */
/*La iguiente Clase Extendera de la Clase Conexion (sera hijo) y tomara todos 
los metodos que este contiene (conectar() y cerrar()), ademas de usar la 
interface DAOPersona que nos "obligara" a implementar (@Override) los metodos 
especificados en esa interface (registrar(), modificar(), eliminar(), listar()
 y eliminarTodaBD())*/
public class DAOPersonaImp extends Conexion implements DAOPersona{

    @Override
    public void registrar(Persona per) throws Exception {
        
        try {
            /*Dentro del try, ya que puede existir una excepcion al tratar de 
            conectar a la BD, se usa el metodo conectar() que proporciona el 
            padre(Conexion)*/
            this.conectar();
            /*Se prepara el Statement con la consulata a realizar*/
            PreparedStatement ps = this.conexion.prepareStatement("INSERT INTO PERSONA (nombre) VALUES (?)");
            /*Se reemplaza el signo (?)  con el metodo setString()*/
            ps.setString(1, per.getNombre());
            /*Se ejecuta la consulta*/
            ps.executeUpdate();
        } catch (Exception e) {
            
            throw e;
        }finally{
            this.cerrar();
        }
        
    }

    @Override
    public void modificar(Persona per, String nombre) throws Exception {
        
        try {
            this.conectar();
            /*Se prepara el Statement con la consulata a realizar*/
            PreparedStatement ps = this.conexion.prepareStatement("UPDATE PERSONA SET nombre = ? WHERE nombre = ?");
            /*Se reemplaza el signo (?)  con el metodo setString()*/
            ps.setString(1, nombre);
            /*Se reemplaza el signo (?)  con el metodo setString() por el nombre
            ingresado por teclado*/
            ps.setString(2, per.getNombre());
            /*Se ejecuta la consulta*/
            ps.executeUpdate();
        } catch (Exception e) {
            /*Se lanza el posible error a una "capa" superior*/
            throw e;
        }finally{
            /*Se usa el metodo que proporciona el "Padre" cerrar() */
            this.cerrar();
        }
        
    }

    @Override
    public void eliminar(Persona per) throws Exception {
        
        try {
            this.conectar();
            /*Se prepara el Statement con la consulata a realizar*/
            PreparedStatement ps = this.conexion.prepareStatement("DELETE FROM PERSONA  WHERE nombre = ?");
            ps.setString(1, per.getNombre());
            /*Se ejecuta la consulta*/
            ps.executeUpdate();
        } catch (Exception e) {
            /*Se lanza el posible error a una "capa" superior*/
            throw e;
        }finally{
            /*Se usa el metodo que proporciona el "Padre" cerrar() */
            this.cerrar();
        }
        
    }

    @Override
    public List<Persona> listar() throws Exception {
        
        List<Persona> lista = null;
        try {
            lista = new ArrayList<>();
            this.conectar();
            /*Se prepara el Statement con la consulata a realizar*/
            PreparedStatement ps = this.conexion.prepareStatement("SELECT * FROM PERSONA");
            /*Se ejecuta la consulta*/
            ResultSet rs = ps.executeQuery();
                
            while(rs.next()){
                Persona p = new Persona();
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                lista.add(p);
            }
            
            /*Se cierra el ResultSet y el PrepareStatement para libertar 
            recursos*/
            rs.close();
            ps.close();
            
            
        } catch (Exception e) {
            /*Se lanza el posible error a una "capa" superior*/
            throw e;
        }finally{
            /*Se usa el metodo que proporciona el "Padre" cerrar() */
            this.cerrar();
        }
        /*Se retorna la lista llenada con objetos tipo persona*/
        return lista;
        
    }

    @Override
    public void eliminarTodaBD() throws Exception {
        
        try {
            this.conectar();
            /*Se prepara el Statement con la consulata a realizar*/
            PreparedStatement ps = this.conexion.prepareStatement("DELETE FROM PERSONA");
            /*Se ejecuta la consulta*/
            ps.executeUpdate();
        } catch (Exception e) {
            /*Se lanza el posible error a una "capa" superior*/
            throw e;
        }finally{
            /*Se usa el metodo que proporciona el "Padre" cerrar() */
            this.cerrar();
        }
        
    }
    
}
