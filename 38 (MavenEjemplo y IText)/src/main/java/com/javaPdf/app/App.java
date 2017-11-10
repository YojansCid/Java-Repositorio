package com.javaPdf.app;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    
    
    public static final String TEXTO1 =  "\n \n            En San Pedro de la Paz a  ";
    String fecha;
    public static final String TEXTO2 =  ", comparece  don ";
    String nombreEmpleador;
    public static final String TEXTO3 =  " chileno, empresario, c�dula de identidad  n�mero ";
    String rutEmpleador;
    public static final String TEXTO4 =  ", en representaci�n de la empresa Servicios "
                    + "de Seguridad IGVI Ltda., del giro de su denominaci�n, RUT 76.330.403-5, ambos domiciliados en San "
                    + "Pedro de la Paz, Avenida Laguna Grande N�533 casa 69, en adelante el  empleador, y  don  ";
    String nombreTrabajador;
    public static final String TEXTO5 =  ",  nacionalidad    chilena, c�dula   nacional   de  identidad   n�mero ";
    String rutTrabajador;
    public static final String TEXTO6 =  "empleado, domiciliado en  ";
    String direccionTrabajador;
    public static final String TEXTO7 =  ", Comuna de ";
    String comunaTrabajador;
    public static final String TEXTO8 =  ",  nacido el d�a  ";
    String fechaNacimientoTrabajador;
    public static final String TEXTO9 =  ", en adelante la trabajador,  quienes  acuerdan el "
                    + "siguiente  contrato de trabajo:\n";
        
    
    /*TEXTOS DE CLAUSULAS*/
    public static final String TEXTOPRIMERO = "\n\nPRIMERO:" ;
    public static final String TEXTOPRIMERO1 = " El trabajador se obliga a desempe�ar las funciones de " ;
    String funcionTrabajador;
    public static final String TEXTOPRIMERO2 = ", conforme  a las instrucciones que le imparta  el empleador a trav�s de sus agentes. En especial deber� controlar  y vigilar en forma estricta las instalaciones donde sea destinado Adem�s deber� reaccionar ante situaciones de peligro, protegiendo  a las personas, y bienes que se encontraren en las instalaciones donde preste servicios. De la misma forma y seg�n corresponda deber� dar  inmediato y oportuno aviso a   las polic�as de Carabineros, Investigaciones, Bomberos, Servicios m�dicos, a su supervisor inmediato,  y a quien la empresa o faena donde desarrolle las labores  tambi�n le indique o se�ale.  Al efecto deber� supervisar el estado de los per�metros que guarnezcan las instalaciones  a custodiar, como  los sistemas el�ctricos,  y de iluminaci�n de la faena, adoptando las medidas correctivas y de aviso  que correspondan en forma oportuna. El trabajador queda obligado a cumplir leal y correctamente con todos y cada uno de los deberes que le imponga este contrato o aquellos que se deriven o aparezcan  de las funciones y cargo que por este instrumento se le encomiendan, debiendo ejecutar sin m�s tr�mite las instrucciones que le sean impartidas por sus superiores. Del mismo modo el trabajador se obliga a desempe�ar en forma eficaz y  puntual, las funciones y el cargo para el cual ha sido contratado empleando para ello la mayor diligencia y dedicaci�n.\n\n";
    
    public static final String TEXTOSEGUNDO = "SEGUNDO:";
    public static final String TEXTOSEGUNDO1 = " El trabajador prestara los servicios para los cuales ha sido contratado,   en cualquiera de las faenas  o instalaciones que  la empleadora lo destine dentro de la octava Regi�n del Bio Bio,  pudiendo ser trasladado a cualquiera de ellas,  en  cualquier momento, sin que ello signifique  menoscabo alguno para el trabajador.\n\n\n";
    
    public static final String TEXTOTERCERO = "TERCERO:";
    public static final String TEXTOTERCERO1 = " Con motivo del desempe�o de la labor contratada por este instrumento, el trabajador percibir� en  forma mensual lo siguiente:\n";
    public static final String TEXTOTERCERO2A = "a) Sueldo base  la suma de  $";
    String sueldoTrabajador;
    public static final String TEXTOTERCERO3A = ".- (MONTO EN PALABRAS)\n\n" ;
    public static final String TEXTOTERCERO4B = "b) Gratificaci�n de  un 25%  sobre el sueldo base con un tope de 4,75 ingresos m�nimos mensuales al a�o.\n\n\n";
    
    public static final String TEXTOCUARTO = "CUARTO:";
    public static final String TEXTOCUARTO1 = " El empleador desde ya queda facultado para descontar de las remuneraciones del trabajador  los impuestos, que las graven, las cotizaciones, previsionales, salud y cesant�a, conforme a la obligaci�n que  le impone el art. 58 del C�digo del Trabajo.\n\n";
    
    public static final String TEXTOQUINTO = "QUINTO:";
    public static final String TEXTOQUINTO1 = " La Jornada de  Trabajo ser� de 45 horas semanales, en  turnos rotativos conforme a lo que disponga  el empleador y conforme a  las necesidades de resguardo de las instalaciones donde el trabajador le toque desempe�ar sus labores, designaci�n, turno, y tiempo que confeccionara  exclusiva y unilateralmente  el  empleador el que  en todo caso se  sujetara a los par�metros que la ley exige.\n\n";
    
    
    public static final String TEXTOSEXTO = "SEXTO:";
    public static final String TEXTOSEXTO1 =" Para todos los efectos legales a que haya lugar, las partes convienen que la labor que efectuara el trabajador en virtud del presente contrato, ser� considerada como una actividad cuya perturbaci�n significa  un hecho grave en la marcha de  la obra o faena, por lo que el trabajador no podr� faltar a sus labores en forma injustificada o sin un aviso previo, para cuyos efectos se entender� plenamente sabido por el trabajador  lo previsto y sancionado en el N�3 del art�culo 160 del C�digo del Trabajo, ac�pite legal que en este acto se le lee al trabajador, y del cual se le entrega  copia  del mismo  el que declara recibir  y tambi�n de haber comprendido a cabalidad.\n\n\n";
    
    
    public static final String TEXTOSEPTIMO = "S�PTIMO:";
    public static final String TEXTOSEPTIMO1 = " Conforme a lo se�alado en la cl�usula precedente y sin que ello signifique limitaci�n alguna,  adem�s de ello se consideraran  como faltas graves lo siguiente:\n\n";
    public static final String TEXTOSEPTIMO2A = "	a) Atrasos  reiterados  en la presentaci�n a  la Jornada de Trabajo, ya sea al inicio de ella o luego de haber hecho uso del  tiempo de colaci�n.\n\n" ;
    public static final String TEXTOSEPTIMO3B = "	b) Divulgaci�n por parte del trabajador de cualquier informaci�n  confidencial que  conociere en el desempe�o de sus labores, como tampoco podr� divulgar las caracter�sticas  del establecimiento donde presta o haya prestado servicios, ni de sus sistemas de control y seguridad.\n\n" ;    
    public static final String TEXTOSEPTIMO4C = "	c) Permitir el ingreso de extra�os no autorizados por la empleadora o por los representantes de la  faena donde desarrolle sus labores.\n\n";    
    public static final String TEXTOSEPTIMO5D = "d) Presentarse a sus labores en estado de  ebriedad, o bajo la influencia del alcohol, para lo cual bastara  el halito alcoh�lico del trabajador, debidamente   detectado por el correspondiente supervisor, quien a su juicio y en forma unilateral calificara uno u otro estado et�lico, para lo cual desde ya el trabajador le otorga la calidad de ministro de Fe al supervisor de la empleadora que tocara a su tiempo. Lo mismo ocurrir� si el trabajador se presentare o ejecutare su labor bajo retardo por el uso de drogas o estupefacientes.\n\n";    
    public static final String TEXTOSEPTIMO6E = "e) Ingresar o consumir bebidas alcoh�licas, drogas y estupefacientes   al establecimiento o faena bajo el cuidado del trabajador.\n";  
    public static final String TEXTOSEPTIMO7F = "f) El trabajador estar� obligado  asistir  y participar  activamente a los cursos de capacitaci�n que disponga la empleadora, el no cumplimiento de ello ser�  considerado  como causal de grave para el  eventual despido del trabajador.\n\n";    
    public static final String TEXTOSEPTIMO8G = "g) No contar   el trabajador con  las exigencias   que     la ley previene  para el desempe�o de los guardias de seguridad, o  presentar documentos inherentes  a  ella  falsificados u adulterados.\n\n";    
    public static final String TEXTOSEPTIMO9H = "h) Fumar durante el desempe�o de las labores.\n\n";
    
    public static final String TEXTOOCTAVO = "OCTAVO:";
    public static final String TEXTOOCTAVO1 = " El trabajador declara haber recibido sin costo alguno, con antelaci�n a la firma de este contrato de una copia del reglamento interno de higiene y seguridad del empleador declarando expresamente haberlo le�do y comprendido.\n\n";
    
    public static final String TEXTONOVENO = "NOVENO:";
    public static final String TEXTONOVENO1 = " Queda estrictamente prohibido al trabajador efectuar horas extras, sin el previo consentimiento del empleador el que deber� ser siempre por  escrito.\n" +
