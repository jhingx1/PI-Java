package colecciones_IV;
import java.util.*;
public class PruebaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instancia de linkedList, tipos generica
		
		LinkedList<String> personas = new LinkedList<String>();
		//agragando elementos
		personas.add("Pepe");
		personas.add("Sandra");
		personas.add("Ana");
		personas.add("laura");
		
		//Cuantos elementos tiene la coleccion
		System.out.println(personas.size());
		
		//Agregando un iterador
		
		ListIterator<String> it = personas.listIterator();
		
		it.next();
		
		//agregado un elemento
		
		it.add("Juan");
		
		//imprimiendo los elementos que tiene la linkedList
		
		for(String persona : personas)
		{
			System.out.println(persona);
		}
		
	}

}
