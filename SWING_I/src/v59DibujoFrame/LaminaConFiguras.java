package v59DibujoFrame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//Para dibujar un rectangulo
		//g.drawRect(50, 50, 200, 200);
		//Pide punto inicial y punto final
		//g.drawLine(100, 100, 300, 200);
		
		//Haciendo la refundicion
		Graphics2D g2 = (Graphics2D) g;
		//como Rectangle2D es abstracta debemos instanciar de esta manera.
		//Ejm: Persona(class: padre), Empleado(Class:Hijo)
		//instanciado: Persona Juan = new Empleado(); principio "es un"
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
		//como draw pertenece a la clase graphich2D debemos usar la instancia d
		//tipo graphich2D que es g2(por refundicion), para ese metodo y luego 
		//le pasamos como parametro rectangulo que es de tipo shane, por que es un objeto
		//de tipo Rectangle2D que implementa la inteface shape.
		
		g2.draw(rectangulo);
	}

	
}
