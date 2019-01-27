package clasesPropias_v165;

public class UsoPareja {

	public static void main(String[] args) {
		//Aki tenemos instanciada la clase pareja
		Pareja<String> una = new Pareja<String>();
		//cambiar el valor de primero a otro valor
		//lo hacemos con el metodo setPrimero
		una.setPrimero("Juan");
		
		System.out.println(una.getPrimero());
		
		Persona pers1 = new Persona("Ana");
		Pareja<Persona> otra = new Pareja<Persona>();
		
		otra.setPrimero(pers1);
		
		System.out.println(otra.getPrimero());
		
		
	}

}
