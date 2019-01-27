package v55Swing_I;
import javax.swing.*;
public class CreandoMarcos {

	public static void main(String[] args) {
		
		miMarco marco1 = new miMarco();
		//Haciendolo visible
		marco1.setVisible(true);
		//Decir que tiene k hacer esa ventana cuandos e cierre
		//Esto dice que cuando se cierre la ventana el programa se cierre
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
