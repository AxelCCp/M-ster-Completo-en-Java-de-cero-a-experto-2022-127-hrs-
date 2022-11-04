package javamaster.hilos.main;

//CLASE 260
//2.-EL CONSTRUCTOR RECIBE UN OBJETO RUNABLE Y EL NOMBRE DEL HILO.
//3.-CON Thread.currentThread().getName() : SE ACCEDE AL NOMBRE QUE SE LE DIÓ AL THREAD POR PARAMETRO AL CONSTRUCTOR DE THREAD.
//4.-CON PROGRAMACIÓN FUNCIONAL.
//CLASE 261
//5.-EL SLEEP() CREA UNA PAUSA EN EL HILO DEL MAIN.
//6.-EL JOIN() ESPERA A QUE SE FINALICEN LOS THREAD PARA SEGUIR CON EL PROSESO. EL JOIN UNE EL THREAD QUE HEMOS CREADO CON EL THREAD DEL MAIN.
//7.-PARA IMPRIMIR EL ESTADO DEL MÉTODO MAIN.
public class A4_261_Main_Join_VS_Sleep {
	public static void main(String[] args) throws InterruptedException {
		
		Thread main = Thread.currentThread();
		
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
				System.out.println("MAIN :::: " + main.getState());
			};	
		//2
		new Thread(viaje,"Isla de Pascua").start();
		new Thread(viaje,"Robbinson Crusoe").start();
		new Thread(viaje,"Juan Fernandez").start();
		new Thread(viaje,"Isla de Chiloe").start();
		
		//5
		Thread.sleep(8000);
		
		System.out.println("------ CONTINUANDO CON LA EJECUCIÓN DEL MAIN 1------ " + main.getName());
		
		//6
		System.out.println("------ JOIN ------");
		
		Thread v1 = new Thread(viaje,"Tierra del fuego");
		Thread v2 = new Thread(viaje,"Antártida");
		Thread v3 = new Thread(viaje,"Atacama");
		Thread v4 = new Thread(viaje,"Campo Hielo Sur");
		v1.start();
		v2.start();
		v3.start();
		v4.start();
		v1.join();
		v2.join();
		v3.join();
		v4.join();
		
		System.out.println("------ CONTINUANDO CON LA EJECUCIÓN DEL MAIN 2------ " + main.getName() + " " + main.getState());
	}
	
	
}
