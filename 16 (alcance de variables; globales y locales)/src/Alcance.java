
/**
 *
 * @author Yojans Cid
 */
public class Alcance {

    private int edad = 24;//variable Global
    
    public void mostrarEdad(){      
        System.out.println("Variable Global "+edad);
/*Al no inicializar dentro del metodo la variable "edad", dicho metodo toma como
referencia la variable global ya inicializada (en el editor se puede notar el 
        color verde al igual que la variable de mas arriba)*/
    }
    
    public void mostrarEdad2(){
/*En este caso se inicializa una variable con el mismo nombre que la variable 
global, pero en este caso se toma en cuenta el valor dado de forma local, dentro
de el metodo (23). Se puede ver en el editor el color amarillo de la variable al
 ser usada en el "println" al igual que en la inicializacion de mas arriba*/
        int edad =23;
        System.out.println("Variable Local: "+edad);
    }
    
    public static void main(String[] args) {
        Alcance a = new Alcance();
        a.mostrarEdad();
        a.mostrarEdad2();
    }
    
}
