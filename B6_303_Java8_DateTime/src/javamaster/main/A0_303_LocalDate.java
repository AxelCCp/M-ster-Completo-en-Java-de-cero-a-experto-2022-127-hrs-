package javamaster.main;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class A0_303_LocalDate {
	public static void main(String[] args) {
		LocalDate fechaActual = LocalDate.now();
		System.out.println("Fecha actual : " + fechaActual);
		System.out.println("Día : " + fechaActual.getDayOfMonth());
		Month mes = fechaActual.getMonth();
		System.out.println("Nombre mes :" + mes);
		System.out.println("Mes.getValue() : " + mes.getValue());
		System.out.println("Mes en español : " + mes.getDisplayName(TextStyle.FULL, new Locale("es","ES")));
		DayOfWeek diaSemana = fechaActual.getDayOfWeek();
		System.out.println("Número del día : " + diaSemana.getValue());
		System.out.println("Nombre del día : " + diaSemana.getDisplayName(TextStyle.FULL, new Locale("es","ES")));
		
		System.out.println("Mes : " + fechaActual.getMonthValue());
		System.out.println("Año : " + fechaActual.getYear());
		System.out.println("Día del año : " + fechaActual.getDayOfYear());
		System.out.println("Era : " + fechaActual.getEra());
			
		fechaActual = LocalDate.of(2022, 1, 25);
		System.out.println("Fecha actual : " + fechaActual);
		
		fechaActual = LocalDate.of(2022, Month.DECEMBER, 25);
		System.out.println("Fecha actual : " + fechaActual);
		
		fechaActual = LocalDate.parse("2022-02-01");
		System.out.println("fecha actual = " + fechaActual);
		
		LocalDate diaDeManiana = LocalDate.now().plusDays(1);
		System.out.println(diaDeManiana);
		
		LocalDate mesAnteriorMismoDia = LocalDate.now().minusMonths(1);
		System.out.println(mesAnteriorMismoDia);
		
		mesAnteriorMismoDia = LocalDate.now().minus(1,ChronoUnit.MONTHS);
		System.out.println(mesAnteriorMismoDia);
		
		DayOfWeek miercoles = LocalDate.parse("2020-11-11").getDayOfWeek();
		System.out.println("miercoles : " + miercoles);
		
		int once = LocalDate.of(2020, 11, 11).getDayOfMonth();
		System.out.println("once : " + once);
		
		boolean esBisiesto = LocalDate.now().isLeapYear();
		System.out.println(esBisiesto);
		
		//COMPARA FECHA ACTUAL CON OTRA FECHA 
		boolean esAntes = LocalDate.now().isBefore(LocalDate.parse("2023-11-10"));
		System.out.println(esAntes);
		
		boolean esDespues = LocalDate.now().isAfter(LocalDate.parse("2023-11-10"));
		System.out.println(esDespues);
		
		
	}
}
