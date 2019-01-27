package v61ManejandoColores;

import javax.swing.JFrame;

public class MarcoConColores extends JFrame{

	public MarcoConColores()
	{
		setTitle("Prueba con colores");
		setSize(400,400);
		LaminaConColores miLamina = new LaminaConColores();
		
		add(miLamina);
		
	}
	
}
