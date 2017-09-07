package com.Mao.BackEndDev;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.testng.annotations.Test;

import com.Mao.BackEndDev.businessObjects.Materials.itemsContect.ItemtsColors;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.AdditionalToItemColor;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumCatergoty;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumColor;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumItemList;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Degree;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.DegreeName;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Stripes;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Durationmembership;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.ParticipateClasses;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.SalTypeEnum;
import com.Mao.BackEndDev.businessObjects.itionalData.DeployEnv.DropTables;
import com.Mao.BackEndDev.businessObjects.itionalData.DeployEnv.InitialValues;
import com.Mao.BackEndDev.datalayer.DaoImplements.CustomersDaoImplement;
import com.Mao.BackEndDev.datalayer.DaoImplements.EmployeeDaoImpl;
import com.Mao.BackEndDev.datalayer.DaoImplements.ItemsImplement;
import com.Mao.BackEndDev.datalayer.DaoImplements.SuplierDaoImplement;



public class StartNG {

	
	public InitialValues initialValues = new InitialValues();

	@Test(groups = { "InitialAllWorkEnv" }, enabled = true)
	public  void dropTables() throws Exception {
		DropTables.doit();

	}

	@Test(groups = { "InitialAllWorkEnv" }, enabled = false)
	public  void initialHRValues() throws Exception {
		initialValues.initialHRValuesIntoDB();

	}
	
	
	@Test(groups = { "InitialAllWorkEnv" }, enabled = false)
	public static void addInitialSuppliyer() {
		SuplierDaoImplement suplierDaoImplement = new SuplierDaoImplement();
		suplierDaoImplement.addSuppliyerWithHibernate((short)1,(short) 1,(short) 1,(short) 1,(short) 1,(short) 0,(short) 0,(short) 0,(short) 0,(short) 0,(short) 0, 564, "Hen", "036316123", "0542689621", "http://www.mao.com", "maoservices@mao.com", "ginat egoz", null, "pardes hana", "Israel", "Center", 8854715);
	}
	
	@Test(groups = { "InitialAllWorkEnv" }, enabled = false,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "employees")
	public static void addInitiaEmployee(String address1, String address2, String city, int zipCode, String region, String country,
	        String officialID, String email, String title, String gender,String fName, String mName, String lName,String phone,  DegreeName degreeName , Stripes stripes,String comments,
	        String MAtype,String description,String DiplomaName,
	        SalTypeEnum salTypeEnum,float amount, Date givenDate,
	        Date startDate,Date endDate) {
		Date date = new Date();
		date.setTime(1497096009);
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.addEmployee(  address1,  address2,  city,  zipCode,  region,  country,
		         officialID,  email,  title,  gender, fName,  mName,  lName, phone,   degreeName ,  stripes, comments,
		         MAtype, description, DiplomaName,
		         salTypeEnum, amount,  givenDate,
		         startDate, endDate);
	
	}
	

	@Test(groups = { "InitialAllWorkEnv" }, enabled = false,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "customers")
	public static void addInitiaCustomer(String address1, String address2, String city, int zipCode, String region, String country,
			String officialID, String email, String title, String gender,String fName, String mName, String lName,String phone, Degree degree, Stripes stripes,String comments
			 ,Durationmembership durationmembership, Date startDate,ParticipateClasses participateClasses, String notes,
			 Date birthDay,Date measurementDate, int high, float weight, int bloodPressureSystolic,int bloodPressureDiastolic, int pulsePressure, float fatPercentage) {
		     CustomersDaoImplement customersDaoImplement = new CustomersDaoImplement();
	        	customersDaoImplement.add( address1,  address2,  city,  zipCode,  region,  country,
				 officialID,  email,  title,  gender, fName,  mName,  lName, phone,  degree,  stripes, comments
				 , durationmembership,  startDate, participateClasses,  notes,
				  birthDay, measurementDate,  high,  weight,  bloodPressureSystolic, bloodPressureDiastolic,  pulsePressure,  fatPercentage);
		
	}
	@Test(groups = { "InitialAllWorkEnv" }, enabled = false)	
	public static void addInitiaAnOccasionalCustomer() throws ClassNotFoundException, SQLException {
		CustomersDaoImplement customersDaoImplement = new CustomersDaoImplement();
		customersDaoImplement.addAnOccasionalCustomer();
	}
	
	
	@Test(groups = { "addItems" }, enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "addItems")
	public static void addItems(EnumItemList subitemlist, String name, String model, String manufacturer,
			Date firstArrived, String barCode,  
			float weight, EnumCatergoty category, String comments,
			int mounthsWarrenty, float width, float length, float height, String madeIn,
			String color,String additionalToItemColor) throws ClassNotFoundException, SQLException {
		ItemsImplement itemsImplement = new ItemsImplement();
		itemsImplement.addItems(subitemlist, name, model, manufacturer, firstArrived, barCode, weight, category, comments, mounthsWarrenty, width, length, height, madeIn);
		itemsImplement.addColors( color, additionalToItemColor, barCode); 
	}
	
	@Test(groups = { "addAnotherColorToTheItem" }, enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "addAnotherColorToTheItem")
	public static void addAnotherColorToTheItem(String barCode,String additionalToItemColor,String color) throws ClassNotFoundException, SQLException {
		ItemsImplement itemsImplement = new ItemsImplement();
		itemsImplement.addColors( color, additionalToItemColor, barCode); 
	}
	
	@Test(groups = { "addSizeToItem" }, enabled = true,dataProviderClass = DataPoviderInitialValues.class, dataProvider = "addSizeToItem")
	public static void addSizeToItem(String barCode,String size,String notes) throws ClassNotFoundException, SQLException {
		ItemsImplement itemsImplement = new ItemsImplement();
		itemsImplement.addSize(barCode,size, notes); 
	}
}


