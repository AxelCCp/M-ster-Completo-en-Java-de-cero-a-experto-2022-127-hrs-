package A0_Arreglos;

import java.util.Scanner;

public class B1_109_BuscarStringEnArray {
	public static void main(String[] args) {
		String[]a = new String[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("Ingrese un nombre: ");
			a[i] = scan.next();
		}
		System.out.println("\r\nIngrese un número a buscar: ");
		String nombre = scan.next();
		int i = 0;
		while(i<a.length && !a[i].equalsIgnoreCase(nombre)) {
			i++;
		}
		if(i==a.length) {
			System.out.println("número no encontrado");
					//equalsIgnoreCase(nombre)
		}else if(a[i].toLowerCase().compareTo(nombre.toLowerCase()) == 0) {
			System.out.println("encontrado en la posición: " + i);
		}	
	}
}
