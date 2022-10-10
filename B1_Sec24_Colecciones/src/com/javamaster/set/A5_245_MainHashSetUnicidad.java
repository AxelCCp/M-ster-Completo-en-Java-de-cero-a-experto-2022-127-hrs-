package com.javamaster.set;

import java.util.HashSet;
import java.util.Set;

import com.javamaster.set.model.A1_245_Alumno;

public class A5_245_MainHashSetUnicidad {

	public static void main(String[] args) {
	
	//A1_245_Alumno : TIENE LOS METODOS "EQUALS Y HASHCODE" .... CON ESTOS SE QUITAN LOS REGISTRO IGUALES DEL SET. 
	//"EQUALS Y HASHCODE"  CON COMO EL COMPARETO() PERO PARA LOS HashSet.
	
	Set<A1_245_Alumno>sa1= new HashSet<>();
	sa1.add(new A1_245_Alumno("Rey Pilaf",5));
	sa1.add(new A1_245_Alumno("Freezer", 3));
	sa1.add(new A1_245_Alumno("Gero", 6));
	sa1.add(new A1_245_Alumno("Rochi", 1));
	sa1.add(new A1_245_Alumno("Ulon", 1)); 
	sa1.add(new A1_245_Alumno("Ulon", 1)); 			//NO APARECE PQ ESTÁ REPETIDO.
	System.out.println(sa1);
	}
	
}
