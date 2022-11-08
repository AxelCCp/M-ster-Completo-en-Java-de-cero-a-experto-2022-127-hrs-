package javamaster.main;

import javamaster.model.Computador;
import javamaster.model.ComputadorRepositorio;
import javamaster.repositorio.iRepo;

public class A2_298_EjemploRepositorioMetodosOrElse {
	public static void main(String[] args) {
		
		//ES MEJOR EL orElseGet() ... YA Q EL orElse() DEVUELVE IGUAL EL PC POR DEFECTO.
		
		iRepo<Computador>repositorio = new ComputadorRepositorio();
		
		Computador pc = repositorio.filtrar("asus rog").orElse(getPc());
		
		System.out.println(pc);
		
		
		
		pc = repositorio.filtrar("mac").orElseGet(() -> {
			return getPc();
		});
		
		System.out.println(pc);
		
	}
	
	public static Computador getPc() {
		System.out.println("Pc por defecto");
		return new Computador("PC ","ALTERNATIVO");
	}
}
