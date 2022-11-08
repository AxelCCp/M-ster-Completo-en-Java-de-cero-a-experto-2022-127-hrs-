package javamaster.model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;
import javamaster.anotation.Init;
import javamaster.anotation.JsonAtributo;

public class Producto {
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getPrecio() {
		return precio;
	}
	public void setPrecio(Long precio) {
		this.precio = precio;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Init
	private void init() {
		this.nombre = Arrays.stream(nombre.split(" "))
				.map(palabra -> palabra.substring(0,1).toUpperCase() + palabra.substring(1).toLowerCase()).collect(Collectors.joining(" "));
	}
	
	//ESTOS SON LOS ATRIBUTOS QUE SE VAN A CONVERTIR EN JSON.
	@JsonAtributo
	private String nombre;
	@JsonAtributo
	private Long precio;
	private LocalDate fecha;
}
