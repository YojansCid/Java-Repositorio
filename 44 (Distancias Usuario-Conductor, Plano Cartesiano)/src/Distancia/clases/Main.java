package Distancia.clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Inicializa los objetos tipo usuario y conductor que son hijos 
        (o heredan) de la clase Ubicacion*/
        Usuario user1 = new  Usuario(3,2,"USUARIO1");
        Usuario user2 = new  Usuario(-5,2,"USUARIO2");
        Usuario user3 = new  Usuario(-3,9,"USUARIO3");
        
        Conductor conductor = new Conductor(0,0,"CONDUCTOR");
        
        /*Imprime la distanci que existe entre los usuarios y los conductores */
        System.out.println("La distancia entre el usuario y el conductor es: [ " + distancia(conductor,user1)+ " ]");
        
    }
    
    public static float distancia(Conductor c, Usuario u){
        /*Inicia las variables para hacer la resta entre las  ubicaciones "x" e 
        "y" de cada objeto (usuario y conductor)*/
        int varx = c.getX()-u.getX();
        int vary = c.getY()-u.getY();
        
        /*ocupa el calculo anterior para asi calcular la distancia entre ellos 
        por medio de la "ecuacion de la recta"*/ 
        
        //uso de la clase  estatica Math
        float distancia = (float)(Math.sqrt(Math.pow(varx, 2) + Math.pow(vary, 2)));
        //retorna la distancia entre el conductor y el usuario indicado
        return distancia;
    }
    
}
