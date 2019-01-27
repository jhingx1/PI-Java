package v57MarcoCentrado;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class MarcoCentrado extends JFrame{
	
	public MarcoCentrado()
	{
		//Por que este metodo es estatico
		//esto almacena nuestro sistema nativo de ventana
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		
		//usando lo metodos
		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;
		//Para que tome el marco sea la mitad de mi patalla
		setSize(anchoPantalla/2,alturaPantalla/2);
		//Para que este en el centrado
		setLocation(anchoPantalla/4,alturaPantalla/4);
		//para colocar titulo
		setTitle("Marco Centrado");
		//icono nuevo,Clase Image que hereda de la clase cosmica.
		//asi que funciona como una clase static
		Image miIcono = mipantalla.getImage("icono.png");
		setIconImage(miIcono);
	}
}
