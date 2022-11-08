package javamaster.patrones.factory.producto;

import javamaster.patrones.factory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto{

	public PizzaNewYorkVegetariana() {
		super();
		nombre = "Pizza vegetariana de New York";
		masa = "Masa ingegral vegana";
		salsa = "Salsa de tomate";
		ingredientes.add("Queso vegano");
		ingredientes.add("Tomate");
		ingredientes.add("Aceitunas");
		ingredientes.add("Espinacas");
		ingredientes.add("Berenjenas");
	}

	@Override
	public void cocinar() {
		System.out.println("Cocinando por 25 min a 150°C.");
		
	}

	@Override
	public void cortar() {
		System.out.println("Cortando la pizza en rebanadas cuadradas.");
		
	}

}
