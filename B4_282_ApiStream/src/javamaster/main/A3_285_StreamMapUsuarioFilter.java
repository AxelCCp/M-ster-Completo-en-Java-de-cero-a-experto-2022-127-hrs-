package javamaster.main;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javamaster.model.Usuario;

//CLASE 285
//filter() : RECIBE UNA LAMBDA DEL TIPO PREDICATE, POR TANTO EVALUA UNA EXPRESIÓN  BOOLEANA Y SI ES TRUE, VA A FILTRAR LOS DATOS. CONVIERTE LOS DATOS A UN NUEVO FLUJO..
//..CON LOS DATOS Q COINCIDAN CON EL FILTRO.

public class A3_285_StreamMapUsuarioFilter {

	public static void main(String[] args) {
		
		System.out.println("-----------SE PASA LA LISTA AL TIPO USUARIOS-----");
		
		Stream<?>nombres = Stream
				.of("peras aaaa","manzanas bbbb","sandias cccc","uvas dddd", "uvas eeee")
				.map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
				.filter(u -> u.getNombre().equals("uvas"))
				.peek(System.out::println);
				
		
		@SuppressWarnings("unchecked")
		List<Usuario>lista = (List<Usuario>) nombres.collect(Collectors.toList());
		lista.forEach(System.out::println);	
	
	}
	
}
