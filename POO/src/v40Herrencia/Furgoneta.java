package v40Herrencia;

public class Furgoneta extends Coche{
	
	private int capacidadCarga;
	private int plazasExtra;
	
	public Furgoneta(int plazasExtra,int capacidadCarga)
	{	//Que hace super(): llama al constructor de la clase padre
		//con el objetivo de darle un estado inicial. a furgoneta.
		super();
		this.plazasExtra = plazasExtra;
		this.capacidadCarga = capacidadCarga;
	}
	
	public String dimeDatosFurgoneta()
	{
		return "La capacidad de carga es: " + capacidadCarga
				+ " y las plazas son: " + plazasExtra;
	}
	
}
