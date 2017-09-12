/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
public class Animal {
    
    private int patas;
    private String tipo;
    private String nombre;

    public Animal(int patas, String tipo, String nombre) {
        this.patas = patas;
        this.tipo = tipo;
        this.nombre = nombre;
    }
    
    
    public void rugirDeInstancia(){
        System.out.println("El animal "+ this.nombre+ " esta rugiendo!");
    }
    
    public static void rugirDeClase(){
        System.out.println("El Animal esta Rugiendo!!");
    }
    

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
    
}
