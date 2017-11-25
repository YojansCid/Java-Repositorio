
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Configuracion extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JButton atras;
	
	public Configuracion(){
		
		setLayout(null);
		setBounds(0, 0, 800,600);		
		
		atras=new JButton (new ImageIcon("src/imagenes/back.png"));
		atras.setBackground(Color.white);
		atras.setBounds(25,25,50,50);
		atras.addActionListener(this);
		add(atras);
		
		JButton smusica = new JButton ("MUSICA");
		smusica.setBackground(Color.orange);
		smusica.setBounds(150,100,200,50);
		smusica.setBorderPainted(false);
		add(smusica);
		
		ButtonGroup grupo1 = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton ("ON",false);
		radio1.setBounds(600,100,100,50);
		grupo1.add(radio1);
		add(radio1);
		
		JRadioButton radio2 = new JRadioButton ("OFF",true);
		radio2.setBounds(700,100,100,50);
		grupo1.add(radio2);
		add(radio2);
	
		JButton dificultad = new JButton ("DIFICULTAD");
		dificultad.setBackground(Color.red);
		dificultad.setBorderPainted(false);
		dificultad.setBounds(150,400,200,50);
		add(dificultad);
		
		ButtonGroup grupo4 = new ButtonGroup();
		JRadioButton radio7 = new JRadioButton ("FACIL",false);
		radio7.setBounds(600,400,100,50);
		grupo4.add(radio7);
		add(radio7);
		
		JRadioButton radio8 = new JRadioButton ("MEDIO",true);
		radio8.setBounds(700,400,100,50);
		grupo4.add(radio8);
		add(radio8);

		JRadioButton radio9 = new JRadioButton ("DIFICIL",true);
		radio9.setBounds(800,400,100,50);
		grupo4.add(radio9);
		add(radio9);
		
		
		
		JButton reloj = new JButton ("RELOJ");
		reloj.setBackground(Color.green);
		reloj.setBorderPainted(false);
		reloj.setBounds(150,300,200,50);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == atras){
			setVisible(false);
			new Menu().setVisible(true);
		}
		
	}

}