/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */

/*El uso de excepciones es crucial a la hora de querer manejar posibles errores 
dentro de un programa ya que es como poner una "red" al programa para que se 
caiga por completo, pudiendo asi manejar los posibles errores de la manera en 
la que sea mas conveniente para nosotros */

public class Ejemplo28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x = 100, y = 0, z;
        try {
            
            z = x/y;

            /*Mandara una excepcion matematica, al querer dividir un numero por cero y 
            "atrapara", con lo que se puede manejar de la forma en que queramos*/
            
        } catch(ArithmeticException ex){
            /*Existe Jerarquia en los catch, esto quiere decir que se pueden 
            colocar las excepciones ma especificas primero a modo de una primera
            "malla que atrapa errores". pero nunca se puede poner una mas general 
            y depues una mas especifica, por ejemplo poner Exception e (que es la 
            mas general que exite) antes de la ArithmeticException ex*/
            System.out.println("El programa tiene un error de [" + ex.getMessage() + "] y fue atrapado en el PRIMER CATCH");

        
        
        } catch (Exception e) {

            /*
            El bloque CATCH nos dice vajo cual excepcion caera el error, en este caso se 
 
            pone una general, que atrapa  todo tipo de errores ( Exception e).Cabe destacar

            que ser mas especifico en el tipo de error el cual se quiere "Atrapar" el rendimiento mejora*/   

            System.out.println("El programa tiene un error de [" + e.getMessage() + "] y fue atrapado en el SEGUNDO CATCH");
            
        }finally{

            /*El bloque finally siempre se ejecvutara*/            
            System.out.println("El bloque FINALLY se ejecuta de todas maneras");
        }
        
        
    }
    
}
