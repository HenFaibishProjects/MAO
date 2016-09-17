package people;

import people.InterFaces.Person;
import people.InterFaces.WorkingDays;

public class employees implements Person, WorkingDays{

	private final char[] WorkingDays;
	private int empCode;
	private String name;
	private String id;
	private String phone;

	

	public employees(char[] workingDays, int suplyCode, String name, String id, String phone) {
		WorkingDays = workingDays;
		empCode = suplyCode;
		this.name = name;
		this.id = id;
		this.phone = phone;
	}

	public int getSuplyCode() {
		return empCode;
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

	public char[] getWorkingDays() {		
		return this.WorkingDays;
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

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	}


