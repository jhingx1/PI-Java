package leyendo;

import java.io.FileReader;
import java.io.IOException;

public class Leer_fichero {

	public void lee()
	{
		try {
			//abriendo una comunicacion con una comunicacion con un fichero
			//consume recursos,tenermos que cerrar la comunicacion.
			
			entrada = new FileReader("C:/javaStreams/ejemplo.txt");
			
			int c = 0; //alamacena el primer caracter que se 
									//encuentra en el fichero de texto
			while (c != -1) //mientras no aya llegado al final
			{
				c = entrada.read();
				
				char letra = (char)c;
				
				System.out.print(letra);
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
	
	FileReader entrada;
}
