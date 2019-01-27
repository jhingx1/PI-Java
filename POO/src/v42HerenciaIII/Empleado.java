package v42HerenciaIII;

import java.util.Date;
import java.util.GregorianCalendar;

public class Empleado {
	//variables de clase
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguente=1;
	//Constructor
	public Empleado(String nom,double sue,int agno,int mes,int dia)
	{
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno,mes-1,dia);
		altaContrato = calendario.getTime();
		id = idSiguente;
		idSiguente++;
	}
	//solo con un parametro
	public Empleado(String nom)
	{//Este this llama al otro constructor de la clase(de acuerdo a su parametros)
	 //y le pasa estos parametros
		this(nom, 30000, 2000, 01, 01);
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
	public String dameIdSiguiente()
	{
		return "Id: "+id;
	}

}
