/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
/*Los HILOS son procesos que se pueden dejar "corriendo" mientras se ejecuta la 
rama principal del programa, se usan por ejemplo cuando se ejecuta una cancion o
se necesitan ejecutar mas de un proceso a la vez*/

/*En el siguienrte programa se crearan dos HILOS a partir de una clase que 
extiende (o es "hijo") de la clase "Thread" y otros dos HILOS que se crean a 
partir de la interface "Runnable". Ambos tipos de creaciones hacen que se 
imprima el nombre del HILO mas un numero de 1 a 1000, mostrando como ambos hilos
se procesan a la vez, ya que la impresion de los numeros se combina entre uno y 
otro*/
public class Ejemplo37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Se instancian dos hilos de tipo HiloConHerencia*/
        HiloConHerencia hilo1 = new HiloConHerencia("1 ");
        HiloConHerencia hilo2 = new HiloConHerencia("2 ");
        
        /*Se utiliza el metodo Start() para que el metodo sobreescrito Run() 
        empiece a ejecutar sus sentencias*/
        hilo1.start();
        hilo2.start();
        
        
        /*Se utiliza el metodo Static Esperar para que el programa se "detenga" 
        durante 3 segundo*/
        Ejemplo37.esperar(3);
        
        //Separacion entre tipos de creacion de HILOS
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("INICIO DE HILOS HECHOS A TRAVEZ DE INTERFACE (en 3 segundos...)");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        
        /*Se utiliza el metodo Static Esperar para que el programa se "detenga" 
        durante 3 segundo*/
        Ejemplo37.esperar(3);
        
        /*Se instancian dos hilos de tipo HiloConInterface*/
        Thread  thread1 = new Thread (new HiloConInterface("1"));
        Thread  thread2 = new Thread (new HiloConInterface("2"));
        
        /*Se utiliza el metodo Start() para que el metodo sobreescrito Run() 
        empiece a ejecutar sus sentencias*/
        thread1.start();
        thread2.start();
        
    }
    
    /*Metodo que hace que el programa espere durante unos segundos segun lo que 
    se le entregue como parametro*/
    public static void esperar (int segundos) {
        try {
            /*El metodo estatico sleep() de la clase Thread hace que el programe
            "se pause", se le entrega un int como milisegundos, pero al 
            multiplicarlo por 1000 se "comvierte" en segundos*/
            Thread.sleep (segundos*1000);
            
        } catch (InterruptedException e) {
            //Se imprime el error en el caso de que ocurriera
            e.getMessage();
        }
    }
    
}
