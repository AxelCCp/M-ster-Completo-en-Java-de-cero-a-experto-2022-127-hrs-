package javamaster.patrones.decorator2.decorador;

import javamaster.patrones.decorator2.Configurable;

public class ConLecheDecorador extends CafeDecorador{

	public ConLecheDecorador(Configurable cafe) {
		super(cafe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getPrecioBase() {
		// TODO Auto-generated method stub
		return cafe.getPrecioBase() + 3.5f;
	}

	@Override
	public String getIngredientes() {
		// TODO Auto-generated method stub
		return cafe.getIngredientes() + " Leche";
	}

}
