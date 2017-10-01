package com.Mao.BackEndDev.businessObjects.hr.Schools;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Account")
public class Account {

	    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	    protected int accountID;
		protected String useNname;
		protected String password;
		protected Date creationTime;
		protected int roleId;
		
		
		public Account(String useNname, String password, Date creationTime, int roleId) {
			super();
			this.useNname = useNname;
			this.password = password;
			this.creationTime = creationTime;
			this.roleId = roleId;
		}
		
		
		public Account() {
		}


		public String getUseNname() {
			return useNname;
		}


		public void setUseNname(String useNname) {
			this.useNname = useNname;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public Date getCreationTime() {
			return creationTime;
		}


		public void setCreationTime(Date creationTime) {
			this.creationTime = creationTime;
		}


		public int getRoleId() {
			return roleId;
		}


		public void setRoleId(int roleId) {
			this.roleId = roleId;
		}


		public int getAccountID() {
			return accountID;
		}
		
		
		
}