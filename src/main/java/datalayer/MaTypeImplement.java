package datalayer;

import java.util.Date;
import otherData.MaTypenew;
import people.Employees;
import people.SupplierNew;


public class MaTypeImplement  extends HibernateStructInfo {
	
	
	public void addMaTypenewWithHibernate(int val , String valstring , Date date , String description)
	{
		MaTypenew matype = new MaTypenew (val,valstring,date, description);
		super.buildSessionFactory();
        super.saveObject(matype); 
	}
	


//	public void selectByPK(int PK)
//	{
//		session.beginTransaction();
//		MaTypenew matype = null;
//		matype =  (MaTypenew) session.get(MaTypenew.class, PK);
//		System.out.println("the name of 35 is:" +  matype.getType());
//	}
//	

}
