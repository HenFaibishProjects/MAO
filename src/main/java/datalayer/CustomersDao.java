package datalayer;

import java.sql.Date;
import java.sql.SQLException;


public interface CustomersDao  {

	 void add(String address1, String address2, String city, int zipCode, String region, String country,
				Date Rdate  , String name,Date birthday, float employeeID, String phone, String email, int  degree, int trainigProgram  , int paymets,int arriveFrom,int insurance , String notes) 
	            throws ClassNotFoundException, SQLException;
	 
     void deleteByid(int id) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyNameCustomer(int id ,String name) throws ClassNotFoundException, SQLException ;

	 void ModidyPhoneCustomer(int id ,String phone) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyDatebirthdayCustomer(int id ,Date birthday) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyEmailCustomer(int id ,String email) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyPhoneCustomer(int id ,int  degree) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyTrainigProgramCustomer(int id ,int trainigProgram) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyPaymetsCustomer(int id ,int paymets) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyArriveFromCustomer(int id ,int arriveFrom) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyInsuranceCustomer(int id ,int insurance) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyNotesCustomer(int id ,String notes) throws ClassNotFoundException, SQLException ;
	 

	 
	 
	
}
