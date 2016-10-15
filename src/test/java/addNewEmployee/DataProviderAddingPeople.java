package addNewEmployee;


import java.util.ArrayList;

import org.testng.annotations.DataProvider;

import people.DaysOfTheWeek;



public class DataProviderAddingPeople {

	@DataProvider(name = "AddVirtualSupplier")
	public static Object[][] dataProviderAddVirtualSupplier() {
		char[] days = {'a','b','c'};
		 ArrayList<DaysOfTheWeek> daysOfTheWeekforDP = new ArrayList<DaysOfTheWeek>();
		 daysOfTheWeekforDP.set(0, DaysOfTheWeek.SUNDAY);
		 daysOfTheWeekforDP.set(1, DaysOfTheWeek.MONDAY);
		 daysOfTheWeekforDP.set(2, DaysOfTheWeek.TUESDAY);
		 daysOfTheWeekforDP.set(3, DaysOfTheWeek.WEDNESDAY);
		 daysOfTheWeekforDP.set(4, DaysOfTheWeek.FRIDAY);
		 
		 return new Object[][] {
			
			

//char[] workingDays, int suplyCode, String name, String id, String phone, int OwnershipType
		//	= {'a','b','c'}; 
			
			{
				days,
				0, 
				"OfficeDepo",
				"0034556", 
				"050-5235455",
				343 ,
				daysOfTheWeekforDP,
			},
			
			{
				days,
				1, 
				"HomeCenter",
				"0034556", 
				"077-1545455",
				3323,
				daysOfTheWeekforDP,
			},
			
			{
				days,
				2, 
				"Binat",
				"0034556", 
				"051-5545455",
				3423423,
				daysOfTheWeekforDP,
			},
			
			{
				days,
				3, 
				"first",
				"0034556", 
				"050-5545455",
				342343,
				daysOfTheWeekforDP,
			},
			
			{
				days,
				4, 
				"first",
				"0034556", 
				"054-5532455",
				23423,
				daysOfTheWeekforDP,
			},
			
			{
				days,
				5, 
				"first",
				"0034556", 
				"054-5545455",
				3,
				daysOfTheWeekforDP,
			},
			
			{
				days,
				6, 
				"first",
				"0034556", 
				"054-5545455",
				3,
				daysOfTheWeekforDP,
			},
			
			{
				days,
				7, 
				"first",
				"0034556", 
				"054-5545455",
				3,
				daysOfTheWeekforDP,
			},
			
			{
				days,
				8, 
				"first",
				"0034556", 
				"054-5545455",
				3,
				daysOfTheWeekforDP,
			},
		};
	} }
			
	
		
	
			
		