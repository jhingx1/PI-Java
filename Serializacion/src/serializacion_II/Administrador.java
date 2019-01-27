package serializacion_II;

public class Administrador extends Empleado{
	
	private double incentivo;

	public Administrador(String n, double s,int agno,int mes, int dia)
	{
		super(n,s,agno,mes,dia);
		incentivo = 0;
	}
	public double getSueldo()
	{
		double sueldoBase = super.getSueldo();
		return sueldoBase = incentivo;
	}
	public void setIncetivo(double b)
	{
		incentivo = b;
	}
	public String toString()
	{
		return super.toString() + " Incentivo" + incentivo;
	}
}
