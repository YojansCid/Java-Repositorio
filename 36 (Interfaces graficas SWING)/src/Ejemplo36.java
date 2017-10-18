
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yojans Cid
 */
public class Ejemplo36 {

    /**
     * @param args the command line arguments
     */
    /*La siguiente clase mostrara como funciona la libreria de JAVA llamada 
    SWING, que permite crear interfaces graficas para una aplicacion*/
    public static void main(String[] args) {
        /*Se crea la ventana que contendra los diferentes componentes de la 
        aplicacion dandole como parametro un nombre ("Ventana SWING")*/
        JFrame ventana = new JFrame("Ventana SWING");
        /*Se setea las dimenciones que tendra la ventana*/
        ventana.setSize(300,200);
        
        
        /*Se crea un Panel, que contendra los diferentes componentes de la 
        aplicacion*/
        JPanel panel = new JPanel();
        
        
        /**Se crea un BOTON llamado botonSaludar*/
        JButton botonSaludar = new JButton("Saludar");
        /*se agrega el BOTON (botonSaludar) a el PANEL creado*/
        panel.add(botonSaludar);
        
        /*Se crea un BOTON llamado botonSalir*/
        JButton botonSalir = new JButton("Salir");
        /*se agrega el  BOTON (botonSalir) a el PANEL creado*/
        panel.add(botonSalir);
        
        /*Se crea un BOTON llamado botonFormulario*/
        JButton botonFormulario = new JButton("Formulario");
        /*se agrega el  BOTON (botonFormulario) a el PANEL creado*/
        panel.add(botonFormulario);
        
        
        /*Se agrega el panel a la ventana (JPanel) creada*/
        ventana.add(panel);
        
        /*Se setea que el boton de salir termine la ejecucion del programa*/
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        /*Se indica que la ventana sera visible, dandole como parametro un 
        boolean true*/
        ventana.setVisible(true);
        
        /*Se agrega una accion al boton botonSaludar al hacer click sobre el*/
        
        /*addActionListener necesita un ActionListener y se le da en forma de 
        funcion (se crea en la parte que se entregan los parametros)*/
        botonSaludar.addActionListener(new ActionListener() {
            /*Se sobreescribe (@Override) el metodo actionPerformed*/
            @Override
            public void actionPerformed(ActionEvent e) {
                /*Dentro del metodo se especifica que se hara luego de presionar
                el BOTON botonSaludar*/
                
                /*Se crea una variable String que captura el texto entregado por
                el JOptionPane.showInputDialog, un panel que contiene un input 
                (label)*/
                String captura = JOptionPane.showInputDialog(null, "Ingrese  su nombre");
                /*Se muestra por medio de un JOptionPane.showMessageDialog el 
                nombre o texto "capturado"*/
                JOptionPane.showMessageDialog(null, captura);
            }
        });
        
        /*Tambien se puede realizar la misma funcionalidad con el uso de "Lamda" 
        (Sera explicado mas adelante) pero su funcionalidad es la siguiente*/
        
        /*botonSaludar.addActionListener((ActionEvent e) -> {
            String captura = JOptionPane.showInputDialog(null, "Ingrese  su nombre");
            JOptionPane.showMessageDialog(null, "Hola " + captura);
        });*/
        
        
        /*De la misma forma se crea una accion para el boton salir, para que 
        cierre los procesos de la aplicacion*/
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ventana.dispose();
            }
        });
        
        /*Se le da a el BOTONbotonFormulario la funcionalidad de abrir el 
        formulario creado en la otra clase (formulario creado por medio de la 
        "paleta de componentes" que proporciona el IDE NetBeans) y vuelve 
        visible. Cabe destacar que se abre otra "pestaña" independiente al 
        presionar el BOTON*/
        botonFormulario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                Formulario formulario = new Formulario();
                formulario.setVisible(true);
            }
        });
        
        
        
        
    }
    
}
