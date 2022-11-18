package javamaster.patrones.decorator2;

public class Cafe implements Configurable{

	@Override
	public float getPrecioBase() {
		// TODO Auto-generated method stub
		return this.precio;
	}

	@Override
	public String getIngredientes() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	
	
	public Cafe(float precio, String nombre) {
		this.precio = precio;
		this.nombre = nombre;
	}



	private float precio;
	private String nombre;
}
