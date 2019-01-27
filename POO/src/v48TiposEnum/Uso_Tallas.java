package v48TiposEnum;

import java.util.Scanner;

public class Uso_Tallas {
	
	enum Talla{
		
		MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
		//variable encapsulada, para que cuando se construya el tipo
		//talla, le pasemos como parametro S (M,L,XL) a abreviatura de esa
		//forma le estamos diciendo que la a la abreviatura perteneciente 
		//a mini es igual a la abreviatura que la abreviatura que le pasamos
		//por parametro.
		//de esta forma asociamos el nombre de este objeto (MINI) y la abreviatura
		//perteneciente a este objeto (S,M,L,XL)
		private String abreviatura;
		//constructor
		private Talla(String abreviatura) //no admite intanciacion.
			{
				this.abreviatura = abreviatura;
			}
		
		public String dameAbreviatura()
		{
			return abreviatura;
		}
		
		};
	
		
		
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI,MEDIANO,GRANDE,MUY_GRANDE");
		//toUpperCase() : pasar a mayuculas lo que el usuario pueda ingresar
		String entrada_datos = entrada.next().toUpperCase();
		//Talla.class: clase a la que pertenece.
		//entrada_datos: datos introducidos por el usuario.
		Talla la_talla=Enum.valueOf(Talla.class, entrada_datos);
		//valueOf: nos debuelve el nombre de la constante enumerada a la que pertenece
		//el texto introducido, que lo hemos alamcenado en entrada datos, con los cual
		//imaginemos que es GRANDE, el metodo estatico valuesOf detecta a que tipo pertenece
		//pues ese texto (string) eso lo hace al primer argumento (Talla.class), con los cual
		//lo que estamos almacenado en "la_talla" es ese valor(GRANDE), y eso me permite utilizar
		//"la_talla" para llamar al metodos getter
		
		System.out.println("Talla = " + la_talla);
		
		System.out.println("abrevitura = " + la_talla.dameAbreviatura());
		
	}
}
