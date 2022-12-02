package javamaster.jdbc;

import java.util.ArrayList;
import java.util.List;

import javamaster.jdbc.model.Usuarios;
import javamaster.jdbc.repo.RepoUsuarios;


//LISTAR Y POR ID

public class App {
    public static void main( String[] args ){
    	
    	RepoUsuarios repo = new RepoUsuarios();
    	List<Usuarios>lista = new ArrayList<>();
    	lista = repo.listar();
    	lista.forEach(u -> System.out.println(u));
    	
    	System.out.println();
    	
    	//Usuarios user = new Usuarios();
    	Usuarios user = repo.usuarioPorId(15L);
    	System.out.println(user);
    	
    }
}
