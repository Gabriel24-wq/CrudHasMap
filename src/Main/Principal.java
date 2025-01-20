package Main;

import java.util.Scanner;

import Implementacion.LogicaMetodos;
import Model.Libros;

public class Principal {
	public static void main(String[] args) {
		Scanner lectura=null;
		
		String clave;
		String titulo;
		int numPaginas;
		String autor;
		
		Libros libro;
		
		int menuPrincipal, subMenu;
		
		System.out.println("Esto e sun ejemplo para git hub");
		int valor=90;
	
		
		LogicaMetodos imp=new LogicaMetodos();
		do {
			System.out.println("BIENVENIDO AL MENU");
			System.out.println("1-->ALTA");
			System.out.println("2-->MOSTRAR");
			System.out.println("3-->BUSCAR");
			System.out.println("4-->EDITAR");
			System.out.println("5-->ELIMINAR");
			System.out.println("6-->SALIR");
			
			lectura=new Scanner(System.in);
			menuPrincipal=lectura.nextInt();
			switch (menuPrincipal) {
			case 1:
				System.out.println("Ingrese la clave");
				lectura = new Scanner(System.in);
				clave = lectura.nextLine();
	
				System.out.println("Ingrese titulo");
				lectura=new Scanner(System.in);
				titulo=lectura.nextLine();
				
				System.out.println("Ingrese el numero de paginas");
				lectura=new Scanner(System.in);
				numPaginas=lectura.nextInt();
				
				System.out.println("Ingrerse el autor");
				lectura=new Scanner(System.in);
				autor=lectura.nextLine();
				//Crear el objeto
				libro=new Libros(clave, titulo, numPaginas, autor);
				
				//Guardar
				imp.guardar(libro);
				System.out.println("Se guardo con exito");
				break;
			case 2:
					imp.mostrar();
				break;
			case 3:
				//Solicitamos y guardamos el valor de clave
				System.out.println("Ingrese la clave que desea buscar");
				lectura=new Scanner (System.in);
				clave=lectura.nextLine();
				
				//Buscar-->Inovcando al metodo buscar mediante la variable de instancia imp
				libro=imp.buscar(clave);
				System.out.println("Se encontro registro "+libro);
				break;
			case 4:
				//Solicitamos y guardamos el valor de clave
				System.out.println("Ingrese la clave que desea editar");
				lectura=new Scanner (System.in);
				clave=lectura.nextLine();
				
				//Buscar-->Inovcando al metodo buscar mediante la variable de instancia imp
				libro=imp.buscar(clave);
				System.out.println("Se encontro registro "+libro);
				do {
					System.out.println("SUBMENU");
					System.out.println("1-->TITULO");
					System.out.println("2-->NUM. PAGINAS");
					System.out.println("3-->REGRESAR");
					lectura=new Scanner(System.in);
					subMenu=lectura.nextInt();
					switch (subMenu) {
					case 1:
						System.out.println("INGRESE EL NUEVO TITULO");
						lectura=new Scanner(System.in);
						titulo=lectura.nextLine(); 
						
						//Atualizacion 
						libro.setTitulo(titulo);
						imp.editar(libro);
						System.out.println("Se actualizo correctamente");
						break;
					case 2:
						System.out.println("INGRESE EL NUEVO NUM. PAGINAS");
						lectura=new Scanner(System.in);
						numPaginas=lectura.nextInt(); 
						
						//Atualizacion 
						libro.setNumPaginas(numPaginas);
						imp.editar(libro);
						System.out.println("Se actualizo correctamente");
						break;
					case 3:
						
						break;
										
					}
					
				}while(subMenu<3);
				break;
			case 5:
				System.out.println("ingrese la clave");
				lectura=new Scanner(System.in);
				clave =lectura.nextLine();
				
				imp.eliminar(clave);
				System.out.println("se elimino con exito");
				break;
			case 6:
				
				break;
		
			
			}
		}while(menuPrincipal<6);

	}
}
