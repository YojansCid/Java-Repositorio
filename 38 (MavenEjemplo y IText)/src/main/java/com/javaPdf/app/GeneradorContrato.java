/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author Yojans Cid
 */
public class GeneradorContrato {
    
    public static final String TEXTO1 =  "\n \n            En San Pedro de la Paz a  ";
    String fecha;
    public static final String TEXTO2 =  ", comparece  don ";
    String nombreEmpleador;
    public static final String TEXTO3 =  " chileno, empresario, cédula de identidad  número ";
    String rutEmpleador;
    public static final String TEXTO4 =  ", en representación de la empresa Servicios "
                    + "de Seguridad IGVI Ltda., del giro de su denominación, RUT 76.330.403-5, ambos domiciliados en San "
                    + "Pedro de la Paz, Avenida Laguna Grande N°533 casa 69, en adelante el  empleador, y  don  ";
    String nombreTrabajador;
    public static final String TEXTO5 =  ",  nacionalidad    chilena, cédula   nacional   de  identidad   número ";
    String rutTrabajador;
    public static final String TEXTO6 =  " empleado, domiciliado en  ";
    String direccionTrabajador;
    public static final String TEXTO7 =  ", Comuna de ";
    String comunaTrabajador;
    public static final String TEXTO8 =  ",  nacido el día  ";
    String fechaNacimientoTrabajador;
    public static final String TEXTO9 =  ", en adelante la trabajador,  quienes  acuerdan el "
                    + "siguiente  contrato de trabajo:\n";
        
    
    /*TEXTOS DE CLAUSULAS*/
    public static final String TEXTOPRIMERO = "\n\nPRIMERO:" ;
    public static final String TEXTOPRIMERO1 = " El trabajador se obliga a desempeñar las funciones de " ;
    String funcionTrabajador;
    public static final String TEXTOPRIMERO2 = ", conforme  a las instrucciones que le imparta  el empleador a través de sus agentes. En especial deberá controlar  y vigilar en forma estricta las instalaciones donde sea destinado Además deberá reaccionar ante situaciones de peligro, protegiendo  a las personas, y bienes que se encontraren en las instalaciones donde preste servicios. De la misma forma y según corresponda deberá dar  inmediato y oportuno aviso a   las policías de Carabineros, Investigaciones, Bomberos, Servicios médicos, a su supervisor inmediato,  y a quien la empresa o faena donde desarrolle las labores  también le indique o señale.  Al efecto deberá supervisar el estado de los perímetros que guarnezcan las instalaciones  a custodiar, como  los sistemas eléctricos,  y de iluminación de la faena, adoptando las medidas correctivas y de aviso  que correspondan en forma oportuna. El trabajador queda obligado a cumplir leal y correctamente con todos y cada uno de los deberes que le imponga este contrato o aquellos que se deriven o aparezcan  de las funciones y cargo que por este instrumento se le encomiendan, debiendo ejecutar sin más trámite las instrucciones que le sean impartidas por sus superiores. Del mismo modo el trabajador se obliga a desempeñar en forma eficaz y  puntual, las funciones y el cargo para el cual ha sido contratado empleando para ello la mayor diligencia y dedicación.\n\n";
    
    public static final String TEXTOSEGUNDO = "SEGUNDO:";
    
    public static final String TEXTOTERCERO = "\n\nTERCERO:";
    public static final String TEXTOTERCERO1 = " Con motivo del desempeño de la labor contratada por este instrumento, el trabajador percibirá en  forma mensual lo siguiente:\n";
    public static final String TEXTOTERCERO2A = "a) Sueldo base  la suma de  $";
    String sueldoTrabajador;
    public static final String TEXTOTERCERO3A = ".- (MONTO EN PALABRAS)\n\n" ;
    public static final String TEXTOTERCERO4B = "b) Gratificación de  un 25%  sobre el sueldo base con un tope de 4,75 ingresos mínimos mensuales al año.\n\n\n";
    
    public static final String TEXTOCUARTO = "CUARTO:";
    
    public static final String TEXTOQUINTO = "\n\nQUINTO:";
    
    
    public static final String TEXTOSEXTO = "\n\nSEXTO:";
    
    
    public static final String TEXTOSEPTIMO = "\n\nSÉPTIMO:";
    
    public static final String TEXTOOCTAVO = "\n\nOCTAVO:";
    
    public static final String TEXTONOVENO = "\n\nNOVENO:";
    
    
    
