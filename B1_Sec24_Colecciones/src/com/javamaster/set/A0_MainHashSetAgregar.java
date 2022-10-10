package com.javamaster.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//CLASE 241
//1.-SE PUEDE DEFINIR DEL TIPO HASHSET,  PERO LOS MÉTODOS MÁS GENERICOS NO SON HASHSET, SINO DEL TIPO DE LA INTERFAZ SET, POR LO TANTO MEJOR USAR SET. 
//2.-SE USA MEJOR SET QUE HASHSET.
//3.-ESTO DEMUESTRA Q LOS HASH SET SON DESORDENADOS. 
//4.-SET NO PERMITE TENER ELEMENTOS DUPLICADOS.
//+LOS SET NO SE PUEDEN ORDENAR.
//5.-CONVERTIR UN SET EN UN ARRAYLIST. SE PASA EL SET COMO ARGUMENTO AL CONSTRUCTOR DE ARRAYLIST. YA QUE ESTE ACEPTA UN COLLECTION.
//6.-SE ORDENA LA LISTA.
//+add(): RETORNA UN BOOLEAN.

public class A0_MainHashSetAgregar {
	public static void main(String[] args) {
		//1
		HashSet<String>hs1 = new HashSet<>();
		//2
		Set<String>hs2 = new HashSet<>();
		hs2.add("uno");
		hs2.add("dos");
		hs2.add("tres");
		hs2.add("cuatro");
		hs2.add("cinco");
		//3
		System.out.println(hs2);
		//4
		boolean b = hs2.add("tres");
		System.out.println("Un SET permite elementos duplicados? " + b);
		System.out.println(hs2);
		//5
		List<String>lista = new ArrayList<>(hs2);
		//6
		Collections.sort(lista);
		System.out.println(lista);
	}
}
