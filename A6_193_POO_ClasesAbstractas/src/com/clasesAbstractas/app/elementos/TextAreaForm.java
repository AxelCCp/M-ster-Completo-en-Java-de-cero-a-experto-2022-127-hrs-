package com.clasesAbstractas.app.elementos;

public class TextAreaForm extends ElementoForm {

	@Override
	public String dibujarHtml() {
		// TODO Auto-generated method stub
		return "<textarea name='" + this.nombre + "' cols='"
				+ this.columnas + "' rows='" + this.filas + "'>"
				+ this.valor + "</textarea>";
	}
	
	public TextAreaForm(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	public TextAreaForm(String nombre,int filas, int columnas) {
		super(nombre);
		this.filas = filas;
		this.columnas = columnas;
	}

	public int getFilas() {
		return filas;
	}
	public void setFilas(int filas) {
		this.filas = filas;
	}
	public int getColumnas() {
		return columnas;
	}
	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	private int filas;
	private int columnas;
}