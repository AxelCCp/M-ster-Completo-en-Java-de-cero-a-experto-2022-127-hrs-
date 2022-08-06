package A0_matrices;

public class A9_127_LimiteSuperior_e_Inferior_yDiagonal {
	public static void main(String[] args) {
		int[][]matriz = new int[5][5];
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				//i=j EN LA DIAGONAL
				if(i==j) {
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
