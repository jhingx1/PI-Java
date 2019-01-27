package colecciones_VII;

public class Articulo implements Comparable<Articulo>{
	
	private int numero_Articulo;
	private String descripcion;
	
	//constructor, num: para el numero de articulos
	//desc: para la descripcion
	public Articulo(int num, String desc)
	{
		numero_Articulo = num;
		descripcion = desc;
	}
	

	@Override
	public int compareTo(Articulo o) {
		//un objeto de tipo articulo : o
		return numero_Articulo - o.numero_Articulo;
		
	}
	
	//para que me devuelva la descripcion
	
	public String getDescripcion()
	{
		return descripcion;
	}

}
