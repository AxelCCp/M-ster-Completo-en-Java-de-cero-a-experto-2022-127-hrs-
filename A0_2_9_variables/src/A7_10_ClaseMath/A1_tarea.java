package A7_10_ClaseMath;


import java.util.Scanner;

public class A1_tarea {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Ingresa el radio de un círculo: ");
		Integer radio = scan.nextInt();
		double area = Math.pow(radio, 2) * Math.PI;
		System.out.println("Area del circulo con radio " + radio + " es: "  + area);
		
	}
}
