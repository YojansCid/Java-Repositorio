import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.RootPaneContainer;
import javax.swing.SwingConstants;


public class JuegoBD extends JFrame implements ActionListener {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton back;
	private JButton pregunta;
	private JButton cambiar;
	private JButton check;
	private JRadioButton alternativaA;
	private JRadioButton alternativaB;
	private JRadioButton alternativaC;
	private JLabel numero;
	private JLabel puntaje;
	
	private JPanel panel ;
	private ButtonGroup contenedor;
	private int randomNumero;
	private String randomNumeroString;
	private int randomRest1;
	private String randomRest1String;
	private int randomRest2;
	private String randomRest2String;
	private int randomAlter;
	private JLabel A;
	private JLabel B;
	private JLabel C;
	private int punt;
	
	public JuegoBD (){
		
		this.setBounds(0,0,810, 630);
		punt=0;
		
		contenedor =new ButtonGroup();;
		
		panel = new JPanel();
		panel.setLayout(null);
		
		back =new JButton(new ImageIcon("src/imagenes/atras.jpg"));
		back.setBounds(10, 30,100 , 50);
		back.addActionListener(this);
		
		
		pregunta = new JButton(new ImageIcon("src/imagenes/descarga.jpg"));
		pregunta.setBounds(600, 30,100 , 50);
		pregunta.addActionListener(this);
		
		
		cambiar = new JButton("cambiar");
		cambiar.setBounds(400, 400,100 , 50);
		cambiar.addActionListener(this);
		
		
		check = new JButton("check");
		check.setBounds(550	, 400,100 , 50);
		check.addActionListener(this);
		
		A=new JLabel("A)");
		A.setBounds(450, 100,100 , 50);
		A.setFont(new Font("Comic Sans MS", Font.BOLD,50));
		A.setForeground(Color.MAGENTA);

		alternativaA = new JRadioButton("alterA",true);
		alternativaA.setBounds(550, 100, 100, 50);
		alternativaA.setFont(new Font("Comic Sans MS", Font.BOLD,50));
		alternativaA.setForeground(Color.ORANGE);
		contenedor.add(alternativaA);
		
		B=new JLabel("B)");
		B.setBounds(450, 200,100 , 50);
		B.setFont(new Font("Comic Sans MS", Font.BOLD,50));
		B.setForeground(Color.MAGENTA);
		
		
		alternativaB = new JRadioButton("alterB",false);
		alternativaB.setBounds(550, 200,100 , 50);
		alternativaB.setFont(new Font("Comic Sans MS", Font.BOLD,50));
		alternativaB.setForeground(Color.ORANGE);
		contenedor.add(alternativaB);
		
		C=new JLabel("C)");
		C.setBounds(450, 300,100 , 50);
		C.setFont(new Font("Comic Sans MS", Font.BOLD,50));
		C.setForeground(Color.MAGENTA);
		
		alternativaC = new JRadioButton("alterC",false);
		alternativaC.setBounds(550, 300,100 , 50);
		alternativaC.setFont(new Font("Comic Sans MS", Font.BOLD,50));
		alternativaC.setForeground(Color.ORANGE);
		contenedor.add(alternativaC);
		

		
		numero =  new JLabel("numero");
		numero.setBounds(10, 150,300 , 100);
		numero.setFont(new Font("Comic Sans MS", Font.BOLD,35));
		numero.setForeground(Color.BLUE);
		
		
		puntaje =  new JLabel("puntaje");
		puntaje.setBounds(10, 250,300 , 100);
		puntaje.setFont(new Font("Comic Sans MS", Font.BOLD,35));
		puntaje.setForeground(Color.GREEN);
		puntaje.setText("Puntaje:");
		
		
		panel.add(back);
		panel.add(pregunta);
		panel.add(cambiar);
		panel.add(check);
		panel.add(alternativaA);
		panel.add(alternativaB);
		panel.add(alternativaC);
		panel.add(numero);
		panel.add(puntaje);
		
		panel.add(A);
		panel.add(B);
		panel.add(C);
		panel.add(new FondoVentanas("/imagenes/paisaje1.jpg"));
		this.add(panel);
		
		
		
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
		
		
	}
	
	public void generar(){
		
		randomNumero = (int)(Math.random()* 10+ 1);
		randomNumeroString = Integer.toString(randomNumero,2) ;
		numero.setText(randomNumeroString);
		

		}
		
		public void aleatorio() {
			randomRest1 = (int)(Math.random()* 10+ 1);
			randomRest1String=Integer.toString(randomRest1) ;
			randomRest2 = (int)(Math.random()* 10+ 1);
			randomRest2String=Integer.toString(randomRest2) ;
			
			randomAlter = (int)(Math.random()* 3+ 1);
		if(randomAlter==1){
			alternativaA.setText(Integer.toString(randomNumero));
			alternativaB.setText(randomRest1String);
			alternativaC.setText(randomRest2String);
		}
		
		if(randomAlter==2){
			alternativaA.setText(randomRest1String);
			alternativaB.setText(Integer.toString(randomNumero));
			alternativaC.setText(randomRest2String);
		}
		if(randomAlter==3){
			alternativaA.setText(randomRest2String);
			alternativaB.setText(randomRest1String);
			alternativaC.setText(Integer.toString(randomNumero));
		}
		
		
	}

	
	

	public void actionPerformed(ActionEvent e) {
		
		
		
		if (e.getSource()==check && alternativaA.isSelected()==true 
				&&	Integer.parseInt(alternativaA.getText())==randomNumero ) {
			punt+=100;
			
			puntaje.setText("Puntaje.:"+punt);

			generar();
			aleatorio();
			
		
			
		}
		
		
		
		if (e.getSource()==check && alternativaB.isSelected()==true 
				 && Integer.parseInt(alternativaB.getText())==randomNumero ) {
			punt+=100;
			
			puntaje.setText("Puntaje.:"+punt);
		
			generar();
			aleatorio();
			
			
			
		}
		
		
		if (e.getSource()==check && alternativaC.isSelected()==true 
				&& Integer.parseInt(alternativaC.getText())==randomNumero ) {
			punt+=100;
			
			puntaje.setText("Puntaje.:"+punt);
			generar();
			aleatorio();
			
		}
		
		if (e.getSource()==check && Integer.parseInt(alternativaB.getText())!=randomNumero){
			
			generar();
			aleatorio();
		}
		
		
		
		if(e.getSource()==cambiar){
			
			
			
			
			
			generar();
			randomNumeroString = Integer.toString(randomNumero,2) ;
			numero.setText(randomNumeroString);
			numero.setHorizontalAlignment(SwingConstants.CENTER);
			numero.setForeground(Color.BLUE);
			numero.setFont(new Font("Comic Sans MS", Font.BOLD,100));
			aleatorio();
		}
	
		
		if (e.getSource()==pregunta){
			new Operaciones();
		}
			
			
		
		
	if (e.getSource()==back){
		setVisible(false);
		new OperacionBinaria();
		
		
	}
}
}
