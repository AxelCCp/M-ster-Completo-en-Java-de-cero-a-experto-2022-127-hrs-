package javamaster.hilos.runnable;

import javamaster.hilos.main.A5_262_SincronizacionDeHilos;

public class ImprimirFrases implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			A5_262_SincronizacionDeHilos.imprimirFrases(this.frase1, this.frase2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public ImprimirFrases(String frase1, String frase2) {
		super();
		this.frase1 = frase1;
		this.frase2 = frase2;
	}



	private String frase1,frase2;
}
