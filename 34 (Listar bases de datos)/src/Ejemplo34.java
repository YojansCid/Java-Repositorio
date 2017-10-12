
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
 *
 * @author Yojans Cid
 */
public class Ejemplo34 {

    /**
     * @param nombre
     */
    
    /*Al igual que en el ejemplo anterior es necesario descargar la libreria 
    necesaria para (en este caso), trabajar 
    con Postgres, llamada: postgresql-9.4-1201-jdbc41.jar
    e importarla en el proyecto. Para hacer esto se presiona click derecho en el
    proyecto y se dirige a la seccion de propiedades y presionar el boton de 
    agregar Jar, se elige la libreria y se agrega.
    
    Tambien crear una base de datos llamada "persona" con al menos una columna 
    llamada "nombre" de tipo varchar*/
    
    public void insertar(String nombre){
    
        //JDBC driver nombre y base de datos URL
        
        //Distingue que base de datos vamos a utilizar
        final String JDBC_DRIVER = "org.postgresql.Driver"; //com.mysql.jdbc.Driver
        
        //Ruta en la cual se hace la conexion a la BD llamada "Clientes"
        final String DB_URL = "jdbc:postgresql://localhost:5432/Clientes"; //com.mysql.jdbc.Driver
              
        //----------------------------------------------------------------------
        //Base de datos credenciales
        
        //usuario de la BD
        final String USER = "postgres";
        //password de la BD
        final String PASS = "postgres123";
        
        //----------------------------------------------------------------------
        /*se utiliza un try with resources para cerrar "conexion" y liberar 
        recursos apenas termine el bloque */
        try ( Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS)){
            Class.forName(JDBC_DRIVER);
                      
            /*Se crea un un insert para la base de datos con los datos ingresados
            como parametro de la función*/
            
            String query = "INSERT INTO PERSONA(nombre) values( (?))";
          
            /*Se seclara unavariable tipo PrepareStatement que prepara la 
            sentencia para ser procesada por la BD, dandole como parametro el 
            "INSERT" anteriormente hecho*/
            
            //PreparedStatement st  = conexion.prepareStatement(query);
            PreparedStatement st  = conexion.prepareStatement(query);
                    
            /*Aqui se cambian los datos por los que necesitamos con el numero 
            correlativo a los simbolos (?). Asi el primero se cambiara por el 
            valor de nombre, el segundo por el de fecha_nac y asi sucesivamente*/
            st.setString(1, nombre);
             
            /*Para que se ejecute el Statement o la sentencia se utiliza el 
            metodo "executeUpdate()"*/

            st.executeUpdate();
            
            /*Se cierra el Statement para liberar recursos*/
            st.close();
            
        } catch (Exception e) {
            
            /*Imprime el mensaje de la exceptions correspondiente si ocurre 
            un error*/ 
            System.out.println(e.getMessage());
        }
        
    }
    
    
    public void listar(){
        
    }
    
    
    public void eliminar(String nombre){
        
    }
    
    public void modificar(String nombre){
        
    }
    
    public static void main(String[] args) {
        
        Ejemplo34 ej = new Ejemplo34();
        String opcion;
        Scanner sc = new Scanner(System.in);
        
 
        do{
            
            System.out.println("Inrese una opcion");
            System.out.println("1: Insertar nombre en la BD.");
            System.out.println("2: Listar BD.");
            System.out.println("3: Modificar un nombre de la BD.");
            System.out.println("4: Eliminar nombre de la BD.");
            System.out.println("5: Eliminar TODA la BD. CUIDADO!!");
            System.out.println("0: Salir.");
            
            opcion = sc.next();
            switch(opcion){

                case "1":
                   System.out.println("Se INSERTARA un nombre en la BD");
                   System.out.println("Ingrese un nombre para  agregar a la BD.");
                   String nombre = sc.next();
                   ej.insertar(nombre);
                   break;
                case "2":
                    System.out.println("Se LISTARA la BD");
                   break;
                case "3":
                   System.out.println("Se MODIFICARA un nombre de la BD");
                   break;
                case "4":
                   System.out.println("Se ELIMINARA un nombre de la BD");
                   break;
                case "5":
                   System.out.println("Se ELIMINARA TODA la BD. CUIDADO!");
                   break;
                case "0":
                   System.out.println("SALIENDO...");
                   System.exit(0);
                   break;
                default:
                   System.out.println("Opcion ingresada NO VALIDA");
                   break;

            }
        }while( opcion != "0");    
        
    }
    
}
