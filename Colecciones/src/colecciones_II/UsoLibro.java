package colecciones_II;

public class UsoLibro {

	public static void main(String[] args) {
		//Aparentemente son iguales
		Libro libro1 = new Libro("P. Java", "Juan", 25);
		Libro libro2 = new Libro("P. Java", "Juan", 25);
		
		if(libro1.equals(libro2))
		{
			System.out.println("Es el mismo libro");
		}else
		{
			System.out.println("No es el mismo libro");
		}

	}
}
