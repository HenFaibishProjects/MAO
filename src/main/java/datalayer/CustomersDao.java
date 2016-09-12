package datalayer;

import java.io.IOException;

import people.Customers;

public interface CustomersDao {
	Customers read(String id);
	
	void save(Customers customers);

	
	
	
	void ModifyPHone(String id , String Newphone) throws IOException;
	
	void ModifyName(String id  , String Newname) throws IOException;
	
	void ModifyGender(String id , char Newgender) throws IOException;
	
	void ModifyHigh(String id , int Newhigh) throws IOException;
	
	void ModifyAge(String id  , int Newage) throws IOException;
	
	void ModifyMemberType(String id  , int NewMemberType) throws IOException;
	
	void Modifytitle(String id  , String Newtitle) throws IOException;
	
	
	
}
