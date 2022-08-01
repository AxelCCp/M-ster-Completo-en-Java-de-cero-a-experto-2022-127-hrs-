package A0_Arreglos;

import java.util.Scanner;

public class B9_tarea14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[]a = new int[7];
		for(int i=0;i<a.length;i++) {
			System.out.println("ingresa los números del array");
			a[i] = scan.nextInt();
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<a[max]) {
				max = max; 
			}else {
				max = i;
			}
		}
		System.out.println("\nEl num más alto: " + a[max]);
	}
}
