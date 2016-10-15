package people;

import java.util.ArrayList;
import java.util.Scanner;

import people.InterFaces.Person;

public class Supplier {
	protected int suplyCode;
	protected String name;
	protected String id;
	protected String phone; 
	protected String website;
	protected String email;  
	protected Address default_address;
	protected ArrayList<DaysOfTheWeek> daysOfTheWeek = new ArrayList<DaysOfTheWeek>();
	protected ArrayList<Curency> curency = new ArrayList<Curency>();
	String taxScan;

	

	public Supplier scanSupplier() {
		Scanner sc = new Scanner(System.in);
		suplyCode = sc.nextInt();
		name = sc.next();
		id = sc.next();
		phone = sc.next();
		curency = Curency.setByScannerCurency();
		taxScan = TaxType.setByScannerTaxType();
        website = sc.next();
		String address1 = sc.next();
		String address2  = sc.next();
		String city = sc.next();
		int zipCode = sc.nextInt();
		String region = sc.next();
		String country = sc.next();
		Address NewAdressFromScan = new Address(address1, address2, city, zipCode, region, country);
		DaysOfTheWeek.setByScannerTheWorkingDaysOfTheWeek();
		Supplier supplierFromScan = new Supplier(suplyCode, name, id, phone, curency, website, email, NewAdressFromScan, daysOfTheWeek);
		return supplierFromScan;
		
	}

	
	public Supplier() {
	
	}
	
	public Supplier(int suplyCode, String name, String id, String phone ,ArrayList<Curency> curency,String website,String email,Address default_address, ArrayList<DaysOfTheWeek> daysOfTheWeek) {
		this.suplyCode = suplyCode;
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.curency = curency;
		this.website = website;
		this.email = email;
		this.default_address = default_address;
		this.daysOfTheWeek = daysOfTheWeek;
	}

	public int getSuplyCode() {
		return suplyCode;
	}

	public String getName() {
		return this.name;
	}

	public String getId() {
		return this.id;
	}

	public String getPhone() {
		return this.phone;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;

	}

	public void setPhone(String phone) {
		this.phone = phone;

	}

	public void setSuplyCode(int suplyCode) {
		this.suplyCode = suplyCode;
	}



	public ArrayList<DaysOfTheWeek> getDaysOfTheWeek() {
		return daysOfTheWeek;
	}


	public void setDaysOfTheWeek(ArrayList<DaysOfTheWeek> daysOfTheWeek) {
		this.daysOfTheWeek = daysOfTheWeek;
	}


	public ArrayList<Curency> getCurency() {
		return curency;
	}


	public void setCurency(ArrayList<Curency> curency) {
		this.curency = curency;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Address getDefault_address() {
		return default_address;
	}


	public void setDefault_address(Address default_address) {
		this.default_address = default_address;
	}

	
}
