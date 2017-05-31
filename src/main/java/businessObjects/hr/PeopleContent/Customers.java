package businessObjects.hr.PeopleContent;

import java.sql.Date;

import businessObjects.hr.PeopleInterFaces.CustomerAction;
import businessObjects.hr.PeopleInterFaces.Person;

public class Customers implements Person, CustomerAction {
	String title;
	int MemberType;
	Date birthDay;
	int high;
	char gender;
	public static int ClientsCounter = 0;
	private String name;
	private String id;
	private String phone;

	public Customers(String title ,int MemberType,int age,int high,char gender,String name, String id, String phone) {
		this.MemberType = MemberType;
		ClientsCounter += 1;
		this.name = name;
		this.id = id;
		this.phone = phone;

	}

	public int getMemberType() {
		return MemberType;
	}

	public void setMemberType(int memberType) {
		MemberType = memberType;
	}

	public double CalcBMI(double weight, double height) {

		double bmi = ((weight * 703) / (height * height));
		return bmi;

	}

	public String CalcHeartBit(double age) {
	        double rate=12;
	        double maxrate = 220;
	        double heartrate = maxrate - age;
	        double val = heartrate - rate;
	        double res1 = (val*0.4);
	        double res2 = (val*0.6);
	        double targetmin = res1+rate;
	        double targetmax = res2+rate;
	        
	        String low = "Heart beat low rate: "+targetmin+" - "+targetmax;
	        
	        res1 = (val*0.6);
	        res2 = (val*0.7);
	        
	        targetmin = res1+rate;
	        targetmax = res2+rate;
	        String medium = "Heart beat medium rate: "+targetmin+" - "+targetmax;
	        
	        res1 = (val*0.7);
	        res2 = (val*0.85);
	        
	        targetmin = res1+rate;
	        targetmax = Math.round(res2+rate)*1000/1000;
	        String max = "Heart beat high rate: "+targetmin+" - "+targetmax;

	        String CalcResult = low + " " + medium + " " + max;	        
	        return CalcResult;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getAge() {
		return birthDay;
	}

	public void setAge(Date birthDay) {
		this.birthDay = birthDay;
	}

	public int getHigh() {
		return high;
	}

	public void setHigh(int high) {
		this.high = high;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	}

