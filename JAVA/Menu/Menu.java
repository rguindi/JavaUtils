package Menu;

import java.util.ArrayList;

public class Menu {

	ArrayList<String> opciones = new ArrayList<String>();
	private int opcion;

	// Constructor
	public Menu(ArrayList<String> opciones) {
		this.opciones = opciones;
	}

	// Getter & Setters
	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}

	// Métodos
	public int getNumOpciones() {
		return opciones.size();
	}

	public void imprimirOpciones() {
		int contador = 1;
		
		System.out.println("\n******************************");
		System.out.println("Por favor, escoja una opción:");
		for (String opcion : opciones) {
			System.out.println(contador + ". " + opcion);
			contador++;
		}
		System.out.println("\n******************************");
	}

}
