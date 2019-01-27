package metodosGenericos_v166;

import java.util.GregorianCalendar;

public class MetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nombre del array nombre
		String nombres[] = {"Maria","Pepe","Jose"};
		
		System.out.println(MisMatrices.getMenor(nombres));
		/*
		//si le pasamos un array de empleados
		
		Empleado paco = new Empleado("Paco", 45, 2000);
		Empleado ana = new Empleado("ana", 45, 2000);
		Empleado maria = new Empleado("maria", 45, 2000);
		
		Empleado misEmpleados[] = {paco,ana,maria}; 
		
		System.out.println(MisMatrices.getMenor(misEmpleados));
		*/
		
		GregorianCalendar fechas[] = {new GregorianCalendar(2015,07,12),
				new GregorianCalendar(2015,05,12),
				new GregorianCalendar(2015,04,12),};
		//sale un formato diferente, hay que darle un formato correcto.
		System.out.println(MisMatrices.getMenor(fechas));
		
	}

}
