package com.Mao.BackEndDev.datalayer.DaoImplements;


import java.sql.SQLException;
import java.util.Date;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Degree;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.DegreeName;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Diploma;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Stripes;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Address;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Employee;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.SalTypeEnum;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Salary;
import com.Mao.BackEndDev.businessObjects.itionalData.DeployEnv.InitialValues;
import com.Mao.BackEndDev.datalayer.DbConnections.HibernateStructInfo;

public class EmployeeDaoImpl extends HibernateStructInfo  {
	
	static final Logger LOG = LoggerFactory.getLogger(EmployeeDaoImpl.class);
	
	private Diploma diploma;
	private Employee employee;
	private Address address;
	private Salary salary;
	private Degree degree;
	public InitialValues initialValues = new InitialValues();
	
	
	public void addEmployee (String address1, String address2, String city, int zipCode, String region, String country,
	        String officialID, String email, String title, String gender,String fName, String mName, String lName,String phone,  DegreeName degreeName , Stripes stripes,String comments,
	        String MAtype,String description,String DiplomaName,
	        SalTypeEnum salTypeEnum,float amount, Date givenDate,
	        Date startDate,Date endDate) {
		
	    	Employee createEmployee = new Employee(address1,  address2,  city,  zipCode,  region,  country,
	    	         officialID,  email,  title,  gender, fName,  mName,  lName, phone,  degree,   degreeName ,  stripes, comments,
	    	         MAtype, description, DiplomaName,
	    	         salTypeEnum, amount,  givenDate,
	    	         startDate, endDate);
		
		
	
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
		int tmpAddIdInt = tmp.getDefaultAddress().getAddressID();
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


	
	
	public void ModifyNameEmployeeFirstName(String OfficialId, String firstName) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setFirstName(firstName);
		saveOrUpdate(employee);

	}

	public void ModifyNameEmployeeMiddleName(String OfficialId, String middleName) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setMiddleName(middleName);
		saveOrUpdate(employee);

	}
	
	public void ModifyNameEmployeeLastName(String OfficialId, String lastName) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setLastName(lastName);
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



	
	                                                                                
	public void ModifyNotesEmployee(String OfficialId, String commnetns) throws ClassNotFoundException, SQLException {
		employee = getUniqueObjectResultByOfficialId(OfficialId);
		employee.setCommentns(commnetns);
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
