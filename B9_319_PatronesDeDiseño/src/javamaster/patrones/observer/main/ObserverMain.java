package javamaster.patrones.observer.main;

import javamaster.patrones.observer.Corporacion;

public class ObserverMain {
	public static void main(String[] args) {
		Corporacion google = new Corporacion("Google",1000);
		google.addObserver(observable -> {
			System.out.println("John : " + ((Corporacion)observable).getNombre() + " nuevo precio $" + ((Corporacion)observable).getPrecio());
		});
	}
}
