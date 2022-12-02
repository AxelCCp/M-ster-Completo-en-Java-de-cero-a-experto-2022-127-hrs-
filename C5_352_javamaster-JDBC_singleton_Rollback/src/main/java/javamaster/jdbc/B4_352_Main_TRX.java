package javamaster.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import javamaster.jdbc.model.Categoria;
import javamaster.jdbc.model.Producto;
import javamaster.jdbc.repo.IRepositorio;
import javamaster.jdbc.repo.ProductoRepositorio;
import javamaster.jdbc.util.ConexionBBDD;

public class B4_352_Main_TRX {
	public static void main(String[] args) throws SQLException {
		
		try(Connection conn = ConexionBBDD.getInstance()){
			
			if(conn.getAutoCommit()==true) {
				conn.setAutoCommit(false);
			}
			
			try{
				
			
			System.out.println("::::::::::::::LISTAR::::::::::::::::::");
			IRepositorio<Producto>repositorio = new ProductoRepositorio();
			repositorio.listar().forEach(System.out::println);
			
			System.out.println(":::::::::::::::POR ID:::::::::::::::::");
			System.out.println(repositorio.porId(3L));
			
			
			System.out.println("::::::::::::::::CREAR::::::::::::::::");
			//CLASE 352
			Producto producto = new Producto();
			producto.setNombre("teclado mecánico IBM");
			producto.setPrecio(1330);
			producto.setFechaRegistro(new Date());
			
			Categoria categoria = new Categoria();
			categoria.setId(3L);
			producto.setCategoria(categoria);
			producto.setSku("abcxz");
			repositorio.guardar(producto);
			System.out.println("Producto guardado con éxito");
			System.out.println();
			
			System.out.println();
			
			System.out.println("::::::::::::::::ACTUALIZAR::::::::::::::::");
			producto = new Producto();
			producto.setId(3L);
			producto.setNombre("teclado razer xxxxxx mecánico");
			categoria = new Categoria();
			categoria.setId(1L);
			producto.setCategoria(categoria);
			producto.setPrecio(1000);
			producto.setSku("abcdsss");
			repositorio.guardar(producto);
			System.out.println("Producto actualizado con éxito");
			System.out.println();
			
			System.out.println("::::::::::::::VOLVER A LISTAR::::::::::::::::::");
			repositorio.listar().forEach(System.out::println);
			
			conn.commit();
			
			}catch(SQLException e){
				conn.rollback();
				e.printStackTrace();
			}
		}
			
	}
}
