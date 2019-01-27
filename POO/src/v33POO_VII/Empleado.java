package v33POO_VII;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
	//variables de clase
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	//Constructor
	public Empleado(String nom,double sue,int agno,int mes,int dia)
	{
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
		altaContrato = calendario.getTime();
		
	}
	//metodos getter
	public String dameNombre()
	{
		return nombre;
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
	
}
