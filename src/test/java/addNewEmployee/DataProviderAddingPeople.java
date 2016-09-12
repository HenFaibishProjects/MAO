package addNewEmployee;


import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;



public class DataProviderAddingPeople {

	@DataProvider(name = "AddVirtualSupplier")
	public static Object[][] dataProviderAddVirtualSupplier() {
		char[] days = {'a','b','c'};
		return new Object[][] {
			
			

//char[] workingDays, int suplyCode, String name, String id, String phone, int OwnershipType
		//	= {'a','b','c'}; 
			
			{
				days,
				0, 
				"first",
				"0034556", 
				"054-5545455",
				3
			},
		};
	} }
			
	
		
	
			
		