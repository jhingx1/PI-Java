package v63Swing_Imagenes;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;
import javax.imageio.*;

public class LaminaConImagen extends JPanel{

	private Image imagen;
	
	public LaminaConImagen()
	{
		try{//intenta abrir la imagen
			//imagen = ImageIO.read(miimagen);
			imagen = ImageIO.read(new File("src/v63Swing_Imagenes/bola.png"));
		}
		catch (IOException e) {//en caso no se encuentre esa imagen hacer esa excepsion
			
			System.out.println("La imagen no se encuentra");
			
		}
	}
	
	public void paintComponent(Graphics g)
	{
		//creando un constructor
		
		super.paintComponent(g);
		//para agregar un archivo
		//File miimagen = new File("src/v63Swing_Imagenes/coche.png");
		
		
		//this:usa los parametro que estan declarados detro de la clase
		//en este caso LaminaConImagenm, entoces la lamina que el objeto que se
		//cargada
		//para guardar la anchura y la altura de la imagen
		int anchuraImagen = imagen.getWidth(this);
		int alturaImagen = imagen.getHeight(this);
		
		//metodo drawImage de la clase Graphics
		
		g.drawImage(imagen, 0, 0, null);
		
		for (int i = 0; i< 400 ; i++)
		{
			for (int j = 0; j< 300 ; j++)
			{
				if(i + j > 0){
					g.copyArea(0, 0, anchuraImagen, alturaImagen, i*anchuraImagen, j*alturaImagen);
				}
				
			}
		}
	}
}
