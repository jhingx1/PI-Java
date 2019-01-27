package v49InterfacesClassInternas;

public class Jefatura extends Empleado{
	
	private double incentivo;
	
	public Jefatura(String nom, double sue,int agno,int mes,int dia)
	{
		super(nom,sue,agno,mes,dia);
	}
	
	public void estableceIncentivo(double b)
	{
		incentivo = b;
	}
	//sobre escriendo el metodo heredado: dameSueldo
	public double dameSueldo()
	{
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe + incentivo;	
	}
	

	
}
