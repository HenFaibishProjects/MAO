//package datalayer;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Predicate;
//
//import people.VirtualSupplier;
//
//public class VirtualSupplierDaoImpl implements VirtualSupplierDao{
//
//	public List<VirtualSupplier> vsuppliers = new ArrayList<VirtualSupplier>();
//
//	public  int  findIndex(String idforfunction) throws IOException{	
//		int index=-1;
//
//		for (int i = 0; (i < vsuppliers.size()) && (index == -1); i++) {
//			if (vsuppliers.get(i).getId() == idforfunction) {
//				index = i;
//			}
//		}
//
//		if (index == -1) {
//			System.err.println("No Such ID"); 
//			throw new IOException("No Such ID");       
//		} 
//		else            
//			return index;
//
//	}
//
//
//	public VirtualSupplier read(final String id) {
//		return vsuppliers.stream().filter(new Predicate<VirtualSupplier>() {
//			public boolean test(VirtualSupplier vsupp) {
//				return vsupp.getId().equals(id);
//			}
//		}).findAny().get();
//	}
//
//	public void  addnewVsupp(VirtualSupplier vsupplier){
//		vsuppliers.add(vsupplier);
//
//
//	}
//
//	public void deleteVsupp(String id) throws IOException {
//		vsuppliers.remove(findIndex(id));
//
//	}
//
//	public void ModifySuplyCode(String id, int newsuppliyerCode) throws IOException {
//		vsuppliers.get(findIndex(id)).setSuplyCode(newsuppliyerCode);
//
//
//	}
//
//	public void ModifyName(String id, String newName) throws IOException {
//		vsuppliers.get(findIndex(id)).setName(newName);
//
//	}
//
//
//	public void ModifyPhone(String id, String NewPhone) throws IOException {
//		vsuppliers.get(findIndex(id)).setPhone(NewPhone);
//
//	}
//
//	public void ModifyOwnershipType(String id, int newOwnershipType) throws IOException {
//		vsuppliers.get(findIndex(id)).setOwnershipType(newOwnershipType);
//
//	}
//
//
//	public void print() {
//		for(VirtualSupplier k: vsuppliers)
//		{
//			System.out.println(k);
//		}
//
//	}
//
//
//
//
//	public List<VirtualSupplier> getVsuppliers() {
//		return vsuppliers;
//	}
//
//
//	public void setVsuppliers(List<VirtualSupplier> vsuppliers) {
//		this.vsuppliers = vsuppliers;
//	}
//
//
//	@Override
//	public String toString() {
//		int i=0;
//		return
//
//"|+    id"  + "   "+ 	vsuppliers.get(i).getId() + "     " + "|" + 
//
//"|+    suppliyerCode" + "   "+	vsuppliers.get(i).getSuplyCode() + "     " + "|" +
//
//"|+    name" + 	"   "+vsuppliers.get(i).getName() + "               " +  "|" +
//
//"|+    Working days" + 	"     "+ vsuppliers.get(i).getDaysOfTheWeek() + "     "+  "|" +
//
//"|+    phone" + 	"     "+vsuppliers.get(i).getPhone() + "     "+  "|" +
//
//"|+    OwnershipType" + "     " +	vsuppliers.get(i).getOwnershipType()  ;
//
//
//	} 
//
//	public void printResultofTheList() {
//    for (int i=0 ; i< vsuppliers.size() ; i++) {
//    	
//    	System.out.println(
//    	"|+    id"  + "   "+ 	vsuppliers.get(i).getId() + "     " + "|" + 
//
//    	"|+    suppliyerCode" + "   "+	vsuppliers.get(i).getSuplyCode() + "     " + "|" +
//
//    	"|+    name" + 	"   "+vsuppliers.get(i).getName() + "               " +  "|" +
//
//    	"|+    Working days" + 	"     "+ vsuppliers.get(i).getDaysOfTheWeek() + "     "+  "|" +
//
//    	"|+    phone" + 	"     "+vsuppliers.get(i).getPhone() + "     "+  "|" +
//
//    	"|+    OwnershipType" + "     " +	vsuppliers.get(i).getOwnershipType() ) ;
//    }
//    	
//    }
//
//
//
//
//}
