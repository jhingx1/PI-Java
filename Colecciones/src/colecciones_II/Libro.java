package colecciones_II;

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

	public String getDatos() {
		return "El titulo es: " + titulo + ". El autor es: " + autor + ". Y el ISBN es: " + ISBN;
	}

}
