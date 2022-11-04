package javamaster.main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import javamaster.model.Usuario;

//1.-SE TOMA EL TIEMPO.
//2.-CUANDO EL PROCESAMIENTO DE LOS DATOS TOMA TIEMPO, SE PUEDE USAR PARALLEL, PARA QUE LOS ELEMENTOS DEL STREAM SE EJECUTEN EN DIFERENTES HILOS.
//3.-SE RASTREAN LOS NOMBRES Y EL HILO Q LO PROCESÓ.

public class B8_294_Operador_Parallel {
	public static void main(String[] args) {
		
		List<Usuario>lista = new ArrayList<>();
		lista.add(new Usuario("aaa","bbbb"));
		lista.add(new Usuario("ccc","dddd"));
		lista.add(new Usuario("eeee","ffff"));
		lista.add(new Usuario("ggg","hhhh"));
		
		long t1 = System.currentTimeMillis();					//1
		
		String result = lista.stream()
			.parallel() 										//2
			.map(u -> u.toString().toUpperCase())
			.peek(n -> {
				System.out.println(Thread.currentThread().getName() + " ---> NOMBRE : " + n);  //3
			})							
			.flatMap(nombre -> {
				try {
					TimeUnit.SECONDS.sleep(1L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if(nombre.contains("ccc".toUpperCase())) {
					return Stream.of(nombre);
				}
				return Stream.empty();
			})
			.findAny().orElse("");
		
		long t2 = System.currentTimeMillis();					//1
		System.out.println("Tiempo total: " + (t2-t1));
		
		System.out.println(result);
	}
}
