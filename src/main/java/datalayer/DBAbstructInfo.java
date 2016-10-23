package datalayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class DBAbstructInfo implements PersonAddressDao {
	
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		static final String DB_URL = "jdbc:mysql://localhost/mao";
		static final String USER = "henf";
		static final String PASS = "itmaster"; 
		

		public void setAddress(long personID,String address1,String address2,String city,int zipCode,String region,String country) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql=  "INSERT INTO defaultaddress (personID,address1,address2,city,zipCode,region,country) values (?,?,?,?,?,?,?)";
			PreparedStatement insertQuery = conn.prepareStatement(sql);
			insertQuery.setFloat(1, personID);
			insertQuery.setString(2, address1);
			insertQuery.setString(3, address2);
			insertQuery.setString(4, city);
			insertQuery.setInt(5, zipCode);
			insertQuery.setString(6, region);
			insertQuery.setString(7, country);
			insertQuery.executeUpdate();


		}

		
		
		public  void ModidyAddressOnePerson(int id ,String addressOne) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql=  "UPDATE defaultaddress SET address1= ? where personID = ? ";
			PreparedStatement insertQuery = conn.prepareStatement(sql);
			insertQuery.setString(1, addressOne);
			insertQuery.setInt(2, id);
			insertQuery.executeUpdate();

		}
		
		public  void ModidyAddressTwoPerson(int id ,String addressTwo) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql=  "UPDATE defaultaddress SET address2= ? where personID = ? ";
			PreparedStatement insertQuery = conn.prepareStatement(sql);
			insertQuery.setString(1, addressTwo);
			insertQuery.setInt(2, id);
			insertQuery.executeUpdate();

		}
		
		public  void ModidyZipCodePerson(int id ,int zip) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql=  "UPDATE defaultaddress SET zipcode = ? where personID = ? ";
			PreparedStatement insertQuery = conn.prepareStatement(sql);
			insertQuery.setInt(1, zip);
			insertQuery.setInt(2, id);
			insertQuery.executeUpdate();

		}
		
		public  void ModidyRegionPerson(int id ,String region) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql=  "UPDATE defaultaddress SET region = ? where personID = ? ";
			PreparedStatement insertQuery = conn.prepareStatement(sql);
			insertQuery.setString(1, region);
			insertQuery.setInt(2, id);
			insertQuery.executeUpdate();

		}
		
		public  void ModidyCityPerson(int id ,String city) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql=  "UPDATE defaultaddress SET city= ? where personID = ? ";
			PreparedStatement insertQuery = conn.prepareStatement(sql);
			insertQuery.setString(1, city);
			insertQuery.setInt(2, id);
			insertQuery.executeUpdate();

		}
		
		public  void ModidyConutryPerson(int id ,String country) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			String sql=  "UPDATE defaultaddress SET country= ? where personID = ? ";
			PreparedStatement insertQuery = conn.prepareStatement(sql);
			insertQuery.setString(1, country);
			insertQuery.setInt(2, id);
			insertQuery.executeUpdate();

}
}
