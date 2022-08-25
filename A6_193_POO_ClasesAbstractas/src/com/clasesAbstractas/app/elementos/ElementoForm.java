package com.clasesAbstractas.app.elementos;

abstract public class ElementoForm {
	
	//SE USA PARA INICIALIZAR LISTA DE ERROR
	public ElementoForm() {
	}
	
	public ElementoForm(String nombre) {
		this();
		this.nombre = nombre;
	}
	
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	abstract public String dibujarHtml();
	
	protected String valor;
	protected String nombre;
}
