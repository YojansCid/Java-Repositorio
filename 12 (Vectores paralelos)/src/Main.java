
import java.util.Scanner;
/**
 *
 * @author Yojans Cid
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    
    /*El programa genera dos vectores, los cuales son llenados desde teclado 
    con los datos "nombre" y "edad" y luego aplica un filtro segun la edad*/
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] nombre = new String[3];
        int [] edad = new int[3];
        
        for(int i =0; i<nombre.length;i++){
            System.out.println("Ingrese el nombre: ");
            nombre[i] = input.next();
            System.out.println("Ingrese la edad: ");
            edad[i] = input.nextInt();
        }
        //Al ser vectores paralelos es mas facil ncontrar datos asociados a dichos vectores
        
        System.out.println("filtrar por edad: ");
        int filtro = input.nextInt();
        for(int i=0; i<nombre.length;i++){
            if(edad[i] == filtro){
                System.out.println("["+nombre[i]+" | "+edad[i]+"]");
            }
            
        }
        
        
    }
    
}
