import java.awt.BorderLayout;

import javax.swing.JFrame;

import convertir.VisorBinario;
import drag.Ventana;


public class Extras extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private VisorBinario visor;
	private Ventana ventana;
	
	public Extras (){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(810,630);
		setLayout(new BorderLayout());
		visor =new convertir.VisorBinario();
		
		ventana = new drag.Ventana();
		
		
		this.add(visor,BorderLayout.NORTH);
		this.add(ventana,BorderLayout.SOUTH);
		
		setVisible(true);
		
		
		
		
	}
}
	
	
	
	


