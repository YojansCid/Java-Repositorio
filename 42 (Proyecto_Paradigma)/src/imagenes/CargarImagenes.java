package imagenes;

import java.awt.Image;

import javax.swing.ImageIcon;

public class CargarImagenes {
	
	public Image cargarImagen(String carta, boolean b){
		Image imagen;
		if(!b){
		imagen= new ImageIcon(
				getClass().getResource(carta+".jpg")).getImage();
		return imagen;
		}else{
			imagen= new ImageIcon(
					getClass().getResource(carta+" vuelta.jpg")).getImage();
			return imagen;
		}
		
	}
}
