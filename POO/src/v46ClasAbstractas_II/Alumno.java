package v46ClasAbstractas_II;

public class Alumno extends Persona{
	
	private String carrera;
	
	public Alumno(String nom,String car)
	{
		super(nom);
		carrera = car;
	}
	
	public String dameDescripcion()
	{
		return "Este alumno esta estudiando la carrera de : " + carrera;
	}
}
