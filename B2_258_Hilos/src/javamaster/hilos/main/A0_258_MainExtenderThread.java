package javamaster.hilos.main;

import javamaster.hilos.thread.NombreThread;


//CLASE 258 
//1.- hilo.start() : SE LEVANTA EL HILO.
//2.-hilo.getState() : MUESTRA EL ESTADO DEL HILO.


public class A0_258_MainExtenderThread {
	
	public static void main(String[] args) {
	
		Thread hilo = new NombreThread("John Doe");
		Thread hilo2 = new NombreThread("Maria");
		Thread hilo3 = new NombreThread("Pepe");
		//2
		System.out.println(hilo.getState());
		//1
		hilo.start();
		hilo2.start();
		hilo3.start();
		System.out.println(hilo.getState());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(hilo.getState());
		
	}
	
}
