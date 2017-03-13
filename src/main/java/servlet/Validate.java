package servlet;

import java.sql.*;


import datalayer.JDBCDBDATA;

public class Validate extends JDBCDBDATA
{

	
	     public static boolean checkUser(String name,String password) 
	     {
	      boolean st =false;
	      try{

	    	  PreparedStatement ps = prepareQuery("select id from register where name=? and password=?");
	    	  
	    	    ps.setString(1, name);
				ps.setString(2, password);
	            ResultSet rs =ps.executeQuery();
	            st = rs.next();
	        
	      }catch(Exception e)
	      {
	          e.printStackTrace();
	      }
	         return st;                 
	  }

		private static PreparedStatement prepareQuery(String string) {
			// TODO Auto-generated method stub
			return null;
		}   
	}