    public static final String TEXTODECIMO = "\n\nDÉCIMO:";
    public static final String TEXTODECIMO1 = " El presente contrato tendrá una duración desde el ";
    String fechaInicioContrato;
    public static final String TEXTODECIMO2 = ", hasta el " ;
    String fechaTerminoContrato;
    public static final String TEXTODECIMO3 = ".\n\n";
    
    
    public static final String TEXTOUNDECIMO = "UNDÉCIMO:";
    
    
    
    
    public static void writePDF() {

//        Document document = new Document() ;
        Document document=new Document(PageSize.LETTER,65,65,60,60);

        try {
            
            
            
            /*Font que usaran las palabras destacadas con NEGRITA*/
            
            Font font_negrita = FontFactory.getFont("Times New Roman");
            font_negrita.setSize(11);
            font_negrita.setStyle(Font.BOLD);
            font_negrita.setFamily(Font.FontFamily.TIMES_ROMAN.toString());
            
            Scanner sc = new Scanner(System.in);
            
            Calendar calendarioGragoriano = new GregorianCalendar(12, Calendar.MONTH, 2017);
        
            /*Inicializar un objeto de tipo Calendar con un metodo de clase (Static) el cual
            obtiene una onstancia de la clase puede ser mas sencillo*/        
            Calendar calendario = Calendar.getInstance();

            System.out.println(Calendar.DAY_OF_MONTH);
            System.out.println(calendario.getTime());
            
            /*Datos ingresados por teclado*/
            
            System.out.println("Ingrese el NOMBRE DEL EMPLEADOR: ");

            Chunk nombreEmpleador = new Chunk ("[EMPLEADOR]", font_negrita);

            System.out.println("Ingrese el RUT DEL EMPLEADOR: ");

            Chunk rutEmpleador = new Chunk ("xx.xxx.xxx-x", font_negrita);
            System.out.println("Ingrese el NOMBRE DEL TRABAJADOR: ");
//            Chunk nombreTrabajador = new Chunk ("DATO DE PRUEBA", font_negrita);
            Chunk nombreTrabajador = new Chunk (sc.nextLine(), font_negrita);
            
            System.out.println("Ingrese el RUT DEL TRABAJADOR: ");
//            Chunk rutTrabajador = new Chunk ("DATO DE PRUEBA", font_negrita);
            Chunk rutTrabajador = new Chunk (sc.nextLine(), font_negrita);
            
            System.out.println("Ingrese la DIRECCIÓN DEL TRABAJADOR: ");
//            Chunk direccionTrabajador = new Chunk ("DATO DE PRUEBA", font_negrita);
            Chunk direccionTrabajador = new Chunk (sc.nextLine(), font_negrita);
            
            System.out.println("Ingrese la COMUNA DEL TRABAJADOR: ");
//            Chunk comunaTrabajador = new Chunk ("DATO DE PRUEBA", font_negrita);
            Chunk comunaTrabajador = new Chunk (sc.nextLine(), font_negrita);
            
            System.out.println("Ingrese la FECHA DE NACIMIENTO DEL TRABAJADOR: ");
//            Chunk fechaNacimientoTrabajador = new Chunk ("DATO DE PRUEBA", font_negrita);
            Chunk fechaNacimientoTrabajador = new Chunk (sc.nextLine(), font_negrita);
            
            System.out.println("Ingrese el SUELDO QUE TENDRA EL TRABAJADOR: ");
//            Chunk sueldoTrabajador = new Chunk ("DATO DE PRUEBA", font_negrita);
            Chunk sueldoTrabajador = new Chunk (sc.nextLine(), font_negrita);
            
            System.out.println("Ingrese la FUNCION QUE TENDRA EL TRABAJADOR: ");
//            Chunk funcionTrabajador = new Chunk ("DATO DE PRUEBA", font_negrita);
            Chunk funcionTrabajador = new Chunk (sc.nextLine().toUpperCase(), font_negrita);


            System.out.println("Ingrese la FECHA DE INICIO DE CONTRATO DEL TRABAJADOR: ");
//            Chunk fechaInicioContrato = new Chunk ("DATO DE PRUEBA", font_negrita);
            Chunk fechaInicioContrato = new Chunk (sc.nextLine(), font_negrita);
            
            System.out.println("Ingrese la FECHA DE TERMINO DE CONTRATO DEL TRABAJADOR: ");
//            Chunk fechaTerminoContrato = new Chunk ("DATO DE PRUEBA", font_negrita);
            Chunk fechaTerminoContrato = new Chunk (sc.nextLine(), font_negrita);
            
            
            /*Clausulas*/
            Chunk primero = new Chunk (TEXTOPRIMERO, font_negrita);
            Chunk segundo = new Chunk (TEXTOSEGUNDO, font_negrita);
            Chunk tercero = new Chunk (TEXTOTERCERO, font_negrita);
            Chunk cuarto = new Chunk (TEXTOCUARTO, font_negrita);
            Chunk quinto = new Chunk (TEXTOQUINTO, font_negrita);
            Chunk sexto = new Chunk (TEXTOSEXTO, font_negrita);
            Chunk septimo = new Chunk (TEXTOSEPTIMO, font_negrita);
            Chunk octavo = new Chunk (TEXTOOCTAVO, font_negrita);
            Chunk noveno = new Chunk (TEXTONOVENO, font_negrita);
//            Chunk afp = new Chunk (TEXTONOVENO2, font_negrita);
//            Chunk salud = new Chunk (TEXTONOVENO4, font_negrita);
//            Chunk cesantia = new Chunk (TEXTONOVENO6, font_negrita);
            Chunk decimo = new Chunk (TEXTODECIMO, font_negrita);
            Chunk undecimo = new Chunk (TEXTOUNDECIMO, font_negrita);
            
            
            
//            Calendar calendario = Calendar.getInstance();
            SimpleDateFormat formateador = new SimpleDateFormat(
            "dd 'de' MMMM 'de' yyyy", new Locale("es"));
            Date fechaDate = new Date();
            Chunk fecha = new Chunk(formateador.format(fechaDate),font_negrita);
            
            String path = new File(".").getCanonicalPath();
            String FILE_NAME = path + "/CONTRATO " + nombreTrabajador + " RUT " + rutTrabajador + ".pdf";
        	
            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
            
            
//            Image firmaEmpleador = Image.getInstance(path + "/img/firmaEmpleador.png");
//            firmaEmpleador.scaleAbsoluteWidth(150f);
//            firmaEmpleador.scaleAbsoluteHeight(70f);
//            firmaEmpleador.setAbsolutePosition(70f, 200f);
//            
            Image timbreGerencia = Image.getInstance(path + "/img/timbreGerencia.png");
            timbreGerencia.scaleAbsoluteWidth(90f);
            timbreGerencia.scaleAbsoluteHeight(75f);
            timbreGerencia.setAbsolutePosition(230, 200f);
//            
            Image firmaTrabajador = Image.getInstance(path + "/img/firmaTrabajador.png");
            firmaTrabajador.scaleAbsoluteWidth(160f);
            firmaTrabajador.scaleAbsoluteHeight(70f);
            firmaTrabajador.setAbsolutePosition(350, 175f);
//            
//            Image todoEnUno = Image.getInstance(path + "/img/todoEnUno.png");
//            todoEnUno.scaleAbsoluteWidth(550);
//            todoEnUno.scaleAbsoluteHeight(150);
//            todoEnUno.setAbsolutePosition(15, 120f);
            
            
            
            document.open();
            FontFactory.registerDirectories();
            
            /*Parrafo de Titulo*/
            
            String tituloContrato_texto = "CONTRATO DE TRABAJO:\n";
            
            
            Font font_titulo = FontFactory.getFont("Times New Roman");
            font_titulo.setSize(14);
            font_titulo.setStyle(Font.BOLD | Font.UNDERLINE);
            font_titulo.setFamily(Font.FontFamily.TIMES_ROMAN.toString());
            Paragraph parrafoTitulo = new Paragraph(tituloContrato_texto,font_titulo);
            parrafoTitulo.setAlignment(Element.ALIGN_CENTER);
            
            
            
            document.add(parrafoTitulo);

            
            Font font_primer_parrafo = FontFactory.getFont("Times New Roman");
            font_primer_parrafo.setSize(11);
//            font_primer_parrafo.setStyle(Font.BOLD | Font.UNDERLINE);
            font_primer_parrafo.setFamily(Font.FontFamily.TIMES_ROMAN.toString());
            
            Paragraph primer_parrafo = new Paragraph();
            
            
            /*Agregar CHunks a el parrafo*/
            /*PRIMER PARRAFO*/
            primer_parrafo.setAlignment(Element.ALIGN_JUSTIFIED);
            primer_parrafo.setLeading(15);
            primer_parrafo.setFont(font_primer_parrafo);
            primer_parrafo.add(TEXTO1);
            primer_parrafo.add(fecha);
            primer_parrafo.add(TEXTO2);
            primer_parrafo.add(nombreEmpleador);
            primer_parrafo.add(TEXTO3);
            primer_parrafo.add(rutEmpleador);
            primer_parrafo.add(TEXTO4);
            primer_parrafo.add(nombreTrabajador);
            primer_parrafo.add(TEXTO5);
            primer_parrafo.add(rutTrabajador);
            primer_parrafo.add(TEXTO6);
            primer_parrafo.add(direccionTrabajador);
            primer_parrafo.add(TEXTO7);
            primer_parrafo.add(comunaTrabajador);
            primer_parrafo.add(TEXTO8);
            primer_parrafo.add(fechaNacimientoTrabajador);
            primer_parrafo.add(TEXTO9);
            
            /*PRIMERA CLAUSULA*/
            primer_parrafo.add(primero);
            primer_parrafo.add(TEXTOPRIMERO1);
            primer_parrafo.add(funcionTrabajador);
            primer_parrafo.add(TEXTOPRIMERO2);
            
            /*SEGUNDA CLAUSULA*/
            primer_parrafo.add(segundo);
//            primer_parrafo.add(TEXTOSEGUNDO1);
            
            /*TERCERA CLAUSULA*/
            primer_parrafo.add(tercero);
            primer_parrafo.add(TEXTOTERCERO1);
            primer_parrafo.add(Chunk.TABBING);
            primer_parrafo.add(TEXTOTERCERO2A);
            primer_parrafo.add(sueldoTrabajador);
            primer_parrafo.add(TEXTOTERCERO3A);
            primer_parrafo.add(Chunk.TABBING);
            primer_parrafo.add(TEXTOTERCERO4B);
            
           
            
            /*CUARTA CLAUSULA*/
            primer_parrafo.add(cuarto);
//            primer_parrafo.add(TEXTOCUARTO1);
            
            
            /*QUINTA CLAUSULA*/
            primer_parrafo.add(quinto);
//            primer_parrafo.add(TEXTOQUINTO1);
            
            /*SEXTA CLAUSULA*/
            primer_parrafo.add(sexto);
//            primer_parrafo.add(TEXTOSEXTO1);
            
            /*SEPTIMA CLAUSULA*/
            primer_parrafo.add(septimo);
//            primer_parrafo.add(TEXTOSEPTIMO1);
            primer_parrafo.add(Chunk.TABBING);
//            primer_parrafo.add(TEXTOSEPTIMO2A);
            primer_parrafo.add(Chunk.TABBING);
//            primer_parrafo.add(TEXTOSEPTIMO3B);
            primer_parrafo.add(Chunk.TABBING);
//            primer_parrafo.add(TEXTOSEPTIMO4C);
            primer_parrafo.add(Chunk.TABBING);
//            primer_parrafo.add(TEXTOSEPTIMO5D);
            primer_parrafo.add(Chunk.TABBING);
//            primer_parrafo.add(TEXTOSEPTIMO6E);
            primer_parrafo.add(Chunk.TABBING);
//            primer_parrafo.add(TEXTOSEPTIMO7F);
            primer_parrafo.add(Chunk.TABBING);
//            primer_parrafo.add(TEXTOSEPTIMO8G);
            primer_parrafo.add(Chunk.TABBING);
//            primer_parrafo.add(TEXTOSEPTIMO9H);

            /*OCTAVA CLAUSULA*/
            primer_parrafo.add(octavo);
//            primer_parrafo.add(TEXTOOCTAVO1);
            
            /*NOVENA CLAUSULA*/
            primer_parrafo.add(noveno);
//            primer_parrafo.add(TEXTONOVENO1);
//            primer_parrafo.add(afp);
//            primer_parrafo.add(TEXTONOVENO3);
//            primer_parrafo.add(salud);
//            primer_parrafo.add(TEXTONOVENO5);
//            primer_parrafo.add(cesantia);
            
            /*public static final String TEXTONOVENO2 = " PROVIDA";
    public static final String TEXTONOVENO3 = "  Salud:";
    public static final String TEXTONOVENO4 = "FONASA";
    public static final String TEXTONOVENO5 = ", y las de cesantía en:";
    public static final String TEXTONOVENO6 = " AFC. \n\n";*/
            
            
            /*DÉCIMA CLAUSULA*/
            primer_parrafo.add(decimo);
            primer_parrafo.add(TEXTODECIMO1);
            primer_parrafo.add(fechaInicioContrato);
            primer_parrafo.add(TEXTODECIMO2);
            primer_parrafo.add(fechaTerminoContrato);
            primer_parrafo.add(TEXTODECIMO3);
            
            
            /*UNDECIMA CLAUSULA*/
            primer_parrafo.add(undecimo);
//            primer_parrafo.add(TEXTOUNDECIMO1);
            
            
            document.add(primer_parrafo);


            

//            document.add(todoEnUno);
            document.add(timbreGerencia);
            document.add(firmaTrabajador);
            document.addAuthor("IGVI");
            document.addTitle("CONTRATO DE TRABAJO IGVI");
            document.close();

        } catch (DocumentException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } 

    }
    
    
}
