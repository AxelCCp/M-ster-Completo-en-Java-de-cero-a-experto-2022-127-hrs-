package com.javamaster.set;

import java.util.HashSet;
import java.util.Set;

//1.-SE CREA UN ARRAY CON UN ELEMENTO DUPLICADO 
//2.-SE REGISTRAN ESTOS ELEMENTOS EN UN SET PARA VER CUAL ESTÁ DUPLICADO.

public class A1_MainHashSetBuscarDuplicado {
	public static void main(String[] args) {
		
		//1
		String[]peces = {"Corvina","Lenguado","Pejerrey","Tiburon","Orca","PezRemo","Lenguado"};
		//2
		Set<String>unicos = new HashSet<>();
		for(String pez : peces) {
			if(unicos.add(pez)==false) {
				System.out.println("Elemento duplicado: " + pez);
			}
		}
		System.out.println(unicos.size() + " elementos no duplicados " + unicos);
	}
}
