package javamaster.lambda.main;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import javamaster.lambda.model.Usuario;

//CLASE 275
//1.-CONSUMER ES UNA EXPRESI�N LAMBDA Q PERMITE PASAR POR ARGUMENTO UN SOLO PAR�METRO QUE DEBE SER DEL TIPO DEL GEN�RICO.
//CONSUMER RECIBE CUALQUIER TIPO DE DATOS POS PAR�METRO Y DESPU�S SE PUEDE HACER CUALQUIER WEA CON ESO.

public class A0_275_Consumer {
	public static void main(String[] args) {
		Consumer<Date>consumidor = (fecha) -> {
			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(f.format(fecha));
		};
		consumidor.accept(new Date());
		
		System.out.println(""); //------------------------------------------------
		
		BiConsumer<String,Integer>consumidorBi = (nombre,edad) -> {
			System.out.println(nombre + " tiene " + edad + " a�os");
		};
		consumidorBi.accept("Boo", 14);
		
		System.out.println(""); //------------------------------------------------
		
		//CLASE 276...
		Consumer<String>consumidor2 = (mensaje) -> {
			System.out.println(mensaje);
		};
		consumidor2.accept("Hola mundo lambda");
		
		System.out.println(""); //------------------------------------------------
		
		List<String>nombres = Arrays.asList("andres","pepe","luz","paco");
		nombres.forEach(consumidor2);
		
		System.out.println(""); //------------------------------------------------
		
		Usuario usuario = new Usuario();
		BiConsumer<Usuario,String>asignarNombre = (persona,nombre) -> {
			persona.setNombre(nombre);
		};
		asignarNombre.accept(usuario, "Andr�s");
		System.out.println("Nombre usuario: " + usuario.getNombre());
		
		System.out.println(""); //------------------------------------------------
		
		Supplier<String>proveedor = () -> {
			return "Hola mundo lambda supplier";
		};
		System.out.println(proveedor.get());
		
		System.out.println(""); //------------------------------------------------
		
		//Supplier<Usuario>creaUsuario = ()-> new Usuario();
		Supplier<Usuario>creaUsuario = Usuario::new;
		Usuario usuario2 = creaUsuario.get();
		asignarNombre.accept(usuario2, "xxx");
		System.out.println("Nombre usuario 2 : " + usuario2.getNombre());
		
	}
}
