package A3_4_operadores;

public class A2_37_OperadoresDeAsignacion {

	public static void main(String[] args) {
		
		//LOS OPERADORES DE ASIGNACI�N SON EL "=" QUE ASIGNA UN VALOR A UNA VARIABLE
		
		int i = 5;
		int j = i + 4;
		
		//TAMBIEN DENTRO DE LOS OPERADORES DE ASIGNACI�N EST�N LOS "OPERADORES DE ASIGNACI�N COMBINADOS O COMPUESTOS" : 
		
		//ESTO ...
		//i = i + 2;
		//...ES IGUAL A ESTO...
		i+=2;
		System.out.println(i);   // R : 7
		
		j -=2;
		System.out.println(j);	 // R : 7
		
		//OPERADOR DE ASIGNACI�N COMBINADO USANSO STRING
		
		String sqlString = "select * from clientes as c";
		sqlString += " where c.nombre = 'Andres'";
		sqlString += " and c.activo=1";
		
		System.out.println(sqlString);
		
	}

}