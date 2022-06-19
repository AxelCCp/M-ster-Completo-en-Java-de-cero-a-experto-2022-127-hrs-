package A1_strings;

public class B2_27_EjemploStringConcatenacion {

	public static void main(String[] args) {
		String curso = "Programaci�n java";
		String profesor = "Andr�s Guzm�n";
	
		
		String resultado = curso.concat(profesor);
		System.out.println("curso = " + curso);
		System.out.println("resultado = " + resultado);
		System.out.println(curso == resultado);
		
		
		//OTRA FORMA DE CONCATENAR UN STRING, PERO DE UNA FORMA M�S FUNCIONAL CON EXPRESI�N LAMBDA
		String resultado2 = curso.transform(c -> {
			return c + " con " + profesor;
		});
		System.out.println("curso = " + curso);
		System.out.println(resultado2);
		
	}

}
