package A3_4_operadores;

import java.util.Scanner;

public class A9_47_OperadorTernarioNumeroMayor {

	public static void main(String[] args) {
		
		
		int max = 0;
		Scanner s = new Scanner (System.in);
		
		System.out.println("ingresa un número");
		int num1 = s.nextInt();
		System.out.println("ingresa otro número");
		int num2 = s.nextInt();
		System.out.println("ingresa otro número mas");
		int num3 = s.nextInt();
		
		//SE CALCULA EN NUM MAYOR DE LOS 3
		
		max = (num1>num2)?num1:num2;
		max = (max>num3)?max:num3;
		
		System.out.println(max);
	}
	
}
