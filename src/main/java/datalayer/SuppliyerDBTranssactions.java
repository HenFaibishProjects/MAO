package datalayer;

import java.sql.*;

public class SuppliyerDBTranssactions extends DBAbstructInfo {

	public static void deleteByIndex(int i) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement stmt = conn.createStatement();
		String sqlAddress= "DELETE FROM supplier where defaultaddress.ID = "  + i ;
		stmt.executeUpdate(sqlAddress);
		String sqlCurrency= "DELETE FROM supplier where daysoftheweek.ID = "  + i ;
		stmt.executeUpdate(sqlCurrency);
		String sqlDaysOfWork= "DELETE FROM supplier where curency.ID = "  + i ;
		stmt.executeUpdate(sqlDaysOfWork);
		String sqlSuppliyer= "DELETE FROM supplier where supplier.ID = "  + i ;
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
			Statement stmt = conn.createStatement();
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
			Statement stmt = conn.createStatement();
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
			Statement stmt = conn.createStatement();
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
			Statement stmt = conn.createStatement();
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







	public static void abc() {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//STEP 3: Open a connection
		System.out.println("Connecting to database...");
		try {
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//STEP 4: Execute a query
		System.out.println("Creating statement...");
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql;
		sql = "SELECT * FROM city";
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//STEP 5: Extract data from result set
		try {
			while(rs.next()){
				//Retrieve by column name
				int id  = rs.getInt("id");
				String name = rs.getString("name");
				String countrycode = rs.getString("countrycode");
				String district = rs.getString("district");
				String population = rs.getString("population");

				//Display values
				System.out.print("id: " + id);
				System.out.print(", name: " + name);
				System.out.print(", countrycode: " + countrycode);
				System.out.println(", district: " + district);
				System.out.println(", population: " + population);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}

