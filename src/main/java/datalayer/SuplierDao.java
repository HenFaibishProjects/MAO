package datalayer;

import java.sql.SQLException;


public interface SuplierDao {
  
	 
	 void add(String address1 , String address2 , String city , int zipCode , String region , String country ,
		        int sunday, int monday, int tuesday, int wednesday, int thursday, int friday, int saturday ,
		        int USDollars, int NIS, int Euro, int AUDollars ,
		        String date , String name, long supplierID , String phone, String website, String email, int taxscan , String notes   
		        ) throws ClassNotFoundException, SQLException ;
	 
	 void deleteByid(int id) throws ClassNotFoundException, SQLException ;
	 
	 void ModidyNameSuppliyer(int supplierID ,String name) throws ClassNotFoundException, SQLException ;

	 void ModidyPhoneSuppliyer(int supplierID ,String phone) throws ClassNotFoundException, SQLException ;

	 void ModidyWebsiteSuppliyer(int supplierID ,String website) throws ClassNotFoundException, SQLException ;
		
	 void ModidyEmailSuppliyer(int supplierID ,String email) throws ClassNotFoundException, SQLException ;
	
	 void ModidyTaxScanSuppliyer(int supplierID ,int tax) throws ClassNotFoundException, SQLException ;
		
	 void ModidyNotesSuppliyer(int supplierID ,String notes) throws ClassNotFoundException, SQLException ;
	
	 void ModidySundaySuppliyer(int supplierID ,int sunday) throws ClassNotFoundException, SQLException ;
	
	 void ModidyMondaySuppliyer(int supplierID ,int monday) throws ClassNotFoundException, SQLException ;
	
	 void ModidyTuesdaySuppliyer(int supplierID ,int tuesday) throws ClassNotFoundException, SQLException ;
	
	 void ModidyWednesdaySuppliyer(int isupplierIDd ,int wednesday) throws ClassNotFoundException, SQLException ;

	 void ModidyThursdaySuppliyer(int supplierID ,int thursday) throws ClassNotFoundException, SQLException; 
		
	 void ModidyFridaySuppliyer(int supplierID ,int firday) throws ClassNotFoundException, SQLException; 
		
	 void ModidySaturdaySuppliyer(int supplierID ,int saturday) throws ClassNotFoundException, SQLException ;
	
	 void ModidyUSDollarSuppliyer(int supplierID ,int us) throws ClassNotFoundException, SQLException ;
	
	 void ModidyNisSuppliyer(int supplierID ,int nis) throws ClassNotFoundException, SQLException ;
	
	 void ModidyEUROSuppliyer(int supplierID ,int euro) throws ClassNotFoundException, SQLException ;

	 void ModidyAUDollarSuppliyer(int supplierID ,int au) throws ClassNotFoundException, SQLException ;
	
	
	


}
