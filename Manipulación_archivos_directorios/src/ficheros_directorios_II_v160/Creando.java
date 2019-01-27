package ficheros_directorios_II_v160;

import java.io.File;
import java.io.IOException;

public class Creando {

	public static void main(String[] args) {
		//Agregando un nuevo directorio
		File ruta = new File("C:" + File.separator + "JavaSerializable" + File.separator + "prueba_texto.txt");

		//ruta.mkdir();
		//Almacena la ruta del archivo, de arriba
		String archivo_destino = ruta.getAbsolutePath();
		
		try{
			ruta.createNewFile();
		}catch (IOException e) {
			e.printStackTrace();
		}
		//Escribiendo : es una clase que se creara despues
		Escribiendo accede_es = new Escribiendo();
		//escribir : metodo de la clase Escribir, que
		//almacena la ruta donde quiero crear el nuevo archivo
		accede_es.escribir(archivo_destino);
		
	}

}
