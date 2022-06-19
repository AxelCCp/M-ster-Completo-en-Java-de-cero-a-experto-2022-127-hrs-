package A1_strings;

public class B3_28_EjemploStringInmutable {

	public static void main(String[] args) {
		String curso = "Programación java";
		String profesor = "Andrés Guzmán";
		String 	detalle = 	curso + " con el instructor " + profesor;
		System.out.println(detalle);
		
		//PRESEDENCIA DE LOS OPERADORES 
		
		int numeroA = 10;
		int numeroB = 5;
		
		//COMO EL 1ER ELEMENTO ES UNA CADENA, JAVA ASUME QUE DEBE CONCATENAR, Y CONCATENA LOS NUMEROS A Y B
		System.out.println(detalle + numeroA + numeroB);
		//PARA QUE NO CONCATENE A Y B SE PONEN PARÉNTESIS
		System.out.println(detalle + (numeroA + numeroB));
		//AQUI ES ALREVES
		System.out.println(numeroA + numeroB + detalle);
		
		
		//METODO CONCAT: COMO LOS STRING SON INMUTABLES, CONCAT JUNTA LOS DEFERENTES STRING Y LOS ALMACENA EN UN NUEVO OBJ STRING, ASÍ LOS STRING ORGINALES SE MANTIENENINMUTABLES.
		String detalle2 = curso.concat(" con ".concat(profesor));
		System.out.println("detalle2 : " + detalle2);
		

	}

}
