package javamaster.main;

import java.util.stream.Stream;
import javamaster.model.Usuario;

//CLASE 286


public class A5_286_StreamMapUsuarioFilterAnyMatch {

	public static void main(String[] args) {
		

	
		
		System.out.println("--------DEVUELVE TRUE O FALSE SI ES Q ENCONTRÓ EL REGISTRO--------");
		
		
		boolean existe = Stream
				.of("peras aaaa","manzanas bbbb","sandias cccc","uvas dddd", "uvas eeee")
				.map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
				.peek(System.out::print)
				.anyMatch(u -> u.getId().equals(5));
				
				System.out.println(existe);

		
	}
	
}
