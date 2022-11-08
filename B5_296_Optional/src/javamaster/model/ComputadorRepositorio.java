package javamaster.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javamaster.repositorio.iRepo;

public class ComputadorRepositorio implements iRepo<Computador>{

	public ComputadorRepositorio() {
		dataSource = new ArrayList<>();
		Procesador proc = new Procesador("i9-8880h", new Fabricante("intel"));
		Computador asus = new Computador("Asus ROG", "Strix G512"); 
		asus.setProcesador(proc);
		
		dataSource.add(asus);
		dataSource.add(new Computador("Mac pro", "xxxx xxx"));
	}

	@Override
	public Optional<Computador> filtrar(String nombre) {
		
		/*
		for(Computador c : dataSource) {
			if(c.getNombre().equalsIgnoreCase(nombre)) {
				return Optional.of(c);
			}
		}
		return Optional.empty();
		*/
		
		return dataSource.stream().filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase())).findFirst();
	}
	
	List<Computador>dataSource;
	

}
