package addNewEmployee;

import org.testng.annotations.*;

public class abc   {
	



	@Test( groups = "aGroup" , enabled = true)
	public void multipleStoragePolicyUpgrade() throws Exception 
	{ 
         int a=1;
	}




	@BeforeMethod(alwaysRun = true)
	protected void printTestStarted(){
		System.out.println("before");
		
	}
	
	@AfterMethod(alwaysRun = true)
	protected void printTestCompleted(){
		System.out.println("after");

	}

}
