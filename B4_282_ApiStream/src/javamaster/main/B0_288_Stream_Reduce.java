package javamaster.main;

import java.util.stream.Stream;


//CLASE 288
//TODOS LOS STRING LOS REDUCE A UN STRING SEPARADO POR COMAS.
public class B0_288_Stream_Reduce {

	public static void main(String[] args) {
		
		Stream<String>nombres = Stream.of("peras aaaa","manzanas bbbb","sandias cccc","uvas aaaa", "uvas aaaa", "uvas iiii", "uvas oooo", "uvas uuuu")
				.distinct();
		//String resultado = nombres.reduce("", (a,b) -> a + ", " + b);
		String resultado2 = nombres.reduce("String concatenado: ", (a,b) -> a + " # " + b);

		//System.out.println(resultado);
		System.out.println(resultado2);
				
	}
	
}
