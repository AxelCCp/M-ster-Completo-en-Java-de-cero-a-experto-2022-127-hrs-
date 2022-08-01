package A0_matrices;

public class A1_118_RecorreMatricesConForVersionSimplificada {
	public static void main(String[] args) {
		String[][]nombres = {{"iuoiu","alskdj"},{"ioryri","bhubh"},{"ompop","sezsz"}};
		
		
		System.out.println("iterando con for");
		for(int i=0; i<nombres.length; i++) {
			for(int j=0; j<nombres[i].length; j++) {
				System.out.print(nombres[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("iterando con forEach");
		//FOR PARA OBTENER CADA FILA
		for(String[]fila : nombres) {
			//FOR PARA RECORRER LOS NOMBRES EN CADA FILA
			for (String nombre : fila) {
				System.out.print(nombre + "\t");
			}
			System.out.println();
		}
	}
}
