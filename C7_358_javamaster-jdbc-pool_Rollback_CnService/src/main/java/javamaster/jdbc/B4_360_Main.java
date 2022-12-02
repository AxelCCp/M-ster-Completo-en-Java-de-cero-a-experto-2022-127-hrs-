package javamaster.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import javamaster.jdbc.model.Categoria;
import javamaster.jdbc.model.Producto;
import javamaster.jdbc.repo.CategoriaRepositorio;
import javamaster.jdbc.repo.IRepositorio;
import javamaster.jdbc.repo.ProductoRepositorio;
import javamaster.jdbc.service.CatalogoServicio;
import javamaster.jdbc.service.IService;
import javamaster.jdbc.util.ConexionBBDD;

public class B4_360_Main {
	public static void main(String[] args) throws SQLException{
		
		IService servicio = new CatalogoServicio();
		System.out.println("::::::::::::::LISTAR::::::::::::::::::");
		servicio.listar().forEach(System.out::println);
			
		System.out.println("::::::::::::::INSERTAR NUEVA CATEGORIA::::::::::::::::::");
		Categoria categoria = new Categoria();
		categoria.setNombre("Luces");

		System.out.println("::::::::::::::::CREAR::::::::::::::::");
		Producto producto = new Producto();
		producto.setNombre("Lámpara Led");
		producto.setPrecio(990);
		producto.setFechaRegistro(new Date());
		producto.setSku("abcd005");	
		servicio.guardarProductoConCategoria(producto, categoria);

		System.out.println("Producto guardado con éxito : " + producto.getId());

			
		System.out.println("::::::::::::::VOLVER A LISTAR::::::::::::::::::");
			
		servicio.listar().forEach(System.out::println);
			
			
		
			
	}
}
