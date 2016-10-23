package datalayer;

import java.sql.Date;
import java.sql.SQLException;



public interface employeeDao {


	 void add(String address1, String address2, String city, int zipCode, String region, String country,
				Date Sdate , Date Edate , String name, long employeeID, String phone, String email,int salaryrate,int  degree, int Dimploma , String notes)
				throws ClassNotFoundException, SQLException;		
				
	 void deleteByid(int id) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyNameEmployee(int id ,String name) throws ClassNotFoundException, SQLException ;

	 void ModidyPhoneEmployee(int id ,String phone) throws ClassNotFoundException, SQLException ;

     void ModifyEndWorkingDateEmployee  (int id ,Date date) throws ClassNotFoundException, SQLException ;
		
	 void ModidyEmailEmployee(int id ,String email) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyEmailEmployee(int id ,int salaryRate) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyMAtypeEmployee(int id ,int MAtype) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyDegreeEmployee(int id ,int degree) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyDimplomaEmployee(int id ,int dimploma) throws ClassNotFoundException, SQLException ;
	
	 void ModidyNotesEmployee(int id ,String notes) throws ClassNotFoundException, SQLException ;
	
	 
	
	
	

}
