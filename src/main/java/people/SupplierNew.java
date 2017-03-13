package people;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class SupplierNew {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int suplyCode;
	protected String name;
	protected String id;
	protected String phone; 
	protected String website;
	protected String email;  
	//@ElementCollection // creates a seperate table  for storing the contents of multiple addresses
	//protected Set<Address> default_address = new HashSet<Address>();
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressID")
	protected Address supplier_default_address;
	protected ArrayList<DaysOfTheWeek> daysOfTheWeek = new ArrayList<DaysOfTheWeek>();
//	protected List<Curency> curency = new ArrayList<Curency>();
	String taxScan;

	

//	public SupplierNew scanSupplier() {
//		Scanner sc = new Scanner(System.in);
//		suplyCode = sc.nextInt();
//		name = sc.next();
//		id = sc.next();
//		phone = sc.next();
//		curency = Curency.setByScannerCurency();
//		taxScan = TaxType.setByScannerTaxType();
//        website = sc.next();
//		String address1 = sc.next();
//		String address2  = sc.next();
//		String city = sc.next();
//		int zipCode = sc.nextInt();
//		String region = sc.next();
//		String country = sc.next();
//		Address NewAdressFromScan = new Address(address1, address2, city, zipCode, region, country);
//		DaysOfTheWeek.setByScannerTheWorkingDaysOfTheWeek();
//		//SupplierNew supplierFromScan = new SupplierNew(suplyCode, name, id, phone, curency, website, email, NewAdressFromScan, daysOfTheWeek);
//		return supplierFromScan;
//		
//	}

	
	public SupplierNew() {
	
	}
	
	public SupplierNew(String address1, String address2, String city, int zipCode, String region, String country, String name, String id, String phone ,String website,String email, ArrayList<DaysOfTheWeek> daysOfTheWeek) {
		
		this.supplier_default_address = new Address(address1,address2,city,zipCode,region,country);
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.website = website;
		this.email = email;
		this.daysOfTheWeek = daysOfTheWeek;
	}

	
//	public SupplierNew(int suplyCode, String name, String id, String phone ,String website,String email) {
//		this.suplyCode = suplyCode;
//		this.name = name;
//		this.id = id;
//		this.phone = phone;
//		this.website = website;
//		this.email = email;
//	}
	
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



	public List<DaysOfTheWeek> getDaysOfTheWeek() {
		return daysOfTheWeek;
	}


	public void setDaysOfTheWeek(ArrayList<DaysOfTheWeek> daysOfTheWeek) {
		this.daysOfTheWeek = daysOfTheWeek;
	}


//	public List<Curency> getCurency() {
//		return curency;
//	}
//
//
//	public void setCurency(ArrayList<Curency> curency) {
//		this.curency = curency;
//	}


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


//	public void setDefault_address(Set<Address> default_address) {
//		this.default_address = default_address;
//	}
//
//
//	public Set<Address> getDefault_address() {
//		return default_address;
//	}



	
}
