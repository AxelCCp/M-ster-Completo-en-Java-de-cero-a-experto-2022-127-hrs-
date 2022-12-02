package javamaster.jdbc;

import javamaster.jdbc.model.Usuarios;
import javamaster.jdbc.repo.RepoUsuarios;

public class MainCrear {
	public static void main(String[] args) {
		
		Usuarios user = new Usuarios();
		user.setUsername("xxxx");
		user.setPassword("1234");
		user.setEmail("asd@qwe.com");
		RepoUsuarios repo = new RepoUsuarios();
		repo.guardar(user);
		
		
		
	}
}
