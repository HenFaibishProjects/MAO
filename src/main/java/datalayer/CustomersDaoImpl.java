package datalayer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import people.Customers;


public class CustomersDaoImpl implements CustomersDao {
	
	private List<Customers> customers = new ArrayList<Customers>();

	public  int  findIndex(String idforfunction) throws IOException{	
		    int index=-1;

              for (int i = 0; (i < customers.size()) && (index == -1); i++) {
                 if (customers.get(i).getId() == idforfunction) {
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
	
	
	
	public Customers read(final String id) {
		return customers.stream().filter(new Predicate<Customers>() {
			public boolean test(Customers customers) {
				return customers.getId().equals(id);
			}
		}).findAny().get();
	}

	public void save(Customers customer) {
		customers.add(customer);
		
		
	}

	public void ModifyPHone(String id, String Newphone) throws IOException {
		customers.get(findIndex(id)).setPhone(Newphone);
		
	}

	public void ModifyName(String id, String Newname) throws IOException {
		customers.get(findIndex(id)).setName(Newname);
		
	}

	public void ModifyGender(String id, char Newgender) throws IOException {
		customers.get(findIndex(id)).setGender(Newgender);
		
	}

	public void ModifyHigh(String id, int Newhigh) throws IOException {
		customers.get(findIndex(id)).setHigh(Newhigh);
		
	}

	public void ModifyAge(String id, int Newage) throws IOException {
		customers.get(findIndex(id)).setAge(Newage);
		
	}

	public void ModifyMemberType(String id, int NewMemberType) throws IOException {
		customers.get(findIndex(id)).setMemberType(NewMemberType);
		
	}

	public void Modifytitle(String id, String Newtitle) throws IOException {
		customers.get(findIndex(id)).setTitle(Newtitle);
		
	}



	public List<Customers> getCustomers() {
		return customers;
	}



	public void setCustomers(List<Customers> customers) {
		this.customers = customers;
	}



	@Override
	public String toString() {
		return "CustomersDaoImpl [Customers=" + customers + "]";
	}





}
