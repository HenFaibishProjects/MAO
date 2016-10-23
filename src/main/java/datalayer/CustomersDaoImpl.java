package datalayer;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class CustomersDaoImpl extends DBAbstructInfo implements CustomersDao {

	public void add(String address1, String address2, String city, int zipCode, String region, String country,
			Date Rdate, String name, Date birthday, long customerID, String phone, String email, int degree,
			int trainigProgram, int paymets, int arriveFrom, int insurance, String notes)
			throws ClassNotFoundException, SQLException {


		setAddress(customerID,address1,address2,city,zipCode,region,country);
		setCustomer( Rdate,  name,  birthday,  customerID,  phone,  email,  degree,  0 , 0, arriveFrom,0 ,  notes, 1); 
		
	}

	public void setCustomer (Date Rdate, String name, Date birthday, long customerID, String phone, String email, int degree,
	int trainigProgram, int paymets, int arriveFrom, int insurance, String notes, int schoolID)  throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "INSERT INTO customers ( Rdate, name, birthday, customerID,  phone,  email,  degree,trainigProgram,  paymets,  arriveFrom,  insurance,  notes,  schoolID) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setDate(1, Rdate);
		insertQuery.setString(2, name);
		insertQuery.setDate(3, birthday);
		insertQuery.setFloat(4, customerID);
		insertQuery.setString(5, phone);
		insertQuery.setString(6, email);
		insertQuery.setInt(7, degree);
		insertQuery.setInt(8, trainigProgram);
		insertQuery.setInt(9,paymets);
		insertQuery.setInt(10,arriveFrom);
		insertQuery.setString(11, notes);
		insertQuery.setInt(12, schoolID);
		insertQuery.executeUpdate();
	}

	
	
	public void deleteByid(int customerID) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement stmt = conn.createStatement();
		String addIndexQuerty = "UPDATE customers  SET active=0 where customerID = " + customerID;
		stmt.executeUpdate(addIndexQuerty);
	}

	public void ModidyNameCustomer(int customerID, String name) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE customers SET name= ? where customerID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, name);
		insertQuery.setInt(2, customerID);
		insertQuery.executeUpdate();

	}


	public void ModidyPhoneCustomer(int customerID, String phone) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE customers SET phone= ? where customerID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, phone);
		insertQuery.setInt(2, customerID);
		insertQuery.executeUpdate();

	}

	public void ModidyDatebirthdayCustomer(int customerID, Date birthday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE customers SET birthday = ? where customerID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setDate(1, birthday);
		insertQuery.setInt(2, customerID);
		insertQuery.executeUpdate();
		
	}

	public void ModidyEmailCustomer(int customerID, String email) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE customers SET email = ? where customerID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, email);
		insertQuery.setInt(2, customerID);
		insertQuery.executeUpdate();
		
	}

	public void ModidyPhoneCustomer(int customerID, int degree) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE customers SET degree = ? where customerID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, degree);
		insertQuery.setInt(2, customerID);
		insertQuery.executeUpdate();
		
	}

	public void ModidyTrainigProgramCustomer(int customerID, int trainigProgram) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE customers SET trainigProgram = ? where customerID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, trainigProgram);
		insertQuery.setInt(2, customerID);
		insertQuery.executeUpdate();
		
	}

	public void ModidyPaymetsCustomer(int customerID, int paymets) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE customers SET paymets = ? where customerID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, paymets);
		insertQuery.setInt(2, customerID);
		insertQuery.executeUpdate();
		
	}

	public void ModidyArriveFromCustomer(int customerID, int arriveFrom) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE customers SET arriveFrom = ? where customerID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, arriveFrom);
		insertQuery.setInt(2, customerID);
		insertQuery.executeUpdate();
		
	}

	public void ModidyInsuranceCustomer(int customerID, int insurance) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE customers SET insurance = ? where customerID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, insurance);
		insertQuery.setInt(2, customerID);
		insertQuery.executeUpdate();
		
	}

	public void ModidyNotesCustomer(int customerID, String notes) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE customers SET notes = ? where customerID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, notes);
		insertQuery.setInt(2, customerID);
		insertQuery.executeUpdate();
		
	}
	


}



