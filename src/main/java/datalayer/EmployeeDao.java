package datalayer;

import java.sql.Date;
import java.sql.SQLException;



public interface EmployeeDao {


	 void addEmployeeWithHibernate(String name, Date startDate ,Date endDate,String officialID, String phone ,int salType,int MAType, int degree,int diploma ,String notes,String email ,String address1 , String address2 , String city , String country , String region , int zipCode);		
				
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
