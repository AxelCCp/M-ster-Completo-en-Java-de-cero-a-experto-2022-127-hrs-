package javamaster.main;

import java.util.stream.Stream;
import javamaster.model.Usuario;

//CLASE 286


public class A6_286_StreamMapUsuarioFilterCount {

	public static void main(String[] args) {
		

	
		
		
		System.out.println("-------CUENTA CANTIDAD DE REGISTROS---------");
		
		
		long count = Stream
				.of("peras aaaa","manzanas bbbb","sandias cccc","uvas dddd", "uvas eeee")
				.map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
				.peek(System.out::print)
				.count();
				
				System.out.println(count);

		

		
	}
	
}
