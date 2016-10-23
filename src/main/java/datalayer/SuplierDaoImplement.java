package datalayer;

import java.sql.*;

public class SuplierDaoImplement extends DBAbstructInfo implements SuplierDao {
	
	
	static int timesSuppliierDetailsHasChanged = 0;
	static int timesSuppliierAddressHasChanged = 0;
	static int timesSuppliierCurencyHasChanged = 0;
	static int timesSuppliierWorkingDaysHasChanged = 0;

	
	public void add(String address1 , String address2 , String city , int zipCode , String region , String country ,
	        int sunday, int monday, int tuesday, int wednesday, int thursday, int friday, int saturday ,
	        int USDollars, int NIS, int Euro, int AUDollars ,
	        String date , String name, long supplierID , String phone, String website, String email, int taxscan , String notes   
	        ) throws ClassNotFoundException, SQLException {
 
setAddress(supplierID,address1,address2,city,zipCode,region,country);
setDaysOfTheWeek( supplierID, sunday,  monday,  tuesday,  wednesday,  thursday,  friday,  saturday);
setCerrency( supplierID , USDollars,  NIS,  Euro,  AUDollars);
setSuppliyer( date ,  name,  supplierID ,  phone,  website,  email,  taxscan ,1 ,  notes , 1 );


}
	

	public void deleteByid(int supplierID) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement stmt = conn.createStatement();
		String addIndexQuerty = "UPDATE supplier  SET active=0 where supplierID = " + supplierID;
		stmt.executeUpdate(addIndexQuerty);
	}

	public void setDaysOfTheWeek(long supplierID,int sunday,int monday,int tuesday,int wednesday,int thursday,int friday,int saturday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "INSERT INTO daysoftheweek ( supplierID,sunday, monday, tuesday, wednesday, thursday, friday, saturday) values (?,?,?,?,?,?,?,?)";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setFloat(1, supplierID);
		insertQuery.setInt(2, sunday);
		insertQuery.setInt(3, monday);
		insertQuery.setInt(4, tuesday);
		insertQuery.setInt(5, wednesday);
		insertQuery.setInt(6, thursday);
		insertQuery.setInt(7, friday);
		insertQuery.setInt(8, saturday);
		insertQuery.executeUpdate();


	}

	public void setCerrency(long supplierID,int USDollars,int NIS,int Euro,int AUDollars) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "INSERT INTO curency (supplierID , USDollars, NIS, Euro, AUDollars) values (?,?,?,?,?)";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setFloat(1, supplierID);
		insertQuery.setInt(2, USDollars);
		insertQuery.setInt(3, NIS);
		insertQuery.setInt(4, Euro);
		insertQuery.setInt(5, AUDollars);
		insertQuery.executeUpdate();


	}

	public void setSuppliyer(String time ,String name,long supplierID,String phone,String website,String email, int taxscan ,int active, String notes,int schoolID) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "INSERT INTO supplier (dateadded , name ,  supplierID , phone, website, email,  taxscan ,active, notes,schoolID) values (?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, time);
		insertQuery.setString(2, name);
		insertQuery.setFloat(3, supplierID);
		insertQuery.setString(4, phone);
		insertQuery.setString(5, website);
		insertQuery.setString(6, email);
		insertQuery.setInt(7, taxscan);
		insertQuery.setInt(8, active);
		insertQuery.setString(9, notes);
		insertQuery.setInt(10, schoolID);
		insertQuery.executeUpdate();


	}
	
	public  void ModidyNameSuppliyer(int supplierID ,String name) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE supplier SET name= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, name);
		insertQuery.setInt(2, supplierID);
		insertQuery.executeUpdate();

	}

	public  void ModidyPhoneSuppliyer(int supplierID ,String phone) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE supplier SET phone= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, phone);
		insertQuery.setInt(2, supplierID);
		insertQuery.executeUpdate();

	}

	public  void ModidyWebsiteSuppliyer(int supplierID ,String website) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE supplier SET website= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, website);
		insertQuery.setInt(2, supplierID);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyEmailSuppliyer(int supplierID ,String email) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE supplier SET email= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, email);
		insertQuery.setInt(2, supplierID);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyTaxScanSuppliyer(int supplierID ,int tax) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE supplier SET tax= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, tax);
		insertQuery.setInt(2, supplierID);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyNotesSuppliyer(int supplierID ,String notes) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE supplier SET notes = ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, notes);
		insertQuery.setInt(2, supplierID);
		insertQuery.executeUpdate();

	}
	
	public  void ModidySundaySuppliyer(int supplierID ,int sunday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET sunday= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, sunday);
		insertQuery.setInt(2, supplierID);
		insertQuery.executeUpdate();

	}
	public  void ModidyMondaySuppliyer(int supplierID ,int monday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET monday = ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, monday);
		insertQuery.setInt(2, supplierID);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyTuesdaySuppliyer(int supplierID ,int tuesday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET tuesday = ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, tuesday);
		insertQuery.setInt(2, supplierID);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyWednesdaySuppliyer(int supplierID ,int wednesday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET wednesday= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, wednesday);
		insertQuery.setInt(2, supplierID);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyThursdaySuppliyer(int supplierID ,int thursday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET thursday= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, thursday);
		insertQuery.setInt(2, supplierID);
		insertQuery.executeUpdate();

	}
	public  void ModidyFridaySuppliyer(int supplierID ,int firday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET firday= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, firday);
		insertQuery.setInt(2, supplierID);
		insertQuery.executeUpdate();

	}
	
	public  void ModidySaturdaySuppliyer(int supplierID ,int saturday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET saturday= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, saturday);
		insertQuery.setInt(2, supplierID);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyUSDollarSuppliyer(int supplierID ,int us) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE curency SET USDollars= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, us);
		insertQuery.setInt(2, supplierID);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyNisSuppliyer(int supplierID ,int nis) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE curency SET nis= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, nis);
		insertQuery.setInt(2, supplierID);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyEUROSuppliyer(int supplierID ,int euro) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE curency SET euro= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, euro);
		insertQuery.setInt(2, supplierID);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyAUDollarSuppliyer(int supplierID ,int au) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE curency SET AUDollars= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, au);
		insertQuery.setInt(2, supplierID);
		insertQuery.executeUpdate();

	}



		
	}


