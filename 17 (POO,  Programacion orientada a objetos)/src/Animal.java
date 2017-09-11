
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
public class Animal {

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


//Metodo  Main
        public static void main(String[] args) {
//Se inicializa un objeto tipo Scanner            
            Scanner sc = new Scanner(System.in);
            int num_animales = -1;//Bandera o indicador de estados
 
            
 //Se hace un TryCatch dentro de un doWhile para asegurar que lo ingresado sea un numero          
                do{
                   try{ 
                        System.out.println("Indique el numero de Animales que desea ingresar: ");
                        num_animales = sc.nextInt();
                    
                    
                    }catch(Exception e){
                        System.out.println("¡Cuidado!, Ingrese un numero");
                        sc.next();
                    }
                    
//si la bandera no cambia, entonces sigue dentro del ciclo DoWhile                    
                }while(num_animales == -1);

/**Se crea un Array de Animales con capacidad ingresada desde teclado*/                
            Animal animales[] = new Animal[num_animales];
            
/**Se ingresan los dastos del animal, hasta que se llenen n (Dato ingresado por teclado) animales y se agreguen al Array*/            
            for(int i = 0; i<num_animales; i++){
                Animal c = new Animal();
                System.out.println("Ingrese el nombre del animal (" + (i+1) + "): ");
                c.setNombre(sc.next());
                System.out.println("Ingrese el tipo del animal (" + (i+1) + "): ");
                c.setTipo(sc.next());
                System.out.println("Ingrese el si es que tiene dueño el animal (" + (i+1) + "): (si/no)");
                if(sc.next().equalsIgnoreCase("si") || sc.next().equalsIgnoreCase("yes")){
                    c.setDueño(true);
                }
                animales[i] = c;
            }
/**Imprime los animales (los datos o atributos) que estan dentro del array*/           
            for (Animal animal : animales) {
                System.out.println(animal.toString());
            }
            
            System.out.println("--------------------------------------------");
           
            System.out.println("Instanciacion de perros: ");
            
/**Se instancian Perros con diferentes constructores (principio de POLIMORFISMO)*/            
            Perro perro = new Perro("Shopper", true,  10);
            Perro perro2 = new Perro("Shopper", true);
            Perro perro3 = new Perro(5);
            Perro perro4 = new Perro();
/**Imprime los datos de cada "perro" en forma de String */            
            System.out.println(perro.toString());
            System.out.println(perro2.toString());
            System.out.println(perro3.toString());
            System.out.println(perro4.toString());
/**Se ejecuta un metodo en cual solo los perros pueden utilizar (ladrar())*/            
            perro.ladrar();
            
            System.out.println("--------------------------------------------");
            
            System.out.println("Instanciacion de gatos: ");
/**Se instancian "gatos" con diferentes constructores (principio de POLIMORFISMO)*/             
            Gato gato = new Gato("Plata", true,  24);
            Gato gato2 = new Gato("Plata", true);
            Gato gato3 = new Gato(7);
            Gato gato4 = new Gato();
            Gato gato5 = new Gato();
/**Imprime los datos de cada "gato" en forma de String */            
            System.out.println(gato.toString());
            System.out.println(gato2.toString());
            System.out.println(gato3.toString());
            System.out.println(gato4.toString());
/**Se ejecuta un metodo en cual solo los gatos pueden utilizar (maullar())*/              
            gato.maullar();
            
           
            
            
            
            



        }
    
}
