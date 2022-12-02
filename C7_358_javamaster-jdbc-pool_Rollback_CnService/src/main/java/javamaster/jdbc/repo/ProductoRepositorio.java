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

public class ProductoRepositorio implements IRepositorio<Producto>{
	
	public ProductoRepositorio() {
	}
	public ProductoRepositorio(Connection conn) {
		this.conn = conn;
	}


	@Override
	public List<Producto> listar() throws SQLException {
		// TODO Auto-generated method stub
		List<Producto>productos = new ArrayList<>();
		try(
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT p.*, c.nombre as categoria FROM productos as p inner join categorias as c ON (p.categoria_id = c.id)")){
			while(rs.next()) {
				Producto p = new Producto();
				p.setId(rs.getLong("id"));
				p.setNombre(rs.getString("nombre"));
				p.setPrecio(rs.getInt("precio"));
				p.setFechaRegistro(rs.getDate("fecha_registro"));
				p.setSku(rs.getString("sku"));

				Categoria categoria = new Categoria();
				categoria.setId(rs.getLong("categoria_id"));
				categoria.setNombre(rs.getString("categoria")); //"categoria" ES EL ALIAS Q SE USA EN LAS CONSULTAS.
				p.setCategoria(categoria);
				productos.add(p);
			}
		}
		return productos;
	}

	
	@Override
	public Producto porId(Long id) throws SQLException {
		Producto producto = null;
		//try(PreparedStatement st = getConnection().prepareStatement("SELECT * FROM productos WHERE id=?")) {
		try(
			PreparedStatement st = conn.prepareStatement("SELECT p.*, c.nombre as categoria FROM productos as p inner join categorias as c ON (p.categoria_id = c.id) WHERE p.id=?")) {
			st.setLong(1, id);
			
			try(ResultSet rs = st.executeQuery()){
				if(rs.next()) {
					producto = crearProducto(rs);
				}
			}
			
		}
		return producto;
	}

	@Override
	public Producto guardar(Producto p) throws SQLException {
		String sql;
		if(p.getId()!=null && p.getId()>0) {
			sql = "UPDATE productos SET nombre=?, precio=?, categoria_id=?, sku=? WHERE id=?";
		}else {
			sql = "INSERT INTO productos(nombre,precio,categoria_id, sku, fecha_registro) VALUES(?,?,?,?,?)";
		}	
		try(													//PARA DEVOLVER EL ID GENERADO DEL INSERT
			PreparedStatement st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			st.setString(1, p.getNombre());
			st.setLong(2, p.getPrecio());
			st.setLong(3, p.getCategoria().getId());
			st.setString(4, p.getSku());
			if(p.getId()!=null && p.getId()>0) {
				st.setLong(5, p.getId());
			} else {
				st.setDate(5, new Date(p.getFechaRegistro().getTime()));	//SE USA DATE DE SQL.
			}
			st.executeUpdate();
			
			if(p.getId()==null) {      //ESTE GET OBTIENE EL ID GENERADO.
				try(ResultSet rs = st.getGeneratedKeys()){
					if(rs.next()) {
						p.setId(rs.getLong(1));
					}
				}
			}
			
			return p;
		}
	}

	@Override
	public void eliminar(Long id) throws SQLException {
		try(
			PreparedStatement st = conn.prepareStatement("DELETE FROM productos WHERE id=?")){
			st.setLong(1, id);
			st.executeUpdate();
		}
	}

	
	
	private Producto crearProducto(ResultSet rs) throws SQLException {
		Producto p = new Producto();
		p.setId(rs.getLong("id"));
		p.setNombre(rs.getString("nombre"));
		p.setPrecio(rs.getInt("precio"));
		p.setFechaRegistro(rs.getDate("fecha_registro"));
		p.setSku(rs.getString("sku"));
		Categoria categoria = new Categoria();
		categoria.setId(rs.getLong("categoria_id"));
		categoria.setNombre(rs.getString("categoria")); //"categoria" ES EL ALIAS Q SE USA EN LAS CONSULTAS.
		p.setCategoria(categoria);
		return p;
	}
	
	
	

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	private Connection conn;
}
