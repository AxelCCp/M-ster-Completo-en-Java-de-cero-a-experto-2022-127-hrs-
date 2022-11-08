package javamaster.patrones.decorator;

public class Texto implements Formateable {
	
	public Texto(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}
	
	@Override
	public String darFormato() {
		return getTexto();
	}
	
	



	private String texto;

}
