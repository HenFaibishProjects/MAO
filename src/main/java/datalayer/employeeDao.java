package datalayer;

import java.io.IOException;

import people.employees;

public interface employeeDao {
	employees read(String id);
	
	void save(employees emp);
	
	void ModifyEmpCode(String id , int newsuppliyerCode) throws IOException ;	
	
	void ModifyEmpName(String id , String newName) throws IOException;
	
	void ModifyEmpPhone(String id , String NewPhone) throws IOException;
	
	
	

}
