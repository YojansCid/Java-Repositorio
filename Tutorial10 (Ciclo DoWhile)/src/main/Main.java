
package main;

/**
 *
 * @author Yojans
 */
public class Main {
    public static void main(String[] args) {
        //Ciclo Do-while
        int edad;
        do{ 
            System.out.println("Ingrese su nombre ");
            java.util.Scanner input = new java.util.Scanner(System.in); 
            edad = input.nextInt();
            
        } while (edad<18);
        System.out.println("Edad ingresada valida, Bienvenid@");
    }
    
}
