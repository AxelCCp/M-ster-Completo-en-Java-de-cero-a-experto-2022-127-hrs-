package javamaster.main;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//CLASE283
//peek() : ES UN OPERADOR INTERMEDIO Q SIRVE PARA INSPECCIONAR LOS ELEMENTOS. SE PARECE AL FOR EACH, CON LA DIFERENCIA DE Q NO ES FINAL.

public class A1_283_StreamMap {
	public static void main(String[] args) {
		
		System.out.println("-----------nombres------------");
		
		Stream<String>nombres = Stream.of("pera","manzana","sandia","uva")
				.peek(n -> System.out.println(n))
				.map(nombre -> {
			return nombre.toUpperCase();
		});
		nombres.forEach(n -> System.out.println(n));
		
		System.out.println("-----------nombres2------------");
		
		Stream<String>nombres2 = Stream.of("peras","manzanas","sandias","uvas")
				.map(n -> n.toUpperCase())
				.peek(n -> System.out.println(n))
				.map(n -> {
			return n.toLowerCase();
		});
		nombres2.forEach(n -> System.out.println(n));
	
		System.out.println("-----------nombres3------------");
		
		Stream<String>nombres3 = Stream
				.of("peras","manzanas","sandias","uvas")
				.map(String::toUpperCase)
				.peek(System.out::println)
				.map(String::toLowerCase);
		nombres3.forEach(System.out::println);		
		
	System.out.println("-----------nombres4-------CONVIERTE A LISTA-----");
		
		Stream<String>nombres4 = Stream
				.of("peras","manzanas","sandias","uvas")
				.map(String::toUpperCase)
				.peek(System.out::println)
				.map(String::toLowerCase);
		List<String>lista = nombres4.collect(Collectors.toList());
		lista.forEach(System.out::println);	
		
		
	}
}
