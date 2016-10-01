package datalayer;

import java.sql.*;

public class SuppliyerDBTranssactions extends DBAbstructInfo {
	
	static int timesSuppliierDetailsHasChanged = 0;
	static int timesSuppliierAddressHasChanged = 0;
	static int timesSuppliierCurencyHasChanged = 0;
	static int timesSuppliierWorkingDaysHasChanged = 0;

	

	public static void deleteByIndex(int i) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement stmt = conn.createStatement();
		String sqlAddress= "DELETE FROM defaultaddress where id = "  + i ;
		stmt.executeUpdate(sqlAddress);
		String sqlCurrency= "DELETE FROM daysoftheweek where id = "  + i ;
		stmt.executeUpdate(sqlCurrency);
		String sqlDaysOfWork= "DELETE FROM curency where id = "  + i ;
		stmt.executeUpdate(sqlDaysOfWork);
		String sqlSuppliyer= "DELETE FROM supplier where id = "  + i ;
		stmt.executeUpdate(sqlSuppliyer);

	}



	public static void deleteByPhone(String phone) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement stmt = conn.createStatement();
		String sqlAddress= "DELETE FROM supplier where defaultaddress.phone = "  + phone ;
		stmt.executeUpdate(sqlAddress);
		String sqlCurrency= "DELETE FROM supplier where daysoftheweek.phone = "  + phone ;
		stmt.executeUpdate(sqlCurrency);
		String sqlDaysOfWork= "DELETE FROM supplier where curency.phone = "  + phone ;
		stmt.executeUpdate(sqlDaysOfWork);
		String sqlSuppliyer= "DELETE FROM supplier where supplier.phone = "  + phone ;
		stmt.executeUpdate(sqlSuppliyer);

	}

	public static void getTheDataByIndex(int i) throws ClassNotFoundException, SQLException {
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

	public static void setAddress(String address1,String address2,String city,int zipCode,String region,String country) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "INSERT INTO defaultaddress (address1,address2,city,zipCode,region,country) values (?,?,?,?,?,?)";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, address1);
		insertQuery.setString(2, address2);
		insertQuery.setString(3, city);
		insertQuery.setInt(4, zipCode);
		insertQuery.setString(5, region);
		insertQuery.setString(6, country);
		insertQuery.executeUpdate();




	}

	public static void setDaysOfTheWeek(int sunday,int monday,int tuesday,int wednesday,int thursday,int friday,int saturday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "INSERT INTO daysoftheweek ( sunday, monday, tuesday, wednesday, thursday, friday, saturday) values (?,?,?,?,?,?,?)";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, sunday);
		insertQuery.setInt(2, monday);
		insertQuery.setInt(3, tuesday);
		insertQuery.setInt(4, wednesday);
		insertQuery.setInt(5, thursday);
		insertQuery.setInt(6, friday);
		insertQuery.setInt(7, saturday);
		insertQuery.executeUpdate();


	}

	public static void setCerrency(int USDollars,int NIS,int Euro,int AUDollars) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "INSERT INTO curency (USDollars, NIS, Euro, AUDollars) values (?,?,?,?)";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, USDollars);
		insertQuery.setInt(2, NIS);
		insertQuery.setInt(3, Euro);
		insertQuery.setInt(4, AUDollars);
		insertQuery.executeUpdate();


	}

	public static void setSuppliyer(String time ,String name,String supplierID,String phone,String website,String email, int taxscan , String notes) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "INSERT INTO supplier (dateadded , name ,  supplierID , phone, website, email,  taxscan , notes) values (?,?,?,?,?,?,?,?)";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, time);
		insertQuery.setString(2, name);
		insertQuery.setString(3, supplierID);
		insertQuery.setString(4, phone);
		insertQuery.setString(5, website);
		insertQuery.setString(6, email);
		insertQuery.setInt(7, taxscan);
		insertQuery.setString(8, notes);
		insertQuery.executeUpdate();


	}
	
	public static void ModidyNameSuppliyer(int id ,String name) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE supplier SET name= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, name);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}

	public static void ModidyPhoneSuppliyer(int id ,String phone) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE supplier SET phone= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, phone);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}

	public static void ModidyWebsiteSuppliyer(int id ,String website) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE supplier SET website= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, website);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public static void ModidyEmailSuppliyer(int id ,String email) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE supplier SET email= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, email);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public static void ModidyTaxScanSuppliyer(int id ,int tax) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE supplier SET tax= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, tax);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public static void ModidyNotesSuppliyer(int id ,String notes) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE supplier SET notes = ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, notes);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public static void ModidyAddressOneSuppliyer(int id ,String addressOne) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE defaultaddress SET address1= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, addressOne);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public static void ModidyAddressTwoSuppliyer(int id ,String addressTwo) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE defaultaddress SET address2= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, addressTwo);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public static void ModidyZipCodeSuppliyer(int id ,int zip) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE defaultaddress SET zipcode = ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, zip);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public static void ModidyRegionSuppliyer(int id ,String region) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE defaultaddress SET region = ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, region);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public static void ModidyCitySuppliyer(int id ,String city) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE defaultaddress SET city= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, city);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public static void ModidyConutrySuppliyer(int id ,String country) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE defaultaddress SET country= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setString(1, country);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public static void ModidySundaySuppliyer(int id ,int sunday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET sunday= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, sunday);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	public static void ModidyMondaySuppliyer(int id ,int monday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET monday = ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, monday);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public static void ModidyTuesdaySuppliyer(int id ,int tuesday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET tuesday = ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, tuesday);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public static void ModidyWednesdaySuppliyer(int id ,int wednesday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET wednesday= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, wednesday);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public static void ModidyThursdaySuppliyer(int id ,int thursday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET thursday= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, thursday);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	public static void ModidyFridaySuppliyer(int id ,int firday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET firday= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, firday);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public static void ModidySaturdaySuppliyer(int id ,int saturday) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE daysoftheweek SET saturday= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, saturday);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public static void ModidyUSDollarSuppliyer(int id ,int us) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE curency SET USDollars= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, us);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public static void ModidyNisSuppliyer(int id ,int nis) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE curency SET nis= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, nis);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public static void ModidyEUROSuppliyer(int id ,int euro) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE curency SET euro= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, euro);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
	public static void ModidyAUDollarSuppliyer(int id ,int au) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		String sql=  "UPDATE curency SET AUDollars= ? where id = ? ";
		PreparedStatement insertQuery = conn.prepareStatement(sql);
		insertQuery.setInt(1, au);
		insertQuery.setInt(2, id);
		insertQuery.executeUpdate();

	}
	
}

