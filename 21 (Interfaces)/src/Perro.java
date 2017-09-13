/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
/*Con la palabra reservada "Implements" se  usan las interfaces y de alguna
manera se simula la herencia multiple (con el uso de herencia, extends solo 
se puede extender o heredar de una sola clase)*/

public class Perro implements Animal, Casa{
    
    private String nombre;
    private String color;
    private int edad;
    private String direccion = "Calle Colo-Colo";
    

    public Perro(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }
    
    public Perro() {
        this.nombre = "S/N";
        this.color = "S/C";
        this.edad = 0;
    }
    
/*Y es aqui en la clase en la que se implemeta la interface donde se crean o 
    sobreescriben los metodos, estrictamente (todos los declarados en la interfaz implementada)*/    
    @Override
    public void mostrarColor() {
        System.out.println("Color de la especie: "+ this.color);
    }
    
    @Override
    public void mostrarNombre() {
        System.out.println("Nombre de la especie: "+ this.nombre);
    }
    
/*A continuacion se muestra como la clase perro soporta multiples  
    implentaciones de diferentes interfaces*/    
    @Override
    public void mostrarDireccion() {
        System.out.println("Direccion del perro: "+ this.direccion);
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    

    
    
    
    
}
