package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ClassLevel")
public class ClassLevel {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ClassLevelID")
	int arrivefromID;
	@Column(name="ClassLevelName")
	String ClassLevelName;


	public ClassLevel(String ClassLevelName) {
		this.ClassLevelName = ClassLevelName;
	}


	public int getArrivefromID() {
		return arrivefromID;
	}


	public void setArrivefromID(int arrivefromID) {
		this.arrivefromID = arrivefromID;
	}


	public String getClassLevelName() {
		return ClassLevelName;
	}


	public void setClassLevelName(String classLevelName) {
		ClassLevelName = classLevelName;
	}





}