"Para los efectos de enterar sus correspondientes cotizaciones el trabajador declara y solicita que sus cotizaciones previsionales sean enteradas, en AFP:";
    public static final String TEXTONOVENO2 = " PROVIDA";
    public static final String TEXTONOVENO3 = "  Salud:";
    public static final String TEXTONOVENO4 = " FONASA";
    public static final String TEXTONOVENO5 = ", y las de cesant�a en:";
    public static final String TEXTONOVENO6 = " AFC. \n\n";
    
    
    public static final String TEXTODECIMO = "D�CIMO:";
    public static final String TEXTODECIMO1 = " El presente contrato tendr� una duraci�n desde el ";
    String fechaInicioContrato;
    public static final String TEXTODECIMO2 = ", hasta el " ;
    String fechaTerminoContrato;
    public static final String TEXTODECIMO3 = ".\n\n";
    
    
    public static final String TEXTOUNDECIMO = "UND�CIMO:";
    public static final String TEXTOUNDECIMO1 = " El presente contrato se firma en tres ejemplares quedando uno en poder del trabajador y dos en manos del empleador.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "Previa lectura ratifican y firman.";
    
    
    
    
    
    

    
    
    public static void main( String[] args )
    {
        System.out.println( "INICIO DE PROGRAMA!: " );
        
        GeneradorContrato.writePDF();
        
        
        
    }
    
    
    
}
    
    

