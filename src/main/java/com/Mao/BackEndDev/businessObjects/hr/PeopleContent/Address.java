package com.Mao.BackEndDev.businessObjects.hr.PeopleContent;

import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "defaultaddress")
public class Address  {
	
       @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	   @Column(name="addressID")
       public int addressID;   
	   @Column(name="address1")
	   public String address1;	
	   @Column(name="address2")
	   public String address2;
	   @Column(name="city")
	   public String city;
	   @Column(name="zipCode")
	   public int zipCode;
	   @Column(name="region")
	   public String region;
	   @Column(name="country")
	   public String country;

		public Address() {

		}
		
	   
	   
	public Address(int suppliyerID,String address1, String address2, String city, int zipCode, String region, String country) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.zipCode = zipCode;
		this.region = region;
		this.country = country;
	}
	
		
	public int getAddressID() {
		return addressID;
	}
	
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", zipCode=" + zipCode
				+ ", region=" + region + ", country=" + country + "]";
	}
	   

}