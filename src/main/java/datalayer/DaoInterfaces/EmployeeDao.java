package datalayer.DaoInterfaces;


import java.sql.SQLException;
import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.joda.time.DateTime;

import businessObjects.hr.PeopleContent.Employee;
import businessObjects.hr.PeopleContent.SalType;
import businessObjects.hr.PeopleContent.Salary;



public interface EmployeeDao {


	public void addEmployeeWithHibernate(String name, Date startDate ,Date endDate,String officialID, String phone ,int salType,int MAType, int degree,int diploma ,String notes,String email ,String address1 , String address2 , String city , String country , String region , int zipCode); 

	public void deleteByid(String OfficialId) throws ClassNotFoundException, SQLException;
	
	public void ModifyNameEmployee(String OfficialId, String name) throws ClassNotFoundException, SQLException ;
	
	public void ModifyPhoneEmployee(String OfficialId, String phone) throws ClassNotFoundException, SQLException;
	
	public void ModifyEndWorkingDateEmployee(String OfficialId, Date date) throws ClassNotFoundException, SQLException ;
	
	public void ModifyEmailEmployee(String OfficialId, String email) throws ClassNotFoundException, SQLException;
	
	public void ModifySalaryEmployee(String OfficialId,SalType type,float amount ) throws ClassNotFoundException, SQLException;
	
	public void ModifyMAtypeEmployee(String OfficialId, int MAtype) throws ClassNotFoundException, SQLException;
	
	public void ModifyDegreeEmployee(String OfficialId, int degree) throws ClassNotFoundException, SQLException;

	public void ModifyDimplomaEmployee(String OfficialId, int dimploma) throws ClassNotFoundException, SQLException;
	
	public void ModifyNotesEmployee(String OfficialId, String notes) throws ClassNotFoundException, SQLException;
	
	public void ModidyAdressEmployee(String OfficialId, String addressContent,String newaddressContent) throws ClassNotFoundException, SQLException;

	
	
	

}
