package javamaster.hilos.main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//CLASE 268
//EXECUTOR : ES UN FRAMEWORK PARTE DEL JDK. PERMITE EJECUTAR TAREAS SINCRONAS Y CONCURRENTES. PERO DESACOPLANDO LA CREACIÓN  DE LOS THREADS. 
//..NO HAY Q ESTAR PREOCUPADO DE CREAR INSTANCIAS DE LOS THREADS. SOLO HAY Q IMPLEMENTAR LAS TAREAS Y ASIGNARLAS AL EXECUTOR. EL EXECUTOR..
//..CREA LOS THREAD, LOS MANEJA, REUTILIZA HILOS DISPONIBLES, OPTIMIZA, MENEJA UN PULL DE THREADS. 

//*EXECUTOR : EJECUTA UNA TAREA CON EL MÉTODO EXECUTE().
//*EXECUTOR SERVICE : ADEMÁS DE EJECUTAR UNA TAREA, PERMITE HACER UN SEGUIMIENTO. ES EL TIPO DE LA INTERFAZ. TAMBN SE PODRÍA USAR EL TIPO CONCRETO.

//1.-CREA UN HILO
//2.-ALTERNATIVA AL THREAD.SLEEP()
//3.-INTERRUMPE EL HILO POR SI ES Q SE DETIENE EL EXECUTOR. ASÍ LIBERA UN HILO PARA EL EXECUTOR.
//4.-ENVÍA LA TAREA. LA REGISTRA.
//5.-FINALIZA EL EXECUTOR UNA VEZ QUE TERMINAN TODAS LAS TAREAS QUE SE ESTÁN EJECUTANDO Y Q QUEDAN POR EJECUTAR.
//6.-executor.awaitTermination(2, TimeUnit.SECONDS) : ESPERA A QUE SE TERMINEN TODAS LA TAREAS PARA FINALIZAR EL EXECUTOR Y CONTINUAR CON EL FLUJO DEL MÉTOD MAIN. SE LE PASA UN TIMEOUT DE 2 SEG.
//7
public class A9_268_Framework_Executor {
	public static void main(String[] args) {
												//1
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Runnable tarea = ()-> {
			System.out.println("Inicio de la tarea...");
			//2
			try {
				System.out.println("Nombre del thread: " + Thread.currentThread().getName());
				TimeUnit.SECONDS.sleep(1L);
			} catch (InterruptedException e) {
				//3
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}
			System.out.println("Finaliza la tarea...");
		};
		
		executor.submit(tarea);//4
		executor.shutdown();//5
		
		System.out.println("----CONTINUANDO CON LA EJECUCIÓN DEL MAIN-----1");
		
		
		try {
			executor.awaitTermination(2, TimeUnit.SECONDS);//6
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("----CONTINUANDO CON LA EJECUCIÓN DEL MAIN-----2");		
		
	}
}
