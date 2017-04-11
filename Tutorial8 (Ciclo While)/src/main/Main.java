package main;

import java.util.Scanner;

/**
 *
 * @author Yojans
 */
public class Main {
    public static void main(String[] args) {
        /*Cliclo While,
        mientras ocurra lo que esta en el parentesis el ciclo seguira ejecutandose*/
        
        int edad;
        
        System.out.println("Ingrese su Edad"); //consulta por primera vez cual es la edad a ingresar
        Scanner input = new Scanner(System.in);
        edad= input.nextInt();
        
        while(edad<0 || edad>100){ 
        /*mientras la edad sea mayor a 100 o menor a 0 arrojara el mensaje 
        de edad no valida y consultara de nuevo en tecldo*/
            System.out.println("Su edad no es valida"); 
            System.out.println("Ingrese su Edad");
            input = new Scanner(System.in);
            edad= input.nextInt();
        }
        
        
        System.out.println("La edad ingresada es:"
                + edad
                + "(valida)\nBienvenido"); //imprime que la edad es valida y su valor 
        
    }
    
}
