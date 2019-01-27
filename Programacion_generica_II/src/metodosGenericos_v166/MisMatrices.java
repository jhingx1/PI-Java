package metodosGenericos_v166;
public class MisMatrices {

	//para crear un metodo generico
	//T :para que me debuelva un dato de tipo T(generico)
	//ejm: el metodo devuelve T:generico,String,Date,Empleado
	//a: nombre del array
	public static <T extends Comparable> T getMenor(T[] a) // T: para que me debuelva el
											//elemento del array que sea menor
	{
		if (a == null || a.length == 0) //si el array es nulo o la longuitud
		{								//es igual a cero
			return null;
		}	
		
		//metodo compareTO, para comparar dos elementos
		//de
		
		//Variable de tipo generico.
		T elementoMenor = a[0]; //a[0] : esta en la posicion 0
		//recorriendo el array
		for (int i = 1; i < a.length ; i++) 
		{
			//en pieso de i = 1, para comparar con a[0] 
			
			if(elementoMenor.compareTo(a[i]) > 0)//implementar la interfaz comparable.
			{
				elementoMenor = a[i];
			}
			
		}
		
		return elementoMenor;
		
		
	}
	
}
