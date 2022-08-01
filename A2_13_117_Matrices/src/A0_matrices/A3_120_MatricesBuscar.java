package A0_matrices;

public class A3_120_MatricesBuscar {
	public static void main(String[] args) {
		
		int[][]matrizDeEnteros = {
				{23,34,45},
				{63,7984,957},
				{122,15,475}
		};
		int  elementoBuscar = 15;
		boolean encontrado = false;
		int i,j=0;
		buscar : for(i=0; i<matrizDeEnteros.length; i++) {
			for(j=0; j<matrizDeEnteros[i].length; j++) {
				if(matrizDeEnteros[i][j] == elementoBuscar) {
					encontrado = true;
					break buscar;
				}
			}
		}
		if(encontrado == true) {
			System.out.println("Encontrado : " +  elementoBuscar + " en las coordenadas " + i + "," + j);
		}else {
			System.out.println(elementoBuscar + " no se encontró en la matriz");
		}
	}
}
