package javamaster.main;

import java.util.stream.Stream;


//CLASE 288
//QUITA LOS ELEMENTOS REPETIDOS.
public class A9_288_Stream_Distinct {

	public static void main(String[] args) {
		
		Stream<String>nombres = Stream.of("peras aaaa","manzanas bbbb","sandias cccc","uvas aaaa", "uvas aaaa", "uvas iiii", "uvas oooo", "uvas uuuu")
				.distinct();
		nombres.forEach(System.out::println);
				
	}
	
}
