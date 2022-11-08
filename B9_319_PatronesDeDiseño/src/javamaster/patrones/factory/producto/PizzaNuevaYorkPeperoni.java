package javamaster.patrones.factory.producto;

import javamaster.patrones.factory.PizzaProducto;

public class PizzaNuevaYorkPeperoni extends PizzaProducto {

	public PizzaNuevaYorkPeperoni() {
		super();
		nombre = "Pizza peperoni New York";
		masa = "A la piedra";
		salsa = "Salsa de tomate";
		ingredientes.add("Queso mozzarella");
		ingredientes.add("Extra peperoni");
		ingredientes.add("Aceitunas");
	}

	@Override
	public void cocinar() {
		System.out.println("Cocinando 90 min a 40°C");
	}

	@Override
	public void cortar() {
		System.out.println("Cortando la pizza en triangulos");
	}

}
