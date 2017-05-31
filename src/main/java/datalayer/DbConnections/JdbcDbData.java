package datalayer.DbConnections;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public abstract class JdbcDbData  {
	
	    protected static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    protected static final String DB_URL = "jdbc:mysql://localhost/mao";
		protected static final String USER = "dbuser";
		protected static final String PASS = "123456"; 
		protected static  Connection conn;
		
		public static PreparedStatement executeTheQuerty(String quertydb) {
			PreparedStatement ps = null ;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(DB_URL,USER,PASS);
		ps =conn.prepareStatement(quertydb);
        
		
		}catch(Exception e)
		{

			e.printStackTrace();
			
		}
		return ps;
		

		}
}
