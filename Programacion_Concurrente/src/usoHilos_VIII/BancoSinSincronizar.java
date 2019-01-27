package usoHilos_VIII;

public class BancoSinSincronizar {

	public static void main(String[] args) {
			
		Banco b = new Banco();
		
		//Hara hacer un bucle for para que realice transferencias
		//desde la cuenta 0 hasta la 99
		
		for (int i= 0; i < 100; i++)
		{
			//Aqui tenemos que instancia la clase que lleva la interfaz runnable
			//y arrancar el hilo.
			//b:objeto Banco, i:que seria la representacion de cada cuenta 0,1,2...
			//max: un numero fijo
			EjecucionTransferencias r = new EjecucionTransferencias(b, i, 200000);
			
			//Creando una instancia de la clase Thread()
			
			Thread t = new Thread(r);//para crear multiple hilos
			t.start();//y esta inicializando los diferentes hilos
			
		}
	}
}
