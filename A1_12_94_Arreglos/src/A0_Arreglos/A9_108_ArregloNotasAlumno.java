package A0_Arreglos;

import java.util.Scanner;

public class A9_108_ArregloNotasAlumno {
	public static void main(String[] args) {
		double[]claseMatematicas, claseHistoria, claseLenguaje;
		int sumNotasMatematicas=0, sumNotasHistoria=0, sumNotasLenguaje=0;
		claseMatematicas = new double[7]; 
		claseHistoria = new double[7]; 
		claseLenguaje = new double[7]; 
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Ingresa 7 notas de estudiantes para Matemáticas: ");
		for(int i=0; i<claseMatematicas.length; i++) {
			claseMatematicas[i] = scan.nextDouble();
		}
		System.out.println("Ingresa 7 notas de estudiantes para Historia: ");
		for(int i=0; i<claseHistoria.length; i++) {
			claseHistoria[i] = scan.nextDouble();
			
		}
		System.out.println("Ingresa 7 notas de estudiantes para Lenguaje: ");
		for(int i=0; i<claseLenguaje.length; i++) {
			claseLenguaje[i] = scan.nextDouble();
			
		}
		for(int i=0;i<7;i++) {
			sumNotasMatematicas += claseMatematicas[i];
			sumNotasHistoria += claseHistoria[i];
			sumNotasLenguaje += claseLenguaje[i];
		}
		double promedioMatematicas = sumNotasMatematicas/claseMatematicas.length;
		double promedioHistoria = sumNotasHistoria/claseHistoria.length;
		double promedioLenguaje = sumNotasLenguaje/claseLenguaje.length;
		double promedioGeneral = (promedioMatematicas + promedioHistoria + promedioLenguaje) / 3; 
		System.out.println("Promedio matematicas: " + promedioMatematicas);
		System.out.println("Promedio historia: " + promedioHistoria);
		System.out.println("Promedio lenguaje: " + promedioLenguaje);
		System.out.println("Promedio general: " + promedioGeneral);
		
		
	}
}
