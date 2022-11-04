package javamaster.hilos.main;

import javamaster.hilos.syncronized.Consumidor;
import javamaster.hilos.syncronized.Panaderia;
import javamaster.hilos.syncronized.Panadero;

public class A6_264_MainPanaderiaPanaderoConsumidor {
	public static void main(String[] args) {
		Panaderia p = new Panaderia();
		new Thread(new Panadero(p)).start();
		new Thread(new Consumidor(p)).start();
	}
}
