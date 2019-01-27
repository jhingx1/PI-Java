package v39SobreCargaConstructores;

public class usoEmpleado {
	public static void main(String[] args) {
		//Con arrays
		Empleado[] misEmpleados = new Empleado[4];
		
		misEmpleados[0] = new Empleado("Paco Gomez", 85000, 1990, 12, 17);
		misEmpleados[1] = new Empleado("Ana Lopez", 95000, 1995, 6, 2);
		misEmpleados[2] = new Empleado("Maria Matin", 105000, 2002, 3, 15);
		//uso de contructores sobre cargados
		//creando un objeto que usa un contructor con un unico parametro
		misEmpleados[3] = new Empleado("Antonio Fernandez");
		
		//recorriendo el array, subiendo el sueldo a los 3 empleados
		for(Empleado e : misEmpleados)
		{
			e.subeSueldo(5);
		}
		//For para que nos imprima la informacionde los empleados
		
		for (Empleado e:misEmpleados)
		{
			System.out.println("Nombre: " + e.dameNombre()
					+ " Sueldo: " +  e.dameSueldo()
					+ " Fecha de Alta " + e.dameFechaContrato());
		}
	}
}
