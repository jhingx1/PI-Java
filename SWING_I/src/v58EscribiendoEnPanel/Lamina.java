package v58EscribiendoEnPanel;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Lamina extends JPanel{
	//Sobre escribiendo el metodo
	public void paintComponent(Graphics g)
	{
		//llamando al metodo de la clase padre, para que lo ejecute
		//primero y luego ejecute el metodo que he sobre escrit abajo
		super.paintComponent(g);
		//sobre escribiendo el metodo
		g.drawString("Estamos aprendiendo SWING", 100, 100);
	}
}
