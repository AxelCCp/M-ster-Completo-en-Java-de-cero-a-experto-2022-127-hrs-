package com.poo.app.clasesGenericas;

public class Animal {

	public Animal(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	private String nombre;
	private String tipo;
}
