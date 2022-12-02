package javamaster.jdbc;

import javamaster.jdbc.repo.RepoUsuarios;

public class MainDelete {
	public static void main(String[] args) {
		
		RepoUsuarios repo = new RepoUsuarios();
		repo.delete(7L);
	}
}
