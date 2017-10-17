package Ejemplo;

import Interfaces.DAOPersona;
import dao.DAOPersonaImp;
import java.util.List;
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
public class Ejemplo35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
   
        String opcion;//Opcion a ingresar por teclado
        
        //objeto que recibira datos ingresados por teclado
        Scanner sc = new Scanner(System.in);
 
        do{
            /*Se imprimen en pantalla las opciones disponibles y se captura en 
            la variable "opcion"*/
            System.out.println("Inrese una opcion");
            System.out.println("1: Insertar nombre en la BD.");
            System.out.println("2: Modificar un nombre de la BD.");
            System.out.println("3: Listar BD.");
            System.out.println("4: Eliminar nombre de la BD.");
            System.out.println("5: Eliminar TODA la BD. CUIDADO!!");
            System.out.println("0: Salir.");
            
            opcion = sc.nextLine();
            /*Se evalua el ciclo Switch con la variable "opcion"*/
            switch(opcion){

                case "1":
                    /*Si se ingresa un "1" como opcion se pedira un nombre para 
                    INSERTAR en la BD*/
                   System.out.println("Se INSERTARA un nombre en la BD");
                   System.out.println("Ingrese un nombre para  agregar a la BD.");
                   String nombre = sc.nextLine();
                   /*Se cre un objeto de tipo Persona para que guarde y simule 
                   la tabla de la BD*/
                   Persona p = new Persona();
                   /*Se setea el nombre del objeto con el dato ingresado por 
                   teclado*/
                   p.setNombre(nombre);
                   
                   try{
                       /*se instancia un objeto de tipo DAOPersona dentro de un 
                       try, ya que es posible que ocurran errores al maniipular 
                       la BD*/
                       DAOPersona per = new DAOPersonaImp();
                       /*se usa el metodo Registrar, dandole como parametro el 
                       objeto Persona recien creado*/
                       per.registrar(p);
                   }catch(Exception e){
                       /*Se imprime el mensaje de error en caso de que ocurra*/
                       System.out.println(e.getMessage());
                   }
                   
                   break;
                                    
                case "2":
                   /*Si se ingresa un "2" como opcion se pedira el nombre que se 
                    desea MODIFICAR y otro con el cual reemplazar el nombre 
                    anteriormente ingresado en la BD*/ 
                   Persona p2 = new Persona();
                   
                   System.out.println("Se MODIFICARA un nombre de la BD");
                   System.out.println("Ingrese el nombre que desea modificar.");
                   
                   String nombreModificar = sc.nextLine();
                   
                   System.out.println("Ingrese el nuevo nombre.");
                   
                   String nombreNuevo = sc.nextLine();
                   
                   p2.setNombre(nombreModificar);
                   
                   try{
                       /*se instancia un objeto de tipo DAOPersona dentro de un 
                       try, ya que es posible que ocurran errores al maniipular 
                       la BD*/
                       DAOPersona DaoPer = new DAOPersonaImp();
                       /*se usa el metodo modificar(), dandole como parametro el 
                       objeto Persona recien creado*/
                       DaoPer.modificar(p2, nombreNuevo);
                   }catch(Exception e){
                       /*En caso de error se imprime el error lanzado desde una
                        capa inferior*/
                       System.out.println(e.getMessage());
                   }

                   break;
                   
                   
                case "3":
                    /*Si se ingresa un "3" como opcion se LISTARTAN todos los 
                    datos de la BD*/ 
                    System.out.println("Se LISTARA la BD");
                    try{
                        /*se instancia un objeto de tipo DAOPersona dentro de un 
                       try, ya que es posible que ocurran errores al maniipular 
                       la BD*/
                        DAOPersona daoPer = new DAOPersonaImp();
                        /*Se instancia una Lista con lo que retorna el metodo 
                        listar() (otrta lista)*/
                        List<Persona> listaBD = daoPer.listar();
                        
                        /*Si la lista no recibe ningun dato, se imprimira un 
                        mensaje avisando que no existen datos registrados*/
                        if (listaBD != null) {
                            System.out.println("NO EXISTEN DATOS REGISTRADOS");
                        }else{
                            /*Si existen datos se imprime el encabezado de la 
                            "tabla"*/
                            System.out.println("[ ID ] - [ NOMBRE ]");
                        }
                        /*Se crea un "foreach con la lista recibida y se 
                        imprimen los datos"*/
                        for (Persona persona : listaBD) {
                        
                        System.out.println("[ " + persona.getId() + " ] - [ " + persona.getNombre() + " ]");
                        }
                    }catch (Exception e){
                        /*En caso de error se imprime el error lanzado desde una
                        capa inferior*/
                        System.out.println(e.getMessage());
                    }
                   break;   
                   
                case "4":
                   /*Si se ingresa un "4" como opcion se borrara el nombre 
                    ingresado por teclado y se guarda en la variable 
                    nombreEliminar*/  
                   System.out.println("Se ELIMINARA un nombre de la BD");
                   System.out.println("Ingrese el nombre que desea ELIMINAR");
                   String nombreEliminar = sc.nextLine();
                   
                   Persona per = new Persona();
                   per.setNombre(nombreEliminar);
                   
                    try {
                        /*se instancia un objeto de tipo DAOPersona dentro de un 
                       try, ya que es posible que ocurran errores al maniipular 
                       la BD*/
                        DAOPersona daoPersona = new DAOPersonaImp();
                        /*se usa el metodo Eliminar, dandole como parametro el 
                       objeto Persona recien creado*/
                        daoPersona.eliminar(per);
                    } catch (Exception e) {
                        /*En caso de error se imprime el error lanzado desde una
                        capa inferior*/
                        System.out.println(e.getMessage());
                    }
                   
                   break;
                case "5":
                    /*Si se ingresa un "5" como opcion se borrara se borrara 
                    todos los registros de la tabla Persona en la BD*/  
                   System.out.println("Se ELIMINARA TODA la BD. CUIDADO!");
                   
                   /*Se pide confirmacion de borrado de datos*/
                   System.out.println("Esta seguro que desea eliminar TODOS LOS DATOS (S/N)");
                   String eliminar = sc.next();
                   /*Si se escribe (s o si) confirma el borrado de los datos, 
                   sin importar si se escribe con o sin mayusculas*/
                    if (eliminar.equalsIgnoreCase("s") || eliminar.equalsIgnoreCase("si")) {
                        try {
                            
                        /*se instancia un objeto de tipo DAOPersona dentro de un 
                        try, ya que es posible que ocurran errores al maniipular 
                        la BD*/    
                            
                        DAOPersona daoPersona = new DAOPersonaImp();
                        daoPersona.eliminarTodaBD();
                        } catch (Exception e) {
                            /*En caso de error se imprime el error lanzado desde una
                             capa inferior*/
                            System.out.println(e.getMessage());
                        }
                    }
                    
                   
                   break;
                   
                case "0":
                   /*Si se ingresa un 0 se imprime un mensaje que se salio del 
                    programa y se cierra*/ 
                   System.out.println("SALIENDO...");
                   System.exit(0);
                   break;
                   
                default:
                   /*Si no se escribe (1, 2, 3, 4, 5 o 0) se imprime un mensaje 
                    de que el dato ingresado no es valido*/ 
                   System.out.println("Opcion ingresada NO VALIDA");
                   break;

            }
            
        //el ciclo se repetira mientras la opcion sea diferente a 0
        }while( opcion != "0");
   
    }
    
}
