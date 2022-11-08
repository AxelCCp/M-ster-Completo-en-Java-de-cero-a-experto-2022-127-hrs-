package javamaster.main;

import java.util.Optional;

public class A0_296_Optional {
	public static void main(String[] args) {
		
		String nombre = "andres";
		Optional<String>opt = Optional.of(nombre);
		System.out.println(opt);
		System.out.println(opt.isPresent());
		if(opt.isPresent()) {
			System.out.println(opt.get());
		}
		System.out.println(opt.isEmpty());
		
		opt.ifPresent(valor -> System.out.println("Hola " + valor));
		
		nombre = null;
		
		//opt = Optional.of(nombre);											//DA ERROR DE NULL POINTER EXCEPTION.
		opt = Optional.ofNullable(nombre);   									//SE EVITA EL ERROR DE NULL POINTER EXCEPTION.
		
		System.out.println("opt : " + opt);
		
		opt.ifPresent(valor -> System.out.println("Hola " + valor));
		
		opt.ifPresentOrElse(valor -> System.out.println("Hola " + valor), () -> System.out.println("No está presente"));
	
		//...CREA UN OPTIONAL VACÍO...
		
		Optional<String>optEmpty = Optional.empty();
		System.out.println("optEmpty : " + optEmpty);
		System.out.println(optEmpty.isPresent());
	}
}
