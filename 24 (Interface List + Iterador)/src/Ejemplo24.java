
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
public class Ejemplo24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
/*List es interfaz, por lo que otras clases la  implentan de diferentes formas*/        
/*Para instanciar una lista de tipo ArrayList (Parecido a un array pero en forma
de objeto) se crea un objeto de tipo list especificando el tipo de dato que 
contendra dento de los simbolos mayor y menor que ("<>") seguido de el constructor
de ArrayList()*/  

        List<String> lista = new ArrayList();
        
/*List<>*Soporta un variado numero de constructores diferentes, para usos diferentes de listas*/

//Mas adelante seran explicados
        List<String> lista2 = new LinkedList();
        List<String> lista3 = new Vector();
        List<String> lista4 = new Stack();

/*Para agregar elementos al objeto lista se hace a travez del metodo "add()" 
        seguido de lo que se quiere agregar*/
        
        lista.add("Hola");
        lista.add(" yo");
        lista.add(" soy");
        lista.add(" MUNDO");

/*La forma mas comun de mostrar todos los datos o recorrer un array o un objeto 
        de tipo List es a travez de un ciclo FOR*/        
        for(String list : lista){
            
//Imprime cada dato ingresado en el ArrayList            
            System.out.println(list);
        }
        
        System.out.println("--------------------------------------");
        
/*Pero tambien se puede hacer a travez de un objeto llamado Iterator, que se 
        cre a travez  de una lista con el metodo "iterator()"*/  

        Iterator <String> iterador = lista.iterator();
        
/*Este tiene a su vez un metodo para ser recorrido o iterado que entrega un 
        boolean, que entrega un TRUE si al menos tiene  un elemento mas. 
        Iterator tambien tiene un metodo llamado "remove()" que remueve el 
        ultimo objeto retornado por "next()" */  

        while(iterador.hasNext()){
            
/*El metodo "next()" retorna el siguiente objeto y avanza el iterador*/
            System.out.println(iterador.next());
            
//Imprime cada dato ingresado en el ArrayList              
            Scanner sc = new Scanner(System.in);
            
 //Como dato, la clase Scanner, que se usa para ingresar datos desde teclado tambien es una clase tipo Iterator           
        }
    }
    
}
