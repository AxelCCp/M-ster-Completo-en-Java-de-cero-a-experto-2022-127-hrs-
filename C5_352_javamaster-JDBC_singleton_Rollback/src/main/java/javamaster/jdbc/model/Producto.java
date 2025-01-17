package javamaster.jdbc.model;

import java.util.Date;

public class Producto {
	
	public Producto() {
	}
	public Producto(long id, String nombre, Integer precio, Date fechaRegistro) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.fechaRegistro = fechaRegistro;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	@Override
	public String toString() {
		return "id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fechaRegistro=" + fechaRegistro + ", categoria=" + categoria.getNombre() + ", sku=" + sku;
	}

	private long id;
	private String nombre;
	private Integer precio;
	private Date fechaRegistro;
	private Categoria categoria;
	private String sku; 
}
