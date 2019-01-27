package colecciones_III;

public class Libro {

	private String titulo;
	private String autor;
	private int ISBN;
	
	public Libro(String titulo, String autor, int iSBN) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		ISBN = iSBN;
	}
	
	public String getDatos()
	{
		return "El titulo es: " + titulo +  ". El autor es: " + autor + ". Y el ISBN es: " + ISBN;
	}
	//sobre escribiendo
	/*public boolean equals(Object obj)
	{
		//si pertenece a la clase libro
		//Para ver si es una instancia de la clase libro, con instanceof
		if(obj instanceof Libro)
		{
			Libro otro = (Libro)obj;
			//Ahora si podemos comparar el ISBN
			if(this.ISBN == otro.ISBN)
			{
				return true;
			}else
			{
				return false;
			}
			
		}else
		{
			return false;
		}
		
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}

}
