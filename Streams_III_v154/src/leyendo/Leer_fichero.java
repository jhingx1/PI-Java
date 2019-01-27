package leyendo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer_fichero {

	public void lee()
	{
		try {
			
			entrada = new FileReader("C:/javaStreams/ejemplo.txt");
			//el contructor tiene un parametro de tipo Reader.
			BufferedReader miBuffer = new BufferedReader(entrada);
			
			String linea = ""; 
					
			while (linea != null) //que lea linea a linea, mientra la linea nosea nula
			{
				
				linea = miBuffer.readLine(); //almacena la primera linea que se encuetra en el buffer
				
				if (linea != null)
					System.out.println(linea);
				
			}
			
			
			
		} catch (IOException e) {
			System.out.println("No se ha encotrado el archivo");
		}finally{
			
			try {
				entrada.close(); // tiene una excepsion controlada de tipo IOException
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
	}
	//entrada es de tipo FileReader que hereda de la clase reader
	FileReader entrada;
}
