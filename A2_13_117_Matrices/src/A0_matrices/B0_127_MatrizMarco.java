package A0_matrices;

public class B0_127_MatrizMarco {
	public static void main(String[] args) {
		
	
		int[][]matriz = new int[5][5];
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				//i=j EN LA DIAGONAL
				if(i==0 || i==matriz.length-1 || j==0 || j==matriz[i].length-1) {
					matriz[i][j] = 1;
				}
			}
		}
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	} 	
}
