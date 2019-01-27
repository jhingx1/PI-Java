package usoHilos_VI;

public class Banco {

	//Crear con 100 cuentas corrientes
	private final double[] cuentas;
	
	public Banco()
	{
		//incializando el array cuentas
		cuentas = new double[100];
		//recorriendo el array, para rellenar las cuentas
		//con un monto
		for (int i= 0; i< cuentas.length ; i++ )
		{
			//llenado las cuentas con 2000 soles.
			cuentas[i] = 2000;//dentro de este array hay 2000
		}
		
	}
	//cantida:cantidad de dinero que se quiere transferir.
	public void transferencia(int cuentaOrigen, int cuentaDestino,double cantidad)
	{
		if (cuentas[cuentaOrigen]< cantidad)//si es cierto que no haga nada (200 < 6000)
		{
			return;
		}
		//para que imprima en pantalla el hilo que se esta utilizando.
		System.out.println(Thread.currentThread());
		//Disminuyendo el dinero de la cuenta.
		cuentas[cuentaOrigen] -= cantidad;
		
		System.out.printf("%10.2f de %d oara %d", cantidad , cuentaOrigen, cuentaDestino);
		//aumentar la cuenta destino.
		cuentas[cuentaDestino] += cantidad;
		//que imprima cual es el saldo todal
		System.out.printf(" Saldo total : %10.2f%n",getSaldoTotal());
	}
	
	public double getSaldoTotal()
	{
		double suma_cuentas = 0;
		//para recorrer el array cuentas
		for(double a : cuentas) //"a" almacena cada cuentas (cada posicion tiene un saldo)
		{
			suma_cuentas +=a;	
		}
		return suma_cuentas;
	}
}
