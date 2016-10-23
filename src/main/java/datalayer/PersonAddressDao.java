package datalayer;


import java.sql.SQLException;

public interface PersonAddressDao {
	
	public  void ModidyAddressOnePerson(int id ,String addressOne) throws ClassNotFoundException, SQLException; 

	public  void ModidyAddressTwoPerson(int id ,String addressTwo) throws ClassNotFoundException, SQLException;
	
	public  void ModidyZipCodePerson(int id ,int zip) throws ClassNotFoundException, SQLException;
	
	public  void ModidyRegionPerson(int id ,String region) throws ClassNotFoundException, SQLException;
	
	public  void ModidyCityPerson(int id ,String city) throws ClassNotFoundException, SQLException; 
	
	public  void ModidyConutryPerson(int id ,String country) throws ClassNotFoundException, SQLException;
}
