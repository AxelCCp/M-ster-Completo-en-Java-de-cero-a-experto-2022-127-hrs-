package javamaster.patrones.decorator.decorador;

import javamaster.patrones.decorator.Formateable;

abstract public class TextoDecorador implements Formateable {
	
	public TextoDecorador(Formateable texto) {
		this.texto = texto;
	}

	protected Formateable texto;
}
