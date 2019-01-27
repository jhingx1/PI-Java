package v36ConstanteFinal;

public class Empleados {
	//final , ya no se puede cambiar, evita que cambie el
	//valor
	private final String nombre;
	private String seccion;
	private int id;
	//idSiguiente es una variable de clase, pertecene a la clase
	//idSiguiente es unico(compartido)
	private static int idSiguente=1;
	//metodo constructor
	public Empleados(String nombre)
	{
		this.nombre = nombre;
		this.seccion = "administacion";
		id = idSiguente;
		idSiguente++;
	}
	
	public void cambiaSeccion(String seccion)
	{
		this.seccion = seccion;
	}
	
	public String devuelveDatos()
	{
		return "El nombre es: " +  nombre +
				" y la seccion es: " + seccion + " y el ID = " + id;
	}
	//metodo getter, metodo estatico o de clase
	public static String dameIdSiguiente()
	{
		return "El IdSiguiente es: " + idSiguente;
	}
}
