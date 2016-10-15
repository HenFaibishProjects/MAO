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
setSuppliyer( date ,  name,  supplierID ,  phone,  website,  email,  taxscan ,1 ,  notes );


}
	


	public void deleteByid(int id) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement stmt = conn.createStatement();
		String addIndexQuerty = "UPDATE supplier  SET active=0 where supplierID = " + id;
		stmt.executeUpdate(addIndexQuerty);
	}

	public void getTheDataByIndex(int i) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement stmt = conn.createStatement();
		String sql=  "select * FROM supplier where vsupplier.Index = "  + i ;
		ResultSet rs = stmt.executeQuery(sql);

		while(rs.next()){
			//Retrieve by column name
			int Index  = rs.getInt("Index");
			int OwnershipType  = rs.getInt("OwnershipType");

			//Display values
			System.out.print("index " + Index);
			System.out.print("OwnershipType " + OwnershipType);
		}
	}

	public void setAddress(long supplierID,String address1,String address2,String city,int zipCode,String region,String country) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "INSERT INTO defaultaddress (personID,address1,address2,city,zipCode,region,country) values (?,?,?,?,?,?,?)";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setFloat(1, supplierID);
		insertQuery.setString(2, address1);
		insertQuery.setString(3, address2);
		insertQuery.setString(4, city);
		insertQuery.setInt(5, zipCode);
		insertQuery.setString(6, region);
		insertQuery.setString(7, country);
		insertQuery.executeUpdate();




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

	public void setSuppliyer(String time ,String name,long supplierID,String phone,String website,String email, int taxscan ,int active, String notes) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "INSERT INTO supplier (dateadded , name ,  supplierID , phone, website, email,  taxscan ,active, notes) values (?,?,?,?,?,?,?,?,?)";
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
		insertQuery.executeUpdate();


	}
	
	public  void ModidyNameSuppliyer(int id ,String name) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE supplier SET name= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, name);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}

	public  void ModidyPhoneSuppliyer(int id ,String phone) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE supplier SET phone= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, phone);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}

	public  void ModidyWebsiteSuppliyer(int id ,String website) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE supplier SET website= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, website);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyEmailSuppliyer(int id ,String email) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE supplier SET email= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, email);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyTaxScanSuppliyer(int id ,int tax) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE supplier SET tax= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, tax);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyNotesSuppliyer(int id ,String notes) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE supplier SET notes = ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, notes);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyAddressOneSuppliyer(int id ,String addressOne) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE defaultaddress SET address1= ? where personID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, addressOne);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyAddressTwoSuppliyer(int id ,String addressTwo) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE defaultaddress SET address2= ? where personID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, addressTwo);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyZipCodeSuppliyer(int id ,int zip) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE defaultaddress SET zipcode = ? where personID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, zip);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyRegionSuppliyer(int id ,String region) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE defaultaddress SET region = ? where personID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, region);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyCitySuppliyer(int id ,String city) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE defaultaddress SET city= ? where personID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, city);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyConutrySuppliyer(int id ,String country) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE defaultaddress SET country= ? where personID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, country);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public  void ModidySundaySuppliyer(int id ,int sunday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET sunday= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, sunday);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	public  void ModidyMondaySuppliyer(int id ,int monday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET monday = ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, monday);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyTuesdaySuppliyer(int id ,int tuesday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET tuesday = ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, tuesday);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyWednesdaySuppliyer(int id ,int wednesday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET wednesday= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, wednesday);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyThursdaySuppliyer(int id ,int thursday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET thursday= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, thursday);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	public  void ModidyFridaySuppliyer(int id ,int firday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET firday= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, firday);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public  void ModidySaturdaySuppliyer(int id ,int saturday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET saturday= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, saturday);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyUSDollarSuppliyer(int id ,int us) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE curency SET USDollars= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, us);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyNisSuppliyer(int id ,int nis) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE curency SET nis= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, nis);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyEUROSuppliyer(int id ,int euro) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE curency SET euro= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, euro);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public  void ModidyAUDollarSuppliyer(int id ,int au) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE curency SET AUDollars= ? where supplierID = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, au);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}



		
	}


