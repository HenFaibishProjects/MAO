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

	@Test( groups = "AddVirtualSupplier" , enabled = true)
	public void addNewVsupp() throws Exception 
	{ 
        char[] days = {'a','b','c'}; 
		VirtualSupplier v = new VirtualSupplier(days, 0, "first", "0034556", "054-5545455", 3);
		configurevirtualSupplier.addnewVsupp(v);
		System.out.println(configurevirtualSupplier.read("0034556").toString());
		configurevirtualSupplier.vsuppliers.forEach(System.out::println);
		configurevirtualSupplier.print();
	}

	@Test(groups = { "AddVirtualSupplier" },dataProviderClass = DataProviderAddingPeople.class, dataProvider = "AddVirtualSupplier", enabled = true)
	public void addNewVsupp1(char[] workingDays, int suplyCode, String name, String id, String phone, int OwnershipType) throws Exception 
	{ 
		VirtualSupplier v = new VirtualSupplier( workingDays, suplyCode, name, id,  phone, OwnershipType);
		configurevirtualSupplier.addnewVsupp(v);
		System.out.println(configurevirtualSupplier.read("0034556").toString());
		configurevirtualSupplier.vsuppliers.forEach(System.out::println);
		configurevirtualSupplier.print();
	}


	
//	@AfterMethod(alwaysRun = true)
//	protected void printTestCompleted(){
//		System.out.println("after");
//
//	}

}
