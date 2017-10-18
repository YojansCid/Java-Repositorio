/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
/*La siguiente clase crea un hilo a traves de la implementacion de la interface 
Runnable*/
public class HiloConInterface implements Runnable {
    
    String nombre;
    
    /*Constructor de la clase, solo se le da el nombre entregado como parametro*/
    HiloConInterface(String nombre){
        this.nombre = nombre;
    }
    
    /*Se sobreescribe el metodo run, lo que ejecutara el HILO al momento de usar
    el metodo start()*/
    
    @Override
    public void run() {
        
        for (int i = 0; i < 1000; i++) {
            System.out.println("HILO CON INTERFACE [" + this.nombre + "] [" + i + "]");
        }
        
    }
    
}
