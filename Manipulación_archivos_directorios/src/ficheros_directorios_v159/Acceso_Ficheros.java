package ficheros_directorios_v159;

import java.io.*;

public class Acceso_Ficheros {
	
	public static void main(String[] args) {
		
		File ruta = new File("C:/JavaSerializable");
		
		System.out.println(ruta.getAbsolutePath());
		
		String[] nombre_archivos = ruta.list();
		
		for (int i= 0 ; i < nombre_archivos.length; i++)
		{
			System.out.println(nombre_archivos[i]);
			//usando el contructor
			File f = new File(ruta.getAbsolutePath(),nombre_archivos[i]);
			//nombre_archivos[i] : almacena la ruta de cada archivo
			
			if(f.isDirectory()){ //verifica si es un directorio o no
				String[] archivos_subcarpeta = f.list();
				
				for (int j = 0 ; j < archivos_subcarpeta.length ; j++)
				{
					System.out.println(archivos_subcarpeta[j]);
				}
				
			}
		}
			
	}
}
