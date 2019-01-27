package colecciones_VIII;

import java.util.Comparator;

public class Articulo implements Comparable<Articulo>, Comparator<Articulo>{
	
	private int numero_Articulo;
	private String descripcion;
	
	
	public Articulo() {
		
	}
	
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


	@Override
	public int compare(Articulo arg0, Articulo arg1) {
		String descripcionA = arg0.getDescripcion();
		String descripcionB = arg1.getDescripcion();
		//para que compare los dos objetos
		return descripcionA.compareTo(descripcionB);
	}

}
