package javamaster.hilos.main;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//CLASE 272
//1.-TAMAÑO DEL POOL.
//2.-TAREA CON DELAY DE 0 MILISEGUNDOS.
//3.-SE APAGA EL EXECUTOR.

public class B5_272_TareasProgramadas_con_ScheduledExecutorService {
	public static void main(String[] args) {
																		//1
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
		System.out.println("Alguna tarea en el main ...");
		//2
		executor.schedule(()->{
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hola mundo tarea...");
		},0,TimeUnit.MILLISECONDS);
		System.out.println("Alguna otra tarea en el main...");
		//3
		executor.shutdown();
	}
}
