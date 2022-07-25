package A0_Arreglos;

import java.util.Scanner;

public class B0_109_BuscarEnteroEnArray {
	public static void main(String[] args) {
		int[]a = new int[10];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("Ingrese un número: ");
			a[i] = scan.nextInt();
		}
		System.out.println("\r\nIngrese un número a buscar: ");
		int num = scan.nextInt();
		int i = 0;
		while(i<a.length && a[i] != num) {
			i++;
		}
		if(i==a.length) {
			System.out.println("número no encontrado");
		}else if(a[i]==num) {
			System.out.println("encontrado en la posición: " + i);
		}	
	}
}
