package datalayer;

import java.io.File;
import java.sql.SQLException;

import WorkoutStileplace.MATypes;

public class SchoolDaoImplement  extends DBAbstructInfo implements SchoolDao{

	@Override
	public void add(String address1, String address2, String city, int zipCode, String region, String country,
			String name, String managerName, int numberOfChapters, String email, String wbesite, MATypes mainMAtype,
			File logo) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByid(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyManagerNameSchool(int id, String managerName) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyNumberOfChaptersSchool(int id, int numberOfChapters) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyEmailSchool(int id, String email) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyWebsiteSchool(int id, String wbesite) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyMATypesSchool(int id, MATypes mainMAtype) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ModidyLogoSchool(int id, File logo) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

}
