package datalayer;

import java.sql.SQLException;


public interface SuplierDao {
  
	
	
	 void deleteByid(int id) throws ClassNotFoundException, SQLException ;

	 void getTheDataByIndex(int i) throws ClassNotFoundException, SQLException ;

	 void add(String address1 , String address2 , String city , int zipCode , String region , String country ,
		        int sunday, int monday, int tuesday, int wednesday, int thursday, int friday, int saturday ,
		        int USDollars, int NIS, int Euro, int AUDollars ,
		        String date , String name, long supplierID , String phone, String website, String email, int taxscan , String notes   
		        ) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyNameSuppliyer(int id ,String name) throws ClassNotFoundException, SQLException ;

	 void ModidyPhoneSuppliyer(int id ,String phone) throws ClassNotFoundException, SQLException ;

	 void ModidyWebsiteSuppliyer(int id ,String website) throws ClassNotFoundException, SQLException ;
		
	 void ModidyEmailSuppliyer(int id ,String email) throws ClassNotFoundException, SQLException ;
	
	 void ModidyTaxScanSuppliyer(int id ,int tax) throws ClassNotFoundException, SQLException ;
		
	 void ModidyNotesSuppliyer(int id ,String notes) throws ClassNotFoundException, SQLException ;
	
	 void ModidyAddressOneSuppliyer(int id ,String addressOne) throws ClassNotFoundException, SQLException ;
	
	 void ModidyAddressTwoSuppliyer(int id ,String addressTwo) throws ClassNotFoundException, SQLException ;
		
	 void ModidyZipCodeSuppliyer(int id ,int zip) throws ClassNotFoundException, SQLException ;
		
	 void ModidyRegionSuppliyer(int id ,String region) throws ClassNotFoundException, SQLException ;
	
	 void ModidyCitySuppliyer(int id ,String city) throws ClassNotFoundException, SQLException ;
	
	 void ModidyConutrySuppliyer(int id ,String country) throws ClassNotFoundException, SQLException ;
	
	 void ModidySundaySuppliyer(int id ,int sunday) throws ClassNotFoundException, SQLException ;
	
	 void ModidyMondaySuppliyer(int id ,int monday) throws ClassNotFoundException, SQLException ;
	
	 void ModidyTuesdaySuppliyer(int id ,int tuesday) throws ClassNotFoundException, SQLException ;
	
	 void ModidyWednesdaySuppliyer(int id ,int wednesday) throws ClassNotFoundException, SQLException ;

	 void ModidyThursdaySuppliyer(int id ,int thursday) throws ClassNotFoundException, SQLException; 
		
	 void ModidyFridaySuppliyer(int id ,int firday) throws ClassNotFoundException, SQLException; 
		
	 void ModidySaturdaySuppliyer(int id ,int saturday) throws ClassNotFoundException, SQLException ;
	
	 void ModidyUSDollarSuppliyer(int id ,int us) throws ClassNotFoundException, SQLException ;
	
	 void ModidyNisSuppliyer(int id ,int nis) throws ClassNotFoundException, SQLException ;
	
	 void ModidyEUROSuppliyer(int id ,int euro) throws ClassNotFoundException, SQLException ;

	 void ModidyAUDollarSuppliyer(int id ,int au) throws ClassNotFoundException, SQLException ;
	
	
	


}
