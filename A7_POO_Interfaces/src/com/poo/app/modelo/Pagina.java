package com.poo.app.modelo;

public class Pagina extends Hoja{

	public Pagina(String contenido) {
		super(contenido);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return this.contenido;
	}

}
