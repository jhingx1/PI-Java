package usoHilos_IX;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banco {

	//Crear con 100 cuentas corrientes
	private final double[] cuentas;
	
	//crear una instancia (variable) de reentranLock
	//un campo encapsulado de la interfz lock.
	
	private Lock cierreBanco = new ReentrantLock();
	
	
	
	public Banco()
	{
		//incializando el array cuentas
		cuentas = new double[100];
		//recorriendo el array, para rellenar las cuentas
		//con un monto
		for (int i= 0; i< cuentas.length ; i++ )
		{
			//llenado las cuentas con 2000 soles.
			cuentas[i] = 200000;//dentro de este array hay 2000
		}
		
	}
	
	
	//cantida:cantidad de dinero que se quiere transferir.
	public void transferencia(int cuentaOrigen, int cuentaDestino,double cantidad)
	{
		cierreBanco.lock();
		
		try
		{
			if (cuentas[cuentaOrigen]< cantidad)//si es cierto que no haga nada (200 < 6000)
			{
				System.out.println(" --------- CANTIDAD INSUFICIENTE----- " +
						cuentaOrigen + " ..... SALDO:" + cuentas[cuentaOrigen] + 
							"..." + cantidad);//cantida a transferir.
				return;
			}else{
				System.out.println("---- CANTIDAD OK ----" + cuentaOrigen);
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
		}finally {//para decirle que si o curreo una excepcion o no libre este codigo
			cierreBanco.unlock();
		}
		
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
