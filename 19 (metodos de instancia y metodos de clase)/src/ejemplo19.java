/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
public class ejemplo19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*Instancia del objeto Animal*/        
        Animal a = new Animal(4, "perro","shopper");

/*Metodo parte del objeto recien instanciado, solo se puede acceder a ese 
 * metodo a travez de una instancia de un objeto*/        
        a.rugirDeInstancia();

/*Metodo de clase, que no necesita una instancia de un objeto, ya que es de 
 * tipo STATIC el metodo se puede usar con el nombre de la clase seguida de un 
 * punto y el nombre del metodo estatico (Animal.rugirDeClase())*/        
        Animal.rugirDeClase();
    }
    
}
