/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */

//IDEM que circulo
public class Cuadrado extends Figura{
    
    double lado;

    public Cuadrado(double lado, double x, double y) {
        super(x, y);
        this.lado = lado;
    }
    
/*Diferente comportamiento de la misma operacion (sacar el area)*/    
    @Override
    public double area() {
        return (lado*lado);
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    

    
    
    
    
}
