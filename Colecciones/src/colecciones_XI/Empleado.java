package colecciones_XI;

public class Empleado {
	
	private String nombre;
	private double sueldo;
	
	public Empleado(String n) {
		nombre = n;
		sueldo = 2000;
	}

	public String toString() {
		return "[Nombre=" + nombre + ", Sueldo=" + sueldo + "]";
	}
	
}
