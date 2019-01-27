package v58EscribiendoEnPanel;

import javax.swing.JFrame;

public class MarcoConTexto extends JFrame {

	public MarcoConTexto()
	{
		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("Pimer Texto");
		//Agregando la lamina a el marco
		Lamina milamina = new Lamina();
		add(milamina);
	}
	
}
