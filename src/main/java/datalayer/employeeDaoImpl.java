package datalayer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import people.employees;

public class employeeDaoImpl implements employeeDao {
	
	private final List<employees> employeesl = new ArrayList<employees>();

	public employees read(final String id) {
		return employeesl.stream().filter(new Predicate<employees>() {
			public boolean test(employees emp) {
				return emp.getId().equals(id);
			}
		}).findAny().get();
	}

	public void save(employees emp) {
		employeesl.add(emp);
		
		
	}

	
	public  int  findIndex(String idforfunction) throws IOException{	
	    int index=-1;

          for (int i = 0; (i < employeesl.size()) && (index == -1); i++) {
             if (employeesl.get(i).getId() == idforfunction) {
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
	

	public void ModifyEmpCode(String id, int empCode) throws IOException {
		employeesl.get(findIndex(id)).setEmpCode(empCode);
		
	}


	public void ModifyEmpName(String id, String newName) throws IOException {
		employeesl.get(findIndex(id)).setName(newName);
		
	}


	public void ModifyEmpPhone(String id, String NewPhone) throws IOException {
		employeesl.get(findIndex(id)).setPhone(NewPhone);
		
	}

	
	@Override
	public String toString() {
		int i=0;
		return


"|+    empCode"  + "   "+ 	employeesl.get(i).getEmpCode() + "     " + "|" + 

"|+    name"  + "   "+ 	employeesl.get(i).getName() + "     " + "|" + 

"|+    id"  + "   "+ 	employeesl.get(i).getId() + "     " + "|" + 

"|+    phone"  + "   "+ 	employeesl.get(i).getPhone()+ "     " + "|" ;






	} 

	public void printResultofTheList() {
    for (int i=0 ; i< employeesl.size() ; i++) {
    	
    	System.out.println(

    			"|+    empCode"  + "   "+ 	employeesl.get(i).getEmpCode() + "     " + "|" + 

    			"|+    name"  + "   "+ 	employeesl.get(i).getName() + "     " + "|" + 

    			"|+    id"  + "   "+ 	employeesl.get(i).getId() + "     " + "|" + 

    			"|+    phone"  + "   "+ 	employeesl.get(i).getPhone()+ "     " + "|" );
    }
    	
    }

}
