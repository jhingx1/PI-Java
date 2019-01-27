package usoHilos_V;

public class HilosVarios2 extends Thread {
	//2. reamos una variable de clase.
	private Thread hilo;
	//1 reamos un constructor,que recibe un arguemento
	//que recibe un objeto de tipo hilo
	public HilosVarios2(Thread hilo)
	{	
		this.hilo = hilo;
	}
	
	public void run()//el que tiene la tarea que queremos realizar, el hilo
	{
		//este bucle no comiensa hasta que no termine el hilo que le pasemos por
		//parametro.
		//Asi se hace, con join
		
		try {
			hilo.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		for(int i = 0; i< 15;i++)
		{
			System.out.println("Ejecutando Hilo" + getName());
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
