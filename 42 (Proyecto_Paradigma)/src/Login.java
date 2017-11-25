import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private String nombreUsuario;
	
	private JTextField campo_texto;
	private JButton boton_sig;
	private JLabel label;

	public Login (){
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		campo_texto = new JTextField ();
		boton_sig = new JButton (new ImageIcon("src/imagenes/siguiente_intro.png"));
		//boton_sig = new JButton (new ImageIcon("src/imagenes/login.png"));
		label = new JLabel("INGRESA TU NOMBRE");
		
		setLayout(null);
		setSize(805,630);
		setTitle("JUEGO BINARIO");
		
		label.setBounds(150,200,500,50);
		campo_texto.setBounds(250,250,300,50);
		boton_sig.setBounds(550,250,50,50);
		
		boton_sig.setBackground(Color.gray);
		
		campo_texto.setHorizontalAlignment(SwingConstants.CENTER);
		campo_texto.setForeground(Color.BLUE);
		campo_texto.setFont(new Font("Comic Sans MS", Font.BOLD,22));
		campo_texto.setToolTipText("ingresa el nombre con el que te registraras");
		
		
		label.setForeground(Color.black);
		label.setFont(new Font("Comic Sans MS", Font.BOLD,26));
		
		campo_texto.addActionListener(this);
		boton_sig.addActionListener(this);
		
		add(campo_texto);
		add(boton_sig);
		add(label);
		add(new FondoVentanas("/imagenes/Login.jpg"));
		
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == boton_sig || e.getSource() == campo_texto) {
				if(!(campo_texto.getText().equals("") == true)){
					nombreUsuario=campo_texto.getText();
					//System.out.println(nombreUsuario);
					setVisible(false);
					new Menu().setVisible(true);
				}
			}
			
		}
}