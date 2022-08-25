package com.clasesAbstractas.app.elementos.select;

public class Opcion {
	
	public Opcion() {
	}
	public Opcion(String valor, String nombre) {
		this.valor = valor;
		this.nombre = nombre;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean getSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public boolean isSelected() {
		// TODO Auto-generated method stub
		return selected;
	}
	
	
	private String valor;
	private String nombre;
	private boolean selected;
	
}
