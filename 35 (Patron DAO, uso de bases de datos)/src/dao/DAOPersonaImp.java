/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class DAOPersonaImp extends Conexion implements DAOPersona{

    @Override
    public void registrar(Persona per) throws Exception {
        
        try {
            this.conectar();
            PreparedStatement ps = this.conexion.prepareStatement("INSERT INTO PERSONA (nombre) VALUES (?)");
            ps.setString(1, per.getNombre());
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
            PreparedStatement ps = this.conexion.prepareStatement("UPDATE PERSONA SET nombre = ? WHERE nombre = ?");
            ps.setString(1, nombre);
            ps.setString(2, per.getNombre());
            ps.executeUpdate();
        } catch (Exception e) {
            
            throw e;
        }finally{
            this.cerrar();
        }
        
    }

    @Override
    public void eliminar(Persona per) throws Exception {
        
        try {
            this.conectar();
            PreparedStatement ps = this.conexion.prepareStatement("DELETE FROM PERSONA  WHERE nombre = ?");
            ps.setString(1, per.getNombre());
            ps.executeUpdate();
        } catch (Exception e) {
            
            throw e;
        }finally{
            this.cerrar();
        }
        
    }

    @Override
    public List<Persona> listar() throws Exception {
        
        List<Persona> lista = null;
        try {
            lista = new ArrayList<>();
            this.conectar();
            PreparedStatement ps = this.conexion.prepareStatement("SELECT * FROM PERSONA");
            
            ResultSet rs = ps.executeQuery();
                
            while(rs.next()){
                Persona p = new Persona();
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                System.out.println(rs.getString("nombre"));
                System.out.println(rs.getInt("id"));
                lista.add(p);
            }
            
            rs.close();
            ps.close();
            
            
        } catch (Exception e) {
            
            throw e;
        }finally{
            this.cerrar();
        }
        
        return lista;
        
    }
    
}
