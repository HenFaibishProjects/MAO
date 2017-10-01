package com.Mao.BackEndDev.businessObjects.hr.Schools;

import java.io.File;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Address;

	@Entity
	@Table(name = "Outpost")
	public class Outpost {
		@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
		protected int outpostID;
		public String name;
		public String telNumber;
		public Address mainOfficeAddress;
		public String commnets;
		public String managerFullName;
		public String email;
		public String wbesite;
		public  File logo;
		
		
		public Outpost(String name, String telNumber, Address mainOfficeAddress, String commnets,
				String managerFullName, String email, String wbesite, File logo) {
			super();
			this.name = name;
			this.telNumber = telNumber;
			this.mainOfficeAddress = mainOfficeAddress;
			this.commnets = commnets;
			this.managerFullName = managerFullName;
			this.email = email;
			this.wbesite = wbesite;
			this.logo = logo;
		}
		
		public Outpost() {

		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTelNumber() {
			return telNumber;
		}

		public void setTelNumber(String telNumber) {
			this.telNumber = telNumber;
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

		public int getOutpostID() {
			return outpostID;
		}

		
		
}
