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
				"OfficeDepo",
				"0034556", 
				"050-5235455",
				343
			},
			
			{
				days,
				1, 
				"HomeCenter",
				"0034556", 
				"077-1545455",
				3323
			},
			
			{
				days,
				2, 
				"Binat",
				"0034556", 
				"051-5545455",
				3423423
			},
			
			{
				days,
				3, 
				"first",
				"0034556", 
				"050-5545455",
				342343
			},
			
			{
				days,
				4, 
				"first",
				"0034556", 
				"054-5532455",
				23423
			},
			
			{
				days,
				5, 
				"first",
				"0034556", 
				"054-5545455",
				3
			},
			
			{
				days,
				6, 
				"first",
				"0034556", 
				"054-5545455",
				3
			},
			
			{
				days,
				7, 
				"first",
				"0034556", 
				"054-5545455",
				3
			},
			
			{
				days,
				8, 
				"first",
				"0034556", 
				"054-5545455",
				3
			},
		};
	} }
			
	
		
	
			
		