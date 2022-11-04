package com.javamaster.set;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//EN UN TREE NO PUEDEN HABER ELEMENTOS NULL.
//POR DEFECTO ORDENA ALFABETICAMENTE POR LA LLAVE.


public class B2_255_MainTreeMap {
	public static void main(String[] args) {
		
		//Map<String, Object>persona = new TreeMap<>();													//ORDEN POR DEFECTO
		//Map<String, Object>persona = new TreeMap<>((a,b)-> b.compareTo(a));							//ORDEN A ,B
		//Map<String, Object>persona = new TreeMap<>(Comparator.reverseOrder());						//ORDEN INVERSO
		Map<String, Object>persona = new TreeMap<>(Comparator.comparing(String::length));				//COMPARA POR EL LARGO DE LOS STRING'S
		System.out.println("Contiene elementos: " + !persona.isEmpty());
		persona.put("nombre", "John");
		persona.put("apellido", "Doe");
		persona.put("email","rrrrrr@rrrr.com");
		persona.put("edad","30");
		
		Map<String,String>direccion = new HashMap<>();
		direccion.put("pais", "USA");
		direccion.put("estado", "California");
		direccion.put("ciudad", "Santa Barbara");
		direccion.put("calle", "one street");
		direccion.put("numero", "120");
		persona.put("direccion", direccion);
		
		System.out.println("Contiene elementos: " + !persona.isEmpty());
		System.out.println("persona: " + persona);
		
		
	}
}
