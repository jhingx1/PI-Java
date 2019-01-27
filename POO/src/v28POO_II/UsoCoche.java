package v28POO_II;

import javax.swing.JOptionPane;

public class UsoCoche {

	public static void main(String[] args) {
		
		Coche miCoche = new Coche();
		//modificando el color, con el metodo setter
		miCoche.estableColor(JOptionPane.showInputDialog("Ingresa Color"));
		
		System.out.println(miCoche.dimeDatosGenerales());
		
		//uso del metodo getter, para motrar el color
		System.out.println(miCoche.dimeColor());
		
		//Uso de los metodos getter y setter de
		//configura asientos
		
		miCoche.configuraAsientos
			(JOptionPane.showInputDialog("Tiene Asientos de cuero?"));
		System.out.println(miCoche.dimeAsientos());
		
		miCoche.configuraClimatizador
			(JOptionPane.showInputDialog("Tiene Climatizador?"));
		System.out.println(miCoche.dimeClimatizador());
		
		System.out.println(miCoche.dimePesoCoche());
		
		System.out.println("El precio final de coche es: "
				+ miCoche.precioCoche());
	}
}
