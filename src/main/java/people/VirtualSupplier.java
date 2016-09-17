package people;

import java.util.Scanner;

import people.InterFaces.CustomerAction;
import people.InterFaces.Person;
import people.InterFaces.WorkingDays;

public final class VirtualSupplier extends Supplier implements Person, CustomerAction{  

	int OwnershipType;
	public static int VirtualSupliersCounter;

	public VirtualSupplier()
	{
		VirtualSupliersCounter += 1;
	}
	
	
	

	

			
	public VirtualSupplier(int suplyCode, String name, String id, String phone, int OwnershipType) {
		super(suplyCode, name, id, phone);
		this.OwnershipType = OwnershipType;
 		VirtualSupliersCounter += 1;

	}

	public int getOwnershipType() {
		return OwnershipType;
	}

	public void setOwnershipType(int ownershipType) {
		OwnershipType = ownershipType;
	}


	public double CalcBMI(double weight, double height) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String CalcHeartBit(double age) {
		// TODO Auto-generated method stub
		return null;
	}
}
