package javamaster.lambda.main;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

import javamaster.lambda.model.Usuario;

public class A2_278_Predicate {
	public static void main(String[] args) {
		Predicate<Integer>test = num -> num > 10;
		boolean r = test.test(11);
		System.out.println("r = " + r);
		
		System.out.println("");//--------------------------------------
		
		Predicate<String>t2 = role -> role.equals("ROLE_ADMIN");
		System.out.println(t2.test("ROLE_USER"));
		
		System.out.println("");//--------------------------------------
		
		BiPredicate<String,String>t3 = (a,b) -> a.equals(b);
		System.out.println(t3.test("andres", "vegeta"));
		
		System.out.println("");//--------------------------------------

		BiPredicate<Integer,Integer>t4 = (a,b) -> a > b;
		System.out.println(t4.test(40, 25));
		
		System.out.println("");//--------------------------------------
		
		Usuario a = new Usuario();
		Usuario b = new Usuario();
		a.setNombre("Ulon");
		b.setNombre("Puar");
		
		BiPredicate<Usuario,Usuario>tx = (ua,ub) -> ua.getNombre().equals(ub.getNombre());
		System.out.println(tx.test(a, b));
		
		
	}
}
