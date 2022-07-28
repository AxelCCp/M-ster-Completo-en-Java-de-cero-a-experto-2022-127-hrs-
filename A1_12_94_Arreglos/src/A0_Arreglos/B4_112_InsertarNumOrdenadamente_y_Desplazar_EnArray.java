package A0_Arreglos;

import java.util.Scanner;

public class B4_112_InsertarNumOrdenadamente_y_Desplazar_EnArray {
	public static void main(String[] args) {
		int[]a= new int[7];
		int numero, posicion;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<a.length-1;i++) {
			System.out.print("Ingrese un número");
			a[i] = scan.nextInt();
		}
		System.out.println();
		System.out.println("Ingrese el número a insertar: ");
		numero = scan.nextInt();
		posicion = 0;
		while(posicion<6 && numero>a[posicion]) {
			posicion++;
		}
		for(int i=a.length-2; i>=posicion; i--) {
			a[i+1] = a[i];
		}
		a[posicion] = numero;
		System.out.println("El nuevo arreglo ordenado: ");
		for(int i=0; i<a.length; i++) {
			System.out.println(i + " => " + a[i]);
		}
		
	}
}
