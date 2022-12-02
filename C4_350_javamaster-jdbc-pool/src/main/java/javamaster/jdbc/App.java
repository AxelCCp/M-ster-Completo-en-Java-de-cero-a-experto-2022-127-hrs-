package javamaster.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javamaster.jdbc.util.ConexionBBDD;

public class App {
   
	//CLASE 339
	
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javamaster?serverTimezone=America/Santiago";
		String username = "root";
		String password = "sasa";
		
		ResultSet resultado = null;
		Statement st = null;
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url,username,password);
			st = conn.createStatement();
			resultado = st.executeQuery("SELECT * FROM productos");
			while(resultado.next()) {
				System.out.println(resultado.getString("id") + " " + resultado.getString("nombre") + " $" + resultado.getString("precio") + " " + resultado.getString("fecha_registro"));
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				resultado.close();
				st.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
