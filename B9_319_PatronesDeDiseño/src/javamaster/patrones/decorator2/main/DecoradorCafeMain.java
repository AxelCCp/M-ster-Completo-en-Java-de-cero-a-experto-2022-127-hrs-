package javamaster.patrones.decorator2.main;

import javamaster.patrones.decorator2.Cafe;
import javamaster.patrones.decorator2.Configurable;
import javamaster.patrones.decorator2.decorador.ConChocolateDecorador;
import javamaster.patrones.decorator2.decorador.ConCremaDecorador;
import javamaster.patrones.decorator2.decorador.ConLecheDecorador;

public class DecoradorCafeMain {
	public static void main(String[] args) {
		//siempre se usa el tipo de la interfaz
		
		Configurable cafe = new Cafe(7,"Cafe Mocha");
		ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
		ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
		ConChocolateDecorador conChoco = new ConChocolateDecorador(conLeche);
		System.out.println("El precio del café Mocha es: " + conChoco.getPrecioBase());
		System.out.println("Los ingredientes : " + conChoco.getIngredientes());
		
		
		Configurable capuchino = new Cafe(4,"Café Capuchino");
		conCrema = new ConCremaDecorador(capuchino);
		conLeche = new ConLecheDecorador(conCrema);
		System.out.println("El precio del capuchino es: " + conLeche.getPrecioBase());
		System.out.println("Los ingredientes : " + conLeche.getIngredientes());
		
		Configurable espresso = new Cafe(3,"Café Espresso");
		System.out.println("El precio del espresso es: " + espresso.getPrecioBase());
		System.out.println("Los ingredientes : " + espresso.getIngredientes());
	}
}
