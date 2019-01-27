package v49InterfacesClassInternas;

import java.util.Arrays;

public class usoEmpleado {
	public static void main(String[] args) {
		
		Jefatura jefe_RRHH = new Jefatura("Jean", 55000, 2006, 9, 25);
		//estableciendo un incentivo
		jefe_RRHH.estableceIncentivo(2570);
		
		//Con arrays
		Empleado[] misEmpleados = new Empleado[6];

		misEmpleados[0] = new Empleado("Ana", 30000, 2000, 07, 07);
		misEmpleados[1] = new Empleado("Carlos", 50000, 1995, 06, 15);
		misEmpleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);
		misEmpleados[3] = new Empleado("Antonio",47500,2009,11,9);
		//Polimorfismo en accion,Principio de sustitucion
		misEmpleados[4] = jefe_RRHH; 
		
		misEmpleados[5] = new Jefatura("Maria", 95000, 1999, 5, 26);
		//haciendo la refundicion
		Jefatura jefe_Finanzas = (Jefatura) misEmpleados[5];
		//utilizando el objeto: jefe finanzas
		jefe_Finanzas.estableceIncentivo(55000);

		//nota:falta lo de instace of, esta en el word
		
		
		//recorriendo el array, subiendo el sueldo a los 3 empleados *todos
		for(Empleado e : misEmpleados)
		{
			e.subeSueldo(5);
		}
		
		//Para ordenar objetos
		//Nos obliga a que el tipo a ordenar implemente la interfaz comparable
		Arrays.sort(misEmpleados);
		
		//For para que nos imprima la informacionde los empleados
		
		for (Empleado e:misEmpleados)
		{
			System.out.println("Nombre: " + e.dameNombre() + " "+ e.dameIdSiguiente()
					+ " Sueldo: " +  e.dameSueldo()
					+ " Fecha de Alta " + e.dameFechaContrato());
		}
	}
}
