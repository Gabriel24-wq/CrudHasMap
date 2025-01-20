package Interface;

import Model.Libros;

public interface Metodos {
	//metodos Para realizar el crud 
	public void guardar(Libros libro);
	
	public void mostrar(); 

	public Libros buscar(String titulo);
	
	public void editar(Libros libro);
	
	public void eliminar(String titulo);
}
