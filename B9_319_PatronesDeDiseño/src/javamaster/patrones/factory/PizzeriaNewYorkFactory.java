package javamaster.patrones.factory;

import javamaster.patrones.factory.producto.PizzaNewYorkItaliana;
import javamaster.patrones.factory.producto.PizzaNewYorkVegetariana;
import javamaster.patrones.factory.producto.PizzaNuevaYorkPeperoni;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{

	@Override
	PizzaProducto crearPizza(String tipo) {
			PizzaProducto producto = null;
			switch(tipo) {
			case "vegetariana" : 
				producto = new PizzaNewYorkVegetariana();
				break;
			case "pepperoni" :
				producto = new PizzaNuevaYorkPeperoni();
				break;
			case "italiana" :
				producto = new PizzaNewYorkItaliana();
				break;
			}
			return producto;
	
		}
}
