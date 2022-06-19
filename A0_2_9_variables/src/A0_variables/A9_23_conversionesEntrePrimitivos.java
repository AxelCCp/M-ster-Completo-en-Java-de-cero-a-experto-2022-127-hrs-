package A0_variables;

public class A9_23_conversionesEntrePrimitivos {
	
	
	public static void main (String[]args) {
		
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

		String otroNumeroStr2 = "100";
		int otroNumeroInt2 = 100;
		
		otroNumeroStr2 = String.valueOf(otroNumeroInt2 + 10);
		System.out.println("otroNumeroStr  = " + otroNumeroStr); // ESTO DA 110.
		
		
		//------------------- CLASE 23 ------------------------
		int i = 10000;
		short s = (short) i;	 //AQUÍ HASY QUE HACER EL CAST  
		long l = i;				 //NO ES NECESARIO HACER EL CAST YA QUE EL INT CABE EN EL LONG.
		System.out.println("l = " + l );
		
		
		int i2 = 42768;
		short s2 = (short) i2;	 //AQUÍ HASY QUE HACER EL CAST  
		long l2 = i2;				 //NO ES NECESARIO HACER EL CAST YA QUE EL INT CABE EN EL LONG.
		System.out.println("l2 = " + l2 );
		System.out.println("i2 = " + i2 );
		System.out.println("s2 = " + s2 ); //DA NEGATIVO.	
	}
	
}
