package javamaster.patrones.decorator.decorador;

import javamaster.patrones.decorator.Formateable;

public class ReemplazarEspaciosDecorador extends TextoDecorador{

	public ReemplazarEspaciosDecorador(Formateable texto) {
		super(texto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String darFormato() {
		// TODO Auto-generated method stub
		return texto.darFormato().replace(" ", "_");
	}

}
