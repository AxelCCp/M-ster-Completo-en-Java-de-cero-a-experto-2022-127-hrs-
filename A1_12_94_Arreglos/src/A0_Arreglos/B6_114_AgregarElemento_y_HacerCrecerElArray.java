package A0_Arreglos;

import java.util.Scanner;

public class B6_114_AgregarElemento_y_HacerCrecerElArray {
	public static void main(String[] args) {
		
		int[]a = new int[10];
		int elemento, posicion, ultimo;
		Scanner scan = new Scanner(System.in);
		
		int longitud = a.length;
		
		for(int i=0; i<longitud; i++) {
			System.out.print("ingrese el número: ");
			a[i] = scan.nextInt();
		}
		
		System.out.println("ingresa un nuevo elemento: ");
		elemento= scan.nextInt();
		System.out.println("posición donde agregar el elemento(0 a 9): ");
		posicion = scan.nextInt(); 
		
		ultimo = a[a.length-1];
		for(int i=longitud-2; i>=posicion; i--) {
			a[i+1] = a[i];
		}
		int[]b = new int[a.length+1];
		System.arraycopy(a, 0, b, 0, a.length);
		b[posicion] = elemento;
		b[b.length-1] = ultimo;
		
		System.out.println("El arreglo: ");
		
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i] + " ");
		}
	}
}
