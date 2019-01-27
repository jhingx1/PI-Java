package usoHilos_VIII;
public class EjecucionTransferencias implements Runnable{
	//campos de clase, para que almacene lo
	//que se pase por parametro
	private Banco banco;
	private int deLaCuenta;//cuenta origen
	private double cantidadMaxima;
	
	//de : cuenta de la que parte.
	//max:cantidad maxima permitida a transferiri
	public EjecucionTransferencias(Banco b,int de,double max )
	{
		//con esto de alguna forma tendremos una instancia de la clase banco
		//y podremos utilizar el metodo transferencia.
		banco = b;
		deLaCuenta = de;
		cantidadMaxima = max;
	}
	
	@Override
	public void run() {
		//para hacer un bucle infinito
		try
		{
			while(true)
			{
				//1ero necesito la cuenta destino.
				//la cuenta origen se le pasara al constructor cuando instancie esta 
				//clase (con el parametro de).
				//Ahora para hacer que sea aleatorio seria con la clase estatica Manth.random().
				int paraLaCuenta = (int)(100*Math.random());
				//con esto se genera una cantidad aleatorioa a transferir (2000 * [num_aletorio])
				double cantidad = cantidadMaxima*Math.random();
				
				banco.transferencia(deLaCuenta, paraLaCuenta, cantidad);
				
				Thread.sleep((int)(10*Math.random()));
			}
		}catch (InterruptedException e) {
			//poner algo de codigo, si se desea
		}
		
	}
	
	
	
}
