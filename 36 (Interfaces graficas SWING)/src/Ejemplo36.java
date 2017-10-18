
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
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ventana SWING");
        ventana.setSize(300,200);
        ventana.setVisible(true);
        
        JPanel panel = new JPanel();
        
        
        JButton botonSaludar = new JButton("Saludar");
        panel.add(botonSaludar);
        
        JButton botonSalir = new JButton("Salir");
        panel.add(botonSalir);
        
        JButton botonFormulario = new JButton("Formulario");
        panel.add(botonFormulario);
        
        ventana.add(panel);
        
        
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        botonSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                String captura = JOptionPane.showInputDialog(null, "Ingrese  su nombre");
                JOptionPane.showMessageDialog(null, captura);
            }
        });
        
        /*botonSaludar.addActionListener((ActionEvent e) -> {
            String captura = JOptionPane.showInputDialog(null, "Ingrese  su nombre");
            JOptionPane.showMessageDialog(null, "Hola " + captura);
        });*/
        
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ventana.dispose();
            }
        });
        
        botonFormulario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                Formulario formulario = new Formulario();
                formulario.setVisible(true);
            }
        });
        
        
        
        
    }
    
}
