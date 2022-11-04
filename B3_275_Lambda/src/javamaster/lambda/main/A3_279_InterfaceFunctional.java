package javamaster.lambda.main;

import javamaster.lambda.aritmetica.Aritmetica;
import javamaster.lambda.aritmetica.Calculadora;

public class A3_279_InterfaceFunctional {
	public static void main(String[] args) {
		Aritmetica suma = (a,b) -> a + b;
		Aritmetica resta = (a,b) -> a - b;
		Aritmetica mult = (a,b) -> a * b;
		Aritmetica div = (a,b) -> a / b;
		
		Calculadora cal = new Calculadora();
		System.out.println(cal.computar(10, 5, div));
	}
}
