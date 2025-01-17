package A3_4_operadores;

public class A4_39_OperadoresIncrementoDecremento {
	public static void main(String[] args) {
	
		
		//OPERADORES DE INCREMENTO Y DECREMENTO
		
		//PRE-INCREMENTO
		int i = 1;
		int j = ++i;  					    // j= i+1 =2			//PRIMERO INCREMENTA EL VALOR DE I Y DESPU�S SE LE ASIGNA A J.
		System.out.println(i);				// R : 2
		System.out.println(j);				// R : 2
		
		//POST-INCREMENTO
		i = 2;
		j = i++;	 					    //PRIMERO SE LE ASIGNA EL VALOR DE I A J Y DESPU�S SE INCREMENTA I. 			
		System.out.println(i);				// R : 3
		System.out.println(j);				// R : 2
		
		//PRE-DECREMENTO
		i = 3;
		j = --i;
		System.out.println(i);              // R : 2
		System.out.println(j);				// R : 2
		
		//POST-DECREMENTO
		i = 4;
		j = i--;
		System.out.println(i);			    // R : 3
		System.out.println(j);				// R : 4
		
		System.out.println(++j);			// R : 5
		System.out.println(j++);			// R : 5
		System.out.println(j);				// R : 6
		
		
		
		
		
	}
}
