package javamaster.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javamaster.jdbc.model.Categoria;
import javamaster.jdbc.model.Producto;
import javamaster.jdbc.repo.IRepositorio;
import javamaster.jdbc.repo.ProductoRepositorio;
import javamaster.jdbc.util.ConexionBBDD;

public class B1_342_Main {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			
			System.out.println("::::::::::::::LISTAR::::::::::::::::::");
			conn = ConexionBBDD.getInstance();
			IRepositorio<Producto>repositorio = new ProductoRepositorio();
			repositorio.listar().forEach(System.out::println);
			
			System.out.println(":::::::::::::::POR ID:::::::::::::::::");
			
			//CLASE 343
			System.out.println(repositorio.porId(3L));
			
			System.out.println("::::::::::::::::CREAR::::::::::::::::");
			
			//CLASE 345
			Producto producto = new Producto();
			producto.setNombre("teclado mecánico red dragon");
			producto.setPrecio(600);
			producto.setFechaRegistro(new Date());
			
			Categoria categoria = new Categoria();
			categoria.setId(3L);
			producto.setCategoria(categoria);
			
			repositorio.guardar(producto);
			System.out.println("Producto guardado con éxito");
			System.out.println();
			
			System.out.println("::::::::::::::VOLVER A LISTAR::::::::::::::::::");
			
			repositorio.listar().forEach(System.out::println);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
