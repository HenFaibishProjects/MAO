package datalayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class DBAbstructInfo  {
	
	    protected static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    protected static final String DB_URL = "jdbc:mysql://localhost/mao";
		protected static final String USER = "henf";
		protected static final String PASS = "itmaster"; 
		
		public static PreparedStatement executeTheQuerty(String quertydb) {
			PreparedStatement ps = null ;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		ps =conn.prepareStatement(quertydb);
        
		
		}catch(Exception e)
		{

			e.printStackTrace();
			
		}
		return ps;
		

		}
}
