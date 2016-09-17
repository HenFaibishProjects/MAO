package datalayer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import people.Supplier;

public class SuplierDaoImpl implements SuplierDao {
	
	private List<Supplier> suppliers = new ArrayList<Supplier>();

	public Supplier read(final String id) {
		return suppliers.stream().filter(new Predicate<Supplier>() {
			public boolean test(Supplier supp) {
				return supp.getId().equals(id);
			}
		}).findAny().get();
	}

	public void addNewSupliyer(Supplier supplier) {
		suppliers.add(supplier);
		
		
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

"|+    Working days" + 	"     "+ suppliers.get(i).getStringWorkingDays() + "     "+  "|" +

"|+    phone" + 	"     "+suppliers.get(i).getPhone() + "     "+  "|" ;




	} 

	public void printResultofTheList() {
    for (int i=0 ; i< suppliers.size() ; i++) {
    	
    	System.out.println(
    	"|+    id"  + "   "+ 	suppliers.get(i).getId() + "     " + "|" + 

    	"|+    suppliyerCode" + "   "+	suppliers.get(i).getSuplyCode() + "     " + "|" +

    	"|+    name" + 	"   "+suppliers.get(i).getName() + "               " +  "|" +

    	"|+    Working days" + 	"     "+ suppliers.get(i).getStringWorkingDays() + "     "+  "|" +

    	"|+    phone" + 	"     "+suppliers.get(i).getPhone() + "     "+  "|" +

    	"|+    OwnershipType" + "     ") ;
    }
    	
    }





		
}
