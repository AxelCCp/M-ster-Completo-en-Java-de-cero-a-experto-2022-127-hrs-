package javamaster.jdbc.repo;

import java.sql.SQLException;
import java.util.List;

public interface IRepositorio <T> {
	public List<T>listar() throws SQLException;
	public T porId(Long id) throws SQLException;
	public T guardar(T p) throws SQLException;
	public void eliminar(Long id) throws SQLException;
}
