package drag;

import javax.swing.*;
public class Ventana extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Canvas canvas;
	
	public Ventana(){
		canvas = new Canvas();
		int ancho = (Canvas.TOTAL_CARTAS*Carta.ANCHO)
				+((Canvas.TOTAL_CARTAS+1)*Canvas.GAP);
		int alto = Carta.ALTO+(2*Canvas.GAP)+50;
		super.setSize(ancho, alto);
		super.add(canvas);
		super.setVisible(true);
		
		//Adaptador ad = new Adaptador()	
	}
	
	
}
