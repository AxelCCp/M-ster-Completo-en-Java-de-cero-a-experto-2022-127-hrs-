package com.javamaster.set;

import java.util.HashSet;
import java.util.Set;

//*.-SE TOM� EL C�DIGO ANTERIOR
//2.-SE REGISTRAN ESTOS ELEMENTOS EN DOS SET. SI UN ELELEMTOS EST� DUPLICADO, PASA AL SET DUPLICADOS. Y DESPU�S SE BORRA EL PRIMER REGISTRO..
//..DEL ELEMENTO DUPLICADO EN EL UNICOS.

public class A2_MainHashSetBuscarDuplicado2 {
	public static void main(String[] args) {
		
		
		String[]peces = {"Corvina","Lenguado","Pejerrey","Tiburon","Orca","PezRemo","Lenguado"};
		//2
		Set<String>unicos = new HashSet<>();
		Set<String>duplicados = new HashSet<>();
		for(String pez : peces) {
			if(unicos.add(pez)==false) {
				duplicados.add(pez);
			}
		}
		unicos.removeAll(duplicados);
		System.out.println("�nicos " + unicos);
		System.out.println("Duplicados " + duplicados);
	}
}
