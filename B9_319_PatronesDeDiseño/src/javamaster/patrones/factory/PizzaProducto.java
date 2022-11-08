package javamaster.patrones.factory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProducto {

	protected String nombre;
	protected String masa;
	protected String salsa;
	protected List<String>ingredientes;
	
	public PizzaProducto() {
		 this.ingredientes = new ArrayList<>();
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void preparar() {
		System.out.println("preparando " + nombre);
		System.out.println("seleccionando la masa " + masa);
		System.out.println("agregando salsa " + salsa);
		System.out.println("agregando ingredientes: ");
		this.ingredientes.forEach(System.out::println);
	}
	
	abstract public void cocinar();
	
	abstract public void cortar();
	
	public void empaquetar() {
		System.out.println("Poniendo la pizza en una caja de empaque...");
	}
	
	
}
