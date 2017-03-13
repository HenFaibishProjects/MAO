package datalayer;

import java.sql.Date;
import java.sql.SQLException;

import people.Employees;

public class EmployeeDaoImpl extends HibernateStructInfo implements EmployeeDao {

	@Override
	public void addEmployeeWithHibernate(String name, Date startDate ,Date endDate,String officialID, String phone ,int salType,int MAType, int degree,int diploma ,String notes,String email ,String address1 , String address2 , String city , String country , String region , int zipCode)
	{
		Employees employees = new Employees (
				address1,
				address2, 
				city,
				zipCode,  
				region, 
				country,
				startDate,
				endDate,
				officialID,
				name, 
				phone,
				email,
				salType,
				MAType,
				degree,
				diploma,
				notes);
		super.buildSessionFactory();
        super.saveObject(employees);   
        
        
  
        
	}

	@Override
	public void deleteByid(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyNameEmployee(int id, String name) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyPhoneEmployee(int id, String phone) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModifyEndWorkingDateEmployee(int id, Date date) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyEmailEmployee(int id, String email) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyEmailEmployee(int id, int salaryRate) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyMAtypeEmployee(int id, int MAtype) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyDegreeEmployee(int id, int degree) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyDimplomaEmployee(int id, int dimploma) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyNotesEmployee(int id, String notes) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

}
