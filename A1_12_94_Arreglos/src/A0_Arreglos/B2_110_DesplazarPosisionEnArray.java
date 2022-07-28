package A0_Arreglos;

import java.util.Scanner;

public class B2_110_DesplazarPosisionEnArray {
	public static void main(String[] args) {
		int[]a = new int[10];
		int ultimo;
		Scanner scan = new Scanner(System.in);
		int longitud = a.length;
		for(int i=0; i<longitud; i++) {
			System.out.print("ingrese el número: ");
			a[i] = scan.nextInt();
		}
		//SE DESPLAZA EN UN ÍNDICE EL ARRAY Y EL VALOR EN EL ÚLTIMO ÍNDICE
		//..SE PASA AL INDICE 0.
		ultimo= a[longitud-1];
		for(int i=longitud-2; i>=0;i--) {
			a[i+1] = a[i];
		}
		a[0] = ultimo;
		System.out.println("El arreglo: ");
		for(int i=0;i<longitud;i++) {
			System.out.print(a[i] + " ");
		}
	}
}
