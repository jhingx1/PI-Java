package clasesPropias_v165;

public class Pareja <T>{
	//T : argumento generico, de tipo Generico.
	private T primero;
	//Constructor
	public Pareja()
	{
		primero = null;
	}
	//Para asiganarle un valor a primero
	public void setPrimero(T nuevoValor)
	{
		primero = nuevoValor;
	}
	//de tipo generico T, debido a que no se que tipo nos va a debolver
	public T getPrimero()
	{
		return primero;
	}
	
}
