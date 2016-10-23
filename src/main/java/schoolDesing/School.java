package schoolDesing;

import java.io.File;

import WorkoutStileplace.MATypes;

public class School {
	
	String name;
	String managerName;
	int numberOfChapters;
	String email;
	String wbesite;
	MATypes mainMAtype;
	File logo;
	
	
	
	
	public School(String name, String managerName, int numberOfChapters, String email, String wbesite,
			MATypes mainMAtype, File logo) {
		super();
		this.name = name;
		this.managerName = managerName;
		this.numberOfChapters = numberOfChapters;
		this.email = email;
		this.wbesite = wbesite;
		this.mainMAtype = mainMAtype;
		this.logo = logo;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getManagerName() {
		return managerName;
	}




	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}




	public int getNumberOfChapters() {
		return numberOfChapters;
	}




	public void setNumberOfChapters(int numberOfChapters) {
		this.numberOfChapters = numberOfChapters;
	}




	public String getEmial() {
		return email;
	}




	public void setEmial(String emial) {
		this.email = emial;
	}




	public String getWbesite() {
		return wbesite;
	}




	public void setWbesite(String wbesite) {
		this.wbesite = wbesite;
	}




	public MATypes getMainMAtype() {
		return mainMAtype;
	}




	public void setMainMAtype(MATypes mainMAtype) {
		this.mainMAtype = mainMAtype;
	}




	public File getLogo() {
		return logo;
	}




	public void setLogo(File logo) {
		this.logo = logo;
	}
	
	
	
	
}
