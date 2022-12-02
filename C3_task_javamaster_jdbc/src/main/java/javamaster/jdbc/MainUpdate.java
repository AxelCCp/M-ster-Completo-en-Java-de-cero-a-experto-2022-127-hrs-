package javamaster.jdbc;

import javamaster.jdbc.model.Usuarios;
import javamaster.jdbc.repo.RepoUsuarios;

public class MainUpdate {

	public static void main(String[] args) {
		
		Usuarios user = new Usuarios();
		user.setId(5L);
		user.setUsername("yyy");
		user.setPassword("321");
		user.setEmail("yyy@yyy.com");
		RepoUsuarios repo = new RepoUsuarios();
		repo.guardar(user);
	}
	
}
