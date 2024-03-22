package Menu;

import java.util.Scanner;

public class ScanTeclado {
	

	//Recibe un mensaje a mostrar por teclado y devuleve un String
	public static String getString(String mensaje) {
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		String entrada = sc.nextLine();
		return entrada;
	}
	
	
	//Recibe un mensaje a mostrar por teclado y devuleve un Entero
	public static int getInt(String mensaje) {
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		int entrada =  sc.nextInt(); sc.nextLine();
		return entrada;
	}
	
	//Recibe un mensaje a mostrar por teclado y devuleve un Double
	public static double getDouble(String mensaje) {
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		double entrada =  sc.nextDouble(); sc.nextLine();
		return entrada;
	}

}
