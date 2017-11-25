
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class ConfiguracionFondo extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public ConfiguracionFondo(){
		
		setLayout(null);
		setBounds(0, 0, 1366,768);
		JButton boton = new JButton(new ImageIcon("src/imagenes/rasca.gif"));
		boton.setBounds(1010,500,229,188);
		boton.setBorderPainted(false);
		JButton boton2 = new JButton(new ImageIcon("src/imagenes/amaca.gif"));
		boton2.setBounds(50,500,229,188);
		boton.setBackground(Color.green);
		add(boton);
		add(boton2);
		
		
		JButton atras=new JButton (new ImageIcon("src/imagenes/atras.jpg"));
		atras.setBackground(Color.yellow);
		atras.setBounds(100,25,100,50);
		//setVisible(false);
		atras.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e){
			}
			});
		add(atras);
		//JButton adelante=new JButton (new ImageIcon("src/imagenes/pegunta.jpg"));
		//adelante.setBackground(Color.YELLOW);
		//conf.add(adelante);
		//adelante.setBounds(900,25,300,300);
		
		JButton smusica = new JButton ("SONIDO MUSICA");
		smusica.setBackground(Color.orange);
		smusica.setBounds(400,100,200,100);
		smusica.setBorderPainted(false);
		add(smusica);
		
		ButtonGroup grupo1 = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton ("ON",false);
		radio1.setBounds(600,100,100,100);
		grupo1.add(radio1);
		add(radio1);
		
		JRadioButton radio2 = new JRadioButton ("OFF",true);
		radio2.setBounds(700,100,100,100);
		grupo1.add(radio2);
		add(radio2);
		
		JButton steclas = new JButton ("SONIDOTECLAS");
		steclas.setBackground(Color.blue);
		steclas.setBorderPainted(false);
		steclas.setBounds(400,200,200,100);
		add(steclas);
		
		ButtonGroup grupo2 = new ButtonGroup();
		JRadioButton radio3 = new JRadioButton ("ON",false);
		radio3.setBounds(600,200,100,100);
		grupo2.add(radio3);
		add(radio3);
		
		JRadioButton radio4 = new JRadioButton ("OFF",true);
		radio4.setBounds(700,200,100,100);
		grupo2.add(radio4);
		add(radio4);
	
		JButton dificultad = new JButton ("DIFICULTAD");
		dificultad.setBackground(Color.red);
		dificultad.setBorderPainted(false);
		dificultad.setBounds(400,300,200,100);
		add(dificultad);
		
		ButtonGroup grupo4 = new ButtonGroup();
		JRadioButton radio7 = new JRadioButton ("FACIL",false);
		radio7.setBounds(600,400,100,100);
		grupo4.add(radio7);
		add(radio7);
		
		JRadioButton radio8 = new JRadioButton ("MEDIO",true);
		radio8.setBounds(700,400,100,100);
		grupo4.add(radio8);
		add(radio8);

		JRadioButton radio9 = new JRadioButton ("DIFICIL",true);
		radio9.setBounds(800,400,100,100);
		grupo4.add(radio9);
		add(radio9);
		
		
		
		JButton reloj = new JButton ("RELOJ");
		reloj.setBackground(Color.green);
		reloj.setBorderPainted(false);
		reloj.setBounds(400,400,200,100);
		add(reloj);
		
		ButtonGroup grupo3 = new ButtonGroup();
		JRadioButton radio5 = new JRadioButton ("ON",false);
		radio5.setBounds(600,300,100,100);
		grupo3.add(radio5);
		add(radio5);
		
		JRadioButton radio6 = new JRadioButton ("OFF",true);
		radio6.setBounds(700,300,100,100);
		grupo3.add(radio6);
		add(radio6);
		
		add(new FondoVentanas("/imagenes/conf.gif"));
		
		setVisible(true);
	}

}