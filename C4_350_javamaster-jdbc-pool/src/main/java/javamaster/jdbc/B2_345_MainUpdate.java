package javamaster.jdbc;

import javamaster.jdbc.model.Categoria;
import javamaster.jdbc.model.Producto;
import javamaster.jdbc.repo.IRepositorio;
import javamaster.jdbc.repo.ProductoRepositorio;

public class B2_345_MainUpdate {
	public static void main(String[] args) {
		
			
			System.out.println("::::::::::::::LISTAR::::::::::::::::::");
			IRepositorio<Producto>repositorio = new ProductoRepositorio();
			repositorio.listar().forEach(System.out::println);
			
			System.out.println(":::::::::::::::POR ID:::::::::::::::::");
			
			//CLASE 343
			System.out.println(repositorio.porId(2L));
			
			System.out.println("::::::::::::::::ACTUALIZAR::::::::::::::::");
			
			//CLASE 345
			Producto producto = new Producto();
			producto.setId(3L);
			producto.setNombre("teclado razer mecánico");
			Categoria categoria = new Categoria();
			categoria.setId(1L);
			producto.setCategoria(categoria);
			producto.setPrecio(40);
			repositorio.guardar(producto);
			System.out.println("Producto actualizado con éxito");
			System.out.println();
			
			System.out.println("::::::::::::::VOLVER A LISTAR::::::::::::::::::");
			
			repositorio.listar().forEach(System.out::println);
			
		
	}
}
