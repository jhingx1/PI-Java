package v148ExcepcionesV_varias;

import javax.swing.JOptionPane;

public class Varias_Excepciones {

	public static void main(String[] args) {
		
		//No es una buena practica
		try{
			division();
		}catch (ArithmeticException e) {
			System.out.println("Estas dividiendo por 0");
		}catch (NumberFormatException e) {
			System.out.println("No has introducido un numero entero");
			//System.out.println(e.getMessage()); //devuelve un string
			
			//nos debuelve la clase a la que pertenece este metodo
			System.out.println("Se ha generado un error de tipo: " + e.getClass().getName());
		}
		
		
	}

	//Metodo estatico
	
	static void division()
	{
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
		int num2  = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
		
		System.out.println("El resultado es : " + num1/num2);
	}
	
}
