package A5_6_ClasesWrapper_TiposDeDatosDeReferencia;

public class A6_73_PasarPorValor {
	
	public static void main(String[] args) {
		
		
		int i = 10;
		System.out.println("iniciamos el main con i = " + i);
		
		test(i);
		
		//SE PODR�A PENSAR Q I DEBERIA SER 35, YA Q SE CAMBI� EN EL M�TODO, PERO FINALMENTE VALE 10.
		//EST0 SE DEBE A QUE SE PASA EL VALOR U NO LA REFERENCIA.
		System.out.println("finalizamos el main con i = " + i);			
	}
	
	
	
	public static void test(int i) {
		System.out.println("Iniciamos el m�todo test con i = " + i);
		i =35;
		System.out.println("finaliza el m�todo test con i = " + i);
	}
	
	
	
}
