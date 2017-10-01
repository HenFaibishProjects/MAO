 
package com.Mao.BackEndDev.businessObjects.hr.Schools;

import java.io.File;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.MATypesEnum;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Address;

@Entity
@Table(name = "School")
public class School {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int schoolID;
	public String name;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "outpostID")
	public Outpost outpost;
	@ManyToOne(cascade = CascadeType.ALL)
	public Account account;
	@JoinColumn(name = "userID")
	public String mainTelNumber;
	public Address mainOfficeAddress;
	public String commnets;
	public String managerFullName;
	public String email;
	public String wbesite;
	public  File logo;
	
	
	public School(String name, Outpost outpost, String mainTelNumber, Address mainOfficeAddress, String commnets,
			String managerFullName, String email, String wbesite, File logo,Account ccount) {
		super();
		this.name = name;
		this.outpost = outpost;
		this.mainTelNumber = mainTelNumber;
		this.mainOfficeAddress = mainOfficeAddress;
		this.commnets = commnets;
		this.managerFullName = managerFullName;
		this.email = email;
		this.wbesite = wbesite;
		this.logo = logo;
	}
	
	public School(String name, Outpost outpost, String mainTelNumber, Address mainOfficeAddress, String commnets,
			String managerFullName, String email, String wbesite) {
		super();
		this.name = name;
		this.outpost = outpost;
		this.mainTelNumber = mainTelNumber;
		this.mainOfficeAddress = mainOfficeAddress;
		this.commnets = commnets;
		this.managerFullName = managerFullName;
		this.email = email;
		this.wbesite = wbesite;
	}
	
	public School() {
 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Outpost getOutpost() {
		return outpost;
	}

	public void setOutpost(Outpost outpost) {
		this.outpost = outpost;
	}

	public String getMainTelNumber() {
		return mainTelNumber;
	}

	public void setMainTelNumber(String mainTelNumber) {
		this.mainTelNumber = mainTelNumber;
	}

	public Address getMainOfficeAddress() {
		return mainOfficeAddress;
	}

	public void setMainOfficeAddress(Address mainOfficeAddress) {
		this.mainOfficeAddress = mainOfficeAddress;
	}

	public String getCommnets() {
		return commnets;
	}

	public void setCommnets(String commnets) {
		this.commnets = commnets;
	}

	public String getManagerFullName() {
		return managerFullName;
	}

	public void setManagerFullName(String managerFullName) {
		this.managerFullName = managerFullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWbesite() {
		return wbesite;
	}

	public void setWbesite(String wbesite) {
		this.wbesite = wbesite;
	}

	public File getLogo() {
		return logo;
	}

	public void setLogo(File logo) {
		this.logo = logo;
	}

	public int getSchoolID() {
		return schoolID;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
	
}


