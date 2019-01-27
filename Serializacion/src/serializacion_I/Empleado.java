package serializacion_I;


import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado implements Serializable{

	private String nombre;
	private double sueldo;
	private Date fechaContrato;
	
	public Empleado(String n, double s, int agno, int mes, int dia)
	{
		nombre = n;
		sueldo = s;
		
		GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
		
		fechaContrato = calendario.getTime();
		
	}
	
	public String getNombre() 
	{
		return nombre;
	}

	public double getSueldo() 
	{
		return sueldo;
	}
	public Date getfechaContrato()
	{
		return fechaContrato;
	}
	
	public void subirSueldo(double porcentaje)
	{
		double aumento = sueldo * porcentaje/100;
		sueldo += aumento;
	}
	
	public String toString() //para escificar un descripcion de la clase,
							//pasar a texto la descripcion
	{
		return "Nombre = " + nombre + ", sueldo = " + sueldo + ", fecha de contrato = " + fechaContrato;
	}
	
}
