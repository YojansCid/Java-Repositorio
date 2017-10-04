
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
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

/*El uso de archivos en Java, ejemplos basicos*/
public class Ejemplo31 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
        /*Se creo un ruta en la ruta que se le dara como parametro al 
        constructor de "File"*/
        
        /*Es necesario cambiar las rutas a una que tengamos en nuestro PC y que
        el archivo en la ruta se llame "archivo.txt" para que todo funcione*/
        
        File ruta = new  File("C:\\Users\\Yojans Cid\\Desktop\\Proyectos JAVA\\JavaTutoriales\\31 (File)\\src\\Archivos\\archivo.txt");
        
        //Nos apoyamos en un lector FileReader, indicandole la ruta en donde se encuentra el archivo
        FileReader lectorArchivo = new FileReader("C:\\Users\\Yojans Cid\\Desktop\\Proyectos JAVA\\JavaTutoriales\\31 (File)\\src\\Archivos\\archivo.txt");
        
        //Permite recorrer el archivo entregado como parametro
        BufferedReader buffer = new BufferedReader(lectorArchivo);
        
        String linea;
        /*Se declara una variable linea, ya que buffer.readLine() 
        retorna un String y se compara si es distinto a NULL para asegurarse 
        que existan lineas a leer*/
        
        
        while((linea = buffer.readLine()) != null ){
            //el ciclo whiile repite el proceso de lectura hasta que no queden lineas por leer
            System.out.println(linea);//imprime linea por linea del archivo
        }
        //Cada vez que se abre un archivo, es necesario cerrarlo para evitar malos funcionamientos
        buffer.close();
        
        System.out.println("--------------------------------------");
        /*Lectura de un archivo con la clase FileInputStream*/
        
        /*El uso de FileInputStream es maas comun en la lectura de datos de tipo
        bite, por ejemplo imagenes, etc. Ya que entrega las lecturas en forma de
        numeros (Cabe destacar que si no existen lineas por leer en el archivo 
        especificado in.read() retorna un int -1)*/
        
        //se entrega la ruta en la que esta el archivo
        FileInputStream in = new FileInputStream("C:\\Users\\Yojans Cid\\Desktop\\Proyectos JAVA\\JavaTutoriales\\31 (File)\\src\\Archivos\\archivo.txt");
        //int respuesta = in.read();//lectura de el archivo especificado
        //if(respuesta != -1){//si encuentra alguna linea la imprime
        //    System.out.println(respuesta);//imprime un 72, lo que no es legible para nosotros 
        //}
        
        /*Como la lectura de esta forma no nos es legible se puede hacer un 
        "artificio" para hacer funcionar la lectura*/
        
        
        /*Se instancia un objeto tipo Scanner y se le da como parametro el objeto
        FileInputStream y el formato que tiene el archivo, en este caso como 
        estamos en español sera "UTF-8"*/
        
        Scanner sc = new Scanner(in, "UTF-8");
        //mientras exista una siguiente linea, esta se imprimira
        while (sc.hasNext()){
            System.out.println(sc.next());
        }
        in.close();//cierre de el archivo para liberar memoria y evitar malos funcionamientos
        
        //La siguiente ruta se usara como forma de cambiarle el nombre al archivo
        File rutaCambioNombre = new  File("C:\\Users\\Yojans Cid\\Desktop\\Proyectos JAVA\\JavaTutoriales\\31 (File)\\src\\Archivos\\archivoCambioNombre.txt");
        
        //La siguiente ruta se usara para agregar un directorio en la ruta especificada
        File ruta2 = new  File("C:\\Users\\Yojans Cid\\Desktop\\Proyectos JAVA\\JavaTutoriales\\31 (File)\\src\\Archivos\\DirectorioCreado\\");
        
        //La siguiente ruta se usara para agregar multiples directorios en la ruta especificada
        File ruta3 = new  File("C:\\Users\\Yojans Cid\\Desktop\\Proyectos JAVA\\JavaTutoriales\\31 (File)\\src\\Archivos\\DirectoriosMultiplesCreado1\\DirectoriosMultiplesCreado2\\DirectoriosMultiplesCreado3\\");
        
        
        /*El siguiente metodo entrega un boolean true si existe la ruta especificada*/
        boolean respuestaExiste = ruta.exists();
        
        /*El siguiente metodo entrega un boolean true si se logra cambiar el 
        nombre del archivo especificado en la ruta*/
        //boolean respuestaCambioNombre = ruta.renameTo(rutaCambioNombre);
        
        /*El siguiente metodo entrega un boolean true si se logra eliminar el 
        archivo especificado en la ruta*/
        //boolean respuestaEliminar = ruta.delete();
        
        /*El siguiente metodo entrega un boolean true si se logra crear el 
        directorio especificado la ruta especificada*/
        boolean respuestaCrear = ruta2.mkdir();
        
        /*El siguiente metodo entrega un boolean true si se logra crear los 
        multiples directorios en la la ruta especificada*/
        boolean respuestaCrearMultiples = ruta3.mkdirs();
        
        System.out.println("Respuesta de EXISTENCIA DE DIRECTORIO[" + respuestaExiste + "]");
        //System.out.println("Respuesta de CAMBIO DE NOMBRE DE ARCHIVO[" + respuestaCambioNombre + "]");
        //System.out.println("Respuesta de ELIMINACION DE DIRECTORIO [" + respuestaEliminar + "]");
        System.out.println("Respuesta de CREACION DE DIRECTORIO [" + respuestaCrear + "]");
        System.out.println("Respuesta de CREACION MULTIPLE DE DIRECTORIOS [" + respuestaCrear + "]");
        
        
    }
    
}
