package ficheros_directorios_II_v160;

import java.io.File;

public class Prueba_rutas {

	public static void main(String[] args) {
		
		File archivo = new File("bin");
		
		System.out.println(archivo.getAbsolutePath());
		
		System.out.println(archivo.exists());
	}

}
