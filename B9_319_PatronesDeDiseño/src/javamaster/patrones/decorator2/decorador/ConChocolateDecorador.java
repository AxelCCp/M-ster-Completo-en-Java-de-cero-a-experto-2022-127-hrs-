package javamaster.patrones.decorator2.decorador;

import javamaster.patrones.decorator2.Configurable;

public class ConChocolateDecorador extends CafeDecorador  {

	public ConChocolateDecorador(Configurable cafe) {
		super(cafe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getPrecioBase() {
		// TODO Auto-generated method stub
		return cafe.getPrecioBase() + 5f;
	}

	@Override
	public String getIngredientes() {
		// TODO Auto-generated method stub
		return cafe.getIngredientes() + " chocolate";
	}

}
