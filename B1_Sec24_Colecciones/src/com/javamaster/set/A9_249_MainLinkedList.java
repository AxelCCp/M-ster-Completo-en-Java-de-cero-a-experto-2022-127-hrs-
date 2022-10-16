package com.javamaster.set;

import java.util.LinkedList;
import java.util.ListIterator;

import com.javamaster.set.model.A1_245_Alumno;


//1.-SE USA LINKEDLIST PARA USAR LOS METODOS PROPIOS DEL LINKED LIST Y NO LOS GENERICOS DE LIST.
//2.-SE AGREGAN MÁS ALUMNOS AL PRINCIPIO Y AL FINAL.

public class A9_249_MainLinkedList {
	public static void main(String[] args) {
		//1
		LinkedList<A1_245_Alumno>al= new LinkedList<>();
		System.out.println(al + ", size = " + al.size());
		System.out.println("está vacía = " + al.isEmpty());
		al.add(new A1_245_Alumno("Rey Pilaf",5));
		al.add(new A1_245_Alumno("Freezer", 3));
		al.add(new A1_245_Alumno("Gero", 6));
		al.add(new A1_245_Alumno("Rochi", 1));  							
		al.add(new A1_245_Alumno("Ulon", 1)); 
		al.add(new A1_245_Alumno("Puar", 1)); 							
		al.add(new A1_245_Alumno("Khrilin",5));
		al.add(new A1_245_Alumno("Sr. tortuga",7));
		System.out.println(al + ", size = " + al.size());
		
		System.out.println("");
		//2
		al.addFirst(new A1_245_Alumno("Octavio",10));
		al.addLast(new A1_245_Alumno("18",10));
		
		System.out.println("");
		System.out.println("primero " + al.getFirst());		 //SI NO ENCUENTRA... RETORNA EXCEPTION
		System.out.println("primero " + al.peekFirst());  	 //SI NO ENCUENTRA... RETORNA NULL
		System.out.println("último " + al.getLast());		 //SI NO ENCUENTRA... RETORNA EXCEPTION
		System.out.println("último " + al.peekLast());		 //SI NO ENCUENTRA... RETORNA NULL
		System.out.println("Índice 2 " + al.get(2));
		
		System.out.println("");
		
		al.remove();
		al.removeFirst();		//SI NO ENCUENTRA... RETORNA EXCEPTION
		al.removeLast();		//SI NO ENCUENTRA... RETORNA EXCEPTION
		al.pollFirst();			//SI NO ENCUENTRA... RETORNA NULL
		al.pollLast();			//SI NO ENCUENTRA... RETORNA NULL
		
		System.out.println(al);
		
		System.out.println("");
		
		al.add(new A1_245_Alumno("Jano",2));
		
		al.remove(new A1_245_Alumno("Jano",2));
		
		System.out.println(al);
		
		System.out.println("");
		
		A1_245_Alumno lucas = new A1_245_Alumno("Lucas",6);
		al.addLast(lucas);
		System.out.println("Indice de lucas: " + al.indexOf(lucas));
		
		System.out.println("");
		
		al.remove(2);
		
		//REEMPLAZA UN ALUMNO POR OTRO:
		al.set(3, new A1_245_Alumno("Lalo",7));
		System.out.println(al);
		
		//CLASE 250 --------------- CONVIERTE LA LINKED LIST EN UNA LIST ITERATOR
		ListIterator<A1_245_Alumno>li = al.listIterator();
		while(li.hasNext()) {
			A1_245_Alumno alumno = li.next();
			System.out.println(alumno);
		}
		
		System.out.println("");
		
		while(li.hasPrevious()) {
			A1_245_Alumno alumno = li.previous();
			System.out.println(alumno);
		}
		
	}
}
