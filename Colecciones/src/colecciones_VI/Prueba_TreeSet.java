package colecciones_VI;
import java.util.*;
public class Prueba_TreeSet {

	public static void main(String[] args) {
	/*	
		//instanciar la clase treeSet

		TreeSet<String> ordenaPersonas =  new TreeSet<>();
		
		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");
		
		//para recorer la coleccion, que es de tipo String(es un generico)
		for(String s:ordenaPersonas)
		{
			System.out.println(s);
		}
		*/
		
		
		Articulo primero = new Articulo(1, "Primer Articulo");
		Articulo segundo = new Articulo(2, "Segundo Articulo");
		Articulo tercero = new Articulo(3, "Tercero Articulo");
		
		//creando el treeSet, para almacenar los objetos de tipo articulo
		
		TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
		
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for (Articulo art:ordenaArticulos)
		{
			System.out.println(art.getDescripcion());
		}

	}

}
