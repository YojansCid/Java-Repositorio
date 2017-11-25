package convertir;

import java.awt.Graphics;

public class CirculoBinario implements Dibujable {
	
	public final static int MARGEN = 20;
	public final static int DIAMETRO = 80;
	private int x;
	private int y;
	private boolean relleno;
	
	public CirculoBinario(int x, int y, boolean valor) {
		this.x = x;
		this.y = y;
		this.relleno = valor;
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
	
	public boolean isRelleno() {
		return relleno;
	}
	
	public void setRelleno(boolean valor) {
		this.relleno = valor;
	}

	@Override
	public void dibujar(Graphics g) {
		if (relleno) {
			g.fillOval(x + (MARGEN/2), y+(MARGEN/2),DIAMETRO ,DIAMETRO);
		} else {
			g.drawOval(x + (MARGEN/2), y+(MARGEN/2),DIAMETRO ,DIAMETRO);
		}
	}
}
