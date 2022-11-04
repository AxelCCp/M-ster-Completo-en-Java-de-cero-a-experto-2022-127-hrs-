package javamaster.hilos.syncronized;

//CLASE 263

public class Panaderia {

	public synchronized void hornear(String masa) {
		while(disponible==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.pan = masa;
		System.out.println("Panadero hornea: " + this.pan);
		this.disponible = true;
		notify();
	}
	
	public synchronized String consumir() {
		while(disponible==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Cliente consume: " + this.pan);
		this.disponible = false;
		notify();
		return pan;
	}
	
	
	
	private String pan;
	private boolean disponible = false;
}
