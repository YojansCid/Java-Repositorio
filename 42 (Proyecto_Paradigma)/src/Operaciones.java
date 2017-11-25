import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Operaciones extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	public static final int ANCHO = 210;
	public static final int ALTO = 57;
	
	private Container contenedor;
	
	private JLabel etiqueta;
	private JButton atras;
	private JButton atras2;
	private JButton B1;
	private JButton B2;
	private JButton B3;
	private JButton B4;
	private JButton B5;
	private JButton B6;
	
	
	public Operaciones(){
		setLayout(null);
		setBounds(0, 0, 800,680);
		
		contenedor = getContentPane();
		etiqueta = new JLabel();
		
		etiqueta.setBounds(0, 0, 680, 680);
		
		atras = new JButton (new ImageIcon("src/imagenes/back.png"));
		atras.setBackground(Color.white);
		atras.setToolTipText("para volver al menú principal");
		atras.setBounds(50,50,100,50);
		atras.addActionListener(this);
		
		atras2 = new JButton (new ImageIcon("src/imagenes/back.png"));
		atras2.setBackground(Color.white);
		atras2.setToolTipText("para volver al menú de explicación");
		atras2.setBounds(10,10,100,50);
		atras2.addActionListener(this);
		
		B1=new JButton (new ImageIcon((new ImageIcon("src/imagenes/BotonSuma.jpg")).getImage().getScaledInstance(ANCHO, ALTO, java.awt.Image.SCALE_DEFAULT)));
		B1.setBorderPainted(false);
		B1.setRolloverIcon(new ImageIcon((new ImageIcon("src/imagenes/BotonSuma2.jpg")).getImage().getScaledInstance(ANCHO, ALTO, java.awt.Image.SCALE_DEFAULT)));
		B1.setBounds(300,50,ANCHO, ALTO);
		B1.addActionListener(this);
		contenedor.add(B1);
		
		
		B2=new JButton (new ImageIcon((new ImageIcon("src/imagenes/BotonResta.jpg")).getImage().getScaledInstance(ANCHO, ALTO, java.awt.Image.SCALE_DEFAULT)));
		B2.setBorderPainted(false);
		
		B2.setRolloverIcon(new ImageIcon((new ImageIcon("src/imagenes/BotonResta2.jpg")).getImage().getScaledInstance(ANCHO, ALTO, java.awt.Image.SCALE_DEFAULT)));
		B2.setBounds(300,(50+ALTO+25),ANCHO, ALTO);
		B2.addActionListener(this);
		contenedor.add(B2);
		
		
		B3=new JButton (new ImageIcon((new ImageIcon("src/imagenes/BotonMulti.jpg")).getImage().getScaledInstance(ANCHO, ALTO, java.awt.Image.SCALE_DEFAULT)));
		B3.setBorderPainted(false);
		B3.setRolloverIcon(new ImageIcon(new ImageIcon("src/imagenes/BotonMulti2.jpg").getImage().getScaledInstance(ANCHO, ALTO, java.awt.Image.SCALE_DEFAULT)));
		B3.setBounds(300,(50+ALTO*2+25*2),ANCHO, ALTO);
		B3.addActionListener(this);
		contenedor.add(B3);
		
		
		
		B4=new JButton (new ImageIcon((new ImageIcon("src/imagenes/BotonDivision.jpg")).getImage().getScaledInstance(ANCHO, ALTO, java.awt.Image.SCALE_DEFAULT)));
		B4.setBorderPainted(false);
		B4.setRolloverIcon(new ImageIcon((new ImageIcon("src/imagenes/BotonDivision2.jpg")).getImage().getScaledInstance(ANCHO, ALTO, java.awt.Image.SCALE_DEFAULT)));
		B4.setBounds(300,(50+ALTO*3+25*3),ANCHO, ALTO);
		B4.addActionListener(this);
		contenedor.add(B4);
		
		
		B5=new JButton (new ImageIcon((new ImageIcon("src/imagenes/BotonBinario.jpg")).getImage().getScaledInstance(ANCHO, ALTO, java.awt.Image.SCALE_DEFAULT)));
		B5.setBorderPainted(false);
		B5.setRolloverIcon(new ImageIcon(new ImageIcon("src/imagenes/BotonBinario2.jpg").getImage().getScaledInstance(ANCHO, ALTO, java.awt.Image.SCALE_DEFAULT)));
		B5.setBounds(300,(50+ALTO*4+25*4),ANCHO, ALTO);
		B5.addActionListener(this);
		contenedor.add(B5);
		
		
		B6=new JButton (new ImageIcon((new ImageIcon("src/imagenes/BotonDecimal.jpg")).getImage().getScaledInstance(ANCHO, ALTO, java.awt.Image.SCALE_DEFAULT)));
		B6.setBorderPainted(false);
		B6.setRolloverIcon(new ImageIcon((new ImageIcon("src/imagenes/BotonDecimal2.jpg")).getImage().getScaledInstance(ANCHO, ALTO, java.awt.Image.SCALE_DEFAULT)));
		B6.setBounds(300,(50+ALTO*5+25*5),ANCHO, ALTO);
		B6.addActionListener(this);
		contenedor.add(B6);
		contenedor.add(atras);
		
		contenedor.setBackground(Color.WHITE);
		contenedor.add(new FondoVentanas("/imagenes/Seleccion2.jpg"));
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setContentPane(contenedor);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== atras){
			setVisible(false);
			new Menu().setVisible(true);;
		}else if(e.getSource() == atras2){
			setVisible(false);
			new Operaciones();
		}
		if(e.getSource() == B1){
			ImageIcon imagen = new ImageIcon((new ImageIcon("src/imagenes/SumaBinaria.gif")).getImage().getScaledInstance(680, -1, java.awt.Image.SCALE_DEFAULT));
			etiqueta.setIcon(imagen);
			contenedor.removeAll();
			contenedor.setBackground(Color.white);
			contenedor.add(atras2);
			contenedor.add(etiqueta);
			contenedor.repaint();
		}
		if(e.getSource() == B2){
			ImageIcon imagen = new ImageIcon((new ImageIcon("src/imagenes/RestaBinaria.gif")).getImage().getScaledInstance(680, -1, java.awt.Image.SCALE_DEFAULT));
			etiqueta.setIcon(imagen);
			contenedor.removeAll();
			contenedor.setBackground(Color.white);
			contenedor.add(atras2);
			contenedor.add(etiqueta);
			contenedor.repaint();
		}
		if(e.getSource() == B3){
			ImageIcon imagen = new ImageIcon((new ImageIcon("src/imagenes/MultiplicacionBinaria.gif")).getImage().getScaledInstance(680, -1, java.awt.Image.SCALE_DEFAULT));
			etiqueta.setIcon(imagen);
			contenedor.removeAll();
			contenedor.setBackground(Color.white);
			contenedor.add(atras2);
			contenedor.add(etiqueta);
			contenedor.repaint();
		}
		if(e.getSource() == B4){
			ImageIcon imagen = new ImageIcon((new ImageIcon("src/imagenes/DivisionBinaria.gif")).getImage().getScaledInstance(680, -1, java.awt.Image.SCALE_DEFAULT));
			etiqueta.setIcon(imagen);
			contenedor.removeAll();
			contenedor.setBackground(Color.white);
			contenedor.add(atras2);
			contenedor.add(etiqueta);
			contenedor.repaint();
		}
		if(e.getSource() == B5){
			ImageIcon imagen = new ImageIcon((new ImageIcon("src/imagenes/Binario-a-Decimal.gif")).getImage().getScaledInstance(680, -1, java.awt.Image.SCALE_DEFAULT));;
			etiqueta.setIcon(imagen);
			contenedor.removeAll();
			contenedor.setBackground(Color.white);
			contenedor.add(atras2);
			contenedor.add(etiqueta);
			contenedor.repaint();
		}
		if(e.getSource() == B6){
			ImageIcon imagen = new ImageIcon((new ImageIcon("src/imagenes/Decimal-a-Binario.gif")).getImage().getScaledInstance(700, -1, java.awt.Image.SCALE_DEFAULT));
			etiqueta.setIcon(imagen);
			contenedor.removeAll();
			contenedor.setBackground(Color.white);
			contenedor.add(atras2);
			contenedor.add(etiqueta);
			contenedor.repaint();
		}
	}		
}

