package com.javamaster.set.model;

import java.util.Objects;

//1.-SE IMPLEMENTA LA INTERFAZ COMPARABLE PARA PODER USAR EL TREESET EN a4_244_MAINCOMPARABLE. PARA Q SE REALICE EL ORDENAMIENTO SEGÚN UNA DE LAS VARIABLES DEL OBJ.										//1
//2.-CON EL MÉTODO COMPARABLE SE ORDENA POR NOMBRE.
//3.-AHORA SE ORDENA POR NOTA.
//CLASE245
//4.-SE USAN EQUALS Y HASHCODE PARA 
public class A1_245_Alumno implements Comparable<A1_245_Alumno>{
	
	public A1_245_Alumno(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota; 
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return "A0_224_Alumno [nombre=" + nombre + ", nota=" + nota + "]";
	}
	
	//2
	@Override
	public int compareTo(A1_245_Alumno o) {
		/*
		if(this.nombre == null) {
			return 0;
		}
		return this.nombre.compareTo(o.getNombre());
		*/
		if(this.nota == o.getNota()) return 0;
		if(this.nota > o.getNota()) return 1;
		else return -1;		
	}
	
	//4
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		A1_245_Alumno alumno = (A1_245_Alumno)o;
		return Objects.equals(nombre, alumno.nombre) && Objects.equals(nota, alumno.nota);
	}
	
	public int hashCode() {
		return Objects.hash(nombre,nota);
	}
	
	private String nombre;
	private int nota;
}
