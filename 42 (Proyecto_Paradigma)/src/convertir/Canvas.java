package convertir;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Canvas extends JPanel {
	
	private ArrayList<CirculoBinario> circulos;
	
	public Canvas() {
		circulos = new ArrayList<>();
		for (int x = 0; x < 400; x=x+100) {
			circulos.add(new CirculoBinario(x,0,false));
		}
		setSize(400, 100);
		setPreferredSize(new Dimension(400, 100));
		setBackground(Color.white);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (Dibujable circulo : circulos) {
			circulo.dibujar(g);
		}
		repaint();
	}
	
	public void verNumero(int numero) {
		if (numero <= 15 && numero >= 0) {
			
			for (CirculoBinario circulo : circulos) {
				circulo.setRelleno(false);
			}
			
			int posicion = circulos.size()-1;
			
			while(numero>=1 && posicion>=0){
				if (numero%2 == 0) {
					circulos.get(posicion).setRelleno(false);
				} else {
					circulos.get(posicion).setRelleno(true);
				}
				posicion--;
				numero = numero/2;
			}
			repaint();
		}
	}

}
