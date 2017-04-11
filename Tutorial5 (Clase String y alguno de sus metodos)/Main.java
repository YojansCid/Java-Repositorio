
package main;

/**
 *
 * @author Yojans
 */
public class Main {

    public static void main(String[] args) {
        //tipo de datos "String" y algunos de  sus  metodos:
        
        String texto = "Hola", texto2= "Hola Mundo", texto3 = "Hola";
        //manejar los textos con String nos permite manipular el texto 
        
        //Entrega el caracter que este en la posicion indicada
        System.out.println(texto.charAt(1));//o
        
        //entrega numeros negativos si son diferentes textos y un 0 si son iguales
        System.out.println(texto.compareTo(texto2)+" osea, son distintos");
        System.out.println(texto.compareTo(texto3)+" osea, son iguales");
        
        //entrega un true si contiene la letra "o" en la  cadena de texto
        System.out.println("la o es contenida en el \"texto1\" = "+texto.contains("o"));
        
        //entrega la posicion en la que se encontro la letra indicada
        System.out.println("la letra o esta en la posicion: "+texto.indexOf("o"));
        //corta el string, le saca la letra que esta en la posicion 1
        System.out.println("subString sin la posicion 1: "+texto.substring(1));
        //deja el string desla la posicion indicada, hasta la posicion indicada
        System.out.println("subString desde la posicion indicada, hasta la posicion indicada"+texto.substring(1, 3));
        //indica el largo del texto
        System.out.println("el texto tiene un largo de: "+texto.length());
    }
    
}
