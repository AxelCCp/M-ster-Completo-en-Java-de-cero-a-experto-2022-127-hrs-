package javamaster.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javamaster.jdbc.model.Producto;
import javamaster.jdbc.repo.IRepositorio;
import javamaster.jdbc.repo.ProductoRepositorio;
import javamaster.jdbc.util.ConexionBBDD;

public class B3_345_MainDelete {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			
			System.out.println("::::::::::::::LISTAR::::::::::::::::::");
			conn = ConexionBBDD.getInstance();
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
