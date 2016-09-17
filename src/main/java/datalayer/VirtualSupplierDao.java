package datalayer;

import java.io.IOException;

import people.VirtualSupplier;

public interface VirtualSupplierDao {


	    VirtualSupplier read(String id);
		
		void addnewVsupp(VirtualSupplier virtualsupplier);
		
		void deleteVsupp(String id) throws IOException;
		
		void ModifySuplyCode(String id , int newsuppliyerCode) throws IOException;	
		
		void ModifyName(String id , String newName) throws IOException;
		
		void ModifyPhone(String id , String NewPhone) throws IOException;
		
		void ModifyOwnershipType(String id , int newOwnershipType) throws IOException;

		
		

	}


