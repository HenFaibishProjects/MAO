package businessObjects.hr.PeopleContent;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nonnull;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import businessObjects.additionalData.otherContents.Currency;
import businessObjects.additionalData.otherContents.DaysOfTheWeek;
import businessObjects.additionalData.otherContents.DaysOfTheWeekEnum;

@Entity
public class Supplier {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int suplyCode;
	protected String name;
	protected String id;
	protected String phone; 
	protected String website;
	protected String email;  
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressID")
	protected Address supplier_default_address;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "DaysOfTheWeek")
 	protected DaysOfTheWeek daysOfTheWeek;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Curency")
 	protected Currency curency;
	String taxScan;
	@Nonnull
	private byte isActive=1;


	
	public Supplier() {
	
	}
	
	public Supplier(short usDollars, short nis , short euro , short auDollars ,short sunday, short monday, short tuesday,short  wednesday, short thursday, short friday, short saturday ,String address1, String address2, String city, int zipCode, String region, String country, String name, String id, String phone ,String website,String email, ArrayList<DaysOfTheWeekEnum> daysOfTheWeek) {
		this.curency = new Currency(suplyCode, usDollars, nis, euro, auDollars);
		this.daysOfTheWeek = new DaysOfTheWeek(suplyCode, sunday, monday, tuesday, wednesday, thursday, friday, saturday);
		this.supplier_default_address = new Address(suplyCode,address1,address2,city,zipCode,region,country);
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.website = website;
		this.email = email;
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

	public Address getSupplier_default_address() {
		return supplier_default_address;
	}

	public void setSupplier_default_address(Address supplier_default_address) {
		this.supplier_default_address = supplier_default_address;
	}

	public DaysOfTheWeek getDaysOfTheWeek() {
		return daysOfTheWeek;
	}

	public void setDaysOfTheWeek(DaysOfTheWeek daysOfTheWeek) {
		this.daysOfTheWeek = daysOfTheWeek;
	}

	public String getTaxScan() {
		return taxScan;
	}

	public void setTaxScan(String taxScan) {
		this.taxScan = taxScan;
	}

	public byte getIsActive() {
		return isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}




	
}
