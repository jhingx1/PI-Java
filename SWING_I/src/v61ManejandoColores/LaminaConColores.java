package v61ManejandoColores;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class LaminaConColores extends JPanel{
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		//Dibujo el rectangulo
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		
		g2.setPaint(Color.RED);
		
		//g2.draw(rectangulo);
		g2.fill(rectangulo);
		
		//Dibujo de la eclipse
		
		Ellipse2D eclipse = new Ellipse2D.Double();
		eclipse.setFrame(rectangulo);
		g2.setPaint(new Color(0,140,255));
		g2.fill(eclipse);
		
		//nota aki falta alguno retoques v61 min 18
	}
	

}
