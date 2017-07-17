package com.Mao.BackEndDev.datalayer.DaoImplements;


import java.sql.SQLException;
import java.util.Date;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.joda.time.DateTime;

import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Degree;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.DegreeName;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Diploma;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.InitialValues;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.MaTypenew;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Stripes;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Address;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Employee;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.SalType;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.SalTypeEnum;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Salary;
import com.Mao.BackEndDev.datalayer.DaoInterfaces.EmployeeDao;
import com.Mao.BackEndDev.datalayer.DbConnections.HibernateStructInfo;

public class EmployeeDaoImpl extends HibernateStructInfo  {
	private Diploma diploma;
	private Employee employee;
	private Address address;
	private Salary salary;
	private Degree degree;
	public InitialValues initialValues = new InitialValues();
	
	
	public void addEmployee (SalTypeEnum salTypeEnum ,String DiplomaName, DegreeName degreeName ,Stripes stripes,String MAtype,String description, float amount, Date  givenDate ,String address1,String address2,String city,int zipCode,String region,String country , Date startDate, Date endDate,String officialID, String name, String phone, String email,
			 String notes) {
		Employee createEmployee = new Employee (salTypeEnum , DiplomaName,  degreeName ,stripes, MAtype, description,  amount,   givenDate , address1, address2, city, zipCode, region, country ,  startDate,  endDate, officialID,  name,  phone,  email,
				  notes);
		super.saveObject(createEmployee);  } 


	public Employee getUniqueObjectResultByOfficialId(String officialID){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("officialID", officialID));
		return (Employee) criteria.uniqueResult();

	}
	
	public Address getUniqueObjectResultByOfficialIdAddress(String officialID){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Employee.class);
		Criteria criteriaAddress = session.createCriteria(Address.class);
		criteria.add(Restrictions.eq("officialID", officialID));
		Employee tmp = (Employee) criteria.uniqueResult();
		int tmpAddIdInt = tmp.getEmployees_default_address().getAddressID();
		criteriaAddress.add(Restrictions.eq("addressID" ,tmpAddIdInt));
		return (Address) criteriaAddress.uniqueResult();

	}
	
	
	public Diploma getUniqueObjectResultByOfficialIdDiploma(String officialID){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Employee.class);
		Criteria criteriaDiploma = session.createCriteria(Diploma.class);
		criteria.add(Restrictions.eq("officialID", officialID));
		Employee tmp = (Employee) criteria.uniqueResult();
		int tmpAddIdInt = tmp.getDiploma().getDiplomaID();
		criteriaDiploma.add(Restrictions.eq("DiplomaID" ,tmpAddIdInt));
		return (Diploma) criteriaDiploma.uniqueResult();
	}
	
	
	public Degree getUniqueObjectResultByOfficialIdDegree(String officialID){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Employee.class);
		Criteria criteriaDegree = session.createCriteria(Degree.class);
		criteria.add(Restrictions.eq("officialID", officialID));
		Employee tmp = (Employee) criteria.uniqueResult();
		int tmpAddIdInt = tmp.getDegree().getDegreeID();
		criteriaDegree.add(Restrictions.eq("DegreeID" ,tmpAddIdInt));
		return (Degree) criteriaDegree.uniqueResult();
	}
	
	public Salary getUniqueObjectResultBySallId(String officialID){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Employee.class);
		Criteria criteriaSalary = session.createCriteria(Salary.class);
		criteria.add(Restrictions.eq("officialID", officialID));
		Employee tmp = (Employee) criteria.uniqueResult();
		int tmpAddIdInt = tmp.getSalary().getSalCode();
		criteriaSalary.add(Restrictions.eq("salCode", tmpAddIdInt));
		return (Salary) criteriaSalary.uniqueResult();
                  
	}

	

	public void deleteByid(String OfficialId) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setIsActive((byte) (0));
		saveOrUpdate(employee);
		
	}


	
	
	public void ModifyNameEmployee(String OfficialId, String name) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setName(name);
		saveOrUpdate(employee);

	}

	
	
	public void ModifyPhoneEmployee(String OfficialId, String phone) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setPhone(phone);
		saveOrUpdate(employee);

	}

	
	
	public void ModifyEndWorkingDateEmployee(String OfficialId, Date date) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setEndDate(date);
		saveOrUpdate(employee);

	}

	
	
	public void ModifyEmailEmployee(String OfficialId, String email) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setEmail(email);
		saveOrUpdate(employee);

	}

	
	



	
	public void ModifyDegreeEmployee(String OfficialId, DegreeName degreeName) throws ClassNotFoundException, SQLException {
		degree = getUniqueObjectResultByOfficialIdDegree(OfficialId);
		degree.setDegreeName(degreeName);
		saveOrUpdate(degree);
	}



	
	                                                                                
	public void ModifyNotesEmployee(String OfficialId, String notes) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setNotes(notes);
		saveOrUpdate(employee);
	}

 
	
	public void ModidyAdressEmployee(String OfficialId, String addressContent,String newaddressContent) throws ClassNotFoundException, SQLException {
		address = getUniqueObjectResultByOfficialIdAddress(OfficialId);
		switch(addressContent){
		case "address1": address.setAddress1(newaddressContent);break;  
		case "address2": address.setAddress2(newaddressContent);break;
		case "city":     address.setCity(newaddressContent); break;
		case "zipCode":  address.setZipCode(Integer.parseInt(newaddressContent));break; 	
		case "region":   address.setRegion(newaddressContent); break;
		case "country":  address.setCountry(newaddressContent); break;}
		saveOrUpdate(address);
	}

	
	public void ModifyDimplomaEmployee(String OfficialId, String dimplomaName) throws ClassNotFoundException, SQLException {
		diploma = getUniqueObjectResultByOfficialIdDiploma(OfficialId);
		diploma.setDiplomaName(dimplomaName);
		saveOrUpdate(diploma);
	
}

		
	public void ModifySalEmployee(String OfficialId,float amount) throws ClassNotFoundException, SQLException {
		Date date = new Date();
		salary = getUniqueObjectResultBySallId(OfficialId);
		salary.setGivenDate(date);
		salary.setAmount(amount);
		saveOrUpdate(salary);
		
	}
		
		
}
