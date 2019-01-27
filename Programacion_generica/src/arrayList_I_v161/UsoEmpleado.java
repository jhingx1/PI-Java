package arrayList_I_v161;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		//Array de tres elemetos, de tipo empleado
		
		/*
		Empleado listaEmpleados[] = new Empleado[3];
		listaEmpleados[0] = new Empleado("Ana", 45, 2500);
		listaEmpleados[1] = new Empleado("Antonio", 55, 2000);
		listaEmpleados[2] = new Empleado("Maria", 25, 2600);
		*/
		//Empleado : El tipo de datos que se almacena en su interior
		//listaEmpleados : nombre del arrayLista
		ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
		
		//listaEmpleados.ensureCapacity(11);
		
		//para agregar un objeto, instanciandolo directamente
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		//Se puede agregar mas elementos
		listaEmpleados.add(new Empleado("Jose", 35, 2200));
		listaEmpleados.add(new Empleado("Jose", 35, 2200));
		listaEmpleados.add(new Empleado("Ana", 45, 2500));
		listaEmpleados.add(new Empleado("Antonio", 55, 2000));
		listaEmpleados.add(new Empleado("Maria", 25, 2600));
		listaEmpleados.add(new Empleado("Jose", 35, 2200));
		listaEmpleados.add(new Empleado("Jose", 35, 2200));
		
		listaEmpleados.add(new Empleado("Pedro", 22, 11000));
		listaEmpleados.add(new Empleado("Pedro", 22, 11000));
		listaEmpleados.add(new Empleado("Pedro", 22, 11000));
		listaEmpleados.add(new Empleado("Pedro", 22, 11000));
		//para cerra el array
		//listaEmpleados.trimToSize();
		
		listaEmpleados.add(new Empleado("Olga", 22, 11000));
		
		System.out.println(listaEmpleados.size());
		
		for(Empleado e:listaEmpleados)
		{
			System.out.println(e.dameDatos());
		}
	}

}
