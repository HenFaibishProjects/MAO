package people;

import java.util.Scanner;

public class Address {
	
	   public String address1;	
	   public String address2;
	   public String city;
	   public int zipCode;
	   public String region;
	   public String country;

	   
	public Address(String address1, String address2, String city, int zipCode, String region, String country) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.zipCode = zipCode;
		this.region = region;
		this.country = country;
	}
	
	
	public Address scanAddress() {
		Scanner sc = new Scanner(System.in);
		address1 = sc.next();
		address2 = sc.next();
        city = sc.next();
        zipCode = sc.nextInt();
        region = sc.next();
        country = sc.next();
        Address NewAdressFromScan = new Address(address1, address2, city, zipCode, region, country);
        return NewAdressFromScan;
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
