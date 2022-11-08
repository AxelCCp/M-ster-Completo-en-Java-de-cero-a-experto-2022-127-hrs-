package javamaster.main;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class A3_307_ZonedDateTime {

	public static void main(String[] args) {
		
		LocalDateTime fechaLocal = LocalDateTime.now();
		ZoneId newYork = ZoneId.of("America/New_York");
		ZonedDateTime zonaNy = ZonedDateTime.of(fechaLocal, newYork);
		System.out.println("Zona horaria de new york : "  + zonaNy);
		
		ZoneId madrid = ZoneId.of("Europe/Madrid");
		ZonedDateTime zonaMadrid = zonaNy.withZoneSameInstant(madrid);
		System.out.println("Zona horaria Madrid : " + zonaMadrid);
		
		System.out.println();
		
		//CLASE 308
		
		//ESTABLECE UNA FECHA CON FORMATO
		LocalDateTime fechaLocal2 = LocalDateTime.parse("2021/09/23 12:45", DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
		//ZoneId newYork2 = ZoneId.of("America/New_York");
		ZonedDateTime zonaNy2 = ZonedDateTime.of(fechaLocal2, ZoneOffset.of("-04:00"));
		System.out.println("Zona horaria de new york : "  + zonaNy2);
		
		//ZoneId madrid2 = ZoneId.of("Europe/Madrid");
		ZonedDateTime zonaMadrid2 = zonaNy.withZoneSameInstant(ZoneOffset.of("+02:00")).plusHours(8);
		System.out.println("Zona horaria Madrid : " + zonaMadrid2);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
		System.out.println("Detalles del viaje a España : ");
		System.out.println("Partida NY : " + f.format(zonaNy2));
		System.out.println("Llegada a Madrid: " + f.format(zonaMadrid2));
		
		//ZONAS DISPONIBLES :::
		ZoneId.getAvailableZoneIds().forEach(System.out::println);
		
		
		
	}
}
