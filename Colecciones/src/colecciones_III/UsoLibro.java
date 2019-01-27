package colecciones_III;

public class UsoLibro {

	public static void main(String[] args) {
		//Aparentemente son iguales
		Libro libro1 = new Libro("P. Java", "Juan", 25);
		Libro libro2 = new Libro("P. Java", "Juan", 25);
		//libro1 = libro2;
		if(libro1.equals(libro2))
		{
			System.out.println("Es el mismo libro");
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
		}else
		{
			System.out.println("No es el mismo libro");
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
		}

	}
}
