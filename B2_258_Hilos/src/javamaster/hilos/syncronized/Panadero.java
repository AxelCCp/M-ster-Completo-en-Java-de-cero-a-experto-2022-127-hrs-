package javamaster.hilos.syncronized;

import java.util.concurrent.ThreadLocalRandom;

//CLASE264
//1.-UN DELAY ENTRE 500 Y 2000 MILISEGUNDOS.

public class Panadero implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10;i++) {
			this.panaderia.hornear("Pan n° : " + i);		
			try {
				//1
				Thread.sleep(ThreadLocalRandom.current().nextInt(500,2000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
	public Panadero(Panaderia panaderia) {
		this.panaderia = panaderia;
	}



	private Panaderia panaderia;
}
