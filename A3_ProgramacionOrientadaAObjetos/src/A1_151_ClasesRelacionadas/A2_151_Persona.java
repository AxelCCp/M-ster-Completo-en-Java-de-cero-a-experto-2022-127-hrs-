package A1_151_ClasesRelacionadas;

public class A2_151_Persona {
	
	public A2_151_Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "A2_151_Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	private String nombre;
	private String apellido;
	
	
}
