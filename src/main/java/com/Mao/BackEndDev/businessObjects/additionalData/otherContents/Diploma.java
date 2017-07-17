
package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Diploma")
public class Diploma {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DiplomaID")
	int diplomaID;
	@Column(name="DiplomaName")
	String diplomaName;


	public Diploma() {
	}
	
	public Diploma(String DiplomaName) {
		this.diplomaName = DiplomaName;
	}


	public int getDiplomaID() {
		return diplomaID;
	}


	public void setDiplomaID(int diplomaID) {
		this.diplomaID = diplomaID;
	}


	public String getDiplomaName() {
		return diplomaName;
	}


	public void setDiplomaName(String diplomaName) {
		this.diplomaName = diplomaName;
	}




}

