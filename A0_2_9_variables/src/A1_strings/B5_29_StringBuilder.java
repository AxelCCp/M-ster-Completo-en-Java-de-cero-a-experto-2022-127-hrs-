package A1_strings;

public class B5_29_StringBuilder {
	
	
	public static void main(String[]args) {
		String a = "a";
		String b = "b";
		String c = a;
		
		
		
		//LA DIFERENCIA ENTRE UN STRING Y UN STRINGBUILDER ES QUE STRING ES INMUTABLE, MIENTRAS QUE STRINGBUILDER ES MUTABLE
		
		//EL OBJ  STRINGBUILDER ES MUCHO MÁS EFICIENTE QUE EL OBJ STRING A LA HORA DE CONCATENAR GRANDES CADENAS.
		
		
		StringBuilder sb = new StringBuilder(a); 
		
		
		
		long inicio = System.currentTimeMillis();
		
		for(int i = 0; i<500; i++) {
			//c = c.concat(a).concat(b).concat("\n");
			//c += a + b + "\n";
			
			//sb.append(a).append(b).append("\n");
			sb.append(a);
			sb.append(b);
			sb.append("\n");
		}
		
		long fin = System.currentTimeMillis();
		
		System.out.println(fin - inicio);
		System.out.println("c = " + c);
		System.out.println("sb = " + sb.toString());
		
		
	}
}
