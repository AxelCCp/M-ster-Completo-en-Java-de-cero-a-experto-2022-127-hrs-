package javamaster.hilos.runnable;

public class ViajeTarea implements Runnable {

	@Override
	public void run() {

		for(int i=0; i<10;i++) {
			System.out.println(i + " " + nombre);
			try {
				Thread.sleep((long)(Math.random() * 1000L));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Finalmente me voy de viaje a ... " + nombre);
		
	}
	public ViajeTarea(String nombre) {
		super();
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}

	private String nombre;
	
}
