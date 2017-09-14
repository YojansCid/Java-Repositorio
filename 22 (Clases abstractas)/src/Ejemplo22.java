/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
public class Ejemplo22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Figura r = new Circulo(2, 4, 5);
        System.out.println("El  area de la figura CIRCULO es: "+r.area());
        
        Figura c = new Cuadrado(3, 6, 6);
        System.out.println("El  area de la figura CUADRADO es: "+c.area());
        
    }
    
}
