package javamaster.jdbc.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javamaster.jdbc.model.Categoria;
import javamaster.jdbc.model.Producto;
import javamaster.jdbc.repo.CategoriaRepositorio;
import javamaster.jdbc.repo.IRepositorio;
import javamaster.jdbc.repo.ProductoRepositorio;
import javamaster.jdbc.util.ConexionBBDD;

public class CatalogoServicio implements IService{

	@Override
	public List<Producto> listar() throws SQLException {
		try(Connection conn = ConexionBBDD.getConnection()){
			productoRepositorio.setConn(conn);
			return productoRepositorio.listar();
		}
		
	}

	@Override
	public Producto productoPorId(Long id) throws SQLException {
		try(Connection conn = ConexionBBDD.getConnection()){
			productoRepositorio.setConn(conn);
			return productoRepositorio.porId(id);
		}
	}

	@Override
	public Producto guardar(Producto producto) throws SQLException {
		try(Connection conn = ConexionBBDD.getConnection()){
			productoRepositorio.setConn(conn);
			if(conn.getAutoCommit()) {
				conn.setAutoCommit(false);
			}
			Producto nuevoProducto = null;
			try {
				nuevoProducto =productoRepositorio.guardar(producto);
				conn.commit();
			}catch(SQLException e) {
				conn.rollback();
				e.printStackTrace();
			}
			return nuevoProducto;
		}
	}

	@Override
	public void deletePorid(Long id) throws SQLException {
		try(Connection conn = ConexionBBDD.getConnection()){
			productoRepositorio.setConn(conn);
			if(conn.getAutoCommit()) {
				conn.setAutoCommit(false);
			}
			try {
				productoRepositorio.eliminar(id);
				conn.commit();
			}catch(SQLException e) {
				conn.rollback();
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void guardarProductoConCategoria(Producto producto, Categoria categoria) throws SQLException {
		try(Connection conn = ConexionBBDD.getConnection()){
			productoRepositorio.setConn(conn);
			categoriaRepositorio.setConn(conn);
			if(conn.getAutoCommit()) {
				conn.setAutoCommit(false);
			}
			try {
				Categoria nuevaCategoria = categoriaRepositorio.guardar(categoria); 
				producto.setCategoria(nuevaCategoria);
				productoRepositorio.guardar(producto);
				conn.commit();
			}catch(SQLException e) {
				conn.rollback();
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<Categoria> listarcategoria() throws SQLException {
		try(Connection conn = ConexionBBDD.getConnection()){
			categoriaRepositorio.setConn(conn);
			return categoriaRepositorio.listar();
		}
	}

	@Override
	public Categoria categoriaPorId(Long id) throws SQLException {
		try(Connection conn = ConexionBBDD.getConnection()){
			categoriaRepositorio.setConn(conn);
			return categoriaRepositorio.porId(id);
		}

	}

	@Override
	public Categoria guardarCategoria(Categoria c) throws SQLException {
		try(Connection conn = ConexionBBDD.getConnection()){
			categoriaRepositorio.setConn(conn);
			if(conn.getAutoCommit()) {
				conn.setAutoCommit(false);
			}
			Categoria nuevaCategoria = null; 
			try {
				nuevaCategoria = categoriaRepositorio.guardar(c);
				conn.commit();
			}catch(SQLException e) {
				conn.rollback();
				e.printStackTrace();
			}
			return nuevaCategoria;
		}
	}

	@Override
	public void eliminarCategoria(Long id) throws SQLException {
		try(Connection conn = ConexionBBDD.getConnection()){
			categoriaRepositorio.setConn(conn);
			if(conn.getAutoCommit()) {
				conn.setAutoCommit(false);
			}
			try {
				conn.commit();
			}catch(SQLException e) {
				conn.rollback();
				e.printStackTrace();
			}
		}
	}
	
	public CatalogoServicio() {
		this.productoRepositorio = new ProductoRepositorio();
		this.categoriaRepositorio = new CategoriaRepositorio();
		
	}
	
	private IRepositorio<Producto>productoRepositorio;
	private IRepositorio<Categoria>categoriaRepositorio;

}
