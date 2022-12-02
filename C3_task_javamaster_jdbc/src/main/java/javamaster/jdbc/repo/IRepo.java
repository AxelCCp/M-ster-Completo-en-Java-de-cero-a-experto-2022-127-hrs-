package javamaster.jdbc.repo;

import java.util.List;

import javamaster.jdbc.model.Usuarios;

public interface IRepo {

	public List<Usuarios>listar();
	public Usuarios usuarioPorId(Long id);
	public void guardar(Usuarios u);
	public void delete(Long id);
	
}
