/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
public class EdadExcepcion extends Exception{
  
    
    /*La exception creada solo hereda de su padre el metodo constructor y 
    devuelve en forma de String lo que le entreguemos como parametro a la hora 
    de instanciar y ocurra un errro*/
    public EdadExcepcion(String nombre){
        super(nombre);//Metodo del constructor del padre, "Exception"
        
    }
    
}
