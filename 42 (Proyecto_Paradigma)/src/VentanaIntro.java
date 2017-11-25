
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class VentanaIntro extends JFrame{
	
	private JLabel titulo;
	private JLabel etiqueta;
	private Adaptador ke;
	
	public VentanaIntro(){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        titulo = new JLabel("PEREZOSO BINARIO");
        etiqueta = new JLabel("Presiona ENTER");
        ke = new Adaptador();
        
        
        titulo.setBounds(210,60,460,70);
        titulo.setForeground(Color.orange);
        Font font01 = new Font("Comic Sans MS", Font.BOLD,36);
        titulo.setFont(font01);
        
        etiqueta.setBounds(250, 350, 460, 200);
        etiqueta.setForeground(Color.white);
        Font font02 = new Font("Comic Sans MS", Font.BOLD,36);
        etiqueta.setFont(font02);
        
        add(titulo);
        add(etiqueta);
        add(new FondoVentanas("/imagenes/perezoso_intro.jpg"));
		
		
		this.addKeyListener(ke);
		
		this.setTitle("Perezoso Binario - Grupo 7");
		this.setSize(800,600);
        this.setUndecorated(true);
        this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	private class Adaptador extends KeyAdapter {
		public void keyPressed(KeyEvent ke) {
	        if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
	        	setVisible(false);
	    		Login l = new Login();
	    		l.setVisible(true);
	        }
	    }
		
	}
}
