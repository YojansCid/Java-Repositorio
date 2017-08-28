
/**
 *
 * @author Yojans Cid
 */
public class Clases {

    /**
     * @param args the command line arguments
     */
    //Declaracion de atributos de la clase
    private String profesor;
    private int numero_alumnos;
    private int numero_sala;
    private int numero_sillas;

/*constructor de la clase (tiene que tener el mismo nombre que la clase)
    ;es el metodo por el cual se instancia una clase y se crea un objeto*/
    public Clases(String profesor, int numero_alumnos, int numero_sala) {
//Se inicializan todos los atributos con los datos entregados como parametros del metodo
        this.profesor = profesor;
        this.numero_alumnos = numero_alumnos;
        this.numero_sala = numero_sala;
        this.numero_sillas = 40;
    }
 
/*Tambien se puede crear un constructor sin entregarle parametros; a este 
principio se le llama polimorfismo,aunque no es la unica manera en la 
que se aplica dicho principio*/
    
/*Una clase puede tener muchos constructores diferentes, entregando 
diferentes parametros, ordenes diferentes, con menos cantidad de parametros, etc*/    
    public Clases() {
        this.profesor = "Sin profesor";
        this.numero_alumnos = 40;
        this.numero_sala = 0;
        this.numero_sillas = 40;
    }
      
    
    public static void main(String[] args) {
        //Se instancia un objeto llamado C
        Clases c = new Clases();
        //toString() retorna todos los datos que contiene un objeto en forma de String
        System.out.println("FUNCION toString(): "+c.toString());
        //retorna el nombre del profesor
        System.out.println("FUNCION getProfesor(): "+c.getProfesor());
        //setea el nombre del profesor, dandole un String
        c.setProfesor("Yojans");
        System.out.println("FUNCION getProfesor() despues de usar el metodo setProfesor(): "+c.getProfesor());
        c.setNumero_sala(15);
        System.out.println("FUNCION getNumero_sala: "+c.getNumero_sala());
        System.out.println("FUNCION toString() despues de modificaciones del objeto: "+c.toString());
        c.Saludar_al_profesor(c);
        
        
    }

/*Los metodos se usan para reutilizar codigo, a dichos metodos se les puede 
    entregar parametros para que sean utilizados de la forma que estime dicho 
    metodo. En este caso se le entrega como parametro un objeto de la clase "Clases"*/ 
    
//para ingresar a los atributos de un objeto instanciado se puede hacer gracias a la notacion "." 
    
/*La palabra void indica que el metodo declarado retorna "vacio", existen otras 
    palabras clave (int, String, char, float, etc) que indican que tipo de 
    dato retornara el metodo*/    
    public void Saludar_al_profesor(Clases c){
        System.out.println("¡Buenos dias profesor "+ c.profesor+ "!");
    }
    
/*Los metodos get y set (de tipo "public#) se usan para tener un mayor control del objeto, 
manteniendo los datos de un objeto protegidos (al ser atributos de tipo "private")
de ser cambiados "externamente". Y hacer que sean dependientes de dichos metodos para ser 
    cambiados o retornarlos; a este principio se le llama ENCAPSULAMIENTO*/    
    
/*Los metodos set...() se usan para setear o cambiar el valor de un 
    dato dentro de un objeto instanciado*/    
    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public void setNumero_alumnos(int numero_alumnos) {
        this.numero_alumnos = numero_alumnos;
    }

    public void setNumero_sala(int numero_sala) {
        this.numero_sala = numero_sala;
    }

    public void setNumero_sillas(int numero_sillas) {
        this.numero_sillas = numero_sillas;
    }

    
/*Los Metodos get....() se usan para retornar algun dato en especifico del 
  objeto instanciado, por ejemplo getProfesor() retorna el nombre del profesor*/    
    public String getProfesor() {
        return profesor;
    }

    public int getNumero_alumnos() {
        return numero_alumnos;
    }

    public int getNumero_sala() {
        return numero_sala;
    }

    public int getNumero_sillas() {
        return numero_sillas;
    }
   
//El metodo toString() se usa para retornar los datos que contiene un objeto en forma de String    
    @Override
    public String toString() {
        return "Clases { " + "profesor = " + profesor + ", numero_alumnos = " 
                + numero_alumnos + ", numero_sala = " 
                + numero_sala + ", numero_sillas = " + numero_sillas + " } ";
    }
 
}
