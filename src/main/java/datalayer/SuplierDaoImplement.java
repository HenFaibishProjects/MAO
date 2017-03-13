package datalayer;

import java.sql.SQLException;

import people.SupplierNew;

public class SuplierDaoImplement extends HibernateStructInfo implements SuplierDao{

	@Override
	public void addSuppliyerWithHibernate(int suplyCode, String name, String id, String phone ,String website,String email ,String address1 , String address2 , String city , String country , String region , int zipCode)
	{
		SupplierNew supplier = new SupplierNew (
				address1, 
				address2, 
				city, 
				zipCode,  
				region, 
				country, 
				name,
				id, 
				phone , 
				website, 
				email, 
				null);
		super.buildSessionFactory();
        super.saveObject(supplier);   
        
	}

	@Override
	public void deleteByid(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyNameSuppliyer(int supplierID, String name) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyPhoneSuppliyer(int supplierID, String phone) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyWebsiteSuppliyer(int supplierID, String website) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyEmailSuppliyer(int supplierID, String email) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyTaxScanSuppliyer(int supplierID, int tax) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyNotesSuppliyer(int supplierID, String notes) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidySundaySuppliyer(int supplierID, int sunday) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyMondaySuppliyer(int supplierID, int monday) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyTuesdaySuppliyer(int supplierID, int tuesday) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyWednesdaySuppliyer(int isupplierIDd, int wednesday) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyThursdaySuppliyer(int supplierID, int thursday) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyFridaySuppliyer(int supplierID, int firday) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidySaturdaySuppliyer(int supplierID, int saturday) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyUSDollarSuppliyer(int supplierID, int us) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyNisSuppliyer(int supplierID, int nis) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyEUROSuppliyer(int supplierID, int euro) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyAUDollarSuppliyer(int supplierID, int au) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

}
