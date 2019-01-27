package serializacion_II;


import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado implements Serializable{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 366988348464812455L;
	private String nombre;
	private double sueldos;
	private Date fechaContrato;
	
	public Empleado(String n, double s, int agno, int mes, int dia)
	{
		nombre = n;
		sueldos = s;
		
		GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
		
		fechaContrato = calendario.getTime();
		
	}
	
	public String getNombre() 
	{
		return nombre;
	}

	public double getSueldo() 
	{
		return sueldos;
	}
	public Date getfechaContrato()
	{
		return fechaContrato;
	}
	
	public void subirSueldo(double porcentaje)
	{
		double aumento = sueldos * porcentaje/100;
		sueldos += aumento;
	}
	
	public String toString() //para escificar un descripcion de la clase,
							//pasar a texto la descripcion
	{
		return "Nombre = " + nombre + ", sueldo = " + sueldos + ", fecha de contrato = " + fechaContrato;
	}
	
}
