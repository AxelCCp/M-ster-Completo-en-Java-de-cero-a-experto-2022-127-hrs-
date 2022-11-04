package javamaster.main;

import java.util.stream.Stream;

import javamaster.model.Usuario;

//CLASE 290
//EL FLATMAP() RETORNA UN STREAM, MIENTRAS Q EL MAP() RETORNA UN TIPO NORMAL.
//AL FLATMAP ENTRAN UN ELEMENTO QUE ES LA LISTA ... PERO SALEN VARIOS STREAMS. SALIDAS DIFERENTES. Y ESTOS EN AL FINAL SON APLANADOS EN UN SOLO STREAM.

public class B4_290_Stream_flatMap {

	public static void main(String[] args) {
		
		Stream<?>nombres = Stream
				.of("peras aaaa","manzanas bbbb","sandias cccc","uvas dddd", "uvas eeee")
				.map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
				.flatMap(u -> {
					if(u.getNombre().equalsIgnoreCase("manzanas")) {
						return Stream.of(u);
					}return Stream.empty();
					
				})
				.peek(System.out::println);
				
		
		//nombres.forEach(System.out::println);
		System.out.println(nombres.count());
	
	}
	
}
