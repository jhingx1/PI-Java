package colecciones_IX;

import java.util.Comparator;

public class ComparadorArticulos implements Comparator<Articulo>{

	@Override
	public int compare(Articulo o1, Articulo o2) {
		
		String desc1 = o1.getDescripcion();
		String desc2 = o2.getDescripcion();
	
		return desc1.compareTo(desc2);
	}
}
