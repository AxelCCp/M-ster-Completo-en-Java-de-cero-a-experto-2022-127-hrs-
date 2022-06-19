package A0_variables;

public class A5_2_18_SistemasNumericos {

	public static void main(String[]args){

		int numeroDecimal = 500;
		System.out.println("Numero decimal = " + numeroDecimal);
		
		//REPRESENTACIÓN DEL 500 EN BINARIO : 111110100
		System.out.println("Numero binario  de = " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));	

		//TODO EL CÓDIGO QUE SE ESCRIBE SE CONVIERTE EN BITECODE QUE ES PROPIO DE LA MAQUINA VIRTUAL
		
		//AHORA SE LE DICE A JAVA QUE ESTE ES UN NÚMERO BINARIO. HAY QUE PONERLE 0b:
		int numeroBinario = 0b111110100;
		System.out.println("numeroBinario = " + numeroBinario); //ESTO VA A IMPRIMIR 500 Y NO EL BINARIO.
		

		//AHORA SE CONVIERTE EL 500 EN UN OCTAL .... EL NÚMERO OCTAL DE 500 ES 764.
		System.out.println("numero octal de " + numeroBinario + " = " + Integer.toOctalString(numeroDecimal));

		//AHORA PARA CONVERTIR A SISTEMA OCTAL, SE ANTEPONE UN 0. ASÍ EL COMPILADOR DE JAVA SABE QUE ES UN OCTAL.
		int numeroOctal = 0764;
		System.out.println(numeroOctal);  //VA A IMPRIMIR 500.

		//AHORA NUMERO EL NÚMERO HEXADECIMAL DE 500   //VA A IMPRIMIR 1f4
		System.out.println("NUMERO HEXADECIMAL DE " + numeroDecimal + " = " +  Integer.toHexString(numeroDecimal));
	
		//AHORA SE DEFINE EL NUMERO HEXADECIMAL 1f4. PARA QUE JAVA LO RECONOZCA SE ANTEPONE "0x". LAS X Y F PUEDEN SER UPPER O LOWER CASE.
		int numeroHex = 0x1f4;
		System.out.println("número hexadecimal = " + numeroHex); //DEBE MOSTRAR 500.
	
		
	}
	
}
