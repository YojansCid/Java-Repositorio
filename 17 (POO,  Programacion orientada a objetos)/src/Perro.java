/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Yojans Cid
 */

/**Comentarios en la Clase Gato, ya que son identicos a los de perro*/
public class Perro extends Animal{
    
    private int huesos_comidos;

    public Perro(String nombre, boolean dueño) {
        super(nombre, dueño, "PERRO");
    }

    public Perro(String nombre, boolean dueño, int huesos_comidos) {
        super(nombre, dueño, "PERRO");
        this.huesos_comidos = huesos_comidos;
    }

    public Perro(int huesos_comidos) {
        this.huesos_comidos = huesos_comidos;
        this.setTipo("PERRO");
    }
   
    public Perro() {
        this.setTipo("PERRO");
    }
    
  
    @Override
    public void hablar(){
        System.out.println("waaaaaauuu!!");
    }

    public int getHuesos_comidos() {
        return huesos_comidos;
    }

    public void setHuesos_comidos(int huesos_comidos) {
        this.huesos_comidos = huesos_comidos;
    }
    
    
    
    @Override
    public String toString(){
        return "ID: " + this.getId_animal() + "\tNombre: " + this.getNombre() + "\tTipo: "
                + this.getTipo() + "\tDueño: " + this.getDueño() + "\tHuesos comidos: " + this.huesos_comidos;
    }
    
}
