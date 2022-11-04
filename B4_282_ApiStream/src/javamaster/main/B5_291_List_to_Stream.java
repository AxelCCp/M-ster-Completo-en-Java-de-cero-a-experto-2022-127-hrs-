package javamaster.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javamaster.model.Usuario;

public class B5_291_List_to_Stream {
	public static void main(String[] args) {
		
		List<Usuario>lista = new ArrayList<>();
		lista.add(new Usuario("aaa","bbbb"));
		lista.add(new Usuario("ccc","dddd"));
		lista.add(new Usuario("eeee","ffff"));
		lista.add(new Usuario("ggg","hhhh"));
		Stream<String>nombres = lista.stream()
			.map(u -> u.getNombre().toUpperCase().concat(" ").concat(u.getApellido().toUpperCase()))
			.flatMap(nombre -> {
				if(nombre.contains("ccc".toUpperCase())) {
					return Stream.of(nombre);
				}
				return Stream.empty();
			})
			.map(nombre -> nombre.toLowerCase())
			.peek(System.out::println);
		System.out.println(nombres.count());
	}
}
