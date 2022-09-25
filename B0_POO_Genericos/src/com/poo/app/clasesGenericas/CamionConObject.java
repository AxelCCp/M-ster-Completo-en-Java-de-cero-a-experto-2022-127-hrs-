package com.poo.app.clasesGenericas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//CUALQUIER ELEMENTO DE UNA CLASE Q IMPLEMENTE ITERABLE, PUEDE PASAR POR UN FOR EACH. POR EJEMPLO LA CLASE LIST IMPLEMENTA ITERABLE Y SE PUEDEN ITERAR LAS LISTAS.

public class CamionConObject implements Iterable<Object>{
	
	public CamionConObject(int max) {
		this.max = max;
		this.objetos = new ArrayList<>();
	}
	
	public void add(Object objeto) {
		if(this.objetos.size() <= max) {
			this.objetos.add(objeto);
		}else {
			throw new RuntimeException("No hay más espacio");
		}
	}
	
	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return this.objetos.iterator();
	}
	
	private List<Object> objetos;
	private int max;
	
}
