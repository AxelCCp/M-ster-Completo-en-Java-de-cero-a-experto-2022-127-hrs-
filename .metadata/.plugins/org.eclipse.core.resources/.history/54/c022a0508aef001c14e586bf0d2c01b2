package A1_strings;

public class C0_34_ConvertirStringToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String trabalenguas = "trabalenguas";
		System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());  // R : [C@626b2d4a
		
		
		char[]arreglo = trabalenguas.toCharArray();
		int largo = arreglo.length;
		for(int i=0; i<largo;i++) {
			System.out.print(arreglo[i]);
		}
		
		System.out.println("");
		
		//SE CONVIERTE EN UN ARREGLO DE CHAR EN UN ARREGLO DE STRING, USANDO UNA EXPRESIÓN REGULAR 
		//CON SPLIT VA A SEPARAR LOS CARACTERES SEGÚN EL CARACTER INDICADO POR PARÁMETRO.
	
		System.out.println(trabalenguas.split("a")); // R : [Ljava.lang.String;@156643d4
		String[]arreglo2 = trabalenguas.split("a");
		int largo2 = arreglo2.length;
		for(int i=0;i<largo2;i++) {
			System.out.print(arreglo2[i]);  // R : trblengus
		} 
		 
		System.out.println();
		
		String archivo = "alguna.imagen.pdf";
		String[]doc = archivo.split("\\.");      // SE USA  \\. PARA INDICAR QUE SE USA EL "."
		int largo3 = doc.length;
		for(int i=0;i<largo3;i++) {
			System.out.print(doc[i]);
		}
		System.out.println();
		//SE OBTIENE LA EXTENSIÓN
		System.out.println(doc[largo3-1]);
		
	}

}
