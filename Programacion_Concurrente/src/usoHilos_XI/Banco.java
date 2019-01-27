package usoHilos_XI;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banco {

	//Crear con 100 cuentas corrientes
	private final double[] cuentas;
	
	//crear una instancia (variable) de reentranLock
	//un campo encapsulado de la interfz lock. que hace el bloqueo
	//private Lock cierreBanco = new ReentrantLock();
	
	//creando campo de tipo condition
	//private Condition saldoSuficiente;
	//constructor
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
		//sujeto a la nueva condicion.
		//saldoSuficiente = cierreBanco.newCondition();
		
	}
	//cantida:cantidad de dinero que se quiere transferir.
	public synchronized void transferencia(int cuentaOrigen, int cuentaDestino,double cantidad) throws InterruptedException
	{
		//cierreBanco.lock();//este es el bloqueo
		
		//try
		//{
			//siempre se va a repetir
			//siempre y cuando el saldo de la cuenta se menor que la cantidad a transferir.
			while (cuentas[cuentaOrigen]< cantidad)
			{
				//return; sobre porque no queremos devolver el flujo de ejecucion a
				//llamada al metodo, sino que queremos que todas las transferencia se realisen.
				
				//mientras esta condicion sea verdad el hilo permanesca a la espera.
				//saldoSuficiente.await();
				wait(); //el hilo se pone a al espera
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
			
			//para avisar las acciones de un hilo a otros hilos
			//saldoSuficiente.signalAll();
			
			notifyAll();//para avisar las acciones de un hilo a otros hilos
			
		//}//finally {//para decirle que si o curreo una excepcion o no libre este codigo
			//cierreBanco.unlock();
		//}
		
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
