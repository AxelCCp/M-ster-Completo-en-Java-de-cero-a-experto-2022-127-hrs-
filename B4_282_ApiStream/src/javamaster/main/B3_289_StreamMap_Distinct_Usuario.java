package javamaster.main;

import java.util.stream.Stream;
import javamaster.model.Usuario;

//CLASE 289
//USANDO EL DISTINCT CON OBJ'S. PARA ESTO SE IMPLEMENTA EL EQUALS EN LA CLASE USUARIOS.

public class B3_289_StreamMap_Distinct_Usuario {

	public static void main(String[] args) {
		
		System.out.println("----------------");
		
		Stream<Usuario>nombres = Stream
				.of("peras aaaa","manzanas bbbb","sandias cccc","uvas dddd", "uvas eeee", "peras aaaa")
				//.distinct()
				.map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
				.distinct();

					
		nombres.forEach(System.out::println);
	}
	
}
