package v28POO_II;

public class Coche {
	//variables de clase o de instancia
	private int ruedas;
	private int largo;
	private int ancho;
	//private int motor;
	private int pesoPlataforma;
	
	private String color; //no esta encapsulada
	private int pesoTotal;
	private boolean asientosCuero;
	private boolean climatizador;

	public Coche()
	{
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		//motor = 1600;
		pesoPlataforma = 500;
	}
	//metodo getter, imforma el valor de una propiedad.
	public String dimeDatosGenerales()
	{
		return "La plataforma del vehiculo tien " +
				ruedas + " ruedas " + ". \nMide " + largo/1000
				+ " metros con un ancho de " + ancho + 
				" cm y \nun peso de plataforma de " + pesoPlataforma
				+" kg";
	}
	
	//metodo setter, modifica el valor de la propiedad.
	public void estableColor(String colorCoche)
	{
		color = colorCoche;
	}
	
	public String dimeColor()
	{
		return "El color del coche es: " +  color;
	}
	//metodo setter
	public void configuraAsientos(String asientosCuero)
	{
		if(asientosCuero.equalsIgnoreCase("si"))
		{
			this.asientosCuero = true;
		}else{
			this.asientosCuero = false;
		}
	}
	
	public String dimeAsientos()
	{
		if(asientosCuero == true)
		{
			return "El coche tiene asientos de cuero";
		}else{
			return "El coche tiene asientos de serie";
		}
	}
	
	public void configuraClimatizador(String climatizador)
	{
		if(climatizador.equalsIgnoreCase("si"))
		{
			this.climatizador = true;
		}else{
			this.climatizador = false;
		}
	}
	
	public String dimeClimatizador()
	{
		if(climatizador == true)
		{
			return "El coche incorpora climatizador";
		}else{
			return "El coche lleva aire acondicionado";
		}
	}
	
	public String dimePesoCoche() //metodo setter y getter
	{
		int pesoCarroceria = 500;
		pesoTotal = pesoPlataforma +  pesoCarroceria;
		
		if(asientosCuero == true)
		{
			pesoTotal = pesoTotal + 50;
		}
		if(climatizador == true)
		{
			pesoTotal = pesoTotal + 20;
		}
		
		return "El peso del coche es : " + pesoTotal;
		
	}
	
	public int precioCoche()
	{
		int precioFinal = 10000; //variable local
		if(asientosCuero == true)
		{
			precioFinal+=2000;
		}
		if(climatizador == true)
		{
			precioFinal += 1500;
		}
		
		return precioFinal;
	}
	
}


















