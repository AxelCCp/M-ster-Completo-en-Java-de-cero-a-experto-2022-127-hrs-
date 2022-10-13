package com.javamaster.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.javamaster.set.model.A1_245_Alumno;

public class A7_247_MainListComparableComparator {
	public static void main(String[] args) {
		
		List<A1_245_Alumno>sa2= new ArrayList<>();
		sa2.add(new A1_245_Alumno("Rey Pilaf",5));
		sa2.add(new A1_245_Alumno("Freezer", 3));
		sa2.add(new A1_245_Alumno("Gero", 6));
		sa2.add(new A1_245_Alumno("Rochi", 1));
		sa2.add(new A1_245_Alumno("Ulon", 1)); 
		sa2.add(new A1_245_Alumno("Puar", 1)); 			
		System.out.println(sa2);
		
		System.out.println("Iterando con for each");
		sa2.forEach(s -> System.out.println(s));
		
		System.out.println("");
		
		//PARA ORDENAR SE USA LA CLASE COLLECTIONS .... DIFERENTE DE LA INTERFAZ COLLECTION
		//ORDENA POR LA NOTA.. DE MENOR A MAYOR SEGÚN EL COMPARETO Q SE CONFIGURÓ EN LA CLASE ALUMNO.
		Collections.sort(sa2);
		System.out.println(sa2);
		
		System.out.println("");
		
		//TAMBIEN SE PUEDE IMPLEMENTAR UN COMPARATOR, PARA SOBREESCRIBIR EL ORDENAMIENTO QUE VIENE DESDE LA CLASE ALUMNO (SE IMPRIME DE MANERA INVERSA)
		//Collections.sort(sa2, (a,b) -> a.getNota().compareTo(b.getNota()));  //ESTO SERÍA ASÍ SI LAS NOTAS FUERAN INTEGER Y NO INT.
		//System.out.println(sa2);
		
		Collections.sort(sa2, (a,b) -> {
			if(a.getNota() == b.getNota()) return 0;
			if(a.getNota() > b.getNota()) return -1;
			else return 1;
		}); 
		System.out.println(sa2);
		
		System.out.println("");
		
		//FORMA ABREVIADA DE ORDENAR CON JAVA 8
		sa2.sort(Comparator.comparing((A1_245_Alumno a) -> a.getNombre()));
		System.out.println(sa2);
		
		System.out.println("");
		
		sa2.sort(Comparator.comparing((A1_245_Alumno a) -> a.getNombre()).reversed());
		System.out.println(sa2);
	}
}
