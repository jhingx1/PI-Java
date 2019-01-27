package v147ExcepcionIV_Propias;

public class Longitud_mail_erronea extends Exception{ //Exception 
	//RuntimeException : Errores no controlados.no obliga a usar try...catch
	//Dos constructores
		//constructor sin argumentos
		public Longitud_mail_erronea()
		{
			
		}
		//Constructor c
		public Longitud_mail_erronea(String msj_errror)
		{
			super(msj_errror);//llamando al constructor de la clase padre
		}
}
