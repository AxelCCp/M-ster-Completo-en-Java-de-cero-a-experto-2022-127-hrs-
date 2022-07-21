package A0_Arreglos;

import java.util.Arrays;

public class A2_99_Array_OrdenamientoBurbuja {
	public static void main(String[] args) {
		
		//COMPARETO() : COMPARA 2 VARIABLES SEG�N LA POSISCI�N QUE TENGAN EN LA TABLA UNICODE 
		
		
		String[]productos = {"vgyvgyvgyvgy","bhubhubhubhu","nijnjinjiji","mkomkomko","f�lgkhlfg�l","tpoyiupt","znbxcvznx","ahgsfdg","qwteruqw"};
		int total = productos.length;
		
		//SE COMPARA CADA ELEMENTO CON CADA ELEMENTO DEL ARREGLO Y LOS ORDENA 
		for(int i=0; i<total; i++) {
			for(int j=0; j<total; j++){
				if(productos[i].compareTo(productos[j])<0) {
					String auxiliar = productos[i];
					productos[i] = productos[j];
					productos[j] = auxiliar;
				}
			}
		}
		
		for(String nn : productos) {
			System.out.println(nn);
		}
		
		 /* R :
		  * ahgsfdg
			bhubhubhubhu
			f�lgkhlfg�l
			mkomkomko
			nijnjinjiji
			qwteruqw
			tpoyiupt
			vgyvgyvgyvgy
			znbxcvznx
		 */
		
	}
}
