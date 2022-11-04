package javamaster.hilos.main;

//CLASE 260

//2.-EL CONSTRUCTOR RECIBE UN OBJETO RUNABLE Y EL NOMBRE DEL HILO.
//3.-CON Thread.currentThread().getName() : SE ACCEDE AL NOMBRE QUE SE LE DI� AL THREAD POR PARAMETRO AL CONSTRUCTOR DE THREAD.
public class A2_260_MainExtenderRunnableSinProgFuncional {
	
	public static void main(String[] args) {
		
		
		//1
		Runnable viaje = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i<10;i++) {					//3
					System.out.println(i + " " + Thread.currentThread().getName());
					try {
						Thread.sleep((long)(Math.random() * 1000L));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Finalmente me voy de viaje a ... " + Thread.currentThread().getName());
			}	
		};
		
		//2
		new Thread(viaje,"Isla de Pascua").start();
		new Thread(viaje,"Robbinson Crusoe").start();
		new Thread(viaje,"Juan Fernandez").start();
		new Thread(viaje,"Isla de Chiloe").start();
	}
	
}
