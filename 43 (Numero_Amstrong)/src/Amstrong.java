
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
public class Amstrong {

    /**
     * @param args the command line arguments
     */
    /*El siguiente programa solicita un numero y verifica, imprimiendo en }
    pantalla si el  numero ingresado es o no Amstrong, por Ej.(153 es de 
    Armstrong ya que este posee 3 dígitos y la suma de cada uno de sus dígitos 
    elevado a 3 es igual a 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153)*/
    
    public static void main(String[] args) {
        //se pide un numero para  comprobar si es Amstrong  o no
        System.err.println("Ingrese un numero para comprobar si es Amstrong");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        //Metoso que comprueba si el nuemro ingresado esAmstrong o no
        comprobarAmstrong(numero , contarDigitos(numero));
        
    }
    //Metodo que retorna el numero de digitos que tiene el numero
    public static int contarDigitos(int x){
        int aux=x, count=1;
        while(aux >= 10){
            aux = aux/10;
            count++;
        }
        return count;
          
    }
    //Metodo que describe si un numero es Amstrong o no
    public static  void comprobarAmstrong(int x,int contador){
        int aux = x, aux2, suma = 0,i=0;
        /*mientras el ciclo no se repita la cantidad de veces igual al numero 
        de digitos del numero , se seguira ejecutando*/
        while(i < contador){
            //se obtiene el ultimo digito del numero
            aux2 = aux%10;
            /*Se va asumando la potencia de cada numero con la cantidad de 
            digitos que tiene el numero*/
            suma = (int) (suma + Math.pow(aux2,contador));
            /*Imprime el resultado de la potencia de cada numero con la cantidad
            de digitos  que tiene el numero*/
            System.out.println("[ "+(int)(Math.pow(aux2,contador))+" ]"); 
            /*Se divide el numero para quitarle el ultimo numero y continuar 
            con la operacion*/
            aux = aux/10;
            i++;
        }
        /*Imprime el resultado de la suma de las potencias*/
        System.out.println("[ "+suma+" ]");
        //Bifurcacion que inprime si el numero ingresado es o no Amstrong
        if(suma == x){
            System.out.println("El numero Ingresado SI es Amstrong");
        }else{
            System.out.println("El numero Ingresado NO es Amstrong");
        }
        
    }
    
    
}
