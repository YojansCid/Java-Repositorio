/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
public class Ejemplo23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Como la documentacion menciona los Strng son de tipo inmutable, lo 
        que significa que no se pueden modificar una vez declaradas*/
        
        String texto = "Hola, ";
        
        texto+= "MUNDO";
        
        System.out.println(texto);
        
        /*Despues de esta demostracion se preguntaran; pero como que los String 
        son inmutables si acabo de modificar el valor original, lo que contradice 
        que algo sea inmutable?*/
        
        /*El operador + hace implicitamente la accion de la clase StringBuilder*/
        
        StringBuilder textoBuilder = new StringBuilder("Hola, ");
        textoBuilder.append("MUNDO");
        
        System.out.println(textoBuilder);
        System.out.println("************************************************");
        
        /*¿Cual es la diferencia entre los dos?, "texto" y "textoBuilder" Pues
        la diferencia es en rendimiento*/
        
        long tiempo_inicio = System.nanoTime();
//Entrega la medicion de timepo antes de iniciar el ciclo FOR en nano segundos
        
        
        StringBuilder builder = new StringBuilder("HOLA ");

/*El siguiente ciclo FOR agregara a "builder" el valor de i 1000 veces*/        
        for (int i = 0; i < 1000; i++) {
            builder.append(i);
        }
        long tiempo_fin = System.nanoTime();
//Entrega la medicion de timepo despues de terminar el ciclo FOR en nano segundos 

        long tiempo_diferencia = tiempo_fin-tiempo_inicio;
        
//la resta del tiempo final y el inicial da la cantidad de tiempo que se demoro en terminar el ciclo    

        System.out.println("Tiempo que se demoro en ejecutar la prueba con STRINGBUILDER " + tiempo_diferencia);
        
        
        
        System.out.println("/////////////////////////////////////////////////////");
        
        
        long tiempo_inicio2 = System.nanoTime();
        String string = "HOLA ";
        
/*El siguiente ciclo FOR agregara a "string" el valor de i 1000 veces*/            
        
for (int i = 0; i < 1000; i++) {
            string +=i;
        }
        long tiempo_fin2 = System.nanoTime();
        
        long tiempo_diferencia2 = tiempo_fin2-tiempo_inicio2;
        
        System.out.println("Tiempo que se demoro en ejecutar la prueba con STRING " + tiempo_diferencia2);
        
/*Como conclusion se puede decir que usar un objeto StringBuilder es mucho mas 
        rapido que usar el tipico String e incluso existe un ahorro de aproximadamente
        20 veces de lo que se demora usando el "+=" con un String*/
        
    }
    
}
