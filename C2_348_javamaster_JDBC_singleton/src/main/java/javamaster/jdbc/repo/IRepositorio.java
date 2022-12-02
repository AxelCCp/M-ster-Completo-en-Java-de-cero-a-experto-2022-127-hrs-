package javamaster.jdbc.repo;

import java.util.List;

public interface IRepositorio <T> {
	public List<T>listar();
	public T porId(Long id);
	public void guardar(T p);
	public void eliminar(Long id);
}
