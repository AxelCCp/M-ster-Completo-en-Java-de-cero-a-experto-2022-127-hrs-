package A3_4_operadores;

public class A7_42_PrecedenciaDeOperadoresLogicos {

	public static void main(String[] args) {
		
		// EN LOS OPERADORES LOGICOS, EL "AND" SIEMPRE TIENE PRIORIDAD SOBRE EL "OR"
		
		int i =3;
		byte j = 3;		
		float k = 127e-7F;
		double l = 2.1413e3;
		boolean m = false;
		
		
		//PRIMERO SE EVAL�A EL && Y DESPU�S EL ||
		//						<-----------
		//			 true || false && false
		boolean b1 = i==j || k<l && m==true;     
		System.out.println("b1 = " + b1);                      // R: true
		
		boolean b2 = true || false && false;				   // R :true
		System.out.println("b2 = " + b2);

		boolean b3 = true || false && false || true;		   // R : true
		System.out.println("b3 = " + b3);
		
		//LEYENDO DE LEFT TO RIGHT
		boolean b4 = ((true || false) && false) || true;	   // R : false
		System.out.println("b4 = " + b4);
	}

}
