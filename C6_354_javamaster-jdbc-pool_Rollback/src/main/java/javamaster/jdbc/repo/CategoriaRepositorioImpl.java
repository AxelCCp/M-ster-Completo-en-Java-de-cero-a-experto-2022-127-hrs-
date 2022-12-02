package javamaster.jdbc.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javamaster.jdbc.model.Categoria;

public class CategoriaRepositorioImpl implements IRepositorio<Categoria>{

	private Connection conn;
	
	public CategoriaRepositorioImpl(Connection conn) {
		this.conn = conn;
	}

	@Override
	public List<Categoria> listar() throws SQLException {
		List<Categoria>categorias = new ArrayList<>();
		try(Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM categorias")){
			while(rs.next()) {
				categorias.add(crearCategoria(rs));
			}
		}
		return categorias;
	}

	@Override
	public Categoria porId(Long id) throws SQLException {
		Categoria categoria = null;
		try(PreparedStatement st = conn.prepareStatement("SELECT * FROM categorias as c WHERE c.id=?")){
			st.setLong(1, id);
			try(ResultSet rs = st.executeQuery()){
				if(rs.next()) {
					categoria = crearCategoria(rs);
				}
			}
		}
		return categoria;
	}

	@Override
	public Categoria guardar(Categoria c) throws SQLException {
		String sql = null;
		if(c.getId()!=null && c.getId()>0) {
			sql = "UPDATE categorias SET nombre=? WHERE id=?";
		}else {
			sql = "INSERT INTO categorias(nombre) VALUES(?)";
		}																//PARA DEVOLVER EL ID GENERADO DEL INSERT
		try(PreparedStatement st = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
			st.setString(1,c.getNombre());
			if(c.getId()!=null && c.getId()>0) {
				st.setLong(2, c.getId());
			}
			st.executeUpdate();
			if(c.getId() == null) {
				try(ResultSet rs = st.getGeneratedKeys()){
					if(rs.next()) {
						c.setId(rs.getLong(1));
					}
				}
			}
		}
		return c;
	}

	@Override
	public void eliminar(Long id) throws SQLException {
		try(PreparedStatement st = conn.prepareStatement("DELETE FROM categorias WHERE id=?")){
			st.setLong(1, id);
			st.executeUpdate();
		}
		
	}
	
	private Categoria crearCategoria(ResultSet rs) throws SQLException {
		Categoria c = new Categoria();
		c.setId(rs.getLong("id"));
		c.setNombre(rs.getString("nombre"));
		return c;
	}

}
