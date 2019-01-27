package colecciones_II;

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
		 
		 for (Cliente cliente : clientesBanco) {
			
			 System.out.println(cliente.getNombre() + " " 
					 + cliente.getN_cuenta() + " " + cliente.getSaldo());
			 
		}
	}
}
