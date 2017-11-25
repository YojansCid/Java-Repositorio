
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class OperacionBinaria extends JFrame implements ActionListener{
	
	private JButton back;
	private JButton comprobar;
	private JButton sumar;
	private JButton restar;
	private JButton multiplicar;
	private JButton dividir;
	private JButton jugcartas;
	private JButton juegoBD;
	private JButton juegoDB;
	private JLabel operador;
	private JLabel igual;
	private JTextField a;
	private JTextField b;
	private JTextField c;
	private JButton exito;
	private JLabel labelpuntaje;
	private JLabel labelerror;
	private JLabel juegoBinarioDecimal;
	private JLabel juegoDecimalBinario;
	private String C;
	private int puntaje;
	
	
	
	
	public OperacionBinaria(){
		
		
		
puntaje=100;
		setLayout(null);
		setBounds(0, 0, 810,630);
		
		juegoBinarioDecimal=new JLabel("Juego Binario-Decimal");
		juegoBinarioDecimal.setBounds(130, 540, 300, 50);
		juegoBinarioDecimal.setForeground(Color.RED);
		juegoBinarioDecimal.setFont(new Font("Comic Sans MS", Font.BOLD,18));
			
		juegoDecimalBinario=new JLabel("Juego Decimal-Binario");
		juegoDecimalBinario.setBounds(450, 540, 300, 50);
		juegoDecimalBinario.setForeground(Color.RED);
		juegoDecimalBinario.setFont(new Font("Comic Sans MS", Font.BOLD,18));
			
		
		
		juegoBD=new JButton(new ImageIcon("src/imagenes/play.png"));
		juegoBD.addActionListener(this);
		juegoBD.setBounds(20,540, 100, 50);
		
		juegoDB=new JButton(new ImageIcon("src/imagenes/play.png"));
		juegoDB.addActionListener(this);
		juegoDB.setBounds(340,540, 100, 50);
		
		labelerror= new JLabel("");
		labelerror.setFont(new Font("Comic Sans MS", Font.BOLD,30));
        labelerror.setBounds(350,100,400,150);
        labelerror.setForeground(Color.RED);
		
		labelpuntaje=new JLabel("0");
	    labelpuntaje.setFont(new Font("Comic Sans MS", Font.BOLD,70));
	    labelpuntaje.setBounds(30,100,250,150);
	    labelpuntaje.setForeground(Color.RED);
        
		exito = new JButton(new ImageIcon("src/imagenes/caritapregunta.png"));
		exito.setBounds(450,400,150,100);
		exito.addActionListener(this);
		
		back = new JButton (new ImageIcon("src/imagenes/atras.jpg"));
		back.setBackground(Color.white);
		back.setBounds(50,50,100,50);
		back.addActionListener(this);
		
		sumar = new JButton (new ImageIcon("src/imagenes/suma.png"));
		sumar.setBackground(Color.white);
		sumar.setBounds(350,50,50,50);
		sumar.addActionListener(this);
		
		restar = new JButton (new ImageIcon("src/imagenes/resta.png"));
		restar.setBackground(Color.white);
		restar.setBounds(400,50,50,50);
		restar.addActionListener(this);
		
		multiplicar = new JButton (new ImageIcon("src/imagenes/multi.png"));
		multiplicar.setBackground(Color.white);
		multiplicar.setBounds(450,50,50,50);
		multiplicar.addActionListener(this);
		
		dividir = new JButton (new ImageIcon("src/imagenes/division.png"));
		dividir.setBackground(Color.white);
		dividir.setBounds(500,50,50,50);
		dividir.addActionListener(this);
		
		comprobar = new JButton(new ImageIcon("src/imagenes/tick.jpg"));
		comprobar.setBackground(Color.white);
		comprobar.setBounds(150,400,150,100);
		comprobar.addActionListener(this);
		comprobar.setBackground(Color.GREEN);
				
		operador = new JLabel(new ImageIcon("src/imagenes/blanco.png"));
		operador.setBackground(Color.white);
		operador.setBounds(300,250,50,50);
		
		igual = new JLabel(new ImageIcon("src/imagenes/igual.png"));
		igual.setBackground(Color.white);
		igual.setBounds(500,250,50,50);
		
		
		jugcartas = new JButton ("otro juego");
		jugcartas.setBackground(Color.white);
		jugcartas.setBounds(670, 550, 100, 30);
		
		
		a = new JTextField("");
		a.setBounds(150,250,150,50);
		int random1 = (int)(Math.random()* 10+ 1);
		String random11 = Integer.toString(random1,2) ;
		a.setText(random11);
		a.setHorizontalAlignment(SwingConstants.CENTER);
		a.setForeground(Color.BLUE);
		a.setFont(new Font("Comic Sans MS", Font.BOLD,22));
		
		b = new JTextField("");
		b.setBounds(350,250,150,50);
		int random2 = (int)(Math.random()*10 + 1);
		String random22 = Integer.toString(random2,2) ;
		b.setText(random22);
		b.setHorizontalAlignment(SwingConstants.CENTER);
		b.setForeground(Color.BLUE);
		b.setFont(new Font("Comic Sans MS", Font.BOLD,22));
		
		c = new JTextField("");
		c.setBounds(550,250,150,50);
		c.setHorizontalAlignment(SwingConstants.CENTER);
		c.setForeground(Color.BLUE);
		c.setFont(new Font("Comic Sans MS", Font.BOLD,22));
		
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.add(sumar);
		panel.add(restar);
		panel.add(multiplicar);
		panel.add(dividir);
		panel.add(back);
		panel.add(comprobar);
		panel.add(operador);
		panel.add(igual);
		panel.add(a);
		panel.add(b);
		panel.add(c);
		panel.add(exito);
		panel.add(labelpuntaje);
		panel.add(labelerror);
		panel.add(jugcartas);
		panel.add(juegoBD);
		panel.add(juegoDB);
		panel.add(juegoDecimalBinario);
		panel.add(juegoBinarioDecimal);
		
		
		panel.add(new FondoVentanas("/imagenes/paisaje2.jpg"));
		KeyAdapter ka = new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e) {
				char key = e.getKeyChar();					
				if (key!=e.VK_1 && key!=e.VK_0){
					e.consume();							
				}

			}
			
		};
		
		a.addKeyListener(ka);
		b.addKeyListener(ka);
		c.addKeyListener(ka);
		
		sumar.addActionListener(this);
		restar.addActionListener(this);
		multiplicar.addActionListener(this);
		dividir.addActionListener(this);
		jugcartas.addActionListener(this);
		
		setContentPane(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		
	}
	
	
	 public static String SumaBin(String a, String b) {
		
		 int a1 = Integer.parseInt(a, 2);
	        int b1 = Integer.parseInt(b, 2);
	        int c1 = a1 + b1;
	       
	        String resultado = Integer.toString(c1, 2);
	        return resultado;	       
}

	 public static String RestaBin(String a, String b) {
			
		 int a1 = Integer.parseInt(a, 2);
	        int b1 = Integer.parseInt(b, 2);
	        int c1 = a1 - b1;
	       
	        String resultado = Integer.toString(c1, 2);
	        return resultado;	       
}
	 
	 public static String MultiBin(String a, String b) {
			
		 int a1 = Integer.parseInt(a, 2);
	        int b1 = Integer.parseInt(b, 2);
	        int c1 = a1 * b1;
	       
	        String resultado = Integer.toString(c1, 2);
	        return resultado;	       
}

	 public static String DivBin(String a, String b) {
			
		 int a1 = Integer.parseInt(a, 2);
	        int b1 = Integer.parseInt(b, 2);
	        int c1 = a1 / b1;
	       
	        String resultado = Integer.toString(c1, 2);
	        return resultado;	       
}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource()==juegoDB){
			setVisible(false);
			new JuegoDecimalBinario();
			
		}
		
		
		if(e.getSource()==back){
			setVisible(false);
			new Menu();
		}
		if(e.getSource()==juegoBD){
			setVisible(false);
			new JuegoBD();
			
			
		}
		
		
		if(e.getSource()==sumar){
			C=SumaBin(a.getText(),b.getText());
			operador.setIcon(new ImageIcon("src/imagenes/suma.png"));
			
		}
		if(e.getSource()==restar){
			C=RestaBin(a.getText(),b.getText());
			operador.setIcon(new ImageIcon("src/imagenes/resta.png"));
		}
		if(e.getSource()==multiplicar){
			C=MultiBin(a.getText(),b.getText());
			operador.setIcon(new ImageIcon("src/imagenes/multi.png"));
		}
		
		if(e.getSource()==dividir){
			C=DivBin(a.getText(),b.getText());
			operador.setIcon(new ImageIcon("src/imagenes/division.png"));
		}
		
		if(e.getSource()==exito){
			int random1 = (int)(Math.random()* 10+ 1);
			String random11 = Integer.toString(random1,2) ;
			a.setText(random11);
			int random2 = (int)(Math.random()* 10+ 1);
			String random22 = Integer.toString(random2,2) ;
			b.setText(random22);
			c.setText("");
			
		}
		
		if (e.getSource()==jugcartas){
				setVisible(false);
				new Juego().setVisible(true);
			
		}
	
	
		try{
		if(e.getSource()==comprobar){
			
			
			String validacion=c.getText();
			
              if(validacion.equals(C)){
            	  
            	labelpuntaje.setText(Integer.toString(puntaje));
				puntaje+=100;
				exito.setIcon(new ImageIcon("src/imagenes/caritaexito.jpg"));
				
			}
			if (!(validacion.equals(C))){
				
				exito.setIcon(new ImageIcon("src/imagenes/caritaerror.jpg"));
				labelerror.setText("El resultado era..."+C);
				
			}
			
		
			
		}}
		
		catch(Exception ee){}
		
	}


}
	