package com.poo.app.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible{

	public Curriculo(String persona,String carrera,String contenido) {
		super(contenido);
		// TODO Auto-generated constructor stub
		this.persona = persona;
		this.carrera = carrera;
		this.experiencias = new ArrayList<>();
	}

	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Nombre: ");
		sb.append(persona).append("\n").append("Resumen: ").append(this.contenido).append("\n").append("Profesión: ").append(this.carrera).append("\n").append("Experiencias: \n");
		for(String exp : this.experiencias) {
			sb.append("- ").append(exp).append("\n");
		}
		return sb.toString();
	}
	
	public Curriculo addExperiencia(String exp) {
		experiencias.add(exp);
		return this;
	}
	
	private String persona;
	private String carrera;
	private List<String>experiencias;
}
