package A0_variables;
/*
PRIMITIVOS

LOS PRIMITIVOS NO SON INSTANCIAS, NO SON OBJETOS. ES UN TIPO DE DATO QUE REPRESENTA UN VALOR. 
MIENTRAS QUE LOS TIPOS DE DATOS DE REFERENCIA, SI SON OBJ DE LA CLASE WRAPPER.


*/


public class A1_2_10_primitivos {
	public static void main(String[]args) {
		
		//BYTES
		System.out.println("tipo byte corresponde en byte a : " + Byte.BYTES);
		System.out.println("tipo byte corresponde en bites a : " + Byte.SIZE);
		System.out.println("valor máximo de un byte:" + Byte.MAX_VALUE);
		System.out.println("valor mínimo de un byte:" + Byte.MIN_VALUE);
		
		System.out.println(":");
		
		//SHORT
		System.out.println("tipo short corresponde en byte a : " + Short.BYTES);
		System.out.println("tipo short corresponde en bites a : " + Short.SIZE);
		System.out.println("valor máximo de un short:" + Short.MAX_VALUE);
		System.out.println("valor mínimo de un short:" + Short.MIN_VALUE);
		
		System.out.println(":");
		
		//SHORT
		System.out.println("tipo int corresponde en byte a : " + Integer.BYTES);
		System.out.println("tipo int corresponde en bites a : " + Integer.SIZE);
		System.out.println("valor máximo de un int:" + Integer.MAX_VALUE);
		System.out.println("valor mínimo de un int:" + Integer.MIN_VALUE);
		
		System.out.println(":");
		
		//LONG
		System.out.println("tipo long corresponde en byte a : " + Long.BYTES);
		System.out.println("tipo long corresponde en bites a : " + Long.SIZE);
		System.out.println("valor máximo de un Long:" + Long.MAX_VALUE);
		System.out.println("valor mínimo de un Long:" + Long.MIN_VALUE);
		
		//CARACTERÍSTICA NUEVA DE JAVA 10 
		var numVar = 127; 
		
	}
}
