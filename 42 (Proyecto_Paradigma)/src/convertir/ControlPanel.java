package convertir;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ControlPanel extends JPanel {
	
	private final Canvas canvas;
	private JButton botonVer;
	private JTextField campoNumero;

	
	public ControlPanel(final Canvas canvas) {
		this.canvas = canvas;
		setLayout(new BorderLayout());
		setSize(400,25);
		botonVer = new JButton("VER NUMERO");
		botonVer.setSize(200,25);
		botonVer.setPreferredSize(new Dimension(200, 25));
		campoNumero = new JTextField();
		campoNumero.setSize(200, 25);
		campoNumero.setPreferredSize(new Dimension(200, 25));
		add(botonVer, BorderLayout.WEST);
		add(campoNumero, BorderLayout.CENTER);
		KeyAdapter ka = new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e) {
				char key = e.getKeyChar();					
				if (!Character.isDigit(key)) {
					e.consume();
				}
			}
			
		};
		
		ActionListener al = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String numeroTexto = campoNumero.getText();
				int numero;
				try{
					numero = Integer.valueOf(numeroTexto);
				} catch(NumberFormatException nfe) {
					numero=16;
				}
				
				if (numero>15) {
					String mensajeError="Error: el numero no se puede convertir";
					JOptionPane.showMessageDialog(null, mensajeError);
				} else {
					canvas.verNumero(numero);
				}
			}
		};
		campoNumero.addKeyListener(ka);
		campoNumero.addActionListener(al);
		botonVer.addActionListener(al);
		setVisible(true);
	}

	public Canvas getCanvas() {
		return canvas;
	}

}
