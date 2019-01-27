package hashMap_1;
import java.util.HashMap;
public class HastMap_1 {

	public static void main(String[] args) {
		
		HashMap<String, String> lista = new HashMap<>();
		lista.put("Pedro", "4444113131");
		lista.put("Luis", "4488883131");
		lista.put("Martha", "4499993131");
		lista.put("Carlo", "445555131");
		
		//Tamanio
		
		int i = lista.size();
		System.out.println("Tamaño: " + i);
		
		//Mostrando elmentos
		String elemento = lista.get("Pedro");
		System.out.println("Telefono : " + elemento);		
		
		//Remover
		lista.remove("Carlo");
		i = lista.size();
		System.out.println("Tamaño: " + i);
		
		//Si tiene elementos
		
		Boolean TieneElementos = lista.isEmpty();
		System.out.println("Tiene elementos : " + TieneElementos);
		
		//limpiar
		lista.clear();
		i = lista.size();
		System.out.println("Tamaño : " + i);
		

	}

}
