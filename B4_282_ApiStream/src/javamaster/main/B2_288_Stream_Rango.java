package javamaster.main;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

//CLASE 288
//SE USA INT STREAM, YA Q ESTE TIENE EL MÉTODO RANGE. RANGE CREA UNA FLUJO ENTRE UN RANGO DE ENTEROS
//1.-SIRVE PARA OBTENER ESTADÍSTICAS DE LOS NÚMEROS.
public class B2_288_Stream_Rango {

	public static void main(String[] args) {
		
		//IntStream nums = IntStream.range(12,64)						//incluye del 12 al 63
		IntStream nums = IntStream.rangeClosed(12,64)						//incluye del 12 al 64
		.peek(System.out::println);
	
		//int resultado = nums.reduce(0, Integer::sum);
		//int resultado = nums.sum();
		//System.out.println(resultado);
		
		//1
		IntSummaryStatistics stats = nums.summaryStatistics();
		System.out.println("max: " + stats.getMax());
		System.out.println("min: " + stats.getMin());
		System.out.println("suma: " + stats.getSum());
		System.out.println("promedio: " + stats.getAverage());
		System.out.println("total: " + stats.getCount());
		
		
				
	}
	
}
