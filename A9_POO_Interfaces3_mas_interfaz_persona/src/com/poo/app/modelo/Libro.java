package com.poo.app.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{
	
	public Libro(Persona autor, String titulo, Genero genero) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.paginas = new ArrayList<>();
	}
	
	public Libro addPagina(Imprimible pagina) {
		paginas.add(pagina);
		return this;
	}
	
	public String imprimir() {
		StringBuilder sb = new StringBuilder("Titulo: ");
		sb.append(this.titulo).append("\n").append("Autor: ").append(this.autor).append("\n").append("Genero: ").append(genero).append("\n");
		for(Imprimible pag : this.paginas) {
			sb.append(pag.imprimir()).append("\n");
		}
		return sb.toString();
	}
	
	//EL TIPO DE LIST<> PUEDE SER DEL TIPO PAGINA, HOJA O IMPRIMIBLE. PERO SE USA IMPRIMIBLE YA Q ES EL MÁS GENÉRICO. 
	private List<Imprimible>paginas;
	private Persona autor;
	private String titulo;
	private Genero genero;
}
