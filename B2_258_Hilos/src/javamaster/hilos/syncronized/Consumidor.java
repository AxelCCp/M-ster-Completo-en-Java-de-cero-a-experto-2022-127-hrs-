package javamaster.hilos.syncronized;

public class Consumidor implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			panaderia.consumir();
		}
		
	}
	
	
	public Consumidor(Panaderia panaderia) {
		super();
		this.panaderia = panaderia;
	}


	private Panaderia panaderia;
}
