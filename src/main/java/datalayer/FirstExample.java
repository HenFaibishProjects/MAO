package datalayer;

import java.sql.*;

import org.hibernate.SQLQuery;

import people.Address;

public class FirstExample {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost/mao";
	static final String USER = "henf";
	static final String PASS = "itmaster"; 


	public static void deleteByIndex(int i) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
		Statement stmt = conn.createStatement();
		String sql= "DELETE FROM supplier where vsupplier.Index = "  + i ;
		stmt.executeUpdate(sql);


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
	//public static void setAddress(String name) throws ClassNotFoundException, SQLException {
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

		public static void setDaysOfTheWeek(boolean sunday,boolean monday,boolean tuesday,boolean wednesday,boolean thursday,boolean friday,boolean saturday) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			Statement stmt = conn.createStatement();
			String sql=  "INSERT INTO daysoftheweek ( sunday, monday, tuesday, wednesday, thursday, friday, saturday) VALUES(" +sunday + monday + tuesday + wednesday + thursday + friday + saturday + ")";
			stmt.executeUpdate(sql);
            
			
	}

		public static void setCerrency(boolean USDollars,boolean NIS,boolean Euro,boolean AUDollars) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
			Statement stmt = conn.createStatement();
			String sql=  "INSERT INTO daysoftheweek ( US-Dollars, NIS, Euro, AU-Dollars) VALUES(" +USDollars + NIS + Euro + AUDollars + ")";
			stmt.executeUpdate(sql);
            
			
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

