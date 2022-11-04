package javamaster.main;


import java.util.Optional;
import java.util.stream.Stream;
import javamaster.model.Usuario;

//CLASE 285
//filter() : RECIBE UNA LAMBDA DEL TIPO PREDICATE, POR TANTO EVALUA UNA EXPRESIÓN  BOOLEANA Y SI ES TRUE, VA A FILTRAR LOS DATOS. CONVIERTE LOS DATOS A UN NUEVO FLUJO..
//..CON LOS DATOS Q COINCIDAN CON EL FILTRO.

public class A4_285_StreamMapUsuarioFilterSingle {

	public static void main(String[] args) {
		
//		System.out.println("----------------");
//		
//		Stream<?>nombres = Stream
//				.of("peras aaaa","manzanas bbbb","sandias cccc","uvas dddd", "uvas eeee")
//				.map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
//				.filter(u -> u.getNombre().equals("uvas"))
//				.peek(System.out::println);
//					
//		@SuppressWarnings("unchecked")
//		Optional<Usuario>uOp =  (Optional<Usuario>) nombres.findFirst();
//		System.out.println(uOp.get());	
	
		
		System.out.println("----------------");
		
		
		Usuario usuario = Stream
				.of("peras aaaa","manzanas bbbb","sandias cccc","uvas dddd", "uvas eeee")
				.map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
				.filter(u -> u.getId().equals(2))
				.findFirst().get();
				
				System.out.println(usuario);

		
	}
	
}
