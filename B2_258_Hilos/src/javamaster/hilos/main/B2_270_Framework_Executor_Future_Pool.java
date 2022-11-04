package javamaster.hilos.main;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

//CLASE 270
//1.-SE USA UN POOL CON 3 TAREAS.CON ESTO SE VAN A EJECUTAR AL MISMO TIEMPO. SI SE LE PONE UN 2,  LA TERCERA TAREA QUEDA EN COLA, A LA ESPERA DE Q TERMINEN LAS TAREAS 1 Y 2.

public class B2_270_Framework_Executor_Future_Pool {
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
												
		//ExecutorService executor = Executors.newSingleThreadExecutor();
		//1
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		Callable<String>tarea = ()-> {
			System.out.println("Inicio de la tarea...");
			
			try {
				System.out.println("Nombre del thread: " + Thread.currentThread().getName());
				TimeUnit.SECONDS.sleep(3L);
			} catch (InterruptedException e) {
				
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
			System.out.println("Finaliza la tarea...");
			return "Tarea 100% complete";
		};
		
		Callable<Integer>tarea2 = ()-> {
			System.out.println("Iniciando tarea 3...");
			TimeUnit.SECONDS.sleep(3);
			return 10;
		};
		
		
		Future<String> resultado = executor.submit(tarea);
		Future<String> resultado2 = executor.submit(tarea);
		Future<Integer> resultado3 = executor.submit(tarea2);
		executor.shutdown();
		
		System.out.println("----CONTINUANDO CON LA EJECUCI�N DEL MAIN-----1");
		
		//System.out.println(resultado.isDone());//2
		
		while(!resultado.isDone() && !resultado2.isDone() && !resultado3.isDone()) {
			System.out.println(String.format("resultado1: %s - resultado2: %s - resultado3: %s", resultado.isDone()?"Finaliz�":"En proceso",
																								 resultado2.isDone()?"Finaliz�":"En proceso",
																								 resultado3.isDone()?"Finaliz�":"En proceso"));
			TimeUnit.MILLISECONDS.sleep(1000L);
		}
		
		
		System.out.println("Obtenemos el resultado de la tarea1: " + resultado.get());
		System.out.println("Finaliza la tarea1: " + resultado.isDone());
		
		System.out.println("Obtenemos el resultado de la tarea2: " + resultado2.get());
		System.out.println("Finaliza la tarea2: " + resultado2.isDone());
		
		System.out.println("Obtenemos el resultado de la tarea3: " + resultado3.get());
		System.out.println("Finaliza la tarea3: " + resultado3.isDone());
		
	}
}
