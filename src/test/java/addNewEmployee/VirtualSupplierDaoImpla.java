package addNewEmployee;

import org.testng.annotations.*;

import datalayer.VirtualSupplierDaoImpl;
import people.VirtualSupplier;

public class VirtualSupplierDaoImpla   {
	private VirtualSupplierDaoImpl configurevirtualSupplier;

	@BeforeMethod(alwaysRun = true)
	protected void printTestStarted(){
		 configurevirtualSupplier = new VirtualSupplierDaoImpl();
		 
	}
		
//	}


	@Test(groups = { "AddVirtualSupplier" },dataProviderClass = DataProviderAddingPeople.class, dataProvider = "AddVirtualSupplier", enabled = true)
	public void addNewVsupp1(char[] workingDays, int suplyCode, String name, String id, String phone, int OwnershipType) throws Exception 
	{ 
		VirtualSupplier v = new VirtualSupplier( workingDays, suplyCode, name, id,  phone, OwnershipType);
		configurevirtualSupplier.addnewVsupp(v);
		configurevirtualSupplier.printResultofTheList();
		//System.out.println(configurevirtualSupplier.toString());
	}

	@Test(enabled = false)
	public void addNewVsupp1() throws Exception 
	{ 
		char[] days = {'a','b','c'};
		VirtualSupplier a = new VirtualSupplier( days, 123, "name1", "abcd",  "aaa", 1111);
		VirtualSupplier b = new VirtualSupplier( days, 456, "name2", "efgh",  "bbb", 2222);
		VirtualSupplier c = new VirtualSupplier( days, 789, "name3", "ijkl",  "ccc", 3333);
		VirtualSupplier d = new VirtualSupplier( days, 190, "name4", "mnop",  "ddd", 4444);
		VirtualSupplier e = new VirtualSupplier( days, 222, "name5", "qrst",  "eee", 5555);
		configurevirtualSupplier.addnewVsupp(a);
		configurevirtualSupplier.addnewVsupp(b);
		configurevirtualSupplier.addnewVsupp(c);
		configurevirtualSupplier.addnewVsupp(d);
		configurevirtualSupplier.addnewVsupp(e);
		configurevirtualSupplier.printResultofTheList();
		//System.out.println(configurevirtualSupplier.toString());
	}
	
//	@AfterMethod(alwaysRun = true)
//	protected void printTestCompleted(){
//		System.out.println("after");
//
//	}

}
