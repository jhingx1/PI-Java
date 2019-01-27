package v149ExcepcionesVIIClausulaFinaly;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Areas_Peso {
	
	static int figura;
	
	public static void main(String[] args) {
		
		Scanner entrada =new Scanner(System.in);
		
		System.out.println("Elige una opcion: \n1: Cuadrado "
				+ "\n2: Rectangulo \n3: Triangulo \n4: Circulo");
		
		try {
			figura = entrada.nextInt();
			//entrada.close();
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error");
		}finally {//este codigo se ejecuta siempre
			entrada.close(); 
		}

		switch (figura) {
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			
			System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
			break;
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El area del rectangulo es: " + base*altura);
			break;
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			
			System.out.println("El area del triangulo es: " + (base*altura)/2);
			break;
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
			System.out.println("El area del circulo es: ");
			System.out.println(Math.pow(radio, 2));
			break;
		default:
			System.out.println("La opcion no es correcta");

		}
		
		//-------------------Segunda parte
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
		System.out.println("Si eres hombre tu peso ideal es: " + (altura - 110) + " kg");
		System.out.println("Si eres mujer tu peso ideal es: " + (altura - 120) + " kg");
	}
}
