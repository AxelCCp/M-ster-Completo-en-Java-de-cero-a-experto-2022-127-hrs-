package javamaster.jdbc.service;

import java.sql.SQLException;
import java.util.List;

import javamaster.jdbc.model.Categoria;
import javamaster.jdbc.model.Producto;

public interface IService {
	public List<Producto>listar() throws SQLException;
	public Producto productoPorId(Long id) throws SQLException;
	public Producto guardar(Producto producto) throws SQLException;
	public void deletePorid(Long id) throws SQLException;
	public void guardarProductoConCategoria(Producto producto, Categoria categoria) throws SQLException;
	
	public List<Categoria>listarcategoria() throws SQLException;
	public Categoria categoriaPorId(Long id) throws SQLException;
	public Categoria guardarCategoria(Categoria c) throws SQLException;
	public void eliminarCategoria(Long id) throws SQLException;
	
}
