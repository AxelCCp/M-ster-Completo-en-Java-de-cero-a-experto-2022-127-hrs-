package com.java.master;

public class A0_173_Calculadora {
	
	
	//argumentos : ES UN ARRAY 
	public int sumar(int... argumentos) {
		int total = 0;
		for(int i:argumentos) {
			total+=i;
		}
		return total;
	}
	
	public float sumar2(float a, int... argumentos) {
		float total = a;
		for(int i:argumentos) {
			total+=i;
		}
		return total;
	}
	
	public double sumar3(double... varargs) {
		double total = 0.0d;
		for(double d : varargs) {
			total+=d;
		}
		return total;
	}
	
	
	
	public int sumar(int a, int b) {
		return a+b;
	}
	public float sumar(float x, float y) {
		return x+y;
	}
	public float sumar(int i, float j) {
		return i+j;
	}
	public float sumar(float i, int j) {
		return i+j;
	}
	public double sumar(double a, double b) {
		return a+b;
	}
	public int sumar(String a, String b) {
		try {
			int resultado = Integer.parseInt(a) + Integer.parseInt(b);
			return resultado;
		}catch(NumberFormatException e) {
			return 0;
		}
	}
}
