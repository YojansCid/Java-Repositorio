
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
/*Se pueden crear nuestras poprias exceptions personalizadas con lo que nos 
ayudaria a manejar casos los cuales consideremnos errores o excepciones*/
public class Ejemplo30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws EdadExcepcion{ 
    //Se puede usar throws para señalar que se lanzara una exception dentro del codigo
        
        final int EDADMAXIMA = 100;//buena practica es inicializar las variables que no cambiaran como FINAL
        final int EDADMINIMA = 0;
        int edad;
    
    //Instancia de Scanner e ingreso de dato desde teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su EDAD:");
        edad = sc.nextInt();
        
        
        
        /*Si no se usa la palabra throws al inicio del metodo, lanzar una 
        exception se puede hacer normalmente a travez de un try/catch*/
        //try {
            if (edad > EDADMAXIMA || edad < EDADMINIMA){
                System.out.println("Edad ingresada no VALIDA");
            }else{
            
                throw new EdadExcepcion("Edad ingresada NO VALIDA");
                /*Lanza la exception creada por nosotros*/
         
            }
        /*} catch (Exception e) {
            
            System.out.println(e.getMessage());
                    
        }*/
        
            
    }
    
}
