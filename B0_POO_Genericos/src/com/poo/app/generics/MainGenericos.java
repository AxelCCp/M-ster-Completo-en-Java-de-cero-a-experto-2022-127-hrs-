package com.poo.app.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainGenericos {
	public static void main(String[] args) {
		List <Cliente>clientes = new ArrayList<>();
		clientes.add(new Cliente("Andrés", "Guzmán"));
		Cliente andres = clientes.iterator().next();
		
		Cliente[]arregloClientes = {
				new Cliente("mkonji","bhumko"),
				new Cliente("vgyvgy","tfctfc")
		};
		Integer[]arregloNums = {1,2,3};
		
		List<Cliente>listClientes = fromArrayToList2(arregloClientes);
		List<Integer>listNums = fromArrayToList2(arregloNums);
		
		listClientes.forEach(c -> System.out.println(c.getNombre()));
		listNums.forEach(n -> System.out.println(n));
		
		//List<Cliente>nombres = fromArrayToList3(new Cliente[]{new Cliente("",""), new Cliente("","")}, new Cliente[] {new Cliente("","")});
		List<String>nombres = fromArrayToList3(new String[] {"Andrés","Pepe","Bea","Luci","John"}, arregloNums);
		nombres.forEach(n -> System.out.println(n));
		
		List<ClientePremium>clientesPremiumList = fromArrayToList4(new ClientePremium[] {new ClientePremium("Pepe","asdsad"),new ClientePremium("John","fhfghf")});
	
		System.out.println("El máximo entre 1,9,4 : " + maximo(1,9,4));
		System.out.println("El máximo entre 1.44,9.5,4.8 : " + maximo(1.44,9.5,4.8));
		System.out.println("El máximo entre arandano, zanahoria, manzana : " + maximo("arandano", "zanahoria", "manzana"));
	}
	
	//ESTE MÉTODO CONVIERTE UN ARRAY DE CLIENTE A LISTA CLIENTES
	public static List<Cliente>fromArrayToList(Cliente[]c){
		return Arrays.asList(c);
	}
	
	//METODO GENERICO Q TRANSFORMA UN ARRAY DE CUALQUIER WEA A UNA LISTA DE CUALQUIER WEA
	public static <T> List <T> fromArrayToList2(T[]c){
		return Arrays.asList(c);
	}
	
	//METODO GENERICO QUE RECIBE MÁS DE UN PARAMETRO Y Q TRANSFORMA UN ARRAY DE CUALQUIER WEA A UNA LISTA DE CUALQUIER WEA
		public static <T,G> List <T> fromArrayToList3(T[]c, G[]x){
			for(G elemento : x) {
				System.out.println(elemento);
			}
			return Arrays.asList(c);
		}
		
	//SE LIMITA EL MÉTODO A QUE SOLO SE LE PASEN PARAMETROS DE TIPOS DE ELEMENTOS QUE HEREDEN DE NUMBER DE JAVA
	public static <T,G extends Number> List <T> fromArrayToList3(T[]c, G[]x){
		for(G elemento : x) {
			System.out.println(elemento);
		}
		return Arrays.asList(c);
	}
		
	//RECIBE PARAMETROS QUE EXTIENDAN DE CLIENTE
	public static <T extends Cliente> List <T> fromArrayToList4(T[]c){
		return Arrays.asList(c);
	}
	
	//RECIBE PARAMETROS QUE EXTIENDAN DE CLIENTE y QUE IMPLEMENTEN LA INTERFAZ COMPARABLE. <T> DE COMPARABLE ES EL TIPO DE LA CLASE Q IMPLEMENTA COMPARABLE.
	public static <T extends Cliente & Comparable<T>> List <T> fromArrayToList5(T[]c){
		return Arrays.asList(c);
	}
	
	//ESTE MÉTODO RECIBE CUALQUIER LISTA DE UN TIPO QUE HEREDE DE CLIENTE.
	public static void imprimirClientes(List<?extends Cliente>clientes) {
		clientes.forEach(c -> System.out.println(c));
	}
	
	//ESTA WEA CALCULA EL MAYOR DE 3 OBJ'S. <T extends Comparable<T>>T : RECIBE PARAMETROS Q EXTIENDAN DE COMPARABLE. EL EXTENDS SE USA AQUÍ PARA CLASES E INTERFACES. LA "T" SOLA DICE Q RETORNA UN TIPO T. 
	public static <T extends Comparable<T>>T maximo(T a,T b,T c){
		T max = a;
		if(b.compareTo(max) > 0) {
			max=b;
		}
		if(c.compareTo(max) > 0) {
			max=c;
		}
		return max;
	}
	
	public static <A,B,C,D,E>List<A>chupaArrays(A[]z,B[]y,C[]x,D[]w,E[]v){
		return null;
	}
	
}
