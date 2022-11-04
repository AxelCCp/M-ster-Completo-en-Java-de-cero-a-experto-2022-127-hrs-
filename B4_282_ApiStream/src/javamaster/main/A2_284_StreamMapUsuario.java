package javamaster.main;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javamaster.model.Usuario;

public class A2_284_StreamMapUsuario {

	public static void main(String[] args) {
		
		System.out.println("-----------SE PASA LA LISTA AL TIPO USUARIOS-----");
		
		Stream<?>nombres = Stream
				.of("peras aaaa","manzanas bbbb","sandias cccc","uvas dddd")
				.map(String::toUpperCase)
				.map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
				.peek(System.out::println)
				.map(u-> {
					String nombre = u.getNombre().toLowerCase();
					String apellido = u.getApellido().toLowerCase();
					u.setNombre(nombre);
					u.setApellido(apellido);
					return u;
				});
		
		@SuppressWarnings("unchecked")
		List<Usuario>lista = (List<Usuario>) nombres.collect(Collectors.toList());
		lista.forEach(System.out::println);	
	
	}
	
}
