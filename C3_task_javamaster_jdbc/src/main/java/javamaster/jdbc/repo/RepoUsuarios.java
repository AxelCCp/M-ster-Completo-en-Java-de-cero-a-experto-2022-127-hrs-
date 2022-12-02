package javamaster.jdbc.repo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javamaster.jdbc.model.Usuarios;
import javamaster.jdbc.util.Conection;

public class RepoUsuarios implements IRepo {

	public Connection getConection() throws SQLException {
		return Conection.getInstance();
	}
	
	@Override
	public List<Usuarios> listar() {
		List<Usuarios>lista = new ArrayList<>();
		try(Connection con = getConection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from usuarios")){
			while(rs.next()) {
				Usuarios user = new Usuarios();
				user.setId(rs.getLong("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
				lista.add(user);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return lista;
	}

	@Override
	public Usuarios usuarioPorId(Long id) {
		Usuarios user = new Usuarios();
		try(Connection con = getConection();
			PreparedStatement st = con.prepareStatement("Select * from usuarios where id=?")){
			st.setLong(1, id);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				user.setId(rs.getLong("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setEmail(rs.getString("email"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void guardar(Usuarios u) {
		String sql;
		if(u.getId() != null || u.getId()>0) {
			//     UPDATE productos SET nombre=?, precio=?, categoria_id=? WHERE id=?
			sql = "update usuarios set username=?, password=?, email=? where id=?";
			try(Connection con = getConection();
				PreparedStatement st = con.prepareStatement(sql)){
				st.setString(1, u.getUsername());
				st.setString(2, u.getPassword());
				st.setString(3, u.getEmail());
				st.setLong(4, u.getId());
				st.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		
		}else {
			sql = "insert into usuarios (username, password, email) values(?,?,?)";
			try(Connection con = getConection();
				PreparedStatement st = con.prepareStatement(sql)){	
				st.setString(1, u.getUsername());
				st.setString(2, u.getPassword());
				st.setString(3, u.getEmail());
				st.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
			
	}

	@Override
	public void delete(Long id) {
		try(Connection con = getConection();
			PreparedStatement st = con.prepareStatement("delete from usuarios where id=?")){
			st.setLong(1, id);
			st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
