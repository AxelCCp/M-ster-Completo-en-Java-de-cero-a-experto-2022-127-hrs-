package javamaster.patrones.decorator2.decorador;

import javamaster.patrones.decorator2.Configurable;

public class ConCremaDecorador extends CafeDecorador{

	public ConCremaDecorador(Configurable cafe) {
		super(cafe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getPrecioBase() {
		// TODO Auto-generated method stub
		return cafe.getPrecioBase() + 2.5f;
	}

	@Override
	public String getIngredientes() {
		// TODO Auto-generated method stub
		return cafe.getIngredientes() + " Crema";
	}

}
