
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
public class Ejemplo27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// Es optativo poner  el tipo de datosque tendra el HashSet        
       
        Set<String> lista = new HashSet<String>();
        Set lista2 = new HashSet();
        
        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("c");
        lista.add("c");
        
//No permite datos repetidos, no toma en cuenta valores que ya se hayan ingresado en el HashSet         
        for (String string : lista) {
            
            System.out.println(string);
//Imprime los datos en un orden "caotico", no en el orden en el que se ingresaron dichos             
            
        }
        
        
    }
    
}
