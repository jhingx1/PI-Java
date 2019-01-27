package v52PruebaTemporizador;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class PruebaTemporizador {
	public static void main(String[] args) {
		//instanciando al interfacez ActionListener manera 1
		DameLaHora oyente = new DameLaHora();
		//instanciando al interfacez ActionListener manera 2
		//ActionListener oyente = new DameLaHora();
		Timer mitemporizador = new Timer(5000,oyente);
		
		mitemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
	
		System.exit(0);
	}	
}