package javamaster.main;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class A1_304_LocalTime {
	public static void main(String[] args) {
		LocalTime ahora = LocalTime.now();
		System.out.println(ahora);
		System.out.println("Hora : " + ahora.getHour());
		System.out.println("Minutos : " + ahora.getMinute());
		System.out.println("Segundos : " + ahora.getSecond());
		
		LocalTime seisConTreinta = LocalTime.of(6, 30);
		System.out.println("seisConTreinta con of(6, 30) : " + seisConTreinta);
		
		LocalTime seisConTreintaY59 = LocalTime.of(6, 30, 59);
		System.out.println("seisConTreintaY59 con of(6, 30, 59) : " + seisConTreintaY59);
		
		seisConTreinta = LocalTime.parse("06:30");
		System.out.println("seisConTreinta con parse(\"06:30\") : " + seisConTreinta);
		
		//SE SUMA 1 HORA
		LocalTime sieteConTreinta = LocalTime.of(6, 30).plus(1,ChronoUnit.HOURS);
		System.out.println("sieteConTreinta : " + sieteConTreinta);
		
		boolean esAnterior = LocalTime.of(6, 30).isBefore(LocalTime.parse("07:30"));
		System.out.println("esAnterior : " + esAnterior);
		
		//a : am pm ... PUEDE SER "hh" o "HH" PARA FORMATO 24HRS.
		DateTimeFormatter df = DateTimeFormatter.ofPattern("hh:mm:ss a");
		String ahoraFormateado = ahora.format(df);
		System.out.println("ahoraFormateado : " + ahoraFormateado);
		
		ahoraFormateado = df.format(ahora);
		System.out.println("ahoraFormateado : " + ahoraFormateado);
		
		LocalTime max = LocalTime.MAX;
		LocalTime min = LocalTime.MIN;
		
		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
