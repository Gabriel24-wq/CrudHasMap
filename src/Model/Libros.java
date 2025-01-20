package Model;


public class Libros {
	private String clave;
	private String titulo;
	private int numPaginas;
	private String autor;
	public Libros() {
	}
	public Libros(String clave, String titulo, int numPaginas, String autor) {
		this.clave = clave;
		this.titulo = titulo;
		this.numPaginas = numPaginas;
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Libros [clave=" + clave + ", titulo=" + titulo + ", numPaginas=" + numPaginas + ", autor=" + autor + "]\n";
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	

}
