package javamaster.jdbc;


import javamaster.jdbc.model.Producto;
import javamaster.jdbc.repo.IRepositorio;
import javamaster.jdbc.repo.ProductoRepositorio;


public class B3_345_MainDelete {
	public static void main(String[] args) {
		
			
			System.out.println("::::::::::::::LISTAR::::::::::::::::::");
			IRepositorio<Producto>repositorio = new ProductoRepositorio();
			repositorio.listar().forEach(System.out::println);
			
			System.out.println(":::::::::::::::POR ID:::::::::::::::::");
			
			//CLASE 343
			System.out.println(repositorio.porId(2L));
			
			System.out.println("::::::::::::::::ELIMINAR::::::::::::::::");
			
			//CLASE 345
			repositorio.eliminar(2L);
			System.out.println("Producto eliminado con éxito");
			System.out.println();
			
			System.out.println("::::::::::::::VOLVER A LISTAR::::::::::::::::::");
			
			repositorio.listar().forEach(System.out::println);
			
	}
}
