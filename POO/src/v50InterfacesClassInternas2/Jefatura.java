package v50InterfacesClassInternas2;

public class Jefatura extends Empleado implements Jefes{
	
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
	
	//Sobre escritura
	@Override 
	public String tomar_decisiones(String decision) {
		
		return "Un miembro de la direccion ha tomado la decision de :" + decision;
	}
	
}
