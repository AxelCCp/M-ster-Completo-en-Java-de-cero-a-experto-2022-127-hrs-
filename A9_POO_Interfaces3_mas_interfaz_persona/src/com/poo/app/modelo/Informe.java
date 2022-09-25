package com.poo.app.modelo;

public class Informe extends Hoja implements Imprimible{

	public Informe(Persona autor, Persona revisor,String contenido) {
		super(contenido);
		// TODO Auto-generated constructor stub
		this.autor = autor;
		this.revisor = revisor;
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return "Informe escrito por: " + autor + ". Y revisado por " + revisor + "\n" + this.contenido;
	}

	private Persona autor;
	private Persona revisor;
}
