package usoHilos_II;

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
	
	public void run() //este metodo es invocado cuando se ejecuta el metodo start()
	{
		//Entoces a esta altura del codigo jamas podra estar detenido bajo ninguna circustancias.
		//imprimira false
		System.out.println("Estado del hilo al comensar: " + Thread.currentThread().isInterrupted());
		
		//for (int i=1; i<=3000; i++){//llama al metodo mueve_pelota
		//while(!Thread.interrupted())//mientras no aya sido interrupido el hilo
		while (!Thread.currentThread().isInterrupted())
		{							//se ejecuta el hilo interno
			pelota.mueve_pelota(componente.getBounds());
			componente.paint(componente.getGraphics());//repintar la lamina
			/*
			try {
				Thread.sleep(4);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();//imprime el estado de la pila
				System.out.println("Hilo bloquedo, Implosible su detencion");
			}
			*/
		}
		//Esto va a dar true
		System.out.println("Estado del hilo al terminar: " + Thread.currentThread().isInterrupted());
	}
	
}
