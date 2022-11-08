package javamaster.patrones.factory.producto;

import javamaster.patrones.factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto{

	public PizzaCaliforniaQueso() {
		super();
		nombre = "Pizza California queso";
		masa = "Masa a la piedra";
		salsa = "tomate queso";
		ingredientes.add("extra queso");
		ingredientes.add("cebolla");
		ingredientes.add("queso azul");
	}

	@Override
	public void cocinar() {
		System.out.println("Cocinando 35 min a 100°C");
	}

	@Override
	public void cortar() {
		System.out.println("Corte triangulos");
	}

}
