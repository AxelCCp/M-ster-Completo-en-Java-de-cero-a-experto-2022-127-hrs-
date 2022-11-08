package javamaster.main;

import java.util.Optional;

import javamaster.model.Computador;
import javamaster.model.ComputadorRepositorio;
import javamaster.repositorio.iRepo;

public class A3_299_EjemploRepositorioMetodosOrElseThrow {
	public static void main(String[] args) {
		
		//EL orElseThrow()  VA A REEMPLAZAR AL GET() ...
		//SE PUEDEN PERSONALIZAR LAS EXCEPTIONS QUE MANDA EL orElseThrow(), SI ES Q NO ENCUENTRA EL PC.
		
		iRepo<Computador>repositorio = new ComputadorRepositorio();
		Computador pc = repositorio.filtrar("asus rog").orElseThrow(() -> new IllegalStateException());
		System.out.println(pc);
		
		String archivo = "documento.pdf";
		String extension = Optional.ofNullable(archivo).filter(a -> a.contains(".")).map(a -> a.substring(archivo.lastIndexOf(".") + 1)).orElseThrow();
		System.out.println(extension);
		
		
	}
	
}
