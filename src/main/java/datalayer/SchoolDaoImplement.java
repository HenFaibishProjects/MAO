package datalayer;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import WorkoutStileplace.MATypes;

public class SchoolDaoImplement  extends DBAbstructInfo implements SchoolDao{

	@Override
	public void add(String address1, String address2, String city, int zipCode, String region, String country,
			String name, String managerName, int numberOfChapters, String email, String wbesite, MATypes mainMAtype,
			File logo) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByid(int schooID) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement stmt = conn.createStatement();
		String addIndexQuerty = "UPDATE school  SET active = 0 where schooID = " + schooID;
		stmt.executeUpdate(addIndexQuerty);

	}



	@Override
	public void ModidyManagerNameSchool(int schooID, String managerName) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE school SET managerName= ? where customerID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, managerName);
		insertQuery.setInt(2, schooID);
		insertQuery.executeUpdate();

	}
		
	

	@Override
	public void ModidyNumberOfChaptersSchool(int schooID, int numberOfChapters) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE school SET numberOfChapters= ? where customerID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, numberOfChapters);
		insertQuery.setInt(2, schooID);
		insertQuery.executeUpdate();

	}
		
	

	@Override
	public void ModidyEmailSchool(int schooID, String email) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE school SET email= ? where customerID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, email);
		insertQuery.setInt(2, schooID);
		insertQuery.executeUpdate();

	}
		
	

	@Override
	public void ModidyWebsiteSchool(int schooID, String wbesite) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE school SET wbesite= ? where customerID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, wbesite);
		insertQuery.setInt(2, schooID);
		insertQuery.executeUpdate();

	}
		
	

	@Override
	public void ModidyMATypesSchool(int schooID, MATypes mainMAtype) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE school SET mainMAtype= ? where customerID = ? ";
		String ma = mainMAtype.name();
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, ma);
		insertQuery.setInt(2, schooID);
		insertQuery.executeUpdate();

	}
		
	

	@Override
	public void ModidyLogoSchool(int schooID, File logo) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE school SET name= ? where customerID = ? ";
		String file = logo.toString();
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, file);
		insertQuery.setInt(2, schooID);
		insertQuery.executeUpdate();

	}
		
	

}
