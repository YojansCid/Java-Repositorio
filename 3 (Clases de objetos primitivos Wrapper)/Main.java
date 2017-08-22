
package main;
/**
 *
 * @author yoxx7
 */
public class Main {

    public static void main(String[] args) {
        //Tambien existen tipos de datos que son como los primitivos, pero su contraparte en objetos o mas conocidos como Wrapper 
        
        Integer x = new Integer(55);
        System.out.println("El numero del objeto Integer es: "+x);
        
        // esto sirve para poder manipular el dato de mejor manera
        
        Integer i= null; //Pueden soportar ser igual a "null", con los primitivos no
        
        String str;
        str = "99";
        int numero = 1, suma;
        suma = numero + Integer.parseInt(str);
        
        /*con este metodo que nos brinda
        Integer se puede transformar el String a entero para asi manipularlo como queramos*/
        System.out.println("El numero de la suma del String y el Int es:" + suma);
    }
    
}
