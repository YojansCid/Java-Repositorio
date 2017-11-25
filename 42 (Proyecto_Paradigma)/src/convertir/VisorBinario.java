package convertir;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class VisorBinario extends JPanel {
	
	private ControlPanel controlPanel;
	private Canvas canvas;
	private JButton bot = new JButton (new ImageIcon ("src/imagenes/back.png"));
	public VisorBinario(){
		canvas = new Canvas();
		controlPanel = new ControlPanel(canvas);
	
		add(canvas, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);
		setSize(400,150);
		
	
		setVisible(true);
	}
	

}
