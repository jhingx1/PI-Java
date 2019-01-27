package arrayList_II_v162;

public class Empleado {
	
	private String nombre;
	private int edad;
	private double salario;
	
	public Empleado(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	//metodo get
	public String dameDatos()
	{
		return "El empledo se llama " + nombre + " . Tiene " + edad + " anos."  
					+ " Y un salario  de " + salario;
	}
	
	
}
