//package addNewEmployee;
//
//import java.util.ArrayList;
//import org.testng.annotations.*;
//import datalayer.SuplierDaoImpl;
//import people.DaysOfTheWeek;
//import people.Supplier;
//
//
//public class VirtualSupplierDaoImpla   {
//	private SuplierDaoImpl configurevirtualSupplier;
//	 ArrayList<DaysOfTheWeek> daysOfTheWeekforDP = new ArrayList<DaysOfTheWeek>();
//
//
//	@BeforeMethod(alwaysRun = true)
//	protected void printTestStarted(){
//		 daysOfTheWeekforDP.set(0, DaysOfTheWeek.SUNDAY);
//		 daysOfTheWeekforDP.set(1, DaysOfTheWeek.MONDAY);
//		 daysOfTheWeekforDP.set(2, DaysOfTheWeek.TUESDAY);
//		 daysOfTheWeekforDP.set(3, DaysOfTheWeek.WEDNESDAY);
//		 daysOfTheWeekforDP.set(4, DaysOfTheWeek.FRIDAY);
//		 configurevirtualSupplier = new SuplierDaoImpl();
//		 
//	}
//		
//
//
//	@Test(groups = { "AddVirtualSupplier" },dataProviderClass = DataProviderAddingPeople.class, dataProvider = "AddVirtualSupplier", enabled = false)
//	public void addNewVsupp1(char[] workingDays, int suplyCode, String name, String id, String phone , ArrayList<DaysOfTheWeek> daysOfTheWeek , int OwnershipType) throws Exception 
//	{ 
//		Supplier v = new Supplier(suplyCode, name, id,  phone, daysOfTheWeek);
//		configurevirtualSupplier.addNewSupliyer(v);
//		configurevirtualSupplier.printResultofTheList();
//		//;
//
//	}
//
//	@Test(enabled = false)
//	public void addNewVsupp1() throws Exception 
//	{ 
//		char[] days = {'a','b','c'};
//		Supplier a = new Supplier( 123, "name1", "abcd",  "aaa", daysOfTheWeekforDP);
//		Supplier b = new Supplier( 456, "name2", "efgh",  "bbb" , daysOfTheWeekforDP);
//		Supplier c = new Supplier( 789, "name3", "ijkl",  "ccc" , daysOfTheWeekforDP);
//		Supplier d = new Supplier( 190, "name4", "mnop",  "ddd" , daysOfTheWeekforDP);
//		Supplier e = new Supplier( 222, "name5", "qrst",  "eee" , daysOfTheWeekforDP);
//		configurevirtualSupplier.addNewSupliyer(a);
//		configurevirtualSupplier.addNewSupliyer(b);
//		configurevirtualSupplier.addNewSupliyer(c);
//		configurevirtualSupplier.addNewSupliyer(d);
//		configurevirtualSupplier.addNewSupliyer(e);
//		configurevirtualSupplier.printResultofTheList();
//	}
//	
//	
//	
//	@Test(enabled = true)
//	public void addNewVsupp2() throws Exception 
//	{ 
//		Supplier a = new Supplier();
//		configurevirtualSupplier.addNewSupliyer(a.scanSupplier());
//		configurevirtualSupplier.printResultofTheList();
//	}
//	
//	@AfterClass(alwaysRun = true)
//	protected void printTestCompleted(){
//		//VSuppOnTable.bain.runTables();
//
//	}
//
//}
