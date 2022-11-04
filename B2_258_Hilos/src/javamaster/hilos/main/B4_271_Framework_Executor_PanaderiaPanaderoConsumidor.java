package javamaster.hilos.main;


import java.util.concurrent.ExecutionException;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import java.util.concurrent.TimeoutException;

import javamaster.hilos.syncronized.Consumidor;
import javamaster.hilos.syncronized.Panaderia;
import javamaster.hilos.syncronized.Panadero;

//CLASE 271
//ThreadPoolExecutor : RECIBE POR PAR�MENTRO: 
	//TAMA�O DE POOL, 
	//UN TAMA�O M�XIMO Q PUDIERA TENER EL POOL AL AMPLIARLO,
	//TIEMPO ANTES DE ELIMINAR LOS POOL QUE SE A�ADIERON, CUANDO ESTOS YA NO SE EST�N USANDO.

//ESTE ES EL MISMO EJEMPLO DE LA CLASE A6_264, PERO CON EXECUTOR.

public class B4_271_Framework_Executor_PanaderiaPanaderoConsumidor {
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
												
		
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		
		System.out.println("Tama�o del pool: " + executor.getPoolSize());
		System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());
		
		Panaderia p = new Panaderia();
		Runnable productor = new Panadero(p);
		Runnable consumidor = new Consumidor(p);
		Future<?> futuro1 = executor.submit(productor);
		Future<?> futuro2 = executor.submit(consumidor);
		
		System.out.println("Tama�o del pool: " + executor.getPoolSize());
		System.out.println("Cantidad de tareas en cola: " + executor.getQueue().size());
		
		executor.shutdown();
		
		System.out.println("----CONTINUANDO CON LA EJECUCI�N DEL MAIN-----1");
		
	
		
	}
}
