package v46ClasAbstractas_II;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado extends Persona{
	//variables de clase
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguente=1;
	//Constructor
	public Empleado(String nom,double sue,int agno,int mes,int dia)
	{
		super(nom); //preparado para recibir un parametro
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
		altaContrato = calendario.getTime();
		id = idSiguente;
		idSiguente++;
	}
	
	public String dameDescripcion()
	{
		return "Este empleado tiene un ID = " +  id + 
				" con un sueldo = " + sueldo;
	}

	public double dameSueldo()
	{
		return sueldo;
	}
	public Date dameFechaContrato()
	{
		return altaContrato;
	}
	
	//metodo setter sube sueldo
	public void subeSueldo(double porcentaje)
	{
		double aumento = sueldo * porcentaje/100;
		sueldo += aumento;
	}
	public String dameIdSiguiente()
	{
		return "Id: "+id;
	}

}
