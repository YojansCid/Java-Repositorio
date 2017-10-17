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
/*La siguiente interface declarara los metodos que seran implementados por la 
clase DAOPersonaImp, esto se usa algo asi como una plantilla con los metodos que
deben usarse a la hora del manejo de la BD*/
public interface DAOPersona {
    
    /*Cada nombre de los metodos es autoexplicativo con lo que hara en la BD*/
    
    public void registrar(Persona per) throws Exception;
    public void modificar(Persona per, String nombre) throws Exception;
    public void eliminar(Persona per) throws Exception;
    public void eliminarTodaBD() throws Exception;

    /**
     *
     * @return
     * @throws Exception
     */
    public List<Persona> listar() throws Exception;
    
}
