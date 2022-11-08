package javamaster.main;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class A2_306_LocalDateTime {
	public static void main(String[] args) {
		LocalDateTime fechaTiempo = LocalDateTime.now();
		System.out.println("fechaTiempo : " + fechaTiempo);
		
		fechaTiempo = LocalDateTime.of(2022, Month.DECEMBER, 24, 20, 45,59);
		System.out.println("fechaTiempo : " + fechaTiempo);
		
		fechaTiempo = LocalDateTime.parse("2022-11-06T13:14:11.340359700");
		System.out.println("2022-11-06T13:14:11.340359700 : " + fechaTiempo);
		
		LocalDateTime fechaTiempo2 = fechaTiempo.plusDays(1);
		System.out.println("fechaTiempo2 : " + fechaTiempo2);
		
		LocalDateTime fechaTiempo3 = fechaTiempo.minusHours(5);
		System.out.println("fechaTiempo3 : " + fechaTiempo3);
		
		Month mes = fechaTiempo.getMonth();
		System.out.println("mes : " + mes);
		
		int dia = fechaTiempo.getDayOfMonth();
		System.out.println("dia " + dia);
		
		int anio = fechaTiempo.getYear();
		System.out.println("anio : " + anio);
		
		//FORMATOS ESTÁDARES DE FECHA
		String formato1 = fechaTiempo.format(DateTimeFormatter.ISO_DATE);
		System.out.println("formato1 : " + formato1);
			
		String formato2 = fechaTiempo.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
		System.out.println("formato2 : " + formato2);
		
		String formato3 = fechaTiempo.format(DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a"));
		System.out.println("formato2 : " + formato3);
		
	}
}
