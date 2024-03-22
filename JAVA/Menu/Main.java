package Menu;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		GestionMenu gestionMenu = new GestionMenu();

		//Indicamos las opciones del menú
		ArrayList<String> opciones = new ArrayList<String>();
		opciones.add("Opcion ");
		opciones.add("Opcion ");
		opciones.add("Opcion ");
		opciones.add("Opcion ");
		opciones.add("Salir");
		
		Menu menu = new Menu(opciones);
	
		
		do {
			menu.imprimirOpciones();
			menu.setOpcion(ScanTeclado.getInt("Opción:"));
			gestionMenu.gestionMenu(menu);
			
		} while (menu.getOpcion() != menu.getNumOpciones());
		
		System.out.println("Gracias por utilizar mi programa");

	}

}
 