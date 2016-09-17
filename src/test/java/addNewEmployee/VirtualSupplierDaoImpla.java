package addNewEmployee;

import org.testng.annotations.*;

import UI.VSuppOnTable;
import datalayer.SuplierDaoImpl;
import datalayer.VirtualSupplierDaoImpl;
import people.Supplier;
import people.VirtualSupplier;

public class VirtualSupplierDaoImpla   {
	private SuplierDaoImpl configurevirtualSupplier;

	@BeforeMethod(alwaysRun = true)
	protected void printTestStarted(){
		 configurevirtualSupplier = new SuplierDaoImpl();
		 
	}
		


	@Test(groups = { "AddVirtualSupplier" },dataProviderClass = DataProviderAddingPeople.class, dataProvider = "AddVirtualSupplier", enabled = false)
	public void addNewVsupp1(char[] workingDays, int suplyCode, String name, String id, String phone, int OwnershipType) throws Exception 
	{ 
		Supplier v = new Supplier(suplyCode, name, id,  phone);
		configurevirtualSupplier.addNewSupliyer(v);
		configurevirtualSupplier.printResultofTheList();
		//;

	}

	@Test(enabled = false)
	public void addNewVsupp1() throws Exception 
	{ 
		char[] days = {'a','b','c'};
		Supplier a = new Supplier( 123, "name1", "abcd",  "aaa");
		Supplier b = new Supplier( 456, "name2", "efgh",  "bbb");
		Supplier c = new Supplier( 789, "name3", "ijkl",  "ccc");
		Supplier d = new Supplier( 190, "name4", "mnop",  "ddd");
		Supplier e = new Supplier( 222, "name5", "qrst",  "eee");
		configurevirtualSupplier.addNewSupliyer(a);
		configurevirtualSupplier.addNewSupliyer(b);
		configurevirtualSupplier.addNewSupliyer(c);
		configurevirtualSupplier.addNewSupliyer(d);
		configurevirtualSupplier.addNewSupliyer(e);
		configurevirtualSupplier.printResultofTheList();
	}
	
	
	
	@Test(enabled = true)
	public void addNewVsupp2() throws Exception 
	{ 
		Supplier a = new Supplier();
		configurevirtualSupplier.addNewSupliyer(a.scanSupplier());
		configurevirtualSupplier.printResultofTheList();
	}
	
	@AfterClass(alwaysRun = true)
	protected void printTestCompleted(){
		//VSuppOnTable.bain.runTables();

	}

}
