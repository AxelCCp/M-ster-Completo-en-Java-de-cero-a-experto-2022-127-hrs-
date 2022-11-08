package javamaster.patrones.factory.producto;

import javamaster.patrones.factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto{

	public PizzaCaliforniaVegetariana() {
		super();
		nombre = "PizzaCalifornia vegetariana";
		masa = "Delgada";
		salsa = "tomate";
		ingredientes.add("Queso mozzarella");
		ingredientes.add("Aceitunas");
		ingredientes.add("Espinacas");
		ingredientes.add("Cebolla");
		ingredientes.add("Berenjena");
	}

	@Override
	public void cocinar() {
		System.out.println("Cocinando por 20 min a 180°");
	}

	@Override
	public void cortar() {
		System.out.println("Cortando en triangulos");
	}

}
