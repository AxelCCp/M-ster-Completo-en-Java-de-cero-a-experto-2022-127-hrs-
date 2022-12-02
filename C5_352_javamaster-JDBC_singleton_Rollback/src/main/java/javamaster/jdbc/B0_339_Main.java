package javamaster.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javamaster.jdbc.util.ConexionBBDD;

public class B0_339_Main {
	//CLASE 340
		public static void main(String[] args) {
			
			ResultSet resultado = null;
			Statement st = null;
			Connection conn = null;
			
			try {
				conn = ConexionBBDD.getInstance();
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
