
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
/*Para la escritura de archivos se deben utilizar dos tipos de clases. FileWriter y PrintWriter*/
public class Ejemplo32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        /*Declaracion de FileWriter y PrintWriter como NULL*/
        FileWriter archivo = null;
        PrintWriter printer = null;
        
        try {
            /*Se instancia el objeto FileWriter, dandole la ruta en donde se 
            encuentra el archivo como parametro del metodo*/
            archivo = new FileWriter("C:\\Users\\Yojans Cid\\Desktop\\Proyectos JAVA\\JavaTutoriales\\32 (Escritura de archivos)\\src\\archivos\\documento.txt");
            
            /*Se instancia el objeto PrinterWriter, dandole el objeto FileWriter como parametro*/
            printer = new PrintWriter(archivo);
            
            /*Con el metodo println del objeto printWriter se agrega un texto a un archivo*/
            printer.println("Escrito desde JAVA por Yojans");
            
            /*Si el archivo ya existe y se quiere agregar una linea y no 
            sobreescribir estas se agrega como parametro un boolean true al 
            instanciar el FileWriter*/
            //archivo = new FileWriter("C:\\Users\\Yojans Cid\\Desktop\\Proyectos JAVA\\JavaTutoriales\\32 (Escritura de archivos)\\src\\archivos\\documento.txt",true);

            
        } catch (Exception e) {
            //Exception
            System.out.println(e.getMessage());//Lanza el mensaje del error correspondiente
        }finally{
            /*Se ejecuta si o si*/
            /*Si el archivo es diferente de NULL este se cierra */
            if(archivo != null){
                archivo.close();
            }
        }
        
        
        
        /////////////////////////////////////////////////////////////
        
        
        
        /*El Try with resource indica que recurso se usara en el bloque try catch
        y al final de el bloque libera el recurso, ahorrandose el uso de del bloque
        FINALLY y asi hacer que el programa maneje los recursos mas eficasmente*/
        
        //ruta entregada con la ruta del archivo y un valor boolean TRUE, esto agrega texto, no lo sobreescribe
        try (FileWriter archivo2 = new FileWriter("C:\\Users\\Yojans Cid\\Desktop\\Proyectos JAVA\\JavaTutoriales\\32 (Escritura de archivos)\\src\\archivos\\documento.txt" , true)){
            
            
           
            printer = new PrintWriter(archivo2);
            
            /*Texto que se agrego a el archivo*/
            printer.println("Texto agregado, no sobreescrito!");
            
        } catch (Exception e) {
            //Exception
            System.out.println(e.getMessage());//Lanza el mensaje del error correspondiente
        }
        }
        
        
        
        
    }
    

