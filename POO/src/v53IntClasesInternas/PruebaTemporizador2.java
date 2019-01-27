package v53IntClasesInternas;

import javax.swing.*;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		
		Reloj mireloj = new Reloj(3000, true);
		
		mireloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "Pulsar Aceptar para continual");
		System.exit(0);

	}
}
