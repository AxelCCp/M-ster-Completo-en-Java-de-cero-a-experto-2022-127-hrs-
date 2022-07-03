package A5_6_ClasesWrapper_TiposDeDatosDeReferencia;

public class A6_73_PasarPorValor {
	
	public static void main(String[] args) {
		
		
		int i = 10;
		System.out.println("iniciamos el main con i = " + i);
		
		test(i);
		
		//SE PODRÍA PENSAR Q I DEBERIA SER 35, YA Q SE CAMBIÓ EN EL MÉTODO, PERO FINALMENTE VALE 10.
		//EST0 SE DEBE A QUE SE PASA EL VALOR U NO LA REFERENCIA.
		System.out.println("finalizamos el main con i = " + i);			
	}
	
	
	
	public static void test(int i) {
		System.out.println("Iniciamos el método test con i = " + i);
		i =35;
		System.out.println("finaliza el método test con i = " + i);
	}
	
	
	
}
