package Menu;

public class GestionMenu {
	
	public void gestionMenu(Menu menu) {

		switch (menu.getOpcion()) {
		case 1:
			
			String nombre = ScanTeclado.getString("Por favor, introduzca su nombre");
			System.out.println("Su nombre es " + nombre);
			
			break;
		case 2:
			System.out.println("Has escogido la opción " + menu.getOpcion());
			break;
		case 3:
			System.out.println("Has escogido la opción " + menu.getOpcion());
			break;
		case 4:
			System.out.println("Has escogido la opción " + menu.getOpcion());
			break;
		case 5:
			System.out.println("Has escogido la opción " + menu.getOpcion());
			break;
		case 6:
			System.out.println("Has escogido la opción " + menu.getOpcion());
			break;
		case 7:
			System.out.println("Has escogido la opción " + menu.getOpcion());
			break;

		default:
			break;
		}
	
		
	}

}
