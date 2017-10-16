/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Ejemplo.Persona;
import java.util.List;
/**
 *
 * @author Yojans Cid
 */
public interface DAOPersona {
    
    
    public void registrar(Persona per) throws Exception;
    public void modificar(Persona per, String nombre) throws Exception;
    public void eliminar(Persona per) throws Exception;

    /**
     *
     * @return
     * @throws Exception
     */
    public List<Persona> listar() throws Exception;
    
}
