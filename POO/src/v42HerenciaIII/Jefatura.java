package v42HerenciaIII;

public class Jefatura extends Empleado{
	
	private double incentivo;
	
	public Jefatura(String nom, double sue,int agno,int mes,int dia)
	{
		super(nom,sue,agno,mes,dia);//hereda el constructor
	}
	
	public void estableceIncentivo(double b)
	{
		incentivo = b;
	}
	//sobre escriendo el metodo heredado: dameSueldo
	public double dameSueldo()
	{
		//super : para diferenciar la clase padre de la clase hija
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe + incentivo;	
	}
}
