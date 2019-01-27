package v54IntClasInternaLocal;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class Reloj {
	
	public void enMarcha(final int intervalo,final boolean sonido)
	{	
		//solo clases internas local
		class DameLaHora2 implements ActionListener
		{
			//puedo acceder a los metodos privados de la clase externa, si los metodos
			//setter y getter
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Date ahora = new Date();
				System.out.println("Te pongo la hora cada 3 segundos" + ahora);
				if(sonido)
				{
					Toolkit.getDefaultToolkit().beep();
				}
			}
		}		
		//instanciando la interfaz ActionListener
		ActionListener oyente = new DameLaHora2();
		Timer mitemposizador = new Timer(intervalo,oyente);
		mitemposizador.start();
	
	}
	
}
