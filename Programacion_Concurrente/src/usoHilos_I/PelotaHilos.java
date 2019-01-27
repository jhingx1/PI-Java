package usoHilos_I;

import java.awt.Component;

public class PelotaHilos implements Runnable{
	
	private Pelota pelota;
	private Component componente;
	
	//Construcor
	//unaPelota : Animacion de la pelota y estable un limite 
	//unComponent : El componente donde esta pelelota va a rebotar
	//en otras palabras le estoy pasando la lamina
	public PelotaHilos(Pelota unaPelota,Component unComponente)
	{
		pelota = unaPelota;
		componente = unComponente; 
	}
	
	public void run() //sobre escribiendo el metodo run()
	{
		for (int i=1; i<=3000; i++){//llama al metodo mueve_pelota
			pelota.mueve_pelota(componente.getBounds());
			componente.paint(componente.getGraphics());//repintar la lamina
			
			try {
				Thread.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
