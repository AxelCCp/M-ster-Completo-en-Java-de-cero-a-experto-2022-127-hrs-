package javamaster.hilos.main;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

//CLASE 269
//1.-RESULTADO FUTURO DE LA TAREA. SE ALMACENA LOS Q DEVUELVE EL SUBMIT()
//2.-DEVUELVE BOOLEAN DE SIS ES Q YA TERMINÓ LA TAREA.
//3.-EL GET() : HAY Q TENER CUIDADO PQ BLOQUEA EL THREAD ACTUAL ESPERANDO A Q SE EJECUTE LA TAREA Y DEVUELVA EL VALOR DE LA TAREA.
//4.-EL GET TAMBN RECIBE PARÁMETROS. SI SE DEMORA MÁS DE 5 SEG EN HACER LA TAREA LANZA UNA TIMEOUT EXCEPTION. 

//5.- USA ---- CALLABLE ---- PARA Q LA TAREA REVUELVA UN STRING (EXPLICACIÓN AL FINAL DE LA  269)

public class B0_269_Framework_Executor_Future_Runnable {
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
												
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Runnable tarea = ()-> {
			System.out.println("Inicio de la tarea...");
			
			try {
				System.out.println("Nombre del thread: " + Thread.currentThread().getName());
				TimeUnit.SECONDS.sleep(3L);
			} catch (InterruptedException e) {
				
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
			System.out.println("Finaliza la tarea...");
		};
		
		Future<?> resultado = executor.submit(tarea);
		executor.shutdown();
		
		System.out.println("----CONTINUANDO CON LA EJECUCIÓN DEL MAIN-----1");
		
		//System.out.println(resultado.isDone());//2
		
		while(!resultado.isDone()) {
			System.out.println("ejecutando tarea...");
			TimeUnit.MILLISECONDS.sleep(1500L);
		}
		
		
		System.out.println(resultado.get());//3 ... 									//IMPRIME NULL PQ NO DEVUELVE NADA.
		System.out.println(resultado.get(5,TimeUnit.SECONDS)); //4
		//System.out.println(resultado.isDone());//2
		
		System.out.println("... continuamos ...");
		
	}
}
