
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
    PostgreSQL, SQL Server, etc. Para que el programa funcione es necesario crear
    una BD postgreSQL en nuestro PC con los nombres especificados o de otra 
    forma cambiar los nombres de los atributos, etc desde el codigo*/
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
            String query = "INSERT INTO PERSONA(nombre,fecha_nacimiento, sexo, telefono, email, puntos) values('" + nombre + "' , '" + fecha_nac + "' , '"  + sexo + "' , '"  + telefono + "' , '"  + email + "' , '"  + puntos + "')";
            
            /*Imprime la consulta en fomra de String*/
            System.out.println(query);
            /*Se seclara unavariable tipo PrepareStatement que prepara la 
            sentencia para ser procesada por la BD, dandole como parametro el 
            "INSERT" anteriormente hecho*/
            
            PreparedStatement st  = conexion.prepareStatement(query);
            
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
    
}
