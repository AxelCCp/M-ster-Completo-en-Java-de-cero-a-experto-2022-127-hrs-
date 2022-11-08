package javamaster.main;

import javamaster.model.Computador;
import javamaster.model.ComputadorRepositorio;
import javamaster.model.Fabricante;
import javamaster.repositorio.iRepo;


//SE OBTIENE A TRAVÉS DEL PC EL FABRICANTE.

public class A4_300_Repositorio_Map_Filter {
	public static void main(String[] args) {
		
		iRepo<Computador>repositorio = new ComputadorRepositorio();
		
		String fab = repositorio.filtrar("asus rog")
				.map(c -> c.getProcesador())              //C : ES DE TIPO COMPUTADOR
				.map(p -> p.getFabricante())			  //P : ES DE TIPO PROCESADOR
				.map(f -> f.getNombre())				  //F : ES DE TIPO FABRICANTE
				//.orElseThrow();
				.orElse("desconocido");
		System.out.println(fab);
		
		
		
		
	}
	
	
}
