package javamaster.hilos.main;

import javamaster.hilos.runnable.ImprimirFrases;

//262.- synchronized : CON ESTO CADA HIO VA A INGRESAR AL MÉTODO Y LO VA A USAR EN ORDEN, PARA Q LAS FRASES NO SE DESORDENEN. EL synchronized BLOQUEA LOS HILOS HASTA Q LES LLEGA EL TURNO. TERMINA UN HILO Y PUEDE EMPESAR OTRO.

public class A5_262_SincronizacionDeHilos {
	public static void main(String[] args) throws InterruptedException {
		new Thread(new ImprimirFrases("Hola! ...","que tal!")).start();
		new Thread(new ImprimirFrases("Quién ...","eres tú?")).start();
		Thread.sleep(100);
		Thread f3= new Thread(new ImprimirFrases("muchas ...","gracias amigos!"));
		
		System.out.println(f3.getState());
		
		f3.start();
		Thread.sleep(100);
		System.out.println(f3.getState());	
	}
	           //1
	public synchronized static void imprimirFrases(String frase1, String frase2) throws InterruptedException {
		System.out.print(frase1);
		
		Thread.sleep(500);
		
		System.out.println(frase2);
	}
}
