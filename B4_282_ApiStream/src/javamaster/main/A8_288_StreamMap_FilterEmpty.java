package javamaster.main;

import java.util.stream.Stream;

//CLASE 288
//FILTRA LOS NOMBRES VACÍOS Y QUE ENTREGUE LA CANTIDAD.

public class A8_288_StreamMap_FilterEmpty {

	public static void main(String[] args) {
		
		System.out.println("----------------");
		
		 long count = Stream
				.of("peras aaaa", "", "uvas dddd","", "uvas dddd", "uvas eeee")
				.filter(n -> n.isEmpty())
				.peek(System.out::println)
				.count();
		 System.out.println(count);
	
	}
}
