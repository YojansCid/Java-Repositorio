
import java.util.Calendar;


/**
 *
 * @author Yojans Cid
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int y = now.get(Calendar.DAY_OF_WEEK);

        System.out.println("La Hora Actual es : "+ now.get(Calendar.HOUR_OF_DAY)+":"
                                                +now.get(Calendar.MINUTE)+":"
                                                +now.get(Calendar.SECOND)+" HRS.");
        System.out.println("Fecha actual : " + (now.get(Calendar.MONTH) + 1)
						+ "-"
						+ now.get(Calendar.DATE)
						+ "-"
						+ now.get(Calendar.YEAR));
        switch(y){
            case 1:
                System.out.println("Hoy es DOMINGO. ");
                break;
            case 2:
                System.out.println("Hoy es LUNES. ");
                break;
            case 3:
                System.out.println("Hoy es MARTES. ");
                break;
            case 4:
                System.out.println("Hoy es MIERCOLES. ");
                break;
            case 5:
                System.out.println("Hoy es JUEVES. ");
                break;
            case 6:
                System.out.println("Hoy es VIERNES. ");
                break;
            case 7:
                System.out.println("Hoy es SABADO. ");
                break;
            default:
                System.out.println("Caso Default");
            
        }
    }
    
}
