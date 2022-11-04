package javamaster.hilos.main;

import javamaster.hilos.runnable.ViajeTarea;

//CLASE 259
//1.-CREÓ UN HILO ASÍ. CUANDO SE USA RUNNABLE, SE PASA POR EL CONSTRUCTOR DE THREAD() EL EJECUTABLE. TAMBN SE LE PUEDE PONER DE UNA EL START()
public class A1_259_MainExtenderRunnable {
	
	public static void main(String[] args) {
		
		//1
		new Thread(new ViajeTarea("Isla de Pascua")).start();
		new Thread(new ViajeTarea("Robbinson Crusoe")).start();
		new Thread(new ViajeTarea("Juan Fernandez")).start();
		new Thread(new ViajeTarea("Isla de Chiloe")).start();
	}
	
}
