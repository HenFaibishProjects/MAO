
package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Degree")
public class Degree {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DegreeID")
	int degreeID;
	@Column(name="Belt")
	DegreeName degreeName;
    Stripes stripes;

	public Degree() {
	}
	
	
	public Degree(DegreeName degreeName,Stripes stripes) {
		this.degreeName = degreeName;
		this.stripes = stripes;
	}


	public int getDegreeID() {
		return degreeID;
	}


	public void setDegreeID(int degreeID) {
		this.degreeID = degreeID;
	}


	public String getDegreeName() {
		return degreeName.toString();
	}


	public void setDegreeName(DegreeName degreeName) {
		this.degreeName = degreeName;
	}


	public String getStripes() {
		return stripes.toString();
	}


	public void setStripes(Stripes stripes) {
		this.stripes = stripes;
	}




}

