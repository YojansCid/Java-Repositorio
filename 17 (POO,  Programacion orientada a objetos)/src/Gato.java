/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Yojans Cid
 */
//HERENCIA
/*Esta clase extiende de "Animal", o sea, hereda de la clase Animal, pudiendo
ahora usar todos los atributos y metodos de la clase "padre" "Animal". Este es un
principio de la programacion orientada a objetos; HERENCIA**/
public class Gato extends Animal{
    //**La clase Gato toene un atributo*/
    private int pajaros_cazados;
/**Tiene un par de constructores, lo que hace que se pueda instanciar con 
 * diferentes tipos de llamada y/o entrega y orden de parametros (POLIMORFISMO)*/
    public Gato(String nombre, boolean dueño) {
        super(nombre, dueño, "GATO");
    }

    public Gato(String nombre, boolean dueño, int pajaros_cazados) {
        super(nombre, dueño, "GATO");
        this.pajaros_cazados = pajaros_cazados;
    }

    public Gato(int pajaros_cazados) {
        this.pajaros_cazados = pajaros_cazados;
        this.setTipo("GATO");
    }
   
    public Gato() {
        this.setTipo("GATO");
    }
    
/**Un metodo que solo esta clase puede utilizar*/  
    public void maullar(){
        System.out.println("miaaauuuu!!");
    }
/**Metodos set() y get() (ENCAPSULAMIENTO)*/
    public int getPajaros_cazados() {
        return pajaros_cazados;
    }

    public void setPajaros_cazados(int pajaros_cazados) {
        this.pajaros_cazados = pajaros_cazados;
    }

    
    
/**Override de metodo toString() para imprimir los datos del objeto en forma de String*/    
    @Override
    public String toString(){
        return "ID: " + this.getId_animal() + "\tNombre: " + this.getNombre() + "\tTipo: "
                + this.getTipo() + "\tDueño: " + this.getDueño() + "\tPajaros cazados: " + this.pajaros_cazados;
    }
    
}
