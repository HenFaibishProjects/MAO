package com.Mao.BackEndDev.businessObjects.hr.PeopleContent;


import java.util.Date;

import javax.annotation.Nonnull;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Arrivefrom;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Degree;
import com.Mao.BackEndDev.businessObjects.hr.PeopleInterFaces.CustomerAction;


@Entity
@Table(name = "Customers")
public class Customers  {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int customerID;
	protected String officialID;
	protected String email;
	protected String title;
	protected MemberType memberType;
	protected Date birthDay;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "indicesID")
	protected Indices indices;
	protected char gender;
	protected String firstName;
	protected String middleName;
	protected String lastName;
	protected String phone;
	@OneToOne (cascade = CascadeType.ALL)
	@JoinColumn(name = "degreeID")
	private Degree degree;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressID")
	protected Address employees_default_address;
	@Nonnull
	private byte isActive=1;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ArrivefromID")
	protected Arrivefrom arrivedFrom;
	
	
	
	
	
	public Customers(int customerID, String officialID, String email, String title, int memberType, Date birthDay,
			Indices indices, char gender, String firstName, String middleName, String lastName, String phone,
			Degree degree, Address employees_default_address, byte isActive,
			String address1,String address2,String city,int zipCode,String region,String country,Arrivefrom arrivedFrom,
			int high, float weight, int bloodPressureSystolic,
			int bloodPressureDiastolic, int pulsePressure, float fatPercentage) {
		super();
		this.customerID = customerID;
		this.officialID = officialID;
		this.email = email;
		this.title = title;
		this.memberType = null;
		this.birthDay = birthDay;
		this.indices = new Indices(new Date(), high, weight, bloodPressureSystolic, bloodPressureDiastolic, pulsePressure, fatPercentage);
		this.gender = gender;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.phone = phone;
		this.degree = degree;
		this.employees_default_address = new Address(customerID, address1, address2, city, zipCode, region, country);
		this.isActive = isActive;
		this.arrivedFrom = null;
	}
	
	
	public Customers(){
	}
	
	

	public int getCustomerID() {
		return customerID;
	}


	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}


	public String getOfficialID() {
		return officialID;
	}


	public void setOfficialID(String officialID) {
		this.officialID = officialID;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public MemberType getMemberType() {
		return memberType;
	}


	public void setMemberType(MemberType memberType) {
		this.memberType = memberType;
	}


	public Date getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}


	public Indices getIndices() {
		return indices;
	}


	public void setIndices(Indices indices) {
		this.indices = indices;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Degree getDegree() {
		return degree;
	}


	public void setDegree(Degree degree) {
		this.degree = degree;
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

	


	}

