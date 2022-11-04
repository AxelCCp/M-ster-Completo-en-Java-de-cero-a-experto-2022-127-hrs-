package javamaster.main;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

//CLASE292
//DENTRO DEL GENERATE VA UNA LAMBDA DEL TIPO SUPPLIER.
//2.-SE LIMITA AL FLUJO A 7 ELEMENTOS.
//3.-SE INICIALIZA EL CONTADOR EN 0.

public class B6_292_StreamInfinito_con_Generate {
	public static void main(String[] args) {
		//3
		AtomicInteger contador = new AtomicInteger(0);
		Stream.generate(() -> { 
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//return "HOLA MUNDO";
			return contador.incrementAndGet();
			})
		.limit(7) //2
		.forEach(System.out::println);
	}
}
