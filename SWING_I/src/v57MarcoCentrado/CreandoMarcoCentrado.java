package v57MarcoCentrado;

import javax.swing.JFrame;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		
		MarcoCentrado miMarco = new MarcoCentrado();
		//Para que cuando cierre la ventana, pare el programa
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Para que mi marco se aga visible
		miMarco.setVisible(true);

	}
}
