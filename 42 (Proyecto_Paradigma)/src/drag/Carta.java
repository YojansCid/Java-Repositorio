package drag;

import imagenes.CargarImagenes;

import java.awt.Graphics;
import java.awt.Image;


public class Carta implements Dibujable {

	public static final int ANCHO = 100;
	public static final int ALTO = 150;
	public static final int CARTA1 = 1;
	public static final int CARTA2 = 2;
	public static final int CARTA4 = 4;
	public static final int CARTA8 = 8;
	public static final int CARTA16 = 16;
	
	private int x;
	private int y;
	private int carta;
	private Image imagen;
	private Image imagen2;
	private boolean visible;
	private boolean encima;
	
	public Carta(int x, int y, String carta){
		this.setVisible(false);
		this.x = x;
		this.y = y;
		CargarImagenes cargador = new CargarImagenes();
		this.setImagen(cargador.cargarImagen(carta,true),cargador.cargarImagen(carta,false));
		this.encima = false;
		
	}

	@Override
	public void dibujar(Graphics g) {
		if (!visible) {
			g.drawImage(imagen, this.x-(ANCHO/2), this.y-(ALTO/2), null);
		} else {
			g.drawImage(imagen2, this.x-(ANCHO/2), this.y-(ALTO/2), null);
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getCarta() {
		return carta;
	}

	public void setCarta(int carta) {
		this.carta = carta;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image image, Image image2) {
		this.imagen = image;
		this.imagen2 = image2;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public boolean isEncima() {
		return encima;
	}

	public void setEncima(boolean encima) {
		this.encima = encima;
	}

}
