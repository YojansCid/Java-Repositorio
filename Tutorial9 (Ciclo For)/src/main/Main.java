
package main;

import java.util.Scanner;

/**
 *
 * @author yoxx7
 */
public class Main {

    public static void main(String[] args) {
       //Ciclo For repite una sentencia las veces que se le indica
        System.out.println("Ingrese un numero de repeticiones:");
        Scanner input = new Scanner(System.in);
        int veces = input.nextInt();
        //con el contador i inicia el for en 1 y repite la sentencia n-veces
        for (int i=1;i<=veces;i++){
            System.out.println("Repeticion N°: "+i);
        }
        //tambien se pueden recorrer arreglos con el for
        String array[] = {"Facebook","Youtube","Twitter","Instagram"};
        for(int j=0;j<array.length;j++){ 
        //con el metodo del array .length nos da el numero de largo que tiene el array
            System.out.println("Primer tipo de For ["+array[j]+"] ");
        }
        //existe otra forma de recorrer un arreglo con un for
        for(String s:array){
            System.out.println("For corto "+s);
        }
    }
    
}
