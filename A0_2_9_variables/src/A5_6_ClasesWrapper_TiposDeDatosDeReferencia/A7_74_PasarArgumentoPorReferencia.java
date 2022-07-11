package A5_6_ClasesWrapper_TiposDeDatosDeReferencia;

public class A7_74_PasarArgumentoPorReferencia {

	public static void main(String[] args) {

		int [] edad = {10,11,12};
		System.out.println("iniciamos el main");
		
		for(int i=0;i<edad.length;i++) {
			System.out.println("edad[i] = " + edad[i]);
		}	
		
		System.out.println("antes de llamar al m�todo test");
		test(edad);
		System.out.println("despu�s de llamar al m�todo test");

		for(int i=0;i<edad.length;i++) {
			System.out.println("edad[i] = " + edad[i]);
		}
		
		
		//SE PODR�A PENSAR Q I DEBERIA SER 35, YA Q SE CAMBI� EN EL M�TODO, PERO FINALMENTE VALE 10.
		//EST0 SE DEBE A QUE SE PASA EL VALOR U NO LA REFERENCIA.
		System.out.println("finalizamos el main con los datos del arreglo modificados!");			
	}
	
	
	public static void test(int[]edadArr) {
		System.out.println("Iniciamos el m�todo test");
		for(int i=0;i<edadArr.length;i++) {
			edadArr[i] = edadArr[i]+20;
		}
		System.out.println("finaliza el m�todo test");
	}		
}
	
