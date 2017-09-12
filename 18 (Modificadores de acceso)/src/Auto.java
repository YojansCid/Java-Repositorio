/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
public class Auto {

/**Los atributos tienen el modificador de acceso PRIVATE por lo que solo pueden 
 * ser accedidos por la clase, para tener control de estos  atributis desde afuera 
 * de la clase se usan los metodos Set() y Get()*/
    
    private int ruedas;//solo se tiene acceso en la clase
    public int puertas;//se tiene acceso desde otras clases
    protected String color;//se puede tener acceso solo si existe herencia
    int asientos; //default o package, puede ser accedido por parte del paquete en el que se encuentra el proyecto

/**El constructor tiene el tipo de modificador de acceso PUBLIC ya que asi puede
ser utilizado fuera de la clase, se puede tener acceso a los metodos y/o atributos*/    
    
    public Auto(int ruedas, int puertas, String color) {
        this.ruedas = ruedas;
        this.puertas = puertas;
        this.color = color;
    }

    
    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
