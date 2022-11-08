package javamaster.repositorio;

import java.util.Optional;

import javamaster.model.Computador;

public interface iRepo <T> {
	
	Optional<Computador> filtrar(String nombre);
	
}
