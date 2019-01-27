package usoHilos_IV;

public class SincronizandoHilos {

	public static void main(String[] args) {
	
		HilosVarios hilo1 =new HilosVarios();
		HilosVarios hilo2 =new HilosVarios();
		
		hilo1.start();
		
		try {
			hilo1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		hilo2.start();
		
		try {
			hilo2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Terminadas la tareas");//Nuevo hilo (hilo3)

	}

}
