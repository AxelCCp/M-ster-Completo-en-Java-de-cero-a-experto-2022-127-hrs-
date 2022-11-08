package javamaster.patrones.factory.producto;

import javamaster.patrones.factory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto{

	public PizzaCaliforniaPepperoni() {
		super();
		nombre = "Pizza California pepperoni";
		masa = "Masa a la piedra";
		salsa = "tomate y weas ";
		ingredientes.add("extra weas");
		ingredientes.add("cebolla y weas");
		ingredientes.add("más weas");
	}

	@Override
	public void cocinar() {
		System.out.println("cocinando a 150°");
	}

	@Override
	public void cortar() {
		System.out.println("rectangulos");
	}

}
