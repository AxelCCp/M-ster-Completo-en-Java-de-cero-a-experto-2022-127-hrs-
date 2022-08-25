package com.clasesAbstractas.app.elementos;

public class InputForm extends ElementoForm{

	@Override
	public String dibujarHtml() {
		// TODO Auto-generated method stub
		return "<input type=\"" + this.tipo
				+ "\" name=\"" + this.nombre
				+ "\" value=\"" + this.valor + "\">";
	}
	public InputForm(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	public InputForm(String nombre, String tipo) {
		super(nombre);
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	private String tipo = "text";
}
