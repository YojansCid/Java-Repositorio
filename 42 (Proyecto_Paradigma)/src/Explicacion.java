import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Explicacion extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel panelPrincipal;
	private JButton b;
	public Explicacion(){
		setLayout(null);
		setBounds(0, 0, 800,600);
		
		panelPrincipal = new JPanel();
		panelPrincipal.setSize(800, 600);
		panelPrincipal.setLayout(null);
		
		setTitle("JUEGO BINARIO");
		
		JButton b = new JButton (new ImageIcon("src/imagenes/back.png"
				+ ""));
		b.setBounds(30,30,60,60);
		b.addActionListener(this);
		
		JButton j = new JButton ("JUGAR",new ImageIcon("src/imagenes/joy.png"));
		j.setBounds(600,300,124,120);
		j.addActionListener(this);
		
		panelPrincipal.add(j);
		panelPrincipal.add(b);
		panelPrincipal.add(new FondoVentanas("/imagenes/explicacion.jpg"));
		
		setContentPane(panelPrincipal);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e){
		
		
		if (e.getSource()==b){
			setVisible(false);
			new Menu();
			
		}
			setVisible(false);
			new OperacionBinaria();
	}
}