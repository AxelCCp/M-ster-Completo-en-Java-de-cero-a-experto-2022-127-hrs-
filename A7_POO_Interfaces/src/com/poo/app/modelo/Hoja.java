package com.poo.app.modelo;

abstract public class Hoja {
		
	public Hoja(String contenido) {
		this.contenido = contenido;
	}
	abstract public String imprimir();
	
	protected String contenido;
	
}
