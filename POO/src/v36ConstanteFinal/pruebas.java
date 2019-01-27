package v36ConstanteFinal;

public class pruebas {

	public static void main(String[] args) {
		
		Empleados trabajado1 = new Empleados("Paco");
		Empleados trabajado2 = new Empleados("Ana");
		Empleados trabajado3 = new Empleados("Antonio");
		Empleados trabajado4 = new Empleados("Maria");
		//cambiando de seccion, metodo setter
		trabajado1.cambiaSeccion("RRHH");
		
		System.out.println(trabajado1.devuelveDatos());
		System.out.println(trabajado2.devuelveDatos());
		System.out.println(trabajado3.devuelveDatos());
		System.out.println(trabajado4.devuelveDatos());
		
		//Llamando al metodo statico(de clase) dameIdSiguiente
		System.out.println(Empleados.dameIdSiguiente());

	}
}
