
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
public class NewtonRamphson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float x , e;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un N° (x)");
        x = sc.nextFloat();
        
        System.out.println("Ingrese un N° (e)");
        e = sc.nextFloat();
        
        float resultado = raizCuadrada(x,e);
        
        System.out.println("EL RESULTADO ES:  " + resultado);
        
        
    }
    
    public static float raizCuadrada(float x, float e){
        float a = 1;
        if (x<0)return -1;
        while (Math.abs((Math.pow(a, 2) - x)) >= e){
            a = ((x/a)+a)/2;
            
            System.out.println("[" + a + "]");
        }
        
        return a;
        
        
    }
    
}
