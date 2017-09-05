
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
public class Animal {

    /**
     * @param args the command line arguments
     */
        
        private String nombre;
        private boolean dueño;
        private String tipo;
        private int id_animal;
        private static int id =1;

    
        
        public static int count_id(){
                id++;
                return id;
        }

        public Animal(String nombre, boolean dueño, String tipo) {
            
            this.id_animal = this.id++;
            this.nombre = nombre;
            this.tipo = tipo;
            this.dueño = dueño;

        }

        public Animal(){
            this.nombre = "S/N";
            this.tipo = "S/T";
            this.dueño = false;
            this.id_animal = this.id++;
        }
        
        
        
        


        public String getNombre() {
            return nombre;
        }

        public boolean isDueño() {
            return dueño;
        }
        
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

        
        @Override
        public  String toString(){
            return "ID: " + this.id_animal + "\tNombre: " + this.nombre + "\tTipo: " + this.tipo + "\tDueño: " + this.getDueño();
        }



        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            int num_animales = -1;
            
                do{
                   try{ 
                        System.out.println("Indique el numero de Animales que desea ingresar: ");
                        num_animales = sc.nextInt();
                    
                    
                    }catch(Exception e){
                        System.out.println("¡Cuidado!, Ingrese un numero");
                        sc.next();
                    }
                    
                    
                }while(num_animales == -1);
                
            Animal animales[] = new Animal[num_animales];
                
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
           
            for (Animal animal : animales) {
                System.out.println(animal.toString());
            }
            
            System.out.println("--------------------------------------------");
            
            System.out.println("Instanciacion de perros: ");
            
            Perro perro = new Perro("Shopper", true,  10);
            Perro perro2 = new Perro("Shopper", true);
            Perro perro3 = new Perro(5);
            Perro perro4 = new Perro();
            
            System.out.println(perro.toString());
            System.out.println(perro2.toString());
            System.out.println(perro3.toString());
            System.out.println(perro4.toString());
            
            perro.ladrar();
            
            System.out.println("--------------------------------------------");
            
            System.out.println("Instanciacion de gatos: ");
            
            Gato gato = new Gato("Plata", true,  24);
            Gato gato2 = new Gato("Plata", true);
            Gato gato3 = new Gato(7);
            Gato gato4 = new Gato();
            Gato gato5 = new Gato();
            
            System.out.println(gato.toString());
            System.out.println(gato2.toString());
            System.out.println(gato3.toString());
            System.out.println(gato4.toString());
            
            gato.maullar();
            
           
            
            
            
            



        }
    
}
