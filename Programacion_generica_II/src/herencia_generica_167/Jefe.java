package herencia_generica_167;

public class Jefe extends Empleado {
	
	public Jefe(String nombre, int edad,double salario)
	{
		super(nombre,edad,salario);
	}
	
	double incetivo(double inc)
	{
		return inc;
	}
}
