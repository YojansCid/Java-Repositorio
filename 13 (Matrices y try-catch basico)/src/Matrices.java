
import java.util.Scanner;

/**
 *
 * @author Yojans Cid
 */
public class Matrices {
     /*Se crearan dos matrices, una con parametros declarados y otro que se 
    llene dinamicamente. luego se imprimiran los de
    no 
    la segunda matriz (b)*/
    public static void main(String[] args) {
        // se pueden inicializar matrices o vectores de esta forma, con valores
        int[][] a = {{1,2,3},{4,5,6}};
        //o solo declararlos sin valores
        int[][] b = new int[3][3];
        
        System.out.println("Mostrar lo que contiene la posicion 1,1 de la matriz A: ["+a[1][1]+"]");//output 5
        
        InicializarMatriz(b);
        System.out.println("La MATRIZ es: ");
        imprimirMatriz(b);//invoca al metodo para imprimir la matriz
        System.out.println("La diagonal de la MATRIZ es: ");
        imprimirDiagonal(b);
        imprimirFila(b);
        imprimirColumna(b);
    }
    
//Funcion que inicializa una matriz  
    public static void InicializarMatriz(int a[][]){
        System.out.println("Se inicializa la MATRIZ B: ");//output 5
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.println("Ingrese el numero para la FILA numero ["+i+"] y la COLUMNA ["+j+"]");
                a[i][j]=sc.nextInt();
            }
        }
    }
//Funcion que imprime una matriz
    public static void imprimirMatriz(int a[][]){
        int i;
        for (i=0;i<a.length;i++){
            for(int j = 0 ; j<a.length; j++){
                System.out.print("\t["+a[i][j]+"]");
//con print no da un salto de linea y asi se puede ver de mejor manera la matriz
            }
            System.out.println("\n");
        }
    }
//Funcion que imprime la diagonal de una matriz   
    public static void imprimirDiagonal(int a[][]){
        int i;
        for (i=0;i<a.length;i++){
            for(int j = 0 ; j<a.length; j++){
                if(i==j){
                    System.out.print("\t["+a[i][j]+"]");
                }else{
                    System.out.print("\t[*]");
                }
                
//con print no da un salto de linea y asi se puede ver de mejor manera la matriz
            }
            System.out.println("\n");
        }
    }
//Funcion que imprime una fila de una matriz      
    public static void imprimirFila(int a[][]){
        
        Scanner sc = new Scanner(System.in);
        int fila =-1;//se usa como bandera (marcadpr de estado)
        
        do{
            try{
                System.out.println("Ingrese que fila desea que se imprima (menor a 3 y mayor o igual a 0): ");
                fila = sc.nextInt();
                //intenta obtener los datos del teclado
            }catch(Exception e){
                System.out.println("¡Cuidado! Solo puedes ingresar números. ");
                //si ingresa un caracter que no sea numero es "atrapado" por el catch
                sc.next();
            }
            
        }while( fila == -1 || ( fila < 0 || fila >= 3 ));
        
        /*mientras la bandera siga igual, osea que la variable fila no haya
        cambiado o el numero ingresado sea igual o mayor a tres o sea inferior
        a 0 el ciclo se repetira*/
        
        for(int i=0;i<a.length;i++){
            for(int j = 0 ; j<a.length; j++){
                if(i==fila){
                    
                    //imprime solo la fila indicada por el teclado
                    
                    System.out.print("\t["+a[i][j]+"]");
                }else{
                    System.out.print("\t[*]");
                }
                
//con print no da un salto de linea y asi se puede ver de mejor manera la matriz

            }
            System.out.println("\n");
        }
    }
//Funcion que imprime una columna de una matriz      
    public static void imprimirColumna(int a[][]){
        Scanner sc = new Scanner(System.in);
        int columna =-1;
        
        do{
            //ocupa  el mismo procedimiento que "ImprimirFila()"
            try{
                System.out.println("Ingrese que fila desea que se imprima (menor a 3 y mayor o igual a 0): ");
                columna = sc.nextInt();
            }catch(Exception e){
                System.out.println("¡Cuidado! Solo puedes ingresar números. ");
                sc.next();
            }
            
        }while( columna == -1 || ( columna < 0 || columna >= 3 ));
        for (int[] a1 : a) {
            for (int j = 0; j<a.length; j++) {
                if (j==columna) {
                    System.out.print("\t[" + a1[j] + "]");
                } else {
                    System.out.print("\t[*]");
                }
//con print no da un salto de linea y asi se puede ver de mejor manera la matriz
            }
            System.out.println("\n");
        }
    }
 
}
