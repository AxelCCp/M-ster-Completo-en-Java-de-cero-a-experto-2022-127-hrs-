package A3_4_operadores;

public class A8_45_OperadorTernario {

	public static void main(String[] args) {
		
		// VATIABLE = CONDICION ? siEsVerdadero : siEsFalso;
		
		String variable = 7==7 ? "si es verdadero" : "no es falso";
		System.out.println(variable);
		
		
		String estado = "";
		double promedio = 6.2;
		
		estado = promedio>5.49?"Aprobado":"Reprobado";
		
		System.out.println("Estado : " + estado);

	}

}
