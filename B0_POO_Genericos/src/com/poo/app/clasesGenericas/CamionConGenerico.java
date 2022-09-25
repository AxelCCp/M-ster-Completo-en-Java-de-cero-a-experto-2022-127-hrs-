package com.poo.app.clasesGenericas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//ESTA ES UNA CLASE QUE RECIBE UN PARÁMETRO GENERICO <T> Y QUE IMPLEMENTA ITERABLE PARA PODER ITERAR SUS OBJETOS AL IGUAL Q LAS LISTAS LIST.
//TAMBN SE LE PONE LA <T> AL ITERABLE PARA DECIRLE Q ITERA GENERICOS DE CUALQUIER #"$&
public class CamionConGenerico <T> implements Iterable <T>{
	
	public CamionConGenerico(int max) {
		this.max = max;
		this.objetos = new ArrayList<>();   
	}
	
	public void add(T objeto) {
		if(this.objetos.size() <= max) {
			this.objetos.add(objeto);
		}else {
			throw new RuntimeException("No hay más espacio");
		}
	}
	
	//EL TIPO DE RETORNO DE ITERATOR ES DE CUALQUIER TIPO GENERICO
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return this.objetos.iterator();
	}
	
	private List<T> objetos;
	private int max;
	
}
