package herencia_generica_167;

public class HerenciaGenericos {

	public static void main(String[] args) {
		/*
		Empleado Administrativa = new Empleado("Elena", 45, 1500);
		
		Jefe DirectoraComercial = new Jefe("Ana", 27, 3500);
		
		//principio ES UN
		//Por el princio de ES UN yo puedo almacenar en un objeto
		//de tipo empleado un objeto de tipo jefe,(no es asi con clases genericas)
		Empleado nuevoEmpleado = DirectoraComercial;
		*/
		//Con clases genericas
		
		Pareja<Empleado> Administrativa = new Pareja<Empleado>();
		
		Pareja<Jefe> DirectoraComercial = new Pareja<Jefe>();
		
		//principio ES UN
		//Pareja<Empleado> nuevoEmpleado = DirectoraComercial;
		
		Pareja.imprimirTrabajador(Administrativa);
		
		Pareja.imprimirTrabajador(DirectoraComercial);
		
	}

}
