package colecciones_V;

import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaListaEnlazada {

	public static void main(String[] args) {
		
		//creando la linkedList paises
		
		LinkedList<String> paises = new LinkedList<String>();
		//Añadiendo elementos
		paises.add("España");
		paises.add("Colombia");
		paises.add("Mexico");
		paises.add("Peru");
		
		//creando la linkedList capitales
		
		LinkedList<String> capitales = new LinkedList<String>();
		
		//Añadiendo elementos
		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("D.F");
		capitales.add("Lima");
		
		//Dos iteradores
		ListIterator<String> iterA = paises.listIterator();
		ListIterator<String> iterB = capitales.listIterator();
		
		//mientras haya un elemento siguiente dentro de el linkedList de capitales
		while (iterB.hasNext()) 
		{
			//Hara con esto comprobare si hay un siguiente elemento en linkList en paises.
			if(iterA.hasNext())
			{
				//Salta al siguiente elemento
				iterA.next();
			}
			
			//añadir un elemento a elemento saltado.
			iterA.add(iterB.next());
		}
		
		System.out.println(paises);
		//inicializar para que buelva a su posicion incial
		iterB = capitales.listIterator();
		
		//mientras haya un elemento siguiente dentro de el linkedList de capitales
		while (iterB.hasNext())
		{   //salta a la siguiente posicion
			iterB.next();
			//ahora que verifique de despues de haber saltado, si hay otra posicion
			if(iterB.hasNext())
			{
				iterB.next();
				//eleminando el elemento saltado
				iterB.remove();
			}
			
		}
		
		System.out.println(capitales);
		
		paises.removeAll(capitales);
		
		System.out.println(paises);
	}
}
