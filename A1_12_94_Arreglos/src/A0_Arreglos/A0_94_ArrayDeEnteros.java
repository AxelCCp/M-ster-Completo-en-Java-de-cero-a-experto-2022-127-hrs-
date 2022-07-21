package A0_Arreglos;

import java.util.Arrays;

public class A0_94_ArrayDeEnteros {
	public static void main(String[] args) {
		
		int[]numeros = new int[4]; 
		int i = numeros[0] = (int)11L;
		int j = numeros[1] = Integer.valueOf("12");
		int k = numeros[2] = 10;
		int l = numeros[3] = 14;
		
		System.out.println(k);
		System.out.println(numeros[numeros.length-1]);
		
		System.out.println(":::::::::::::::");
		int total = numeros.length;
		for(int z=0; z<total;z++) {				
			System.out.println(numeros[z]);
		}
		
		System.out.println("::::::::SORT:::::::::");
		Arrays.sort(numeros);							//EL SORT TAMBN SIRVE CON LOS NÚMEROS
		for(int z : numeros) {
			System.out.println(z);
		}
		
		System.out.println(":::::::::::::::");
		
		String[] arrayString = new String[7];
		String a = arrayString[0] = "aaa";
		String b = arrayString[1] = "rrr";
		String c = arrayString[2] = "ccc";
		String d = arrayString[3] = "zzz";
		String e = arrayString[4] = "eee";
		String f = arrayString[5] = "xxx";
		String g = arrayString[6] = "ggg";
		for(String nn : arrayString) {
			System.out.println(nn);
		}
		System.out.println("::::::::SORT:::::::::");   //ORDENA LOS ELEMENTOS DEL ARRAY
		Arrays.sort(arrayString);
		for(String nn : arrayString) {
			System.out.println(nn);
		}
		
		System.out.println("::::::FOR INVERSO:::::::: " + (numeros.length-1));
		for(int h = numeros.length-1; h>=0; h--) {
			System.out.println(numeros[h]);
		}
		
	}
}
