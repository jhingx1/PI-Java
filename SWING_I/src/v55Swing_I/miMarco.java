package v55Swing_I;

import java.awt.Frame;

import javax.swing.JFrame;

public class miMarco extends JFrame{//heredando

	public miMarco()
	{
		setBounds(500, 300, 250, 250);//Posicion y tamanios
		//setResizable(false); //no permite redimencionar
		setExtendedState(6); //marco a pantalla completa
	}
	
}
