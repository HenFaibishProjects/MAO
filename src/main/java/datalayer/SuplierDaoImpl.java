package datalayer;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.mysql.cj.api.jdbc.Statement;

import people.Supplier;

public class SuplierDaoImpl extends FirstExample implements SuplierDao {
	
	private List<Supplier> suppliers = new ArrayList<Supplier>();

	public Supplier read(final String id) {
		return suppliers.stream().filter(new Predicate<Supplier>() {
			public boolean test(Supplier supp) {
				return supp.getId().equals(id);
			}
		}).findAny().get();
	}

	
	
	public void seealla() throws ClassNotFoundException, SQLException {
		getTheDataByIndex(1);
		
	}
	
	public void deleteSpecific() throws ClassNotFoundException, SQLException {
		deleteByIndex(1);
	}
		
		
		public void add() throws ClassNotFoundException, SQLException {
			
			//setAddress("address1","address2","city",55244,"region","country");
			setAddress("address1","address2","city",5555,"region","country");
			//setDaysOfTheWeek(true,true,true,true,false,false,false);
			//setCerrency(true,true,true,true);
		
		
	}
	
	@SuppressWarnings("null")
	public void addNewSupliyer(Supplier supplier) {
		
		suppliers.add(supplier);
		
		String sql;
	      sql = "SELECT * FROM vsupplier";
	      ResultSet rs = null;
		try {
			Statement stmt=null;
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public  int  findIndex(String idforfunction) throws IOException{	
	    int index=-1;

          for (int i = 0; (i < suppliers.size()) && (index == -1); i++) {
             if (suppliers.get(i).getId() == idforfunction) {
             index = i;
    }
          }

              if (index == -1) {
              System.err.println("No Such ID"); 
              throw new IOException("No Such ID");       
              } 
              else            
	           return index;
	
}




	public void ModifySuplyCode(String id, int newsuppliyerCode) throws IOException {
		suppliers.get(findIndex(id)).setSuplyCode(newsuppliyerCode);

		
	}

	public void ModifyName(String id, String newName) throws IOException {
		suppliers.get(findIndex(id)).setName(newName);
		
	}


	public void ModifyPhone(String id, String NewPhone) throws IOException {
		suppliers.get(findIndex(id)).setPhone(NewPhone);
		
	}




	public List<Supplier> getSuppliers() {
		return suppliers;
	}

	@Override
	public String toString() {
		int i=0;
		return

"|+    id"  + "   "+ 	suppliers.get(i).getId() + "     " + "|" + 

"|+    suppliyerCode" + "   "+	suppliers.get(i).getSuplyCode() + "     " + "|" +

"|+    name" + 	"   "+suppliers.get(i).getName() + "               " +  "|" +

"|+    Working days" + 	"     "+ suppliers.get(i).getDaysOfTheWeek() + "     "+  "|" +

"|+    phone" + 	"     "+suppliers.get(i).getPhone() + "     "+  "|" ;




	} 

	public void printResultofTheList() {
    for (int i=0 ; i< suppliers.size() ; i++) {
    	
    	System.out.println(
    	"|+    id"  + "   "+ 	suppliers.get(i).getId() + "     " + "|" + 

    	"|+    suppliyerCode" + "   "+	suppliers.get(i).getSuplyCode() + "     " + "|" +

    	"|+    name" + 	"   "+suppliers.get(i).getName() + "               " +  "|" +

    	"|+    Working days" + 	"     "+ suppliers.get(i).getDaysOfTheWeek() + "     "+  "|" +

    	"|+    phone" + 	"     "+suppliers.get(i).getPhone() + "     "+  "|" +

    	"|+    OwnershipType" + "     ") ;
    }
    	
    }



	@Override
	public void addNewSupliyer() {
		// TODO Auto-generated method stub
		
	}







		
}
