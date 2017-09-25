
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
public class Ejemplo26 {

    /**
     * @param args the command line arguments
     */
    
    //El uso de HashMap se hace a travez de llaves que se le asocian a un dato, algo asi como una dupla de daots
    public static void main(String[] args) {
        
    //HashMap() se puede declarar como un HashMap o Map    
        HashMap  hashMap = new HashMap();
        Map  hashMap2 = new HashMap();
    
    //Con el metodo put() se le pueden agregar datos y sus respectivas llaves asociativas    
        hashMap.put("usuario", "Yojans");
        
    //Ya que existe la clave en la que se  esta tratando de ingresar datos este se reescribe    
        hashMap.put("usuario", "Inger");
        hashMap.put("direccion", "Pedro aguirre Cerda #535");
        hashMap.put("tatuajes", "8");
    
    /*El metodo containsKey() regresa un dato de tipo BOOLEAN true si la llave
        ingresada como parametro existe en el HashMap*/    
        boolean contieneLlave = hashMap.containsKey("direccion");
        
        
        System.out.println(contieneLlave);
        
    /*Se imprime dos de los datos ingresados en el HashMap uniendolos en un String*/    
        System.out.println("La señorita [" + hashMap.get("usuario").toString() + "] tiene [ " + hashMap.get("tatuajes").toString() + " ] tatuajes");
       // System.out.println(hashMap.get("usuario").toString());
        
        
    }
    
}
