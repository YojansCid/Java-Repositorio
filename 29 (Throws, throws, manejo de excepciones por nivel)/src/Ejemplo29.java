/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */

/*El uso de exceptions se puede manejar en forma de niveles, cuando se llama a 
un metodo dentrro de otro el cual tiene un error u exception*/
public class Ejemplo29 {

    /**
     * @param args the command line arguments
     */
    
    
        private void metodo1(){
            try {
                //intenta llamar al metodo3()
                metodo2();
            } catch (Exception e) {
                /*Se recibe el error desde "metodo2()" y se imprime en forma de 
                String */
                System.out.println(e.getMessage());
                
                /*Ademas para "dar cuenta" que el error fue tratado por el 
                "metodo1()" se imprime un texto*/
                System.out.println("Excepcion manejada en el [1° NIVEL]");

            }
  
        }
        
        
        private void metodo2() throws Exception{
            try {
                //intenta llamar al metodo3()
                metodo3();
                
            } catch (Exception e) {
                
                /*Se recibe el mensaje de la exception del "metodo3" en forma de String */
                System.out.println(e.getMessage());
                /*Se envia el error a un nivel superior para ser tratado (throw)*/
                throw new Exception("Enviando la excepcion a un nivel superior desde el [2° NIVEL]");
            }
        }
        
        private void metodo3() throws Exception{
            /*En el metodo tres se provoca un error a proposito para mostrar el manejo del exceptions, "arrojandola" a un nivel mayor (el metodo que llamo al tercer metodo, en este caso el segundo metodo)*/
            int x= 10, y =0, z;
            try {
                //error provocado a proposito (ArithmeticalException)
                z = x/y;
            } catch (Exception e) {
                /*Gracias al uso de throw y una instancia de Exception() se 
                manda a un nivel superior (metodo que llamo a este)*/
                throw new Exception("Enviando la excepcion a un nivel superior desde el [3° NIVEL]");
                /*Se puede enviar simplemente un throw declarado*/
                //throw e;
            }
        }
        
        
        /*Se puede lanzar un error u Exception a con la palabra reservada "throw" 
        y una instancia de alguna de las Exception disponibles (Exception e 
        (la mas general), ArithmeticException, NullPointerException, etc )*/
        private void lanzarError(){
            throw new ArithmeticException();
        }
    
    
    
    public static void main(String[] args) {
        
        
        /*Instancia de la clase Ejemplo29 y llamada del metodo "metodo1()" que 
        llama al "metodo2()" y a su vez este llama a el "metodo3()" que provoca 
        el error intencionalmente*/
        Ejemplo29 se = new Ejemplo29();
        se.metodo1();
        
        /*Se puede lanzar un error a proposito con el metodo "lanzarError()"*/
        //se.lanzarError();
        
    }
    
    
    
    
    
    
    
}
