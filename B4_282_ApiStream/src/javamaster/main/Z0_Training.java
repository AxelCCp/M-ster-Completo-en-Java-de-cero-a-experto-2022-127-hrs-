package javamaster.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Z0_Training {
	public static void main(String[] args) {
		
		System.out.println("-------------------------- A0 ---------------------------");
		
		Stream<String>abc = Stream.of("a","b","c","d","e");
		abc.forEach(System.out::println);
		
		System.out.println();
		
		String[]frutas = {"pera","manzana","sandia","zanahoria","palta"};
		Stream<String>frutas1 = Arrays.stream(frutas);
		frutas1.forEach(System.out::println);
		
		System.out.println();
		
		Stream<String>frutas2 = Stream.<String>builder().add("uva").add("melón").add("naranja").build();
		frutas2.forEach(System.out::println);
		
		System.out.println();
		
		List<String>abc2 = new ArrayList<>();
		abc2.add("a");
		abc2.add("b");
		abc2.add("c");
		abc2.add("d");
		Stream<String>abcStream = abc2.stream();
		abcStream.forEach(System.out::println);
		
		System.out.println("-------------------------- A1 ---------------------------");
		
		Stream<String>abcA1 = Stream.of("a","B","c","D","e")
				.map(f -> {
					return f.toUpperCase();
				})
				.peek(System.out::println)
				.map(f -> {
					return f.toLowerCase();
				});
		abcA1.forEach(System.out::println);

		System.out.println();
		
		Stream<Integer>numsA1 = Stream.of(1,2,3,4,5,6,7)
				.peek(System.out::println)
				.map(n -> {
					return n*2;
				})
				.peek(n -> System.out.println(" " + n));
		
		List<Integer>listNumsA1 = numsA1.collect(Collectors.toList());
		listNumsA1.forEach(n -> System.out.print(" " + n));
		
		System.out.println("\n-------------------------- A2 SE PASA LA LISTA A OTRO TIPO---------------------------");
		
		Stream<Integer>numsA2 = Stream.of(1,2,3,4,5,6,7)
				.peek(n -> System.out.println(n))
				.map(n -> {
					Integer numInt = (int) (n*Math.random()*10);
					return numInt;
				})
				.peek(n -> System.out.println("  " + n));

		List<Integer>numsA2int = numsA2.collect(Collectors.toList());
		List<Double> listnd = new ArrayList<>();
		numsA2int.forEach(n -> {
			double nd = (double)n;
			listnd.add(nd); 
		});
		
		listnd.forEach(n -> System.out.println("    " + n));
		
		System.out.println("\n-------------------------- A4 FILTER ---------------------------");
		
		Stream<Integer>numsA4 = Stream.of(2,23,64,78,23,3,56,7,9,12)
				.filter(n -> n>10)
				.peek(n -> System.out.println(n));
		numsA4.forEach(n -> System.out.println(" " + n));
		
		System.out.println("\n-------------------------- A5 anyMatch ---------------------------");
		
		Stream<Integer>numsA5 = Stream.of(2,23,64,78,23,3,56,7,9,12);
		boolean existe = numsA5.anyMatch(n -> n.equals(64));
		System.out.println(existe);
		
		System.out.println("\n-------------------------- A6 CUENTA CANTIDAD DE REGISTROS ---------------------------");
		
		Stream<Integer>numsA6 = Stream.of(2,23,64,78,23,3,56,7,9,12);
		Long cantidad = numsA6.count();
		System.out.println(cantidad);
		
		System.out.println("\n-------------------------- A8 CUENTA Filtro empty ---------------------------");
		
		Integer[]numeros = new Integer[90]; 
		int contador = 1;
		for(int i=0; i<90;i++) {
			if(contador%10==0) {
				contador++;
			}
			numeros[i] = contador;
			contador++;
		}
		
		List<Double>listaDoubleA8 = new ArrayList<>();
		
		Stream<Integer>numsA8 = Stream.of(numeros).peek(n -> System.out.print(n + " "));
		
		List<Integer>listaIntegerA8 = Arrays.asList(numeros);
		listaIntegerA8.forEach(n -> {
			double nd = (double)n;
			listaDoubleA8.add(nd/2);
		});
				
		listaDoubleA8.forEach(System.out::println);
		
		Stream<Double>flujoDoubleA8 = listaDoubleA8.stream();
			
		Double resultadoA8 = flujoDoubleA8.reduce((double) 0, Double::sum);
		
		System.out.println(resultadoA8);
		
		System.out.println("\n-------------------------- A9 distinc / ELIMINA LOS REPETIDOS---------------------------");
		
		listaDoubleA8.add(0.5);
		listaDoubleA8.add(1.0);
		listaDoubleA8.add(1.5);
		
		Stream<Double>flujoDoubleA9 = listaDoubleA8.stream().distinct();
		
		flujoDoubleA9.forEach(System.out::println);
		
		
		System.out.println("\n-------------------------- B0 CONCATENAR CON REDUCE---------------------------");
	
		Stream<String>letrasB0 = Stream.of("a","e","i","o","u");
		String cadena  = letrasB0.reduce("String : ",(a,b) -> a + " " + b);
		System.out.println(cadena);
		
		System.out.println("\n-------------------------- B8 PARALLEL---------------------------");
		
		Integer[]numsB8 = {1,2,3,4,5};
		
		Stream<Integer>numsStreamB8 = Stream.of(numsB8)
				//.peek(System.out::println)
				.parallel()
				.map(n -> {
					if(n==1) {
						temporizador();
						System.out.println(Thread.currentThread().getName() + " : " + n);
						return (n*5) + 10;
					}
					if(n==2) {
						temporizador();
						System.out.println(Thread.currentThread().getName() + " : " + n);
						return n+1;
					}
					if(n==3) {
						temporizador();
						System.out.println(Thread.currentThread().getName() + " : " + n);
						return n-2;
					}
					if(n==4) {
						temporizador();
						System.out.println(Thread.currentThread().getName() + " : " + n);
						return (n*4) + 20;
					}
					else {
						temporizador();
						System.out.println(Thread.currentThread().getName() + " : " + n);
						return n;
					}
				})
				.peek(System.out::println)
				.flatMap(n -> {
					if(n%2==0) {
						temporizador();
						System.out.println(Thread.currentThread().getName() + " : " + n);
						return Stream.of(n*10);
					}else {
						temporizador();
						System.out.println(Thread.currentThread().getName() + " : " + n);
						return Stream.of(n*20);
					}
				});
		numsStreamB8.forEach(System.out::println);
			
	}
	public static void temporizador() {
		Long num = (long) (Math.random()*10);
		try {
			TimeUnit.SECONDS.sleep(num);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
