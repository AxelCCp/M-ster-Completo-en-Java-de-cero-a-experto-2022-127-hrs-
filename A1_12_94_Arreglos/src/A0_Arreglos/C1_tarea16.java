package A0_Arreglos;

import java.util.Scanner;

/*
   Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9). Escriba un programa que imprima el número
   que tiene más ocurrencias en el arreglo y también imprimir la cantidad de veces que aparece en el arreglo.
   Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
   Como resultado debería imprimir lo siguiente:
   La mayor ocurrencias es: 3 
   El elemento que mas se repite es: 5
   En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.
   */
public class C1_tarea16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[]a = new int[7];
		int[]b = new int[7];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("ingresa num entre 1 y 9: ");
				a[i] = scan.nextInt();
		}
		System.out.println();
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int cont1 = 1;
		int indice = 0;
		System.arraycopy(a, 0, b, 0, a.length);
		for(int i=0;i<a.length;i++) {
			if(a[indice] == b[i]) {
				cont1++;
				if(i == 6) {
					indice++;
				}
			}
	
			System.out.println(a[i] + " aparece: " + cont1);
		}
	}
}
