package javamaster.jdbc.repo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javamaster.jdbc.model.Categoria;
import javamaster.jdbc.model.Producto;
import javamaster.jdbc.util.ConexionBBDD;

public class ProductoRepositorio implements IRepositorio<Producto>{
	
	private Connection getConnection() throws SQLException {
		return ConexionBBDD.getInstance();
	}

	@Override
	public List<Producto> listar() {
		// TODO Auto-generated method stub
		List<Producto>productos = new ArrayList<>();
		try(Statement st = getConnection().createStatement();
			ResultSet rs = st.executeQuery("SELECT p.*, c.nombre as categoria FROM productos as p inner join categorias as c ON (p.categoria_id = c.id)")){
			while(rs.next()) {
				Producto p = new Producto();
				p.setId(rs.getLong("id"));
				p.setNombre(rs.getString("nombre"));
				p.setPrecio(rs.getInt("precio"));
				p.setFechaRegistro(rs.getDate("fecha_registro"));

				Categoria categoria = new Categoria();
				categoria.setId(rs.getLong("categoria_id"));
				categoria.setNombre(rs.getString("categoria")); //"categoria" ES EL ALIAS Q SE USA EN LAS CONSULTAS.
				p.setCategoria(categoria);
				productos.add(p);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return productos;
	}

	
	@Override
	public Producto porId(Long id) {
		Producto producto = null;
		//try(PreparedStatement st = getConnection().prepareStatement("SELECT * FROM productos WHERE id=?")) {
		try(PreparedStatement st = getConnection().prepareStatement("SELECT p.*, c.nombre as categoria FROM productos as p inner join categorias as c ON (p.categoria_id = c.id) WHERE p.id=?")) {
			st.setLong(1, id);
			
			try(ResultSet rs = st.executeQuery()){
				if(rs.next()) {
					producto = crearProducto(rs);
				}
			}
			
		}catch(SQLException e ) {
			e.printStackTrace();
		}
		return producto;
	}

	@Override
	public void guardar(Producto p) {
		String sql;
		if(p.getId() != 0 && p.getId() > 0) {
			sql = "UPDATE productos SET nombre=?, precio=?, categoria_id=? WHERE id=?";
		}else {
			sql = "INSERT INTO productos(nombre,precio,categoria_id,fecha_registro) VALUES(?,?,?,?)";
		}	
		try(PreparedStatement st = getConnection().prepareStatement(sql)){
			st.setString(1, p.getNombre());
			st.setLong(2, p.getPrecio());
			st.setLong(3, p.getCategoria().getId());
			if(p.getId() != 0 && p.getId() > 0) {
				st.setLong(4, p.getId());
			} else {
				st.setDate(4, new Date(p.getFechaRegistro().getTime()));	//SE USA DATE DE SQL.
			}
			st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void eliminar(Long id) {
		try(PreparedStatement st = getConnection().prepareStatement("DELETE FROM productos WHERE id=?")){
			st.setLong(1, id);
			st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	
	
	private Producto crearProducto(ResultSet rs) throws SQLException {
		Producto p = new Producto();
		p.setId(rs.getLong("id"));
		p.setNombre(rs.getString("nombre"));
		p.setPrecio(rs.getInt("precio"));
		p.setFechaRegistro(rs.getDate("fecha_registro"));
		Categoria categoria = new Categoria();
		categoria.setId(rs.getLong("categoria_id"));
		categoria.setNombre(rs.getString("categoria")); //"categoria" ES EL ALIAS Q SE USA EN LAS CONSULTAS.
		p.setCategoria(categoria);
		return p;
	}
	
}
