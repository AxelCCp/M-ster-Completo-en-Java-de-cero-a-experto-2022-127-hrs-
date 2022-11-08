package javamaster.main;

import java.util.Optional;

import javamaster.model.Computador;
import javamaster.model.ComputadorRepositorio;
import javamaster.repositorio.iRepo;

public class A1_297_EjemploRepositorio {
	public static void main(String[] args) {
		
		iRepo<Computador>repositorio = new ComputadorRepositorio();
		
		repositorio.filtrar("asus rog").ifPresentOrElse(System.out::println, () -> System.out.println("No se encontró"));
		
		/*
		Optional<Computador> pc = repositorio.filtrar("asus rog");
		
		if(pc.isPresent()) {
			System.out.println(pc.get());
		}else {
			System.out.println("No se encontró el pc");
		}
		*/
		
	}
}
