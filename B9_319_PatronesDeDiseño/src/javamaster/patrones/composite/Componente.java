package javamaster.patrones.composite;

import java.util.Objects;

abstract public class Componente {
	
	abstract public String mostrar(int nivel);
	abstract public boolean buscar(String nombre);
	
	public Componente(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this==obj) return true;
		if(obj==null || getClass() != obj.getClass()) return false;
		Componente that = (Componente) obj;
		return Objects.equals(nombre, that.nombre);
	}
	
	protected String nombre;
}
