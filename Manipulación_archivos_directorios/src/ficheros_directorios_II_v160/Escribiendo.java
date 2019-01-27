package ficheros_directorios_II_v160;

import java.io.FileWriter;
import java.io.IOException;

public class Escribiendo {
	
	//creando el metodo escribir
	//ruta_archivo : ruta donde queremos crear el archivo.
	public void escribir(String ruta_archivo)
	{
		String frase = "Esto es un ejemplo";
		try{
			FileWriter escritura = new FileWriter(ruta_archivo);
			
			for (int i = 0; i < frase.length() ; i++)
			{
				//con este bucle recorre "frase" caracter a caracter
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
			
		}catch (IOException e) {
			
		}
	}
	
}
