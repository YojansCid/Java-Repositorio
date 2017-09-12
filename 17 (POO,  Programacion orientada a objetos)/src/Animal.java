
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */


/*Los pilares de la programacion orientada a objetos son 4; Herencia, Polimorfismo,
encapsulamiento y Abstraccion. Los cuales en conjuntos nos brindan un paradigma de 
programacion solido y lleno de buenas practicas*/

/*constructores: Sirven para instanciar un nuevo objeto de la clase; es el metodo
que inicializa las variables a utilizar por un objeto*/

public abstract  class  Animal {
    
/*esta clase es ABSTRACT ya que uno de los metodos no se crea sino que solo se 
    "declara" y se obliga asi a implemetar y/o hacer un @Override de los metodos
    en los hijos de dicha herencia*/

    /**
     * @param args the command line arguments
     */
        //se declaran las variables de la clase
/*Al hacer la declaracion de los atributos se aplica el concepto de  ABSTRACCION,
   ya que se extraen los atributos y comportamientos (METODOS) que se usaran 
   desde el "Mundo Real"*/
    
        private String nombre;
        private boolean dueño;
        private String tipo;
        private int id_animal;
        private static int id =1;
        
/*variable que se usa para agregar un ID a un animal, al ser "static" cada vez que 
   se le agrega 1 (+=1) este aumenta cada vez que se usa , en este caso*/

/*Esta clase tiene mas de un constructor por lo que un objeto de esta clase se 
   puede instanciar de diferentes formas, entregandoles a la funcion a usar  los
   parametros requeridos y en el orden requerido, al hacer esto se aplica el concepto
   de POLIMORFISMO
   */
        
//Constructor que inicializa todas las variables de la clase 
        public Animal(String nombre, boolean dueño, String tipo) {
            
            this.id_animal = this.id++;
            this.nombre = nombre;
            this.tipo = tipo;
            this.dueño = dueño;

        }

//Construtor que inicializa  los datos y los deja en un estado "default"        
        public Animal(){
            this.nombre = "S/N";
            this.tipo = "S/T";
            this.dueño = false;
            this.id_animal = this.id++;
        }
        
        public abstract void hablar();
        /** Metodo que es solo declarado por lo que la crecion de este se hace 
         * en los hijos de esta clase*/
        
        

/*Declaracion de los metodos "get" (obtener datos  especificos de el objeto)*/
       
/*Haciendo los metodos Get y Set se implementa el concepto de ENCAPSULAMIENTO,
   al hacer privados los atributos  y solo hacerlos accesibles por medio de estos
   metodos*/        
        public String getNombre() {
            return nombre;
        }

        
//isDueño() retorna si el atributo dueño  es TRUE o FALSE
        public boolean isDueño() {
            return dueño;
        }
//getdueño() retorna si el animal tiene dueño o no en forma de String        
        public String getDueño(){
            if(this.dueño){
                return "SI";
            }else{
                return "NO";
            }
        }

        public String getTipo() {
            return tipo;
        }

        public int getId_animal() {
            return id_animal;
        }
        
                
        public static int getId() {
        return id;
        }


        
/*Metodos que setean un atributo de un objeto dado*/        
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setDueño(boolean dueño) {
            this.dueño = dueño;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public void setId_animal(int id_animal) {
            this.id_animal = id_animal;
        }
      
        public static void setId(int id) {
            Animal.id = id;
        }

 
/*Se sobreescribe el metodo toString() para hacer que muestre todos los atributos
   ede un objeto*/        
        @Override
        public  String toString(){
            return "ID: " + this.id_animal + "\tNombre: " + this.nombre + "\tTipo: " + this.tipo + "\tDueño: " + this.getDueño();
        }



    
}
