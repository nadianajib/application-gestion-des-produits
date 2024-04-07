package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnectio {
	private static Connection connection;
	static {
		try {
			 Class.forName("org.postgresql.Driver");
		
             connection= DriverManager.getConnection("jdbc:postgresql://localhost:2002/pharmacie", "postgres","admin");
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
    

	}
	public static Connection getConnection() {
		return connection;
	}
	

}
