package A0_Arreglos;

public class A4_103_ArraysCombinados {
	public static void main(String[] args) {
		Integer[]a,b,c;
		a = new Integer[10]; 
		b = new Integer[10]; 
		c = new Integer[20]; 
		
		for(int i=0;i<a.length;i++) {
			a[i] = i+1;
		}
		
		for(int i=0;i<b.length;i++) {
			b[i] = (i+1)*5;
		}
		
		int aux = 0;
		
		for(int i=0;i<10;i++) {
			c[aux++] = a[i];
			c[aux++] = b[i];
		}
		
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
	}
	
}
