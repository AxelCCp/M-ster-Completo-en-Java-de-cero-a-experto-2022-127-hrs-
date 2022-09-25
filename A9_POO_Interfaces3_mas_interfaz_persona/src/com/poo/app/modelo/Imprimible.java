package com.poo.app.modelo;

public interface Imprimible {
	
	//public String imprimir();
	
	//IMPLEMENTACIÓN DEFAULT DE UN MÉTODO. ESTOS MÉTODOS NO SON OBLIGATORIOS
	default String imprimir() {
		return "Imprime cualquier wea por defecto";
	}
}
