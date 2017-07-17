package com.Mao.BackEndDev.businessObjects.hr.PeopleContent;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "SalType")
public class SalType {

	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int salTypeCode;
	@Column(unique=true)
	public String salTypeName;
	@Transient
	public SalTypeEnum types;
	
	
	
	public SalType(SalTypeEnum types) {
		this.salTypeName = types.toString();

	}
	
	
	public int getSalTypeCode() {
		return salTypeCode;
	}
	public void setSalTypeCode(int salTypeCode) {
		this.salTypeCode = salTypeCode;
	}
	public String getGetSalTypeName() {
		return salTypeName;
	}
	public void setGetSalTypeName(String getSalTypeName) {
		this.salTypeName = getSalTypeName;
	}
	public SalTypeEnum getTypes() {
		return types;
	}
	public void setTypes(SalTypeEnum types) {
		this.types = types;
	}
 
	


	
	
	
	
	
	
}
