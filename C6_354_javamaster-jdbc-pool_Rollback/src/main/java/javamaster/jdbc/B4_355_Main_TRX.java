package javamaster.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import javamaster.jdbc.model.Categoria;
import javamaster.jdbc.model.Producto;
import javamaster.jdbc.repo.CategoriaRepositorioImpl;
import javamaster.jdbc.repo.IRepositorio;
import javamaster.jdbc.repo.ProductoRepositorio;
import javamaster.jdbc.util.ConexionBBDD;

public class B4_355_Main_TRX {
	public static void main(String[] args) throws SQLException{
		
		try(Connection conn = ConexionBBDD.getConnection()){
			if(conn.getAutoCommit()) {
				conn.setAutoCommit(false);
			}
			try {
			
			System.out.println("::::::::::::::INSERTAR NUEVA CATEGORIA::::::::::::::::::");
			IRepositorio<Categoria>repositorioCat = new CategoriaRepositorioImpl(conn);
			Categoria categoria = new Categoria();
			categoria.setNombre("Electrohogar");
			Categoria nuevaCategoria = repositorioCat.guardar(categoria);
			System.out.println("categoria guardada con éxito : " + nuevaCategoria.getId());
			
			System.out.println("::::::::::::::LISTAR::::::::::::::::::");
			IRepositorio<Producto>repositorio = new ProductoRepositorio(conn);
			repositorio.listar().forEach(System.out::println);
			
			System.out.println(":::::::::::::::POR ID:::::::::::::::::");
			System.out.println(repositorio.porId(3L));
			
			System.out.println("::::::::::::::::CREAR::::::::::::::::");
			Producto producto = new Producto();
			producto.setNombre("Refrigerador Samsung");
			producto.setPrecio(9000);
			producto.setFechaRegistro(new Date());
			producto.setSku("abcd002");
			producto.setCategoria(nuevaCategoria);
			
			repositorio.guardar(producto);
			System.out.println("Producto guardado con éxito");
			System.out.println();
			
			System.out.println("::::::::::::::VOLVER A LISTAR::::::::::::::::::");
			
			repositorio.listar().forEach(System.out::println);
			
			conn.commit();
			
			}catch(SQLException e) {
				conn.rollback();
				e.printStackTrace();
			}
		}
			
	}
}
