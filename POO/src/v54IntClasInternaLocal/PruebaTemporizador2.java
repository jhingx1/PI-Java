package v54IntClasInternaLocal;

import javax.swing.*;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		
		Reloj mireloj = new Reloj();
		
		mireloj.enMarcha(3000, true);
		
		JOptionPane.showMessageDialog(null, "Pulsar Aceptar para continual");
		System.exit(0);

	}
}
