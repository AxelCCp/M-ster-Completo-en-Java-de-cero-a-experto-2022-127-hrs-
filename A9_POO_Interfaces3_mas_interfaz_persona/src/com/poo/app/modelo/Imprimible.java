package com.poo.app.modelo;

public interface Imprimible {
	
	//public String imprimir();
	
	//IMPLEMENTACI�N DEFAULT DE UN M�TODO. ESTOS M�TODOS NO SON OBLIGATORIOS
	default String imprimir() {
		return "Imprime cualquier wea por defecto";
	}
}
