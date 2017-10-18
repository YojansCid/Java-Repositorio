/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
/*La siguiente clase crea un hilo a traves de la herencia de Thread*/
public class HiloConHerencia extends Thread{
    
    String nombre;

    
    /*Constructor de la clase, solo se le da el nombre entregado como parametro*/
    HiloConHerencia(String nombre){
        this.nombre = nombre;
    }
    
    /*Se sobreescribe el metodo run, lo que ejecutara el HILO al momento de usar
    el metodo start()*/
    @Override
    public  void run(){
        
        for (int i = 0; i < 1000; i++) {
            System.out.println("HILO CON HERENCIA [" + this.nombre + "] [" + i + "]");
        }
        
    }
    
}
