package leyendo_escribiendo_bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Lectura_Escritura {

	public static void main(String[] args) {
		
		int contador = 0;
		
		int datos_entrada[] =new int[26348];
		
		try{
			//Tenermos un flujo de datos abrierto, ubicacion del archivo
			FileInputStream archivo_lectura = new FileInputStream("C:/javaStreams/imagen.jpg");
			boolean final_ar = false;
			//Operador negacion, invetir si es verdadero o falso.
			while (!final_ar)
			{
				//lee hasta el ultimo byte y debuelve -1 cuando ha terminado
				int byte_entrada = archivo_lectura.read();
				//
				if (byte_entrada != -1)//si esto es falso, es por que ha leido hasta el final
				{//Si byte_entrada es diferente de -1, entoces almacena en el array
				//datos_entrada. Esto es para que no almacene el -1
					datos_entrada[contador] = byte_entrada;
				}
				else  //cuando llega al final
					final_ar = true;
				
				System.out.println(datos_entrada[contador]);
				
				contador++;
			}
			
			archivo_lectura.close();
			
		}catch(IOException e){
			System.out.println("Error al acceder a la imagen");
		}

		System.out.println(contador);
		
		//Llamando al metodo
		
		crea_fichero(datos_entrada);
		
	}
	
	
	//creando un metodo estatico, ya que la llamado la vamos hacer del el maid(que es estatico)
	static void crea_fichero(int datos_nuevo_fichero[])
	{
		//creando el try catch
		try{
			FileOutputStream fichero_nuevo = new FileOutputStream("C:/javaStreams/imagen_copia.jpg");
			//Uso de FOR para leer todos los elemetos del array que el metod esta recibiendo 
			//como parametro.
			
			for (int i = 0; i < datos_nuevo_fichero.length; i++)
			{
				//A cada vuelta de bucle tiene que "escribir", con los datos
				//almacenado en el array(en cada posiscion).
				fichero_nuevo.write(datos_nuevo_fichero[i]);
			}
			
			fichero_nuevo.close();
			
		}catch(IOException e){
			System.out.println("Error al cerar el archivo");
		}
		
	}
}
