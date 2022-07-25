package A0_Arreglos;

public class A3_101_ArrayInt_ordenamientoBurbuja {
	public static void main(String[] args) {
		Integer[]numeros = new Integer[4];
		numeros[0] = 10;
		numeros[1] = 45;
		numeros[2] = 76;
		numeros[3] = 23;
		//---------------------------------------------------
		for(int i=0;i<numeros.length-1;i++) {
			for(int j=0; j<numeros.length-1-i; j++) {
				if(numeros[j+1].compareTo(numeros[j])<0) {
					int auxiliar = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = auxiliar;
				}
			}
		}
		for(Integer n : numeros) {
			System.out.println(n);
		}
		System.out.println("..........");
		for(Integer i=0; i<numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		//---------------------------------------------------
		
		String[]productos = {"vgyvgyvgyvgy","bhubhubhubhu","nijnjinjiji","mkomkomko","fñlgkhlfgñl","tpoyiupt","znbxcvznx","ahgsfdg","qwteruqw"};
		sortBurbuja(productos);
		sortBurbuja(numeros);
	}
	
	
	//MÉTODO QUE ORDENA EL ARREGLO. SE USA LA CLASE OBJECT PARA HACERLO GENERICO Y COMPARABLE, YA QUE TIENE LOS TIPOS GENERICOS :::eje::: Comparable<String>...
	public static void sortBurbuja(Object[]arreglo) {
		System.out.println(":::::::::::::::sortBurbuja:::::::::::::::");
		int total = arreglo.length;
		int contador =0;
		for(int i=0;i<total-1;i++) {
			for(int j=0; j<total-1-i; j++) {
				if(((Comparable)arreglo[j+1]).compareTo(arreglo[j]) < 0) {
					Object auxiliar = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = auxiliar;
				}
				contador++;
			}
		}
		System.out.println("Contador :" + contador);
		for(Object n : arreglo) {
			System.out.println(n);
		}
	}
	
}
