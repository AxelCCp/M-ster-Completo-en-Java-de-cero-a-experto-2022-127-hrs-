package com.javamaster.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class B0_250_MainHashMap {
	public static void main(String[] args) {
		Map<String, String>persona = new HashMap<>();
		persona.put("nombre", "John");
		persona.put("apellido", "Doe");
		persona.put("email","rrrrrr@rrrr.com");
		persona.put("edad","30");
		System.out.println("persona: " + persona);
		
		System.out.println(persona.get("nombre"));
		
		System.out.println("");
		
		String valorApellido = persona.remove("apellido");
		System.out.println("eliminado: " + valorApellido);
		System.out.println(persona);
		
		System.out.println("");
		
		boolean b = persona.containsKey("email");
		System.out.println(b);
		
		System.out.println("");
		
		boolean b2 = persona.containsValue("John");
		System.out.println(b2);
		
		System.out.println("");
		
		//SE ALMACENAN LOS VALORES EN UN COLLECTION DE STRING
		Collection<String>valores = persona.values();
		for(String valor : valores) {
			System.out.println(valor);
		}
		
		System.out.println();
		
		//SE OBTIENEN LOS VALORES DE LAS LLAVES CON SET
		Set<String>llaves = persona.keySet();
		for(String llave : llaves) {
			System.out.println(llave);
		}
		
		System.out.println("");
		
		//SE USA LA CLASE INNER "ENTRY" QUE ES UNA CLASE QUE ESTÁ DENTRO, ENBEBIDA EN MAP. CON ENTRY Y EL METODO ENTRYSET() SE PUEDE ITERAR E IMPRIMIR CLASE Y VALOR A LA VEZ.
		for(Map.Entry<String,String>par : persona.entrySet()) {
			System.out.println(par.getKey() + " => " + par.getValue());
		}
		
		System.out.println("");
		
		//SE IMPRIME LLAVE Y VALOR, PERO ESTA VEZ USANDO KEYSET
		for(String llave : persona.keySet()) {
			String valor = persona.get(llave);
			System.out.println(llave + " => " + valor);
		}
		
		//AHORA CON LAMBDA
		persona.forEach((llave,valor) -> System.out.println(llave + " => " + valor));
		
		System.out.println("total :" + persona.size());
		System.out.println("Contiene elementos " + !persona.isEmpty());
		
		System.out.println("");
		
		boolean b3 = persona.replace("nombre", "John", "Andrés");
		System.out.println("b3: " + b3);
		persona.forEach((llave,valor) -> System.out.println(llave + " => " + valor));
		
		
	}
}
