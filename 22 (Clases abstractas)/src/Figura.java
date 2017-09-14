/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */

/*Las clases abstractas no se pueden instanciar, esto quiere decir que no puedo 
instanciar un objeto de tipo  FIGURA*/
public abstract class Figura {
    
    private double x;
    private double y;

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
/*Pero puedo declarar los metodos  y atributos que quiero que las subclases 
    (o clases hijas de esta) implementen de acuerdo a sus necesidades*/
    public abstract double area();

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    
    
    
    
}
