
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
public class Ejemplo25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//Las listas solo soportan datos de tipo objeto, no inmutables (ej: String, Integer, Etc) 


/*Es recomentdable usar el constructor del ArrayList() con parametros de 
capacidad inicial, por temas de rendimiento*/

        List <Integer> lista= new ArrayList();//constructor SIN capacidad inicial
        
        long tiempo_inicio = System.currentTimeMillis();//medicion tiempo inicial
        
/*Por cada vez que se agrega un elemento a la lista se ejecuta  una vez el 
        procesador para asignar un bloque de memoria*/        
        lista.add(1);//1 procesador 1 bloque
        lista.add(2);//1 procesador 1 bloque
        lista.add(3);//1 procesador 1 bloque
        lista.add(4);//1 procesador 1 bloque
        lista.add(5);//1 procesador 1 bloque
        
/*Se usa 5 veces el procesador*/        
   

/*Por temas de medicion se hace un FOR para agregar 1.000.000 de elementos en 
la lista y asi sea medible el tiempo para nosotros (que no sea tan pequeña 
la medicion del tiempo)*/

        for (int i = 0; i < 1000000; i++) {
            lista.add(i);
        }
        
        long tiempo_fin = System.currentTimeMillis();
        
//fin de la medicion del tiempo (medido en milisegundos), despues del llenado de la lista
        
        System.out.println("Tiempo que demoro en llenar una lista SIN capacidad inicial: " + (tiempo_fin-tiempo_inicio) + " ms");
 
        List <Integer> lista2= new ArrayList(1000005);//constructor CON capacidad inicial
        
        long tiempo_inicio2 = System.currentTimeMillis();

        //El procesador actuo solo una vez para asignar 
        lista2.add(1); //A cada bloque
        lista2.add(2);
        lista2.add(3);
        lista2.add(4);
        lista2.add(5);
        
        for (int i = 0; i < 1000000; i++) {
            lista2.add(i);
        }
        
        long tiempo_fin2 = System.currentTimeMillis();
        
        
        System.out.println("Tiempo que demoro en llenar una lista CON capacidad inicial: " + (tiempo_fin2-tiempo_inicio2) + " ms");      
        
    }

/*En sistemas de procesamiento alto cuando se tiene nocion del limite de procesos 
    que realizara el procesador es mejor dar una capacidad inicial, para darle 
    un plus de rendimiento al Software*/    
}
