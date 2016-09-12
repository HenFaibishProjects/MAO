package datalayer;

import java.io.IOException;

import people.Supplier;

public interface SuplierDao {
	Supplier read(String id);
	
	void save(Supplier supplier);
	
	void ModifyWorkingDays(String id, char[] newWorkingDays) throws IOException ;
	
	void ModifySuplyCode(String id , int newsuppliyerCode) throws IOException ;	
	
	void ModifyName(String id , String newName) throws IOException;
	
	void ModifyPhone(String id , String NewPhone) throws IOException;


}
