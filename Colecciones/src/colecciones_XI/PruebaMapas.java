package colecciones_XI;
import java.util.*;

public class PruebaMapas {

	public static void main(String[] args) {

		HashMap<String,Empleado> personal = new HashMap<String, Empleado>();
		
		personal.put("145", new Empleado("Jean"));
		personal.put("146", new Empleado("Ana"));
		personal.put("147", new Empleado("Antonio"));
		personal.put("148", new Empleado("Sandra"));
		
		System.out.println(personal);
		
		personal.remove("147");
		
		System.out.println(personal);
		
		personal.put("148", new Empleado("Natalia"));
		
		System.out.println(personal);
		
		//System.out.println(personal.entrySet());
		
		//for each
		
		for(Map.Entry<String, Empleado> entrada:personal.entrySet()) {
			String clave = entrada.getKey();
			Empleado valor = entrada.getValue();
			System.out.println("Clave=" + clave +", Valor=" + valor);
			
		}
		
		
		
	}

}
