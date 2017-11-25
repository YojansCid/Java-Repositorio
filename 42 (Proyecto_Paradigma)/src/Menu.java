import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import convertir.VisorBinario;

public class Menu extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private final JPanel p;
	private JLabel label;
	
	private JButton boton1;
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;

	private ImageIcon juegos;
	private ImageIcon operaciones;
	private ImageIcon configuracion;
	private ImageIcon extras;
	private ImageIcon historia;
	private ImageIcon acercade;
	private ImageIcon juegos2;
	private ImageIcon operaciones2;
	private ImageIcon configuracion2;
	private ImageIcon extras2; 
	private ImageIcon historia2;
	private ImageIcon acercade2;
	
	public Menu() {
		setVisible(true);
		setTitle("JUEGO BINARIO");
		setSize(800,600);
		
		p = new JPanel();
		
		label = new JLabel("ELIGE UNA OPCIÓN");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.DARK_GRAY);
		label.setFont(new Font("Comic Sans MS", Font.BOLD,26));
		
		FondoVentanas fondo = new FondoVentanas("/imagenes/selecion.jpg");
		
		juegos = new ImageIcon("src/imagenes/juegos.jpg");
		operaciones = new ImageIcon("src/imagenes/operaciones.jpg");
		configuracion = new ImageIcon("src/imagenes/configuracion.jpg");
		extras = new ImageIcon("src/imagenes/extras.jpg");
		historia = new ImageIcon("src/imagenes/historia2.png");
		acercade = new ImageIcon("src/imagenes/acercade.jpg");
		
		juegos2=new ImageIcon("src/imagenes/juegos2.jpg");
		operaciones2=new ImageIcon("src/imagenes/operaciones2.jpg");
		configuracion2=new ImageIcon("src/imagenes/configuracion2.jpg");
		extras2=new ImageIcon("src/imagenes/extras2.jpg");
		historia2=new ImageIcon("src/imagenes/historia2.png");
		acercade2=new ImageIcon("src/imagenes/acercade2.jpg");
		
		int ancho = 210; // ancho en pixeles que tendra el icono escalado
		int alto = -1; // alto (para que conserve la proporcion pasamos -1)
		//210x57pixeles

		// Obtiene un icono en escala con las dimensiones especificadas
		ImageIcon juegosEscala = new ImageIcon(juegos.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
		ImageIcon operacionesEscala = new ImageIcon(operaciones.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
		ImageIcon configuracionEscala = new ImageIcon(configuracion.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
		ImageIcon extrasEscala = new ImageIcon(extras.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
		ImageIcon historiaEscala = new ImageIcon(historia.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
		ImageIcon acercadeEscala = new ImageIcon(acercade.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
		
		ImageIcon juegos2Escala = new ImageIcon(juegos2.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
		ImageIcon operaciones2Escala = new ImageIcon(operaciones2.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
		ImageIcon configuracion2Escala = new ImageIcon(configuracion2.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
		ImageIcon extras2Escala = new ImageIcon(extras2.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
		ImageIcon historia2Escala = new ImageIcon(historia2.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
		ImageIcon acercade2Escala = new ImageIcon(acercade2.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_DEFAULT));
		
		boton1 = new JButton (juegosEscala);
		boton2 = new JButton (operacionesEscala);
		boton3 = new JButton (configuracionEscala);
		boton4 = new JButton (extrasEscala);
		boton5 = new JButton (historiaEscala);
		boton6 = new JButton (acercadeEscala);
		
		p.setBorder(new EmptyBorder(5, 5, 5, 5));
		p.setLayout(null);
		
		boton1.setBackground(Color.BLUE);
		boton1.setBorderPainted(false);
		boton1.setRolloverIcon(juegos2Escala);
		boton1.addActionListener(this);
				
		boton2.setBorderPainted(false);
		boton2.setRolloverIcon(operaciones2Escala);
		boton2.addActionListener(this);
		
		boton3.setBorderPainted(false);
		boton3.setRolloverIcon(configuracion2Escala);
		boton3.addActionListener(this);

		boton4.setBorderPainted(false);
		boton4.setRolloverIcon(extras2Escala);
		boton4.addActionListener(this);
			
		boton5.setBackground(Color.WHITE);
		boton5.setBorderPainted(false);
		boton5.setRolloverIcon(historia2Escala);
		boton5.addActionListener(this);
		
		boton6.setBorderPainted(false);
		boton6.setRolloverIcon(acercade2Escala);
		boton6.addActionListener(this);
		
		label.setBounds(0,30,800,50);
		boton1.setBounds(60, 150, 210, 57);
		boton2.setBounds(290, 150, 210, 57);
		boton3.setBounds(520, 150, 210, 57);
		boton4.setBounds(60, 350, 210, 57);
		boton5.setBounds(290, 350, 210, 57);
		boton6.setBounds(520, 350, 210, 57);
	
		p.setLayout(null);
		
		p.add(label);
		p.add(boton1);
		p.add(boton2);
		p.add(boton3);
		p.add(boton4);
		p.add(boton5);
		p.add(boton6);
		p.add(fondo);
	
		setContentPane(p);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == boton1){
			setVisible(false);
			new Explicacion();			
		}
		if(e.getSource() == boton2){
			setVisible(false);
			new Operaciones();
		}
		if(e.getSource() == boton3){
			setVisible(false);
			new Configuracion();
		}	
		if(e.getSource() == boton4){
			setVisible(false);
			new Extras();
			
		}	
		if(e.getSource() == boton5){
			setVisible(false);
			new Historia();
			
		}
		if(e.getSource() == boton6){
			setVisible(false);
			new AcercaDe();
		}	
	}
}