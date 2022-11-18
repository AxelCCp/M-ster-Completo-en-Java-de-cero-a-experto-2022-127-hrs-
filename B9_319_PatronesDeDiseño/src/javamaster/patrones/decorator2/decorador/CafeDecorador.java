package javamaster.patrones.decorator2.decorador;

import javamaster.patrones.decorator2.Configurable;

abstract public class CafeDecorador implements Configurable{
	
	public CafeDecorador(Configurable cafe) {
		this.cafe = cafe;
	}

	protected Configurable cafe; 
}
