/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
//Uso de extends para indicar que es una subclase de la clase FIGURA
public class Circulo extends Figura{
    
    private double radio;

/*Se implementa el metodo circulo() de acuerdo a las necesidades de la clase, en
    este caso la forma de sacar el area de un circulo es diferente a la de las
    otras figuras posibles (necesita otro comportamiento para realizar la misma 
    funcion)*/    
    
    public Circulo(double x, double y, double radio) {
        super(x, y);
//usa el constructor de la clase padre, con los parametros definidos en este
        this.radio = radio;
    }
    
    
/*Para usar la clase abstracta estoy OBLIGADO a implementar o sobreescribir 
    (@Override) los metodos definidos por la clase abstracta y padre, en este 
    caso la clase FIGURA*/
    @Override
    public double area() {
/*Math.PI entrega el numero PI, al ser parte de la clase MATH se pueden usar 
        los metodos y atributos de clase de esta*/        
        return Math.PI*(radio*radio);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
    
    
    
}
