package javamaster.main;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.concurrent.TimeUnit;

public class A4_309_Periodos_y_Duracion {
	public static void main(String[] args) {
		
		//TIEMPO ENTRE 2 FECHAS
		LocalDateTime fecha1 = LocalDateTime.now();
		LocalDateTime fecha2 = LocalDateTime.now().plusHours(1).plusMinutes(20).plusSeconds(30).plusDays(1);
		Duration lapsus = Duration.between(fecha1, fecha2);
		System.out.println(lapsus);
		System.out.println(lapsus.getSeconds());
		System.out.println(lapsus.toDays());
		System.out.println(lapsus.toHours());
		System.out.println(lapsus.toMinutes());
		
		System.out.println();
		
		//INSTANTES DE DURACIÓN
		Instant i1 = Instant.now();
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Instant i2 = Instant.now();
		Duration tiempo = Duration.between(i1, i2);
		System.out.println(tiempo);
		
		System.out.println();
		
		//EJEMPLOS DE PERIODO  ... CALCULA EL TIEMPO ENTRE 2 FECHAS
		LocalDate fecha3 = LocalDate.of(2011, 9, 23);
		LocalDate fecha4 = LocalDate.of(2022,11, 15);
		Period periodo = Period.between(fecha3, fecha4);
		System.out.println(periodo);
		
		
	}
}
