package javamaster.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
	
	public Usuario(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = ++ultimoId;
		this.facturas = new ArrayList<>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public List<Factura> getFacturas() {
		return facturas;
	}
	public void addFactura(Factura factura) {
		this.facturas.add(factura);
		factura.setUsuario(this);
	}

	@Override
	public String toString() {
		return nombre + " " + apellido;
	}

	//CLASE 289
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return false; 
		Usuario usuario = (Usuario) obj;
		return Objects.equals(nombre, usuario.nombre) && Objects.equals(apellido, usuario.apellido);
	}




	private String nombre;
	private String apellido;
	// CLASE285
	private Integer id; 
	private static int ultimoId;
	//CLASE293
	private List<Factura>facturas;
	
	
}
