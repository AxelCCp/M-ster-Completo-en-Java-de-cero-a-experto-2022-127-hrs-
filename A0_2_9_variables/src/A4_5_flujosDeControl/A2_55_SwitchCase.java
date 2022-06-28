package A4_5_flujosDeControl;

public class A2_55_SwitchCase {
	
	
	public static void main(String[] args) {	
		
		//EL SWITCH NO SOPORTA LONG
		
		int num = 3;
		
		switch(num) {
			case 0 :
				System.out.println("El número es 0");
				break;
			case 1 :
				System.out.println("El número es 1");
				break;
			case 2 :
				System.out.println("El número es 2");
				break;
			case 3 :
				System.out.println("El número es 3");
				break;
			default :
				System.out.println("numero o caracter desconocido");
		}
		
	}
	
}
