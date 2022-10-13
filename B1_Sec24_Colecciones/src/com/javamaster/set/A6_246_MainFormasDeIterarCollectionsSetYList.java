package com.javamaster.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.javamaster.set.model.A1_245_Alumno;

public class A6_246_MainFormasDeIterarCollectionsSetYList {

	public static void main(String[] args) {
		Set<A1_245_Alumno>sa1= new HashSet<>();
		sa1.add(new A1_245_Alumno("Rey Pilaf",5));
		sa1.add(new A1_245_Alumno("Freezer", 3));
		sa1.add(new A1_245_Alumno("Gero", 6));
		sa1.add(new A1_245_Alumno("Rochi", 1));
		sa1.add(new A1_245_Alumno("Ulon", 1)); 
		sa1.add(new A1_245_Alumno("Puar", 1)); 			
		System.out.println(sa1);
		
		System.out.println("Iterando usando for each:");
		for(A1_245_Alumno a : sa1) {
			System.out.println(a);
		}
		
		System.out.println("Iterando usando while e iterator");
		Iterator<A1_245_Alumno>it = sa1.iterator();
		while(it.hasNext()) {
			A1_245_Alumno a = it.next();
			System.out.println(a.getNombre());
		}
		
		System.out.println("Iterando con expresiones lambda");
		sa1.forEach(a -> System.out.println(a));
		
		
		System.out.println("\nAHORA CON ARRAY LIST");
		
		List<A1_245_Alumno>sa2= new ArrayList<>();
		sa2.add(new A1_245_Alumno("Rey Pilaf",5));
		sa2.add(new A1_245_Alumno("Freezer", 3));
		sa2.add(new A1_245_Alumno("Gero", 6));
		sa2.add(new A1_245_Alumno("Rochi", 1));
		sa2.add(new A1_245_Alumno("Ulon", 1)); 
		sa2.add(new A1_245_Alumno("Puar", 1)); 			
		System.out.println(sa2);
		
		System.out.println("Iterando usando for each:");
		for(A1_245_Alumno a : sa2) {
			System.out.println(a);
		}
		
		System.out.println("Iterando usando while e iterator");
		Iterator<A1_245_Alumno>it2 = sa2.iterator();
		while(it2.hasNext()) {
			A1_245_Alumno a = it2.next();
			System.out.println(a.getNombre());
		}
		
		System.out.println("Iterando con expresiones lambda");
		sa2.forEach(a -> System.out.println(a));
		
		System.out.println("Iterando con for clásico");
		for(int i=0; i<sa2.size();i++) {
			System.out.println(sa2.get(i));
		}
	}
}
