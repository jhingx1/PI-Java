package v52PruebaTemporizador;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

public class DameLaHora implements ActionListener{

	public void actionPerformed(ActionEvent e)
	{
		Date ahora = new Date(); //nos debuelve la hora
		System.out.println("Te pongo la hora cada 5 sg: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();
	}
	
}
