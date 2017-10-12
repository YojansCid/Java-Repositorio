
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
public class Ejemplo33 {

    /**
     * @param args the command line arguments
     */
    /*En el uso de la API que proporciona JAVA llamada JDBC (Java Data Base 
    Connectivity) 
    ayuda a interactuar con diferentes bases de datos como por ejemplo mySql, 
    PostgreSQL, SQL Server, etc. 
    
    Para que el programa funcione es necesario crear
    una BD postgreSQL en nuestro PC con los nombres especificados o de otra 
    forma cambiar los nombres de los atributos, etc desde el codigo.
    
    La tabla creada tiene como nombre "persona" y dicha tabla tiene 7 columnas, 
    estas son : id, nombre, fecha_nacimiento, sexo, email y puntos. Todos de 
    tipo Character,esto por metodos de demostracion, ya que en java pueden ser 
    tratados como String
    
    Ademas es necesario descargar la libreria necesaria para (en este caso) trabajar 
    conPostgres, llamada: postgresql-9.4-1201-jdbc41.jar
    e importarla en el proyecto. Para hacer esto se presiona click derecho en el
    proyecto y se dirige a la seccion de propiedades y presionar el boton de 
    agregar Jar, se elige la libreria y se agrega*/
    public static void main(String[] args) {
        
        
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
        //Datos ingresados desde teclado
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su fecha de nacimiento: ");
        String fecha_nac = sc.nextLine();
        System.out.println("Ingrese su fecha de sexo: ");
        String sexo = sc.nextLine();
        System.out.println("Ingrese su telefono: ");
        String telefono = sc.nextLine();
        System.out.println("Ingrese su email: ");
        String email = sc.nextLine();
        System.out.println("Ingrese su Puntos de la tienda: ");
        String puntos = sc.nextLine();
        
        
        //----------------------------------------------------------------------
        /*se utiliza un try with resources para cerrar "conexion" y liberar 
        recursos apenas termine el bloque */
        try ( Connection conexion = DriverManager.getConnection(DB_URL, USER, PASS)){
            Class.forName(JDBC_DRIVER);
            
            
            /*Se crea un un insert para la base de datos con los datos ingresados
            por  teclado*/
            
            /*Existen diferentes formas de formular una consulta:*/
            
            //La 1° concatenando todo en un String y dandoselo a PrepareStatement
            String query = "INSERT INTO PERSONA(nombre,fecha_nacimiento, sexo, "
                    + "telefono, email, puntos) values('" + nombre + "' , '" 
                    + fecha_nac + "' , '"  + sexo + "' , '"  + telefono + "' , '"
                    + email + "' , '"  + puntos + "')";
            
            
            /*La 2° haciendo que los datos sean reemplazados por el simbolo de 
            igual entre parentesis (?) y usar el metodo que proporciona PrepareStatement
            para cambiar esos simbolor por los que se necesitan*/
            String query2 = "INSERT INTO PERSONA(nombre,fecha_nacimiento, sexo, "
                    + "telefono, email, puntos) values( (?)  , (?) , (?) , (?) , (?) , (?))";
            
            
            
            /*Imprime la consulta en fomra de String*/
            System.out.println(query);
            
            /*Se seclara unavariable tipo PrepareStatement que prepara la 
            sentencia para ser procesada por la BD, dandole como parametro el 
            "INSERT" anteriormente hecho*/
            
            //PreparedStatement st  = conexion.prepareStatement(query);
            PreparedStatement st2  = conexion.prepareStatement(query2);
            
            
            /*Aqui se cambian los datos por los que necesitamos con el numero 
            correlativo a los simbolos (?). Asi el primero se cambiara por el 
            valor de nombre, el segundo por el de fecha_nac y asi sucesivamente*/
            st2.setString(1, nombre);
            st2.setString(2, fecha_nac);
            st2.setString(3, sexo);
            st2.setString(4, telefono);
            st2.setString(5, email);
            st2.setString(6, puntos);
            
            
            /*Para que se ejecute el Statement o la sentencia se utiliza el 
            metodo "executeUpdate()"*/
            
            
            //st.executeUpdate();
            st2.executeUpdate();
            
            /*Se cierra el Statement para liberar recursos*/
            //st.close();
            st2.close();
            
        } catch (Exception e) {
            
            /*Imprime el mensaje de la exceptions correspondiente si ocurre 
            un error*/ 
            System.out.println(e.getMessage());
        }
            
        
        
        
        
        
        
    }
    
}
