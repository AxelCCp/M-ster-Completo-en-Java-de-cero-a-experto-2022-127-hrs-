package javamaster.patrones.factory.producto;

import javamaster.patrones.factory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto{

	public PizzaNewYorkItaliana() {
		super();
		nombre = "Pizza New York Italiana";
		masa = "gruesa";
		salsa = "tomate con carne";
		ingredientes.add("Queso mozzarella");
		ingredientes.add("Aceitunas");
		ingredientes.add("Jamón");
		ingredientes.add("Chorizillo");
	}

	@Override
	public void cocinar() {
		System.out.println("Cocinando por 30 min a 120°C");
	}

	@Override
	public void cortar() {
		System.out.println("Cortando en triangulos");
	}

}
