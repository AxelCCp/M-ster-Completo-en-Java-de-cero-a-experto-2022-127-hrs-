package javamaster.hilos.main;

//CLASE 260
//2.-EL CONSTRUCTOR RECIBE UN OBJETO RUNABLE Y EL NOMBRE DEL HILO.
//3.-CON Thread.currentThread().getName() : SE ACCEDE AL NOMBRE QUE SE LE DIÓ AL THREAD POR PARAMETRO AL CONSTRUCTOR DE THREAD.
//4.-CON PROGRAMACIÓN FUNCIONAL.
public class A3_260_MainExtenderRunnableConProgFuncional {
	
	public static void main(String[] args) {
		
		
		//1               //4
		Runnable viaje = ()->{
				
				for(int i=0; i<10;i++) {					//3
					System.out.println(i + " " + Thread.currentThread().getName());
					try {
						Thread.sleep((long)(Math.random() * 1000L));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Finalmente me voy de viaje a ... " + Thread.currentThread().getName());
			};	
	
		
		//2
		new Thread(viaje,"Isla de Pascua").start();
		new Thread(viaje,"Robbinson Crusoe").start();
		new Thread(viaje,"Juan Fernandez").start();
		new Thread(viaje,"Isla de Chiloe").start();
	}
	
}
