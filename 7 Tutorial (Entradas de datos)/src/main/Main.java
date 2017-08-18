package main;

import java.util.Scanner;

/**
 *
 * @author Yojann
 */
public class Main {

    public static void main(String[] args) {
        //ingreso de datos desde teclado
        String texto;
        
        System.out.println("Ingrese su nombre ");
        Scanner input = new Scanner(System.in); 
        //con esta clase se puede tener acceso a los datos ingresados por teclado
        texto = input.next();
        //se guardan los datosen la variable inicializada como 
        System.out.println("Hola "+texto);
    }
    
}
