package Implementacion;

import java.util.HashMap;

import Interface.Metodos;
import Model.Libros;

public class LogicaMetodos implements Metodos {
	

	//tipos de datos primitivos int, long, float, etc. hay que parsearlos
	//int= integer, float,=float, long=Long;
	
	HashMap<String, Libros> registros=new HashMap<String, Libros>();

	@Override
	public void guardar(Libros libro) {
		// TODO Auto-generated method stub
		/*PUT-->Se utiliza para actualizar recursos al completo,
		es decir, se actualiza todo el recurso con los datos que se pasan.
		Hay que tener cuidado pues si se pasa un id erróneo el recurso se creará.*/
		registros.put(libro.getClave(), libro);
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(registros);
	}

	@Override
	public Libros buscar(String titulo) {
		// TODO Auto-generated method stub
		
		return registros.get(titulo);
	}

	@Override
	public void editar(Libros libro) {
		// TODO Auto-generated method stub
		registros.put(libro.getClave(), libro);
	}	

	@Override
	public void eliminar(String titulo) {
		// TODO Auto-generated method stub
		registros.remove(titulo);
	}

}
