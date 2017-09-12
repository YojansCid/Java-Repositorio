
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
public class Main {
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
                Animal c = new Perro();
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
            Animal perro5 = new Perro("boby", true);//Un objeto de tipo animal puede ser instanciado como PERRO, ya que existe herencia
            
/**Imprime los datos de cada "perro" en forma de String */            
            System.out.println(perro.toString());
            System.out.println(perro2.toString());
            System.out.println(perro3.toString());
            System.out.println(perro4.toString());
/**Se ejecuta un metodo en cual solo los perros pueden utilizar (ladrar())*/  
            
            perro.hablar();
            perro5.hablar();//Este perro es producto de la instanciacion de un animal con el constructor de perro()
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
            gato.hablar();
            
           
            
            
            
            



        }
    
}
