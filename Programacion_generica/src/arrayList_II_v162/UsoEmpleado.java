package arrayList_II_v162;

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
		
		//listaEmpleados.add(new Empleado("Olga", 22, 11000));
		listaEmpleados.set(1,new Empleado("Olga", 22, 11000));
		
		//System.out.println(listaEmpleados.get(4).dameDatos());
		
		//System.out.println(listaEmpleados.size());
		/*
		for(Empleado e:listaEmpleados)
		{
			System.out.println(e.dameDatos());
		}
		*/
		//para saber el tamaño del arrayList
		/*for (int i= 0; i < listaEmpleados.size(); i++)
		{	//creando un objeto de tipo empleado
			Empleado e = listaEmpleados.get(i);
			System.out.println(e.dameDatos());
		}*/
		
		//la dimencion del array normal debe ser igual que la del arrayLista
		//para poder traspasar los elementos.
		Empleado arrayEmpleados[] = new Empleado[listaEmpleados.size()];
		
		//Para copiar todo lo que esta en los arrayLista (listaEmpleados)
		//a el array arrayEmpleados[] y recorrelo con el bucle for.
		listaEmpleados.toArray(arrayEmpleados);
		
		for(int i = 0; i< arrayEmpleados.length; i++)
		{
			System.out.println(arrayEmpleados[i].dameDatos());
		}
		
		
	}

}
