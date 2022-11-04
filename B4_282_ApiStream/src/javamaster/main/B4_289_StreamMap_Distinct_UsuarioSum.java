package javamaster.main;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javamaster.model.Usuario;

//CLASE 289
//IMPRIME LA CANTIDAD DE CARACTERES DE CADA UNO.

public class B4_289_StreamMap_Distinct_UsuarioSum {

	public static void main(String[] args) {
		
		System.out.println("----------------");
		
		IntStream largoNombres = Stream.of("peras aaaa","manzanas bbbb","sandias cccc","uvas dddd", "uvas eeee", "peras aaaa")
				.map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
				.distinct()
				.mapToInt(u -> u.toString().length())
				.peek(System.out::println);
		System.out.println();		
		//System.out.println(largoNombres.sum());
		IntSummaryStatistics stats = largoNombres.summaryStatistics();
		System.out.println("total " + stats.getSum());
		System.out.println("max " + stats.getMax());
		System.out.println("min " + stats.getMin());
		System.out.println("promedio " + stats.getAverage());
		
	}
	
}
