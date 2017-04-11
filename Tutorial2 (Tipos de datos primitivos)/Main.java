
package main;

/**
 *
 * @author yoxx7
 */
public class Main {

    public static void main(String[] args) {
        
        //Tipos de datos primitivos, en Java existen muchos pero los mas usados son:
        
        int x, y, totalSuma; // Entero
        char c, cc, sumaLetras; // Un caracter
        float f,ff, totalSuma2; // Un numero decimal simple
        double d;// Doble de un int
        long l; // Entero muy grande
        byte b; // Entero pequeño
        String s, sumaLetras2;//Cadenas de texto
        
        
        x=1;
        y=3;
        totalSuma=x+y;
        System.out.println("La suma de los numeros enteros es: "+totalSuma);// imprime La suma de un par de enteros
        
        f = (float) 1.25;//es necesario castear el tipo de dato que son 
        ff = (float) 2.35;
        totalSuma2 = f+ff;
        System.out.println("La suma de los numeros decimales es: "+totalSuma2);// imprime La suma de un par de decimales
        
        c= 'a';
        cc='B';
        sumaLetras= (char) (c+cc);
        StringBuilder str = new StringBuilder(); //una objeto que manipula los char de major manera
        str.append(c); //metodo que agrega  letras al String
        str.append(cc);
        System.out.println("La suma de las letras como char es: "+sumaLetras);// imprime La suma de un par de letras
        //Imprime el  simbolo £ por que internamente los caracteres tienen un numero
        //asociado y la suma de los dos referencia al numero que tiene asignado el simbolo £
        System.out.println("La suma de las letras como StringBuilder es: "+str);// imprime La suma de un par de letras
    }
    
}
