package javamaster.jdbc.util;

import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

//CLASE350
//1.-PARA USAR POOL DE CONEXIONES.
//2.-TAMAÑO DEL POOL INICIAL.
//3.-MINIMO DE CONEXIONES INACTIVAS. MINIMO DE CONEXIONES Q ESTÁN ESPERANDO PARA SER USADAS.
//4.-MÁXIMO 8 CONEXIONES INACTIVAS.
//5.-TOTAL DEL POOL : CONEXIONES ACTIVAS + CONEXIONES INACTIVAS.
//6.-METODO Q GENERA LA CONEXION CON EL POOL.
public class ConexionBBDD {
	private static String url = "jdbc:mysql://localhost:3306/javamaster?serverTimezone=America/Santiago";
	private static String username = "root";
	private static String password = "sasa";
	private static BasicDataSource pool; //1
	
	public static BasicDataSource getInstance() throws SQLException {
		if(pool == null) {
			pool = new BasicDataSource();
			pool.setUrl(url);
			pool.setUsername(username);
			pool.setPassword(password);
			pool.setInitialSize(3);	//2
			pool.setMinIdle(3);		//3
			pool.setMaxIdle(8);		//4
			pool.setMaxTotal(8);	//5
		}
		return pool;
				
	}
	
	
	public static Connection getConnection() throws SQLException {
		return getInstance().getConnection();
	}

}
