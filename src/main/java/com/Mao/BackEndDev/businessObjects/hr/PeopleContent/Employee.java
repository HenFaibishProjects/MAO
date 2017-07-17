package com.Mao.BackEndDev.businessObjects.hr.PeopleContent;

import java.util.Date;

import javax.annotation.Nonnull;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.joda.time.DateTime;

import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Degree;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.DegreeName;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Diploma;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.MaTypenew;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Stripes;


@Entity
@Table(name = "Employee")
public class Employee  {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empID;
	private String officialID;
	private Date startDate;
	private Date endDate;
	private String name;
	private String phone;
	private String email;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "salaryID")
	private Salary salary;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mATypeID")
	private MaTypenew mAType;
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn(name = "degreeID")
	private Degree degree;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "diplomaID")
	private Diploma diploma;
	private String notes;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressID")
	protected Address employees_default_address;
	@Nonnull
	private byte isActive=1;
	
	public Employee() {
		super();	
	}
	
	
	public Employee(SalTypeEnum salTypeEnum ,String DiplomaName, DegreeName degreeName ,Stripes stripes,String MAtype,String description, float amount, Date  givenDate ,String address1,String address2,String city,int zipCode,String region,String country , Date startDate, Date endDate,String officialID, String name, String phone, String email,
		 String notes) {
		this.mAType = new MaTypenew(MAtype,description);
		this.degree = new Degree(degreeName, stripes);
		this.diploma = new Diploma(DiplomaName);
		this.salary = new Salary(salTypeEnumnumber(salTypeEnum), amount, givenDate);
		this.employees_default_address = new Address(empID,address1,address2,city,zipCode,region,country);
		this.startDate = startDate;
		this.endDate = endDate;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.notes = notes;
	}

	
	

	private int salTypeEnumnumber(SalTypeEnum salTypeEnum) {
		int salTypeById=0;
		switch (salTypeEnum.toString()) {
		case ("ByHouer"):
			salTypeById = 1;
		break;

		case ("ByClass"):
			salTypeById = 2;
		break;

		case ("ByWeek"):
			salTypeById = 3;
		break;

		case ("ByMounth"):
			salTypeById = 4;
		break;

		case ("ByYear"):
			salTypeById = 5;
		break;

		}
		return salTypeById;

	}


	public int getEmpID() {
		return empID;
	}



	public void setEmpID(int empID) {
		this.empID = empID;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public Date getEndDate() {
		return endDate;
	}



	public void setEndDate(Date   endDate) {
		this.endDate = endDate;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}




	public String getNotes() {
		return notes;
	}



	public void setNotes(String notes) {
		this.notes = notes;
	}



	public String getOfficialID() {
		return officialID;
	}



	public void setOfficialID(String officialID) {
		this.officialID = officialID;
	}



	public Address getEmployees_default_address() {
		return employees_default_address;
	}



	public void setEmployees_default_address(Address employees_default_address) {
		this.employees_default_address = employees_default_address;
	}



	public byte getIsActive() {
		return isActive;
	}



	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}


	public Salary getSalary() {
		return salary;
	}


	public void setSalary(Salary salary) {
		this.salary = salary;
	}


	public MaTypenew getmAType() {
		return mAType;
	}


	public void setmAType(MaTypenew mAType) {
		this.mAType = mAType;
	}


	public Degree getDegree() {
		return degree;
	}


	public void setDegree(Degree degree) {
		this.degree = degree;
	}


	public Diploma getDiploma() {
		return diploma;
	}


	public void setDiploma(Diploma diploma) {
		this.diploma = diploma;
	}
	
	



	
	}


