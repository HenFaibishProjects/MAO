package datalayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/mao";
	   static final String USER = "henf";
	   static final String PASS = "itmaster"; 
	   public Statement stmt=null;
	   public ResultSet rs = null;
	   
	   
	   
	   public static void RegisterJDBCDriver()  {
		   Connection conn = null;
		   Statement stmt = null;
		      try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      
		      // Open a connection
		      System.out.println("Connecting to database...");
		      try {
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		      // Execute a query
		      System.out.println("Creating statement...");
		      try {
				stmt = conn.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
		      
		  	public void seeall(int i) {
				
				String sql;
			      sql = "SELECT * FROM vsupplier";
			      
			      ResultSet rs = null;
				try {
					
					rs = stmt.executeQuery(sql);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		      
}}
