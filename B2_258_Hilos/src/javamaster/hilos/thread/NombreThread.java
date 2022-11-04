package javamaster.hilos.thread;

public class NombreThread extends Thread{
	
	public NombreThread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Se inicia el método run del hilo: " + getName());
		
		
		//ALGÚN PROCESO DEL HILO
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getName());
		}
		
		
		System.out.println("Finaliza el hilo.");
	}
	
}
