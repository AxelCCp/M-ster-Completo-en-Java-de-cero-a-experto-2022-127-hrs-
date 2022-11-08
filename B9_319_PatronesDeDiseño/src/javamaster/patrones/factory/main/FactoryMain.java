package javamaster.patrones.factory.main;

import javamaster.patrones.factory.PizzaProducto;
import javamaster.patrones.factory.PizzeriaCaliforniaFactory;
import javamaster.patrones.factory.PizzeriaNewYorkFactory;
import javamaster.patrones.factory.PizzeriaZonaAbstractFactory;

public class FactoryMain {
	public static void main(String[] args) {
		PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
		PizzeriaZonaAbstractFactory ca = new PizzeriaCaliforniaFactory();
		PizzaProducto pizza = ca.ordenarPizza("queso");
		System.out.println("Bruce oredena la pizza " + pizza.getNombre());
		
		pizza = ny.ordenarPizza("pepperoni");
		System.out.println("Andrés ordena una " + pizza.getNombre());
		
		pizza = ca.ordenarPizza("vegetariana");
		System.out.println("un culiao ordena " + pizza.getNombre());
		
		pizza = ny.ordenarPizza("vegetariana");
		System.out.println("un otro culiao ordena " + pizza.getNombre());
		
		pizza = ca.ordenarPizza("pepperoni");
		System.out.println("un weon ordena una " + pizza.getNombre());
		
		System.out.println("pizza : " + pizza);
	}
}
