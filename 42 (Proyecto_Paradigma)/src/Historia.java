import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Historia extends JFrame implements ActionListener{
	
	private JButton back;
	private JButton next;
	
	public Historia(){
		
		setLayout(null);
		setBounds(0, 0, 810,630);
		
		back = new JButton (new ImageIcon("src/imagenes/back.png"));
		back.setBackground(Color.white);
		back.setBounds(50,50,100,50);
		back.addActionListener(this);
		
		next = new JButton (new ImageIcon("src/imagenes/next.png"));
		next.setBackground(Color.white);
		next.setBounds(700,50,100,50);
		next.addActionListener(this);
		
		add(back);
		add(next);
		add(new FondoVentanas("/imagenes/fondoEx.png"));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back){
			setVisible(false);
			new Menu().setVisible(true);
		}
		if(e.getSource()==next){
			getContentPane().removeAll();
			add(back);
			add(new FondoVentanas("/imagenes/historia.png"));
			repaint();
			if(e.getSource()==back){
				setVisible(false);
				new Menu().setVisible(true);
			}
		}
		
	}
}