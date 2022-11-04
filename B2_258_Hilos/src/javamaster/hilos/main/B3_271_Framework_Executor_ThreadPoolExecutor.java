package javamaster.hilos.main;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

//CLASE 271
//ThreadPoolExecutor : RECIBE POR PARÁMENTRO: 
	//TAMAÑO DE POOL, 
	//UN TAMAÑO MÁXIMO Q PUDIERA TENER EL POOL AL AMPLIARLO,
	//TIEMPO ANTES DE ELIMINAR LOS POOL QUE SE AÑADIERON, CUANDO ESTOS YA NO SE ESTÁN USANDO.

public class B3_271_Framework_Executor_ThreadPoolExecutor {
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
												
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
		
		System.out.println("Tamaño del pool: " + executor.getPoolSize());
		System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());
		
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
		
		System.out.println("Tamaño del pool: " + executor.getPoolSize());
		System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());
		
		executor.shutdown();
		
		System.out.println("----CONTINUANDO CON LA EJECUCIÓN DEL MAIN-----1");
		
		//System.out.println(resultado.isDone());//2
		
		while(!resultado.isDone() && !resultado2.isDone() && !resultado3.isDone()) {
			System.out.println(String.format("resultado1: %s - resultado2: %s - resultado3: %s", resultado.isDone()?"Finalizó":"En proceso",
																								 resultado2.isDone()?"Finalizó":"En proceso",
																								 resultado3.isDone()?"Finalizó":"En proceso"));
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
