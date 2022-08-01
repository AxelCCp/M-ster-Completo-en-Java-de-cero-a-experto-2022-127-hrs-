package A0_Arreglos;

import java.util.Scanner;

/* Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos. Luego debemos mostrarlos en el siguiente orden: 
 * el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.*/
public class B8_tarea1 {
	public static void main(String[] args) {
		int[]a = new int[10];
		Scanner scan = new Scanner(System.in); 
		int longitud = a.length; 
		for(int i=0;i<10;i++) {
			System.out.println("Ingresa 10 elementos:");
			a[i] = scan.nextInt();
		}
		for(int i=0;i<longitud;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		for(int i=0;i<longitud/2;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
		int contador=0;
		for(int i=(longitud-1)/2;i>=0;i--) {
			System.out.print(a[longitud-1-contador] + " ");
			contador++;
		}
		System.out.println("............");
		int contador2=0;
		for(int i=0;i<longitud/2;i++) {
			System.out.print(a[i] + " ");
			System.out.print(a[longitud-1-contador2] + " ");
			contador2++;
		}	
	}
}
 