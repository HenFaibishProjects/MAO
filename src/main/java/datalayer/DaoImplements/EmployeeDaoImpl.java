package datalayer.DaoImplements;


import java.sql.SQLException;
import java.util.Date;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.joda.time.DateTime;

import businessObjects.hr.PeopleContent.Address;
import businessObjects.hr.PeopleContent.Employee;
import businessObjects.hr.PeopleContent.SalType;
import businessObjects.hr.PeopleContent.Salary;
import datalayer.DaoInterfaces.EmployeeDao;
import datalayer.DbConnections.HibernateStructInfo;

public class EmployeeDaoImpl extends HibernateStructInfo implements EmployeeDao {
	
	public Employee employee;
	public Address address;
	
	
	public int addSalType(SalType type, int empId , float amount ,  DateTime  givenDate )
	{
		Salary salary = new Salary (
				type,
				empId, 
				amount,
				givenDate
				);
		    super.saveObject(salary);
		    return salary.getSalCode();
		} 

	
	@Override
	public void addEmployeeWithHibernate(String name, Date startDate ,Date endDate,String officialID, String phone ,int salType,int MAType, int degree,int diploma ,String notes,String email ,String address1 , String address2 , String city , String country , String region , int zipCode)
	{
		Employee createEmployee = new Employee (
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
		super.saveObject(createEmployee);  } 


	public Employee getUniqueObjectResultByOfficialId(String officialID){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("officialID", officialID));
		return (Employee) criteria.uniqueResult();

	}
	
	public Salary getUniqueObjectResultBySallId(int salCode){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Salary.class);
		criteria.add(Restrictions.eq("salCode", salCode));
		return (Salary) criteria.uniqueResult();

	}
	
	public Address getUniqueObjectResultByAddressId(String officialID){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Address.class);
		criteria.add(Restrictions.eq("addressID", officialID));
		return (Address) criteria.uniqueResult();
	}

	
	@Override
	public void deleteByid(String OfficialId) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setIsActive((byte) (0));
		saveOrUpdate(employee);
		
	}


	
	@Override
	public void ModifyNameEmployee(String OfficialId, String name) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setName(name);
		saveOrUpdate(employee);

	}

	
	@Override
	public void ModifyPhoneEmployee(String OfficialId, String phone) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setPhone(phone);
		saveOrUpdate(employee);

	}

	
	@Override
	public void ModifyEndWorkingDateEmployee(String OfficialId, Date date) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setEndDate(date);
		saveOrUpdate(employee);

	}

	
	@Override
	public void ModifyEmailEmployee(String OfficialId, String email) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setEmail(email);
		saveOrUpdate(employee);

	}

	
	@Override
	public void ModifySalaryEmployee(String OfficialId,SalType type,float amount ) throws ClassNotFoundException, SQLException {
		DateTime  date = new DateTime ();
		employee = getUniqueObjectResultByOfficialId(OfficialId);	
		employee.setSalType(setTheSalValues(type, amount,date , employee));
		saveOrUpdate(employee);
		

	}

  
	public int setTheSalValues(SalType type, float amount, DateTime  givenDate, Employee employee) {
		int salNewCode = addSalType(type, employee.getEmpID() , amount , givenDate );
		return salNewCode;
	}

	
	@Override
	public void ModifyMAtypeEmployee(String OfficialId, int MAtype) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setMAType(MAtype);
		saveOrUpdate(employee);

	}

	@Override
	public void ModifyDegreeEmployee(String OfficialId, int degree) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setDegree(degree);
		saveOrUpdate(employee);

	}

	@Override
	public void ModifyDimplomaEmployee(String OfficialId, int dimploma) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setDimploma(dimploma);
		saveOrUpdate(employee);

	}

	
	@Override                                                                                
	public void ModifyNotesEmployee(String OfficialId, String notes) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setNotes(notes);
		saveOrUpdate(employee);
	}


	@Override
	public void ModidyAdressEmployee(String OfficialId, String addressContent,String newaddressContent) throws ClassNotFoundException, SQLException {
		address = getUniqueObjectResultByAddressId(OfficialId);
		switch(addressContent){  
		case "address1": address.setAddress1(newaddressContent);break;  
		case "address2": address.setAddress2(newaddressContent);break;
		case "city": address.setCity(newaddressContent); break;
		case "zipCode": 
			int newaddressContentZip =  Integer.parseInt(newaddressContent);
			address.setZipCode(newaddressContentZip); 
			break;
		case "region": address.setRegion(newaddressContent); break;
		case "country": address.setCountry(newaddressContent); break;}
		saveOrUpdate(address);
	}


}
