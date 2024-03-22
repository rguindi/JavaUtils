/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundotic.cursojava.G.EntradaSalida;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class EjemploScanner {
    
    public static void main(String... args){
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un dato");
        String cadena = entrada.nextLine();
        System.out.println("Introduce un dato");
        int entero = entrada.nextInt();
        System.out.println("Introduce un dato");
        String cadena2 = entrada.nextLine();
        System.out.println(entero);
        entrada.close();
         
    }
    
}
