package arrayList_v164;

public class ArrayList {
	
	private Object[] datosElemento; //array
	private int i=0;
	
	//Contructor
	public ArrayList(int z)
	{	//z : numero de elementos del array de objeto
		datosElemento = new Object[z];
	}
	//Nos debuelve un elemento de este array
	public Object get(int i)
	{
		return datosElemento[i];
	}
	//recibe como parametro un objeto de tipo Object
	public void add(Object o)
	{
		datosElemento[i] = o; //este objeto se almacenara en una 
							  //posicion en concreto del array
		i++;//variable contador.
	}
	
}
