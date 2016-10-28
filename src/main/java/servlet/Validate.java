package servlet;

import java.sql.*;

import datalayer.DBAbstructInfo;

public class Validate extends DBAbstructInfo
{


	public static void checkUser(String name,String password) throws SQLException 
	{
        
		
		PreparedStatement ps = executeTheQuerty("select id from register where name=? and password=?");
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs =ps.executeQuery();
		
			
		
              
}   
}