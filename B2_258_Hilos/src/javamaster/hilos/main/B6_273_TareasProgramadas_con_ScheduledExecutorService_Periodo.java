package javamaster.hilos.main;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

//CLASE 273
//1.-PARA TAREAS QUE SE REPITEN DENTRO DE UN INTERVALO DE TIEMPO PREDEFINIDO.
//2.-COMIENZA CON UN DELAY DE 1 SEGUNDO Y SE VA EJECUTANDO LA TAREA CADA 2 SEGUNDOS.
//3.-PARA QUE LAS TAREAS SE EJECUTEN DURANTE LOS SEGUNDOS DETERMINADOS.
//4.-TAMBN SE PUEDE USAR UN CONTADOR REGRESIVO Q CUENTA LA CANTIDAD DE TAREAS. ES UN BLOQUEADOR.
	//4.1.-VA DESCONTANDO.
	//4.2.-HASTA Q LLEGUE A 0 Y BLOQUEA EL THREAD.
//5.-PARA CANCELAR LA TAREA ANTES DE APAGAR EL EXECUTOR. SE OBTIENE FUTURE Y DESPUÉS SE CANCELA LA TAREA(5.2.-).
//6.-TAMBN SE PUEDE USAR ATOMIC INTEGER EN VEZ DEL LOCK. VE EL FINAL DE LA 273.
public class B6_273_TareasProgramadas_con_ScheduledExecutorService_Periodo {
	public static void main(String[] args) throws InterruptedException {
																		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
		System.out.println("Alguna tarea en el main ...");
		
		//4
		CountDownLatch lock = new CountDownLatch(5);
		
		//5					//1  
		Future<?>future = executor.scheduleAtFixedRate(()->{
			try {
				
				TimeUnit.MILLISECONDS.sleep(1000);
				lock.countDown();//4.1
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Hola mundo tarea...");
			//2
		},1000,2000,TimeUnit.MILLISECONDS);
		
		lock.await();//4.2
		
		future.cancel(true);//5.2
		
		//3
		//TimeUnit.SECONDS.sleep(10);
		
		System.out.println("Alguna otra tarea en el main...");
		
		executor.shutdown();
	}
}
