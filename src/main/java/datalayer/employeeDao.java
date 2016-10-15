package datalayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import people.employees;

public interface employeeDao {
	employees read(String id);
	
	
	
	
	 void deleteByid(int id) throws ClassNotFoundException, SQLException ;

	 void getTheDataByIndex(int i) throws ClassNotFoundException, SQLException ;

	 void add(String address1 , String address2 , String city , int zipCode , String region , String country ,
		        String date , String name, long EmployeeID , String phone, String email, String notes   
		        ) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyNameEmployee(int id ,String name) throws ClassNotFoundException, SQLException ;

	 void ModidyPhoneEmployee(int id ,String phone) throws ClassNotFoundException, SQLException ;

     void ModifyEndWorkingDateEmployee  (int id ,Date date) throws ClassNotFoundException, SQLException ;
		
	 void ModidyEmailEmployee(int id ,String email) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyEmailEmployee(int id ,int salaryRate) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyMAtypeEmployee(int id ,int MAtype) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyDegreeEmployee(int id ,int degree) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyDimplomaEmployee(int id ,int dimploma) throws ClassNotFoundException, SQLException ;
	
	 void ModidyNotesEmployee(int id ,String notes) throws ClassNotFoundException, SQLException ;
	
	 void ModidyAddressOneEmployee(int id ,String addressOne) throws ClassNotFoundException, SQLException ;
	
	 void ModidyAddressTwoEmployee(int id ,String addressTwo) throws ClassNotFoundException, SQLException ;
		
	 void ModidyZipCodeEmployee(int id ,int zip) throws ClassNotFoundException, SQLException ;
		
	 void ModidyRegionEmployee(int id ,String region) throws ClassNotFoundException, SQLException ;
	
	 void ModidyCityEmployee(int id ,String city) throws ClassNotFoundException, SQLException ;
	
	 void ModidyConutryEmployee(int id ,String country) throws ClassNotFoundException, SQLException ;
	
	 
	
	
	

}
