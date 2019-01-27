package usoHilos_V;

public class SincronizandoHilos {

	public static void main(String[] args) {
	
		HilosVarios hilo1 =new HilosVarios();
		//Este hilo no comiense hasta que termine el hilo
		//le se le pasemos por argumento.
		HilosVarios2 hilo2 =new HilosVarios2(hilo1);
		
		hilo2.start();
		//Estos dos hilos se ha sincronizado.
		hilo1.start();
		
		//hilo main que liberado, debido a que los hilos estan sincronizados
		//en segundo plano.
		System.out.println("Terminadas la tareas");//Nuevo hilo (hilo3)

	}

}
