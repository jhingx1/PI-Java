package usoHilos_V;

public class HilosVarios extends Thread{
	//sobre escribiendo el metodo Run()
	
	public void run()//el que tiene la tarea que queremos realizar, el hilo
	{
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
