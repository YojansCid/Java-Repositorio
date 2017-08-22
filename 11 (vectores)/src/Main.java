
import java.util.Scanner;
/**
 *
 * @author Yojans Cid
 */
public class Main {
    
    /**Se creara un vector con un tamaño indicado por teclado y cada 
    espacio o indice del vector se llenara con numeros Random()*/
    
    public static void main(String[] args) {
        System.out.println("Ingrese el tamaño del vector: ");
        Scanner input = new Scanner(System.in);
        
        int tamano = input.nextInt();
        int a[] = new int[tamano];
        
        for (int i=0;i<tamano;i++){
        a[i]=(int) (Math.random() * 100) + 1;
        }
        System.out.println("Los numeros del vector, en estado desordenado son: ");
        imprimirVector(a);
        // imprime el vector generado con numeros random
        System.out.println("Al aplicar un metodo de ordenamiento BubbleSort queda");
        a=bubbleSort(a);
        imprimirVector(a);
        /*ordena los numeros del vector con el metodo de ordenamiento 
        bubbleSort y lo imprime*/
        
    }
    
    //funcion que imprime un vector
    public static void imprimirVector(int a[]){
        int i;
        for (i=0;i<a.length;i++){
        
            System.out.println("\n["+a[i]+"]");
        }
    }
    //funcion bubbleSort
    public static int[] bubbleSort(int a[]){
        int aux;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    aux=a[j];
                    a[j]=a[i];
                    a[i]=aux;
                }
            }
        }
        return a;
    }
    
}
