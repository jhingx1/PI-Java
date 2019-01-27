package v53IntClasesInternas;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class Reloj {
	
	private int intervalo;
	private boolean sonido;
	
	public Reloj(int intervalo,boolean sonido)
	{
		this.intervalo = intervalo;
		this.sonido = sonido;
			
	}

	public void enMarcha()
	{	//instanciando la interfaz ActionListener
		ActionListener oyente = new DameLaHora2();
		Timer mitemposizador = new Timer(intervalo,oyente);
		mitemposizador.start();
	}
	
	//solo clases internas
	private class DameLaHora2 implements ActionListener
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
}
