

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class JuegoDecimalBinario implements ActionListener {
	
	private JButton a,b,c,d,g,f,botorand,comprobar,atras;
	private ImageIcon A,B,C,D,E,F,A1,B1,C1,D1,E1,F1;
	
	private boolean botonA , botonB , botonC , botonD , botonE , botonF;
	private JFrame venta = new JFrame ("La ventanita ") ;
	private JPanel panel1, panel2,panel3,panel4,panel5;
	private int contador = 63,seleccionado = 0,puntos= 0;
	private JLabel puntaje , valornumero, string ;
	private JLabel carta1 , carta2 ,carta3 ,carta4 ,carta5 , carta6;
	  
	private String rand,pun,fallo;
	
	public JuegoDecimalBinario(){
		
		
		Container contenedor= venta.getContentPane();
	
		
		
		seleccionado = (int) Math.round((Math.random()*64));
		
		panel1 = new JPanel(new GridLayout (2,7));
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		panel5 = new JPanel();
		
		fallo="intente de nuevo";
		string = new JLabel("Su puntaje es...");
		puntaje = new JLabel("0");
		valornumero = new JLabel( );
		rand = Integer.toString (seleccionado);
		
		valornumero.setText(rand);
		
		venta.setSize(1000,600);
		venta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		venta.setLocationRelativeTo(null);
		panel1.setPreferredSize(new Dimension (800,600));
		panel4.setPreferredSize(new Dimension(85, 40));
		
		
		
		string.setFont(new Font("Comic Sans MS", Font.BOLD,70));
		string.setForeground(Color.RED);
		puntaje.setFont(new Font("Comic Sans MS", Font.BOLD,70));
		puntaje.setForeground(Color.RED);
		valornumero.setFont(new Font("Comic Sans MS", Font.BOLD,70));
		valornumero.setForeground(Color.GREEN);
		
		A=new ImageIcon ("src/imagenes/carta1.jpg");
		B=new ImageIcon ("src/imagenes/carta2.jpg");
		C=new ImageIcon ("src/imagenes/carta4.jpg");
		D=new ImageIcon ("src/imagenes/carta8.jpg");
		E=new ImageIcon ("src/imagenes/carta16.jpg");
		F=new ImageIcon ("src/imagenes/carta32.jpg");
		
		A1=new ImageIcon ("src/imagenes/carta1 vuelta.jpg");
		B1=new ImageIcon ("src/imagenes/carta2 vuelta.jpg");
		C1=new ImageIcon ("src/imagenes/carta4 vuelta.jpg");
		D1=new ImageIcon ("src/imagenes/carta8 vuelta.jpg");
		E1=new ImageIcon ("src/imagenes/carta16 vuelta.jpg");
		F1=new ImageIcon ("src/imagenes/carta32 vuelta.jpg");
		
		carta1 = new JLabel(" 1");
		carta2 = new JLabel(" 1");
		carta3 = new JLabel(" 1");
		carta4 = new JLabel(" 1");
		carta5 = new JLabel(" 1");
		carta6 = new JLabel(" 1");
		
		carta1.setFont(new Font("Comic Sans MS", Font.BOLD,70));
		carta1.setForeground(Color.BLUE);
		carta2.setFont(new Font("Comic Sans MS", Font.BOLD,70));
		carta2.setForeground(Color.BLUE);
		carta3.setFont(new Font("Comic Sans MS", Font.BOLD,70));
		carta3.setForeground(Color.BLUE);
		carta4.setFont(new Font("Comic Sans MS", Font.BOLD,70));
		carta4.setForeground(Color.BLUE);
		carta5.setFont(new Font("Comic Sans MS", Font.BOLD,70));
		carta5.setForeground(Color.BLUE);
		carta6.setFont(new Font("Comic Sans MS", Font.BOLD,70));
		carta6.setForeground(Color.BLUE);
		
		a= new JButton(A);
		b= new JButton(B);
		c= new JButton(C);
		d= new JButton(D);
		g= new JButton(E);
		f= new JButton(F);
		
		botorand = new JButton("cambiar");
		comprobar = new JButton("comprobar");
		atras = new JButton(new ImageIcon("src/imagenes/atras.jpg"));
		
		
		a.setPreferredSize(new Dimension(100, 150));
		b.setPreferredSize(new Dimension(100, 150));
		c.setPreferredSize(new Dimension(100, 150));
		d.setPreferredSize(new Dimension(100, 150));
		g.setPreferredSize(new Dimension(100, 150));
		f.setPreferredSize(new Dimension(100, 150)); 
		botorand.setPreferredSize(new Dimension(85, 40));
		atras.setPreferredSize(new Dimension(95, 55));
		
		
		panel1.add(f);
		panel1.add(g);
		panel1.add(d);
		panel1.add(c);
		panel1.add(b);
		panel1.add(a);
		panel1.add(carta1);
		panel1.add(carta2);
		panel1.add(carta3);
		panel1.add(carta4);
		panel1.add(carta5);
		panel1.add(carta6);
		
		panel5.add(atras,BorderLayout.NORTH);
		
		a.addActionListener(this);
		b.addActionListener(this);
		c.addActionListener(this);
		d.addActionListener(this);
		g.addActionListener(this);
		f.addActionListener(this);
		
		botorand.addActionListener(this);
		comprobar.addActionListener(this);		
		atras.addActionListener(this);
		
		valornumero.setPreferredSize(new Dimension(100, 100));
		
		panel2.add(string);
		panel2.add(puntaje);
		panel3.add(valornumero);
		panel3.add(botorand,BorderLayout.SOUTH);
		panel4.add(comprobar);
		
		contenedor.add(new FondoVentanas("imagenes/paisaje3.jpg"));
		contenedor.add(panel4,BorderLayout.SOUTH);
		contenedor.add(panel3,BorderLayout.EAST);
		contenedor.add(panel1,BorderLayout.CENTER);
		contenedor.add(panel2,BorderLayout.NORTH);
		
		venta.setContentPane(contenedor);
		venta.repaint();
		venta.setVisible(true);
	    venta.add(panel5,BorderLayout.WEST);
	}

	public static void main(String[] args) {
	          new JuegoDecimalBinario ();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==atras){
			venta.setVisible(false);
			new OperacionBinaria();
			
		}
		
		 
		if (e.getSource() == a ){
			if ( botonA==false ){
				 botonA=true;
				 a.setIcon(A1);
				 contador-=1;
				 carta6.setText(" 0");
				}
			else {
				botonA=false;
				a.setIcon(A);
				contador+=1;
				carta6.setText(" 1");
			}
			
		}
		if (e.getSource() == b ){
			if ( botonB==false ){
				 botonB=true;
				 b.setIcon(B1);
				 contador-=2;
				 carta5.setText(" 0");
				}
			else {
				botonB=false;
				b.setIcon(B);
				contador+=2;
				carta5.setText(" 1");
			}
			
		}
		if (e.getSource() == c ){
			if ( botonC==false ){
				 botonC=true;
				 c.setIcon(C1);
				 contador-=4;
				 carta4.setText(" 0");
				}
			else  {
				botonC=false;
				c.setIcon(C);
				contador+=4;
				carta4.setText(" 1");
			}
			
		}
		if (e.getSource() == d ){
			if ( botonD==false ){
				 botonD=true;
				 d.setIcon(D1);
				 contador-=8;
				 carta3.setText(" 0");
				}
			else {
				botonD=false;
				d.setIcon(D);
				contador+=8;
				carta3.setText(" 1");
			}
			
		}
		if (e.getSource() == g ){
			if ( botonE==false ){
				 botonE=true;
				 g.setIcon(E1);
				 contador-=16;
				 carta2.setText(" 0");
				}
			else {
				botonE=false;
				 g.setIcon(E);
				 contador+=16;
				 carta2.setText(" 1");
			}
			
		}
		if (e.getSource() == f ){
			if ( botonF==false ){
				 botonF=true;
				 f.setIcon(F1);
				 contador-=32;
				 carta1.setText(" 0");
				}
			else {
				botonF=false;
				f.setIcon(F);
				contador+=32;
				carta1.setText(" 1");
			}
			
		}
		if (e.getSource() == botorand){
			seleccionado  = (int) Math.round((Math.random()*64));
			rand = Integer.toString (seleccionado);
			valornumero.setText(rand);
			if(puntos > 0){	
				puntos-=50;
				pun = Integer.toString (puntos);
				puntaje.setText(pun);
				}
		}
		
		if (e.getSource() == comprobar){
			if (contador == seleccionado){
				fallo= "Su puntaje es...";
				puntos+=100;
				pun = Integer.toString (puntos);
				string.setText(fallo);
				puntaje.setText(pun);
				seleccionado  = (int) Math.round((Math.random()*64));
				rand = Integer.toString (seleccionado);
				valornumero.setText(rand);
			}
			else{
				fallo="intente de nuevo";
				string.setText(fallo);
				puntaje.setText(null);
			}
			
		}
		
		
	}


}

