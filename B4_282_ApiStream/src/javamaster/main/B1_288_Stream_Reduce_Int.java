package javamaster.main;

import java.util.stream.Stream;


//CLASE 288
//SUMA LOS ELEMENTOS DEL STREAM.

public class B1_288_Stream_Reduce_Int {

	public static void main(String[] args) {
		
		Stream<Integer>nombres = Stream.of(12,34,65,34,67,64);

		//int resultado = nombres.reduce(0, (a,b) -> a + b);
		//int resultado = nombres.reduce(0, (a,b) -> Integer.sum(a, b));
		int resultado = nombres.reduce(0, Integer::sum);

		System.out.println(resultado);
				
	}
	
}
