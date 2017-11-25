package drag;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Canvas extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final static int GAP = 50;
	public final static int TOTAL_CARTAS = 6;
	private int seleccionado;
	
	private ArrayList<Carta> cartas;
	
	public Canvas(){
		JButton buton = new JButton("Reiniciar!");
		cartas = new ArrayList<>();
		final int cartaAltura= GAP+(Carta.ALTO/2);
		final int cartaAnchura1= GAP+(Carta.ANCHO/2);
		final int cartaAnchura2= GAP+(Carta.ANCHO/2)+Carta.ANCHO+GAP;
		final int cartaAnchura4= GAP+(Carta.ANCHO/2)+Carta.ANCHO*2+GAP*2;
		final int cartaAnchura8= GAP+(Carta.ANCHO/2)+Carta.ANCHO*3+GAP*3;
		final int cartaAnchura16= GAP+(Carta.ANCHO/2)+Carta.ANCHO*4+GAP*4;
		final int cartaAnchura32= GAP+(Carta.ANCHO/2)+Carta.ANCHO*5+GAP*5;
		
		cartas.add(new Carta(cartaAnchura32, cartaAltura, "carta32"));
		cartas.add(new Carta(cartaAnchura16, cartaAltura, "carta16"));
		cartas.add(new Carta(cartaAnchura8, cartaAltura, "carta8"));
		cartas.add(new Carta(cartaAnchura4, cartaAltura, "carta4"));
		cartas.add(new Carta(cartaAnchura2, cartaAltura, "carta2"));
		cartas.add(new Carta(cartaAnchura1, cartaAltura, "carta1"));
		
		int ancho = 4*((TOTAL_CARTAS*Carta.ANCHO)+((TOTAL_CARTAS+1)*GAP));
		int alto = 4*(Carta.ALTO+(2*GAP));
		
		super.setSize(ancho, alto);
		buton.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent e){
				cartas.get(0).setX(cartaAnchura1);
				cartas.get(0).setY(cartaAltura);
				cartas.get(0).setVisible(false);
				cartas.get(1).setX(cartaAnchura2);
				cartas.get(1).setY(cartaAltura);
				cartas.get(1).setVisible(false);
				cartas.get(2).setX(cartaAnchura4);
				cartas.get(2).setY(cartaAltura);
				cartas.get(2).setVisible(false);
				cartas.get(3).setX(cartaAnchura8);
				cartas.get(3).setY(cartaAltura);
				cartas.get(3).setVisible(false);
				cartas.get(4).setX(cartaAnchura16);
				cartas.get(4).setY(cartaAltura);
				cartas.get(4).setVisible(false);
				cartas.get(5).setX(cartaAnchura32);
				cartas.get(5).setY(cartaAltura);
				cartas.get(5).setVisible(false);
				repaint();
				
			}
		});
		super.add(buton);
		Adaptador ad = new Adaptador();
		super.addMouseListener(ad);
		super.addMouseMotionListener(ad);
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		for (Dibujable carta : cartas) {
			carta.dibujar(g);
		}
	}
	
	private class Adaptador extends MouseAdapter {
		
		@Override
		public void mouseDragged(MouseEvent e) {
			if (seleccionado != -1) {
				cartas.get(seleccionado).setX(e.getX());
				cartas.get(seleccionado).setY(e.getY());
				repaint();					
			}
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			Carta carta =cartas.get(seleccionado);
			if (e.getClickCount() == 2) {
				carta.setVisible(!carta.isVisible());
				repaint();
			}
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			seleccionado = -1;
			for (int i = 0; i < cartas.size(); i++) {
				int x1,y1;
				x1 = cartas.get(i).getX()-(Carta.ANCHO/2);
				y1 = cartas.get(i).getY()-(Carta.ALTO/2);
				if(!(e.getX() < x1 || e.getX()>(x1+Carta.ANCHO)
						|| e.getY() < y1 || e.getY() > y1+Carta.ALTO)){
					seleccionado = i;
				}
			}
			
			
		}
	}

}
