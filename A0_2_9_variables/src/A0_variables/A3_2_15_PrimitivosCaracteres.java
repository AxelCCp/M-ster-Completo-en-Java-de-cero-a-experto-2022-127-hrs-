package A0_variables;

public class A3_2_15_PrimitivosCaracteres {
public static void main(String[]args){
		
		//SOLO PUEDE CONTENER UN SOLO CARACTER.
		char caracter = 'A';  
		char caracter2 = '1';  
		char caracter3 = '\u0040';   //CARACTER UNICODE @. 
		
		char decimal = 64;  //ESTE ES EL DECIMAL EN HTML CODE DEL @.  '\u0040' = 64.

		char simbolo = '@';

		System.out.println("caracter = " + caracter);
		System.out.println("caracter = " + caracter2);
		System.out.println("caracter = " + caracter3);	

		System.out.println(caracter3 == decimal);  //DEBE DAR TRUE.
		
		System.out.println(caracter3 == simbolo);  //DEBE DAR TRUE.


		//VALORES DE CHAR
		System.out.println("char corresponde en byte : " +  Character.BYTES);
		System.out.println("char corresponde en bites : " +  Character.SIZE);
		System.out.println("char valor minimo : " +  Character.MIN_VALUE);    //ESTO DA UN ESPACIO. EL VALOR ARROJADO PUEDE CAMBIAR DEPENDIENDO DE LA ARQUITECTURA DEL SISTEMA OPERATIVO. 
		System.out.println("char valor maximo : " +  Character.MAX_VALUE);    //ESTO DA UN CUADRADO. EL VALOR ARROJADO PUEDE CAMBIAR DEPENDIENDO DE LA ARQUITECTURA DEL SISTEMA OPERATIVO. 
		
		
		//CARACTERES UNICODE:
		//char espacio = 	'\u0020';
		//char retroceso = 	'\b';    	//ESTO ES LO MISMO QUE BORRAR UN ESPACIO.
		//char tabulador = 	'\t';        	//TABULADOR 1 ESPACIO DE SANGRÍA.
		//char nuevaLinea = 	'\n';
		//char retornoCarro =	'\r';
 
	}
}
