package com.javamaster.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class B1_253_MainHashMapConMapAnidado {
	public static void main(String[] args) {
		
		Map<String, Object>persona = new HashMap<>();
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
		
		System.out.println("persona: " + persona);
		
		System.out.println(persona.get("nombre"));
		
		System.out.println("");
		
		String valorApellido = (String) persona.remove("apellido");
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
		System.out.println("----------SE ALMACENAN LOS VALORES EN UN Collection-----------");
		Collection<Object>valores = persona.values();
		for(Object valor : valores) {
			System.out.println(valor);
		}
		
		System.out.println();
		
		//SE OBTIENEN LOS VALORES DE LAS LLAVES CON SET
		System.out.println("----------keySet-----------");
		Set<String>llaves = persona.keySet();
		for(String llave : llaves) {
			System.out.println(llave);
		}
		
		System.out.println("");
		
		//SE USA LA CLASE INNER "ENTRY" QUE ES UNA CLASE QUE ESTÁ DENTRO, ENBEBIDA EN MAP. CON ENTRY Y EL METODO ENTRYSET() SE PUEDE ITERAR E IMPRIMIR CLASE Y VALOR A LA VEZ.
		System.out.println("----------entrySet-----------");
		for(Entry<String, Object> par : persona.entrySet()) {
			System.out.println(par.getKey() + " => " + par.getValue());
		}
		
		System.out.println("");
		
		//SE IMPRIME LLAVE Y VALOR, PERO ESTA VEZ USANDO KEYSET
		System.out.println("----------keySet-----------");
		for(String llave : persona.keySet()) {
			Object valor = persona.get(llave);
			System.out.println(llave + " => " + valor);
		}
		
		//AHORA CON LAMBDA
		System.out.println("---------- CON forEach(() -> XXX) -----------");
		persona.forEach((llave,valor) -> System.out.println(llave + " => " + valor));
		
		System.out.println("total :" + persona.size());
		System.out.println("Contiene elementos " + !persona.isEmpty());
		
		System.out.println("");
		
		boolean b3 = persona.replace("nombre", "John", "Andrés");
		System.out.println("b3: " + b3);
		persona.forEach((llave,valor) -> System.out.println(llave + " => " + valor));
		
		//-------------OBTENER EL MAPA DE DIRECCIÓN Y MOSTRARLO---------------------------
		
		System.out.println("---------------OBTENER EL MAPA DE DIRECCIÓN Y MOSTRARLO------------------");
		Map<String,String>direccionPersona = (Map<String, String>) persona.get("direccion");
		String pais = direccionPersona.get("pais");
		String ciudad = direccionPersona.get("ciudad");
		String barrio = direccionPersona.getOrDefault("barrio","la playa");
		System.out.println("El país de John es: " + pais + ". La ciudad es: " + ciudad + ". El barrio es: " + barrio);
		
		System.out.println("---------------OBTENER EL MAPA DE DIRECCIÓN Y MOSTRARLO-------keySet-----------");
		for(String llave : persona.keySet()) {
			Object valor = persona.get(llave);
			if(valor instanceof Map) {
				Map<String,String>direccionMap = (Map<String, String>) valor;
				System.out.println("PAIS: " + direccionMap.get("pais"));
				System.out.println("ESTADO: " + direccionMap.get("estado"));
				System.out.println("CIUDAD: " + direccionMap.get("ciudad"));
				
			}else {
				System.out.println(llave + " => " + valor);
			}
		}
		
		System.out.println("---------------OBTENER EL MAPA DE DIRECCIÓN Y MOSTRARLO-------entrySet-----------");
		for(Entry<String, Object> par : persona.entrySet()) {
			Object valor = par.getValue();
			if(valor instanceof Map) {
				Map<String,String>direccionMap = (Map<String, String>) valor;
				//System.out.println("PAIS: " + direccionMap.get("pais"));
				//System.out.println("ESTADO: " + direccionMap.get("estado"));
				//System.out.println("CIUDAD: " + direccionMap.get("ciudad"));
				for(Map.Entry<String,String>parDir : direccionMap.entrySet()){
					System.out.println(parDir.getKey() + " => " + parDir.getValue());
				}
			}else {
				System.out.println(par.getKey() + " => " + par.getValue());
			}
		}
	}
}
