
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class AcercaDe extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	private JButton b;
	
	public AcercaDe(){
		
		setLayout(null);
		setBounds(0, 0, 810,630);
		
		b = new JButton (new ImageIcon("src/imagenes/back.png"));
		b.setBackground(Color.white);
		b.setBounds(50,50,100,50);
		b.addActionListener(this);
		
		add(b);
		add(new FondoVentanas("/imagenes/acercade1.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b){
			this.setVisible(false);
			new Menu();
		}
		
	}
}