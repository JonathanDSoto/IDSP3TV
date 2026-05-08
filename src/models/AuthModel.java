package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AuthModel {

	public AuthModel() {
		
	}
	
	public boolean access(String email, String password)
	{
		
		String query = "SELECT * FROM `users` WHERE email = ? and password = ?;";
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/p3tv", 
					"root", 
					""
			);
			
			PreparedStatement ps = conn.prepareStatement(query);
		    ps.setString(1, email);
		    ps.setString(2, password);
		    
		    ResultSet rs = ps.executeQuery();
		    
		    if (rs.next()) {
		    	 
		        return true;
		    }  
			
		    rs.close();
		    ps.close();
		    conn.close();
		    
			System.out.println(query);
			
			
		} catch (Exception e) { 
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean addAccount(String email, String password, String name)
	{
		
		String query = "INSERT INTO `users` (`id`, `email`, `password`, `name`, `phone`, `lastname`) VALUES (NULL, ?, ?, ?, NULL, NULL);";
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/p3tv",
					"root",
					""
			);
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, email);
			ps.setString(2, password);
			ps.setString(3, name);
			
			int rowsAffected = ps.executeUpdate();
			
			if (rowsAffected > 0)
				return true;
			
		
		} catch (Exception e) { 
			e.printStackTrace();
		}
		
		
		return false;
	}
	
}





