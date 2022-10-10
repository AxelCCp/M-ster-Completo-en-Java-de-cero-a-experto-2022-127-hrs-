package com.javamaster.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//+LOS TREESET SE ORDENAN DE FORMA NATURAL Y/O DEPENDIENDO DEL ORDENAMIENTO QUE LE DEMOS.
//LOS TREE SET TIENEN UN COSTO DE RENDIMIENTO YA QUE SON ORDENADOS. CADA VEZ QUE SE AGREGA UN ELEMENTO AL TREESET, ESTE SE VA ORDENANDO EN SU POSICIÓN.
//1.-NO ACEPTA ELEMENTOS DUPLICADOS.
//2.-ORDENA LOS NÚMEROS DE FORMA NATURAL.
//3.-SE USA LA INTERFAZ COMPARATOR PARA ORDENAR DE FORMA INVERSA LOS STRING.
//4.-SE INVIERTE EL ORDEN USANDO FUNCIONES LAMBDA.

public class A3_MainTreeSet {
	public static void main(String[] args) {
		
		Set<String>ts = new TreeSet<>();
		ts.add("uno");
		ts.add("dos");
		ts.add("tres");
		ts.add("tres"); //
		ts.add("cuatro");
		ts.add("cinco");
		System.out.println("ts: " + ts);
	
		//2
		Set<Integer>nums = new TreeSet<>();
		nums.add(1);
		nums.add(5);
		nums.add(2);
		nums.add(4);
		nums.add(3);
		System.out.println("nums " + nums);
		
		
		//3
		Set<String>ts2 = new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				return b.compareTo(a);
			}
		});
		ts2.add("uno");
		ts2.add("dos");
		ts2.add("tres");
		ts2.add("tres"); //
		ts2.add("cuatro");
		ts2.add("cinco");
		System.out.println("ts2 " + ts2);
		
		//4
		Set<Integer>nums2 = new TreeSet<>((a,b)->{
			return b.compareTo(a);
		});
		nums2.add(1);
		nums2.add(5);
		nums2.add(2);
		nums2.add(4);
		nums2.add(3);
		System.out.println("nums2 " +nums2);
		
	}
}
