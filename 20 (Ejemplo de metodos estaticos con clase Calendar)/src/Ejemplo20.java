
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
public class Ejemplo20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
/*Al inicializar un objeto como GregorianCalendar la ventaja que existe 
es que se le pueden dar parametros al constructor*/
        Calendar calendarioGragoriano = new GregorianCalendar(12, Calendar.MONTH, 2017);
        
/*Inicializar un objeto de tipo Calendar con un metodo de clase (Static) el cual
        obtiene una onstancia de la clase puede ser mas sencillo*/        
        Calendar calendario = Calendar.getInstance();
        
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(calendario.getTime());
        
    }
    
}
