package A0_matrices;

public class B2_tarea19 {
	//IMPRIME UNA SILLA
	public static void main(String[] args) {
		int[][]a = new int[10][10];
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {
				if(j==3) {
					a[i][j] = 7;
				}
				if(j>3 && j<6 && i==5) {
					a[i][j] = 7;
				}
				if(i>5 && j==5) {
					a[i][j] = 7;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+"\t" );
			}
			System.out.println();
		}
	}
}
