package hashMap_1;

import java.util.*;

public class PruebaMapas {
	
	public static void main(String[] args) {
		HashMap<String, Empleado> personal = new HashMap<String,Empleado>();
		
		personal.put("145", new Empleado("Juan"));
		personal.put("146", new Empleado("Ana"));
		personal.put("147", new Empleado("Antonio"));
		personal.put("148", new Empleado("Sandra"));
		
		
		//imprimir todos los datos del HashMap personal
		System.out.println(personal);		
		/*
		//remover al elemento con el key 147
		personal.remove("147");
		//imprimiento para verificar
		System.out.println(personal);
		
		
		//añadiendo un nuevo objeto de tipo empleado con 
		//key igual a 148
		personal.put("148",new Empleado("Natalia"));
		System.out.println(personal);
		
		*/
		
		//System.out.println(personal.entrySet());
		
		for(Map.Entry<String, Empleado> entrada:personal.entrySet()) {
			String clave = entrada.getKey();
			Empleado valor = entrada.getValue();
			System.out.println("Clave= " + clave + " ,Valor=" + valor);
		}
		
	}

}

class Empleado{
	
	private String nombre;
	private double sueldo;
	
	public Empleado(String n) {
		nombre = n;
		sueldo = 2000;
	}
	//En lugar del los get y set
	public String toString() {
		return "[Nombre= " + nombre + ", sueldo= " + sueldo + "]";
	}
	
	
}