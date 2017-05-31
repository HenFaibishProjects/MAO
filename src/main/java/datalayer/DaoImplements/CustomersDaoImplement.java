package datalayer.DaoImplements;

import java.sql.Date;
import java.sql.SQLException;

import datalayer.DaoInterfaces.CustomersDao;

public class CustomersDaoImplement implements CustomersDao{

	@Override
	public void add(String address1, String address2, String city, int zipCode, String region, String country,
			Date Rdate, String name, Date birthday, float employeeID, String phone, String email, int degree,
			int trainigProgram, int paymets, int arriveFrom, int insurance, String notes)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByid(String OfficialId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyNameCustomer(String OfficialId, String name) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyPhoneCustomer(String OfficialId, String phone) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyDatebirthdayCustomer(String OfficialId, Date birthday)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyEmailCustomer(String OfficialId, String email) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyPhoneCustomer(String OfficialId, int degree) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyTrainigProgramCustomer(String OfficialId, int trainigProgram)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyPaymetsCustomer(String OfficialId, int paymets) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyArriveFromCustomer(String OfficialId, int arriveFrom)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyInsuranceCustomer(String OfficialId, int insurance) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyNotesCustomer(String OfficialId, String notes) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyAdressCustomer(String OfficialId, String addressContent, String newaddressContent)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	
	
}
