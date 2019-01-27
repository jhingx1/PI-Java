package v142ExcepsionesI;

import javax.swing.*;

public class Fallos {

	public static void main(String[] args) {
		
		int [] mi_matriz = new int [5];
		
		mi_matriz[0] = 5;
		mi_matriz[1] = 38;
		mi_matriz[2] = -15;
		mi_matriz[3] = 92;
		mi_matriz[4] = 71;
		mi_matriz[5] = 80;
		
		for (int i=0;i<5;i++)
		{
			System.out.println("Posicion " + i + " = " + mi_matriz[i]);
		}
		
		//peticion de datos personales
		
		
		String nombre  = JOptionPane.showInputDialog("Ingresa tu nombre: ");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
		System.out.println("Hola " + nombre + " tienes " + edad + " El programa termino su ejecucion");
		
	}

}
