package ficheros_directorios_II_v160;

import java.io.File;

public class Eliminar {

	public static void main(String[] args)
	{
		File ruta = new File("C:" + File.separator + "JavaSerializable" + File.separator + "prueba_texto.txt");

		//buscar en la API
		ruta.delete();
		
	}
}
