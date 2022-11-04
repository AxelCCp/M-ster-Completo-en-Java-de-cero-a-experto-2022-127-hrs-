package javamaster.lambda.main;

import java.util.function.BiFunction;
import java.util.function.Function;

//RECIBE UN ARGUMENTO POR PARÁMETRO Y DEVUELVE VALOR. ES UNA COMBINACIÓN ENTRE SUPPLIER Y CONSUMER.
//LOS DOS PARÁMETROS VARIABLES Q RECIBE, UNO ES EL TIPO Q RECIBE Y EL OTRO EL TIPO Q DEVUELVE.

public class A1_277_Function {
	public static void main(String[] args) {
		Function<String,String>f1 = param -> {
			return"Hola que tal.. " + param;
		};
		String resultado = f1.apply("andres");
		System.out.println(resultado);
		
		System.out.println(""); //----------------------------------
		
		Function<String,String>f2 = param -> param.toUpperCase();
		System.out.println(f2.apply("andres"));
		
		System.out.println(""); //----------------------------------
		
		BiFunction<String,String,String>f3 = (a,b) -> a.toUpperCase().concat(b.toUpperCase());
		String r2 = f3.apply("Andres", "jose");
		System.out.println(r2);
		
		System.out.println(""); //----------------------------------
		
		BiFunction<String,String,Integer>f4 = (a,b) -> a.compareTo(b);
		System.out.println(f4.apply("andres", "andres"));
		
		System.out.println(""); //----------------------------------
	}
}
