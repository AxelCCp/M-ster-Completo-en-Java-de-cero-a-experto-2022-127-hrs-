package A0_matrices;

public class A8_126_SumarFilas_y_ColumnasDeUnaMatriz {
	 public static void main(String[] args) {
	        int sumaFila,sumaColumna;
	        int[][]a= {
	                {1,2,3},
	                {4,5,6},
	                {7,8,9}
	        };
	        int[][]suma = new int [3][3];
	        for(int i=0;i<a.length;i++) {
	            sumaFila=0;
	            sumaColumna=0;
	            for(int j=0; j<a[i].length; j++) {
	                sumaFila += a[i][j];    
	                sumaColumna += a[j][i];
	            }
	            System.out.println("Total fila " + i + " : " + sumaFila);
	            System.out.println("Total columna " + i  + " : " + sumaColumna);
	        }
	    }
}
