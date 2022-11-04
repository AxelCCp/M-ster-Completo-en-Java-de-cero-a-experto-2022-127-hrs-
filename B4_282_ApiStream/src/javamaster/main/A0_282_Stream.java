package javamaster.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//CLASE282
//1.- OF() : RECIBE UN ARREGLO DE VALORES. ESTE RETORNA UN ARRAY Y CON EL STREAM SE PASA A FLUJO.
//2.-SE LE PSA UN <STRING> ANTES DEL BUILDER() Y CON EL BUILD() SE PASA A STREAM. 
//3.-SE CREA STREAM DESDE UNA COLLECTION.

public class A0_282_Stream {
	public static void main(String[] args) {
									//1
		Stream<String>nombres = Stream.of("pera","manzana","sandia","uva");
		nombres.forEach(e -> System.out.println(e));
		
		
		String[]frutas = {"pera","manzana","sandia","uva"};
		Stream<String> f = Arrays.stream(frutas);
		f.forEach(e -> System.out.println(e));
		
		//2
		Stream<String>nombres2 = Stream.<String>builder().add("pera").add("frutilla").add("naranja").add("papaya").build(); 
		nombres2.forEach(e -> System.out.println(e));
		
		//3
		List<String>lista = new ArrayList<>();
		lista.add("a");
		lista.add("e");
		lista.add("i");
		lista.add("o");
		lista.add("u");
		Stream<String>letras = lista.stream();
		letras.forEach(l -> System.out.println(l));
		
		
	}
}
