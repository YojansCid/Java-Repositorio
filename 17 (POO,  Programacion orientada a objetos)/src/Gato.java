/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Yojans Cid
 */
public class Gato extends Animal{
    
    private int pajaros_cazados;

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
    
  
    public void maullar(){
        System.out.println("miaaauuuu!!");
    }

    public int getPajaros_cazados() {
        return pajaros_cazados;
    }

    public void setPajaros_cazados(int pajaros_cazados) {
        this.pajaros_cazados = pajaros_cazados;
    }

    
    
    
    @Override
    public String toString(){
        return "ID: " + this.getId_animal() + "\tNombre: " + this.getNombre() + "\tTipo: "
                + this.getTipo() + "\tDueño: " + this.getDueño() + "\tPajaros cazados: " + this.pajaros_cazados;
    }
    
}
