package A0_variables;

public class A9_2_21_conversionDeTipos {
	public static void main(String[]args){

		String numeroStr = "50";

		int numeroInt = Integer.parseInt(numeroStr);
	
		System.out.println("numeroInt = " + numeroInt);

		String  realStr = "98765.43";

		double realDouble = Double.parseDouble(realStr);

		System.out.println("realDouble = " + realDouble);

		String logicoStr = "true";
		boolean logicoBoolean = Boolean.parseBoolean(logicoStr );   
		System.out.println("logicoBoolean = " + logicoBoolean);

		//CLASE 22 .- PASAR DE PRIMITIO A STRING 
		int otroNumeroInt  = 100;
		
		System.out.println("otroNumeroInt: " + otroNumeroInt);
		String otroNumeroStr = Integer.toString(otroNumeroInt);
		
		//OTRA MANERA DE PASAR A STRING
		otroNumeroStr = String.valueOf(otroNumeroInt);
		System.out.println("otroNumeroStr  = " + otroNumeroStr);

		otroNumeroStr = String.valueOf(otroNumeroInt + 10);
		System.out.println("otroNumeroStr  = " + otroNumeroStr); // ESTO DA 110.

		

	}
}
