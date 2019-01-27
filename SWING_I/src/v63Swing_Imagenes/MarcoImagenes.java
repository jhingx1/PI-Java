package v63Swing_Imagenes;

import javax.swing.JFrame;

public class MarcoImagenes extends JFrame{

	public MarcoImagenes()
	{
		setTitle("Marcon con Imagenes");
		setBounds(750, 300, 500, 500);
		
		LaminaConImagen milamina = new LaminaConImagen();
		add(milamina);
		
	}
	
}
