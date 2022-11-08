package javamaster.patrones.singleton;

public class ConexionBDSingleton {
	
	private ConexionBDSingleton() {
		System.out.println("Conectando con algún motor de base de datos.");
	}
	
	
	public static ConexionBDSingleton getInstancia() {
		if(instancia == null) {
			instancia = new ConexionBDSingleton();
		}
		return instancia;
	}
	
	
	private static ConexionBDSingleton instancia;
}
