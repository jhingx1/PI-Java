package colecciones_I;

import java.util.*;

public class CuentasUsuarios {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente("Antonio Banderas", "00001", 200000);
		Cliente cl2 = new Cliente("Rafael Nadal", "00002", 250000);
		Cliente cl3 = new Cliente("Antonio Banderas", "00001", 200000);
		Cliente cl4 = new Cliente("Julio Inglesias", "00001", 500000);
		//Creando la coleccion (set) de tipo  HashSet
		Set <Cliente> clientesBanco = new HashSet<Cliente>();
		//hemos agregado los objetos de tipo cliente a la coleccion
		//clientesBanco.
		 clientesBanco.add(cl1);
		 clientesBanco.add(cl2);
		 clientesBanco.add(cl3);
		 clientesBanco.add(cl4);
		 
		 for (Cliente cliente : clientesBanco) {
			
			 System.out.println(cliente.getNombre() + " " 
					 + cliente.getN_cuenta() + " " + cliente.getSaldo());
			 
		}
	}
}
