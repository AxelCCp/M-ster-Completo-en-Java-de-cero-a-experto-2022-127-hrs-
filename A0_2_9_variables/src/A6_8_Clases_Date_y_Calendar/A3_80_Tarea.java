package A6_8_Clases_Date_y_Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class A3_80_Tarea {

	
	//TAREA PENDIENTE***************
	
/* Para esta tarea se pide ingresar una fecha de nacimiento en formato string, convertirla a una fecha del tipo java.util.Date y 
 * calcular la edad de la persona de acuerdo a la fecha actual.
   Intentar usar solo lo visto hasta el momento, no el api de java 8 que lo veremos mas adelante, 
   también se pueden apoyar de google que hay varios ejemplos.
 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ingresa una fecha de nacimiento con el siguiente formato yyyy-MM-dd :");
		String fechaStr = scan.next();
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date fechaDate = formatoFecha.parse(fechaStr);
			System.out.println(fechaDate);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
}
