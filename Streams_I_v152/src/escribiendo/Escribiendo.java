package escribiendo;

import java.io.FileWriter;
import java.io.IOException;

public class Escribiendo {

	public void escribir()
	{
		String frase = "Esto es una prueba de escritura 2 ";
		
		//accediendo a un archivo externo que no existe
		//para esto debemo utilizar una instancia de la clase fileWriter
		
		try {
			//Creando un archivo, donde se escribira lo que esta almacendo en frase
			FileWriter escritura = new FileWriter("C:/javaStreams/Texto_nuevo.txt", true);
			
			//Para que recorra toda la frase.
			for (int i = 0; i < frase.length(); i++)
			{
				//Para que escriba en el Streams con nombre escritura
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
