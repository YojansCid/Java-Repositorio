
package main;

/**
 *
 * @author Yojans
 */
public class Main {

    public static void main(String[] args) {
        //Ciclo "if", bifurcaciones
        
        int x = 50;
        int y = 60;
        int numeroMayor, numeroMayor2;
        if(x<y){ //pregunta si x es menor a 60, entra en el ciclo
            numeroMayor=y; //se le asigna el numero myor a la variable
            System.out.println("X es menos que Y, el numero mayor es: "+ numeroMayor);
        }else{
                //si x no cumple la condicion que esta en el if entra en el else
            numeroMayor=x; //se le asigna el numero myor a la variable
            System.out.println("X es mayor que Y, el numero mayor es: "+ numeroMayor);
        }
        
        
       numeroMayor2 = (x<y)? y:x;// se asigna el valor de la variable mayor con un "if corto"
       System.out.println("el numero mayor es: "+ numeroMayor2);
        
    }
    
}
