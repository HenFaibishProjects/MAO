package people;

import java.util.Date;


public class employees  {

	private int empID;
	private Date startDate;
	private Date endDate;
	private String name;
	private String phone;
	private String email;
	private int salType;
	private int MAType;
	private int degree;
	private int dimploma;
	private String notes;
	
	
	
	public employees(int empID, Date startDate, Date endDate, String name, String phone, String email, int salType,
			int mAType, int degree, int dimploma, String notes) {
		super();
		this.empID = empID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.salType = salType;
		MAType = mAType;
		this.degree = degree;
		this.dimploma = dimploma;
		this.notes = notes;
	}



	public int getEmpID() {
		return empID;
	}



	public void setEmpID(int empID) {
		this.empID = empID;
	}



	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}



	public Date getEndDate() {
		return endDate;
	}



	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getSalType() {
		return salType;
	}



	public void setSalType(int salType) {
		this.salType = salType;
	}



	public int getMAType() {
		return MAType;
	}



	public void setMAType(int mAType) {
		MAType = mAType;
	}



	public int getDegree() {
		return degree;
	}



	public void setDegree(int degree) {
		this.degree = degree;
	}



	public int getDimploma() {
		return dimploma;
	}



	public void setDimploma(int dimploma) {
		this.dimploma = dimploma;
	}



	public String getNotes() {
		return notes;
	}



	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	



	
	}


