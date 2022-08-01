package A0_Arreglos;

import java.util.Scanner;

public class C0_tarea15 {
	public static void main(String[] args) {
		/*Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números positivos, 
		 * el promedio de los negativos y contar el número de ceros.
		 * */
		Scanner scan = new Scanner(System.in);
		int[]a = new int[7];
		for(int i=0;i<a.length;i++) {
			System.out.println("ingresa num: ");
			a[i] = scan.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		int sumapos = 0;
		int sumaneg = 0; 
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>0) {
				sumapos += a[i];
			}else if(a[i]<0){
				sumaneg -= -a[i];
			}
		}
		System.out.println(sumapos);
		System.out.println(sumaneg);
	}
}
