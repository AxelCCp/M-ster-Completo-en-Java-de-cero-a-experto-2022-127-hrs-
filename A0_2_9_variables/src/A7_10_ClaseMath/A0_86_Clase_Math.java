package A7_10_ClaseMath;

import java.util.Random;

public class A0_86_Clase_Math {
	public static void main(String[] args) {
		 int absoluto = Math.abs(-3);
		 System.out.println("absoluto = " + absoluto);
		 
		 double max = Math.max(3.5,1.2);
		 System.out.println("max = " + max);
		 	
		 double min = Math.min(3.5,1.2);
		 System.out.println("min = " + min);
		 
		 double techo = Math.ceil(3.5);
		 System.out.println("techo = " + techo);
		 
		 double piso = Math.floor(3.5);
		 System.out.println("piso = " + piso);
		 
		 long redondear = Math.round(3.5);
		 System.out.println("redondear = " + redondear);
		 
		 long redondear2 = Math.round(Math.PI);
		 System.out.println("redondear2 = " + redondear2);
		 
		 //EXPONENCIAL
		 double exp = Math.exp(1);
		 System.out.println(exp);
		 
		 //FUNCIÓN LOGARITMO NATURAL DE 10
		 double log = Math.log(10);
		 System.out.println(log);
		 
		 //POTENCIA
		 double potencia = Math.pow(10, 3);
		 System.out.println(potencia);
		 
		 //RAIZ CUADRADA
		 double raiz = Math.sqrt(5);
		 System.out.println(raiz);
		 
		 //CONVERTIR UN ANGULO EN RADIANES A GRADOS trigonometría
		 double grados = Math.toDegrees(1.57);
		 System.out.println(grados);
		 
		 //CONVERTIR DE RADIANES A GRADOS trigonometría
		 double radianes = Math.toRadians(90.00);
		 System.out.println(radianes);
		 
		 //SENO DE 90 trigonometría
		 System.out.println("SIN(90): " +  Math.sin(radianes));
		 
		 //COSENO DE 90 trigonometría
		 System.out.println("Cos(90): " +  Math.cos(radianes));
		 
		 
		 //------CLASE RANDOM--------
		 Random randomObj = new Random();
		 int randomInt = randomObj.nextInt();
		 System.out.println(randomInt);
		 
		 //RANGO HASTA 7 ... NO INCLUYE EL 7
		 int randomInt2 = randomObj.nextInt(7);
		 System.out.println(randomInt2);
		
		 //RANGO ENTRE 2 NÚMEROS 15 Y 25 ... incluyendo el 25
		 int randomInt3 = 15 + randomObj.nextInt(25 - 15 + 1);
		 System.out.println(randomInt3);
		 
		 
	}
	
	
}
