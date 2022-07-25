package A0_Arreglos;

import java.util.Scanner;

public class A7_107_DetectarOrdenDeUnArray {
	public static void main(String[] args) {
		int[]a = new int[7];
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese 7 números: ");
		for(int i=0; i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		boolean ascendente = false;
		boolean descendente = false;
		for(int i=0; i<a.length - 1; i++) {
			if(a[i] > a[i+1]) {	
				descendente = true;
			}
			if(a[i] < a[i+1]) {	
				ascendente = true;
			}
		}
		if(ascendente == true && descendente == true) {
			System.out.println("Arreglo = desordenado");
		}
		if(ascendente == false && descendente == false) {
			System.out.println("Arreglo = todos son iguales");
		}
		if(ascendente == true && descendente == false) {
			System.out.println("Arreglo = ascendente");
		}
		if(ascendente == false && descendente == true) {
			System.out.println("Arreglo = descendente");
		}
	}
}
