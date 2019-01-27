package arrayList_v164;

import java.io.File;

public class UsoArrayList {

	public static void main(String[] args) {
		//Entoces vamos a ver si somos capaces de
		//utilizar esta clase  arrayList para almacenar 
		//en principio objetos de tipo string.

		//para que el array de tipo objeto tenga 4 elementos
		ArrayList archivos = new ArrayList(5);
		
		//para agregar elementos al arraylist
		archivos.add("Juan"); //posicio 0
		archivos.add("Maria");
		archivos.add("Ana");
		archivos.add("Sandra");
		
		archivos.add(new File("Gestion_pedidos"));
		
		//ver lo que tenemos almacenado
		//Varible de tipo string, para ver lo que esta en la posicion 2
		String nombrePersona = (String)archivos.get(4);
		
		System.out.println(nombrePersona);
		
	}

}
