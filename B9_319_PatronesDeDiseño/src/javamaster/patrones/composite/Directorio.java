package javamaster.patrones.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directorio extends Componente{

	public Directorio(String nombre) {
		super(nombre);
		this.hijos = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String mostrar(int nivel) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("\t".repeat(nivel));
		sb.append(nombre).append("/").append("\n");
		for(Componente hijo : this.hijos) {
			sb.append(hijo.mostrar(nivel+1));
			if(hijo instanceof Archivo) {
				sb.append("\n");
			}	
		}
		return sb.toString();
	}

	public Directorio addComponente(Componente c) {
		hijos.add(c);
		return this;
	}
	
	public void removeComponente(Componente c) {
		hijos.remove(c);
	}
	

	private List<Componente>hijos;


	@Override
	public boolean buscar(String nombre) {
		// TODO Auto-generated method stub
		if(this.nombre.equalsIgnoreCase(nombre)) {
			return true;
		}
		for(Componente hijo : this.hijos) {
			if(hijo.buscar(nombre)) {
				return true;
			}
		}
		return false;
	}
}
