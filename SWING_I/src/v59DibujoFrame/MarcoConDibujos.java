package v59DibujoFrame;

import javax.swing.JFrame;

import v58EscribiendoEnPanel.Lamina;

public class MarcoConDibujos extends JFrame{

	public MarcoConDibujos()
	{
		setTitle("Prueba con Dibujos");
		setSize(400,400);
		
		//agregando la lamina
		LaminaConFiguras milamina = new LaminaConFiguras();
		add(milamina);
	}
	
}
