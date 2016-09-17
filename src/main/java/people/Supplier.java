package people;

import java.util.Scanner;

import people.InterFaces.Person;
import people.InterFaces.WorkingDays;

public class Supplier implements Person{
	private int suplyCode;
	private String name;
	private String id;
	private String phone;
	String StringWorkingDays;

	

	public Supplier scanSupplier() {
		Scanner sc = new Scanner(System.in);
		suplyCode = sc.nextInt();
		name = sc.next();
		id = sc.next();
		phone = sc.next();
		Supplier supplierFromScan = new Supplier(suplyCode, name, id, phone);
		//sc.close();
		return supplierFromScan;
		
	}
	
	
	public Supplier() {
	
	}
	
	public Supplier(int suplyCode, String name, String id, String phone) {
		this.suplyCode = suplyCode;
		this.name = name;
		this.id = id;
		this.phone = phone;
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

	public String getStringWorkingDays() {
		return StringWorkingDays;
	}

	public void setStringWorkingDays(String stringWorkingDays) {
		StringWorkingDays = stringWorkingDays;
	}

}
