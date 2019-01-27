package colecciones_III;

import java.util.*;

public class CuentasUsuarios {

	public static void main(String[] args) {
		//copiando cliente 1
		Cliente cl1 = new Cliente("Antonio Banderas", "00001", 200000);
		Cliente cl2 = new Cliente("Rafael Nadal", "00002", 250000);
		Cliente cl3 = new Cliente("Penelope Cruz", "00003", 300000);
		Cliente cl4 = new Cliente("Julio Inglesias", "00004", 500000);
		
		Cliente cl5 = new Cliente("Antonio Banderas", "00001", 200000);
		
		//Creando la coleccion (set) de tipo  HashSet
		Set <Cliente> clientesBanco = new HashSet<Cliente>();
		//hemos agregado los objetos de tipo cliente a la coleccion
		//clientesBanco.
		 clientesBanco.add(cl1);
		 clientesBanco.add(cl2);
		 clientesBanco.add(cl3);
		 clientesBanco.add(cl4);
		 clientesBanco.add(cl5);
		 /*
		 for (Cliente cliente : clientesBanco) {
			 
			System.out.println(cliente.getNombre() + " " 
					 + cliente.getN_cuenta() + " " + cliente.getSaldo());
			
			 //eliminado un elemento de la coleccion.
			 if (cliente.getNombre().equals("Julio Inglesias"))
			 {
				 clientesBanco.remove(cliente);
			 }
			 
		 }*/
		 
		 Iterator<Cliente> it = clientesBanco.iterator();
		 while(it.hasNext())
		 {
			 String nombre_clientes = it.next().getNombre();
			 if (nombre_clientes.equals("Julio Inglesias"))
			 {
				 //coger que esta examinando el objeto ahora mismo y eleminarlo
				 it.remove();
			 }
		 }
		 
		 for (Cliente cliente : clientesBanco) {
			 System.out.println(cliente.getNombre() + " " 
					 + cliente.getN_cuenta() + " " + cliente.getSaldo());		
		 }
		
		//creando el objeto iterador con nombre:it
		
		 //Este iterador>it sea igual a lo que mi coleccion clientesBanco me debuelva
		 //con el metodo iterator().
		 //de tal forma tenemos un iterador 
		 //que es capas de recorrer nuestra coleccion clientes bancos
		 
		 /*
		Iterator<Cliente> it = clientesBanco.iterator(); 
		
		while (it.hasNext())//mientras aya un elemento.
		{
			//esto nos dise k un vez que has saltado dame el nombre
			//Aqui se alamacena el nombre del objeto almacenado.
			String nombre_cliente =  it.next().getNombre();
			System.out.println(nombre_cliente);
		}
		*/
	}
}
