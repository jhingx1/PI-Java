package colecciones_IX;
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
		Articulo tercero = new Articulo(3, "Este es el tercer articulo");
		
		//creando el treeSet, para almacenar los objetos de tipo articulo
		
		TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
		
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for (Articulo art:ordenaArticulos)
		{
			System.out.println(art.getDescripcion());
		}

		
		//Articulo comparadorArticulos = new Articulo();
		
		//TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(comparadorArticulos);
		
		//ComparadorArticulos compara_art = new ComparadorArticulos();
		
		TreeSet<Articulo> ordenaArticulos2 = new TreeSet<Articulo>(new Comparator<Articulo>() {
			
			public int compare(Articulo o1, Articulo o2) {
				
				String desc1 = o1.getDescripcion();
				String desc2 = o2.getDescripcion();
			
				return desc1.compareTo(desc2);
			}
			
		}
				);
		
		ordenaArticulos2.add(primero);
		ordenaArticulos2.add(segundo);
		ordenaArticulos2.add(tercero);
		
		for(Articulo art: ordenaArticulos2 )
		{
			System.out.println(art.getDescripcion());
		}
		
		
	}

}
