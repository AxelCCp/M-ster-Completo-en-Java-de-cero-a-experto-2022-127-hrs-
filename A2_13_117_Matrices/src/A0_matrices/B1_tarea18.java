package A0_matrices;

public class B1_tarea18 {
	public static void main(String[] args) {
		//IMPRIME UNA X
		int[][]a = new int[18][18];
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a[i].length; j++) {
				if(i==j) {
					a[i][j] = 18;
				}
				if(j==a.length-1-i) {
					a[i][j] = 18;
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
