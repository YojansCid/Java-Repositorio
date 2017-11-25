import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JDesktopPane;

@SuppressWarnings("serial")
public class FondoVentanas extends JDesktopPane {

	private Image imagen;

	public FondoVentanas(String archivo ) {

		this.setLayout(null);
		this.setSize(800,600);

		try {
			
			
			imagen=ImageIO.read(getClass().getResource(archivo));
		
		}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void paintComponent(Graphics g){

		super.paintComponent(g);
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
		setOpaque(false);
	}

}