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
public class Employee extends Person {

	private Date startDate;
	private Date endDate;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "salaryID")
	private Salary salary;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "mATypeID")
	private MaTypenew mAType;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "diplomaID")
	private Diploma diploma;
	
	public Employee(String address1, String address2, String city, int zipCode, String region, String country,
			        String officialID, String email, String title, String gender,String fName, String mName, String lName,String phone, Degree degree,  DegreeName degreeName , Stripes stripes,String comments,
			        String MAtype,String description,String DiplomaName,
			        SalTypeEnum salTypeEnum,float amount, Date givenDate,
			        Date startDate,Date endDate)
                	{
						super(officialID, email, title, gender, fName, mName, lName, phone, degree, stripes,comments);
		                super.defaultAddress = new Address(address1, address2, city, zipCode, region, country);
		    			this.mAType = new MaTypenew(MAtype,description);
		    			this.diploma = new Diploma(DiplomaName);
		    			this.salary = new Salary(salTypeEnumnumber(salTypeEnum), amount, givenDate);
		    			this.startDate = startDate;
		    			this.endDate = endDate;
		    		}
	
	

	private int salTypeEnumnumber(SalTypeEnum salTypeEnum) {
		int salTypeById=0;
		switch (salTypeEnum.toString()) {
		case ("ByHouer"):
			salTypeById = 1;break;
		case ("ByClass"):
			salTypeById = 2;break;
		case ("ByWeek"):
			salTypeById = 3;break;
		case ("ByMounth"):
			salTypeById = 4;break;
		case ("ByYear"):
			salTypeById = 5;break;
		}
		return salTypeById;
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

	public String getOfficialID() {
		return officialID;
	}



	public void setOfficialID(String officialID) {
		this.officialID = officialID;
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




	public Diploma getDiploma() {
		return diploma;
	}


	public void setDiploma(Diploma diploma) {
		this.diploma = diploma;
	}
	
	



	
	}


