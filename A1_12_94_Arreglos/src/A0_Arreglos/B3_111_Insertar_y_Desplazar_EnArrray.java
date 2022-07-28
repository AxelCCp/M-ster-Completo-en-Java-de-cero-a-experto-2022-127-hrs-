package A0_Arreglos;

import java.util.Scanner;

public class B3_111_Insertar_y_Desplazar_EnArrray {
	public static void main(String[] args) {
		int[]a = new int[10];
		int elemento, posicion;
		Scanner scan = new Scanner(System.in);
		int longitud = a.length;
		for(int i=0; i<longitud; i++) {
			System.out.print("ingrese el número: ");
			a[i] = scan.nextInt();
		}
		//
		System.out.println("ingresa un nuevo elemento: ");
		elemento= scan.nextInt();
		System.out.println("posición donde agregar el elemento(0 a 9): ");
		posicion = scan.nextInt(); 
		for(int i=longitud-2; i>=posicion; i--) {
			a[i+1] = a[i];
		}
		a[posicion] = elemento;
		System.out.println("El arreglo: ");
		for(int i=0;i<longitud;i++) {
			System.out.print(a[i] + " ");
		}
	}
}
