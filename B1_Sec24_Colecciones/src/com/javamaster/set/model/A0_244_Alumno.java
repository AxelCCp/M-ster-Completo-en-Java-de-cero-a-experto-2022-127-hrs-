package com.javamaster.set.model;

//1.-SE IMPLEMENTA LA INTERFAZ COMPARABLE PARA PODER USAR EL TREESET EN a4_244_MAINCOMPARABLE. PARA Q SE REALICE EL ORDENAMIENTO SEGÚN UNA DE LAS VARIABLES DEL OBJ
										//1
//2.-CON EL MÉTODO COMPARABLE SE ORDENA POR NOMBRE.
//3.-AHORA SE ORDENA POR NOTA.
public class A0_244_Alumno implements Comparable<A0_244_Alumno>{
	
	public A0_244_Alumno(String nombre, int nota) {
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
	public int compareTo(A0_244_Alumno o) {
		// TODO Auto-generated method stub
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

	private String nombre;
	private int nota;
}
