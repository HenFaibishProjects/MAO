//package people;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//
//import people.InterFaces.Person;
//
//public final class VirtualSupplier extends Supplier implements Person{  
//     
//	public static int VirtualSupliersCounter;
//	int OwnershipType;
//	public static boolean accepts_marketing;
//	public int addresses_count;
//	public String  virtualNamePayment;
//	public boolean has_Ebay_account;
//	public boolean has_PrivateSite;
//	public String continent;
//	public String taxType;
//	public int maximumPerOrder;
//	
//	
//	public VirtualSupplier()
//	{
//		VirtualSupliersCounter += 1;
//	}
//	
//	
//			
//	public VirtualSupplier(int suplyCode, String name, String id, String phone ,ArrayList<Curency> curency,String website,String email,Address default_address, ArrayList<DaysOfTheWeek> daysOfTheWeek 
//		, int OwnershipType,int addresses_count ,String  virtualNamePayment,boolean has_Ebay_account,boolean has_PrivateSite,String continent,String taxType,int maximumPerOrder) {
//		super(suplyCode, name, id, phone, curency, website, email, default_address, daysOfTheWeek);
//		this.OwnershipType = OwnershipType;
// 		VirtualSupliersCounter += 1;
//
//	}
//	
//	public VirtualSupplier scanVSupplier() {
//		Scanner sc = new Scanner(System.in);
//		suplyCode = sc.nextInt();
//		name = sc.next();
//		id = sc.next();
//		phone = sc.next();
//		OwnershipType = sc.nextInt();
//		accepts_marketing = sc.nextBoolean();
//		addresses_count= sc.nextInt();
//		virtualNamePayment= sc.next();
//		has_Ebay_account= sc.nextBoolean();
//		has_PrivateSite = sc.nextBoolean();
//		continent = Continent.setByScannerContinentString();
//		taxType = TaxType.setByScannerTaxType();
//		maximumPerOrder = sc.nextInt();
//		DaysOfTheWeek.setByScannerTheWorkingDaysOfTheWeek();
//		VirtualSupplier vSupplierFromScan = new VirtualSupplier
//				       (suplyCode, 
//						name,
//						id,
//						phone,
//						curency,
//						website,
//						email,
//						default_address,
//						daysOfTheWeek,
//						OwnershipType, 
//						addresses_count, 
//						virtualNamePayment,
//						has_Ebay_account,
//						has_PrivateSite, 
//						continent, 
//						taxType,
//						maximumPerOrder);
//			
//		                        return vSupplierFromScan;}
//
//
//	public int getOwnershipType() {
//		return OwnershipType;
//	}
//
//	public void setOwnershipType(int ownershipType) {
//		OwnershipType = ownershipType;
//	}
//
//
//	public static boolean isAccepts_marketing() {
//		return accepts_marketing;
//	}
//
//
//	public static void setAccepts_marketing(boolean accepts_marketing) {
//		VirtualSupplier.accepts_marketing = accepts_marketing;
//	}
//
//
//
//	public int getAddresses_count() {
//		return addresses_count;
//	}
//
//
//
//	public void setAddresses_count(int addresses_count) {
//		this.addresses_count = addresses_count;
//	}
//
//
//
//
//	public String getVirtualNamePayment() {
//		return virtualNamePayment;
//	}
//
//
//
//
//	public void setVirtualNamePayment(String virtualNamePayment) {
//		this.virtualNamePayment = virtualNamePayment;
//	}
//
//
//	public boolean isHas_Ebay_account() {
//		return has_Ebay_account;
//	}
//
//
//
//	public void setHas_Ebay_account(boolean has_Ebay_account) {
//		this.has_Ebay_account = has_Ebay_account;
//	}
//
//
//
//	public boolean isHas_PrivateSite() {
//		return has_PrivateSite;
//	}
//
//
//
//	public void setHas_PrivateSite(boolean has_PrivateSite) {
//		this.has_PrivateSite = has_PrivateSite;
//	}
//
//
//
//	public String getContinent() {
//		return continent;
//	}
//
//
//
//
//	public void setContinent(String continent) {
//		this.continent = continent;
//	}
//
//
//	public String getTaxType() {
//		return taxType;
//	}
//
//
//
//	public void setTaxType(String taxType) {
//		this.taxType = taxType;
//	}
//
//
//
//	public int getMaximumPerOrder() {
//		return maximumPerOrder;
//	}
//
//
//	public void setMaximumPerOrder(int maximumPerOrder) {
//		this.maximumPerOrder = maximumPerOrder;
//	}
//}
