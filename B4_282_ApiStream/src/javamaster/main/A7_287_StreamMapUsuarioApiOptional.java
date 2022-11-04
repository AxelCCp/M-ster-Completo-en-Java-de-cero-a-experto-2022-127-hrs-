package javamaster.main;


import java.util.Optional;
import java.util.stream.Stream;
import javamaster.model.Usuario;

//CLASE 287
//1.-SI NO LO ENCUENTRA, DEVUELVE A JOHN DOE.
//2.-TAMBN PUEDE DEVOLVER NULL.
//3.-DA EL MISMO RESULTADO Q EN EL "1" PERO USA LAMBDA.
//4.-SINO LO ENCUENTRA, LANZA UNA EXCEPTION.
//5.-PARA EVITAR EL NULL, TAMBN SE PUEDE USAR EL IF()

public class A7_287_StreamMapUsuarioApiOptional {

	public static void main(String[] args) {
		
		System.out.println("----------------");
		
		Stream<?>nombres = Stream
				.of("peras aaaa","manzanas bbbb","sandias cccc","uvas dddd", "uvas eeee")
				.map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
				.filter(u -> u.getNombre().equals("uvassssss"))
				.peek(System.out::println);
					
		@SuppressWarnings("unchecked")
		Optional<Usuario>usuario =  (Optional<Usuario>) nombres.findFirst();
		//1
		//System.out.println(usuario.orElse(new Usuario("John","Doe")));	
		//2
		//System.out.println(usuario.orElse(null));	
		//3
		//System.out.println(usuario.orElseGet(() -> new Usuario("John","Doe")));	
		//4
		//System.out.println(usuario.orElseThrow());	
		//5
		if(usuario.isPresent()) {
			System.out.println(usuario.get());	
		}else {
			System.out.println("No se encontró el obj");
		}
	}
}
