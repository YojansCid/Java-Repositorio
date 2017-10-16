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
            
            System.out.println("Inrese una opcion");
            System.out.println("1: Insertar nombre en la BD.");
            System.out.println("2: Modificar un nombre de la BD.");
            System.out.println("3: Listar BD.");
            System.out.println("4: Eliminar nombre de la BD.");
            System.out.println("5: Eliminar TODA la BD. CUIDADO!!");
            System.out.println("0: Salir.");
            
            opcion = sc.next();
            switch(opcion){

                case "1":
                   System.out.println("Se INSERTARA un nombre en la BD");
                   System.out.println("Ingrese un nombre para  agregar a la BD.");
                   String nombre = sc.next();
                   Persona p = new Persona();
        
                   p.setNombre(nombre);

                   try{
                       DAOPersona per = new DAOPersonaImp();
                       per.registrar(p);
                   }catch(Exception e){
                       System.out.println(e.getMessage());
                   }
                   break;
                                    
                case "2":
                    
                   Persona p2 = new Persona();
                   
                   System.out.println("Se MODIFICARA un nombre de la BD");
                   System.out.println("Ingrese el nombre que desea modificar.");
                   
                   String nombreModificar = sc.next();
                   
                   System.out.println("Ingrese el nuevo nombre.");
                   
                   String nombreNuevo = sc.next();
                   
                   p2.setNombre(nombreModificar);
                   
                   try{
                       DAOPersona DaoPer = new DAOPersonaImp();
                       DaoPer.modificar(p2, nombreNuevo);
                   }catch(Exception e){
                       System.out.println(e.getMessage());
                   }

                   break;
                   
                   
                case "3":
                    System.out.println("Se LISTARA la BD");
                    try{
                        DAOPersona daoPer = new DAOPersonaImp();
                    
                        List<Persona> listaBD = daoPer.listar();

                        System.out.println("[ ID ] - [ NOMBRE ]");
                        for (Persona persona : listaBD) {
                        
                        System.out.println("[ " + persona.getId() + " ] - [ " + persona.getNombre() + " ]");
                        }
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
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
            
        //el ciclo se repetira mientras la opcion sea diferente a 0
        }while( opcion != "0");
        
        
        
        
        
        
        
    }
    
}
