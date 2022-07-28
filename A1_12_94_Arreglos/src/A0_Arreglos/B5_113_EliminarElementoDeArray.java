package A0_Arreglos;

import java.util.Scanner;

public class B5_113_EliminarElementoDeArray {
	public static void main(String[] args) {
		int[]a = new int[10];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<a.length; i++) {
			System.out.print("Ingresa un número: ");
			a[i] = scan.nextInt();
			
		}
		System.out.println();
		System.out.println("Ingresa una posición a eliminar: ");
		int posicion = scan.nextInt();
		
		for(int i=posicion;i<a.length-1; i++) {
			//EN LA POSICION ACTUAL SE DEJA LA POSICIÓN SIGUIENTE.
			a[i] = a[i+1];
		}
		System.out.println("ARRAY A[]");
		for(int i=0; i<a.length; i++) {
			System.out.println(i + " => " + a[i]);
		}
		//SE COPIA EL ARRAY CON ARRAY COPY EN ARRAY B
		int[]b = new int[a.length-1];
		System.arraycopy(a, 0, b, 0, b.length);
		
		System.out.println("NUEVO ARRAY B[]");
		for(int i=0; i<b.length;i++) {
			System.out.println(i + " => " + b[i]);
		}
		
		
		
	}
}
