package javamaster.patrones.decorator.main;

import javamaster.patrones.decorator.Formateable;
import javamaster.patrones.decorator.Texto;
import javamaster.patrones.decorator.decorador.MayusculaDecorador;
import javamaster.patrones.decorator.decorador.ReemplazarEspaciosDecorador;
import javamaster.patrones.decorator.decorador.ReversaDecorador;
import javamaster.patrones.decorator.decorador.SubrayadoDecorador;

public class MainDecorador {
	public static void main(String[] args) {
		Formateable texto = new Texto("Hola que tal andrés");
		MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
		ReversaDecorador reversa = new ReversaDecorador(mayuscula);
		SubrayadoDecorador subrayado = new SubrayadoDecorador(reversa);
		ReemplazarEspaciosDecorador reemplazar = new ReemplazarEspaciosDecorador(subrayado);
		System.out.println(reemplazar.darFormato());
		
		
	}
}
