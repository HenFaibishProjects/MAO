import java.awt.List;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import datalayer.EmployeeDaoImpl;
import datalayer.MaTypeImplement;
import datalayer.SuplierDaoImplement;
import people.Curency;
import people.DaysOfTheWeek;



public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		addMAtype();
		addSuppliyer();
		addEmployee();

	}



	public static void addMAtype() {
		MaTypeImplement maTypeImplement = new MaTypeImplement(); 
		maTypeImplement.addMaTypenewWithHibernate(randNumber(),"faaassf",new Date(),"description");
	}



	public static void addSuppliyer() {
		SuplierDaoImplement suplierDaoImplement = new SuplierDaoImplement();
		suplierDaoImplement.addSuppliyerWithHibernate(0, "Hen",  "34534543", "054-2689621", "www.mmm.com" ,"Faibsih@gmail.com", "hmada", null, "Tel-Aviv", "Israel", null, randNumber());
	}



	public static void addEmployee() {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.addEmployeeWithHibernate("Hen", null, null, "45345345", "054-268339621", 1, 3, 1, 3, "just notes", "mail@mail.com", "GEgoz", null, "P-Hana", "israel", "hasharon", randNumber());
	}
		
	
	
public static int  randNumber() {
	
	Random ran = new Random();
	int x = ran.nextInt(100) + 10;
	return x;
}
		
		
		//suplierDaoImplement.addWithHibernate(1234, null, null, null, null, null, null, null, null);
		

		//supplierDao.seealla(1);
		//supplierDao.deleteByid(2);
//	supplierDao.add("ginat Egoz 7" , null , "HerTzelia" , 34234 , "hasharon" ,"Germany" ,
//		       1,1,0,0,1,0,0,
//		        1,0,1,0 ,
//		        null , "Hen f", 216165423 , "050-5589621", "http://www.onw.com", "zzzi10@gmail.com", 1 , "This is my first test" );
//	
//	
//	supplierDao.add("gin" , null , "petah tikva" , 34234 , "hasharon" ,"Germany" ,
//		       0,0,1,1,1,0,0,
//		        0,1,1,0 ,
//		        null , "dan e", 3624523 , "054-2688401", "http://www.two.com", "zzzi10@gmail.com", 1 , "This is my second test" );
//	
//	supplierDao.add("dsf 7" , null , "neve" , 34234 , "hasharon" ,"Germany" ,
//		       0,1,1,1,1,0,0,
//		        0,1,1,0 ,
//		        null , "elk s", 362435353 , "054-7689621", "http://www.three.com", "zzzi10@gmail.com", 1 , "This " );
//	
//	supplierDao.add("3345 3" , null , "marin" , 34234 , "hasharon" ,"Germany" ,
//		       1,1,0,1,1,0,0,
//		        1,1,1,0 ,
//		        null , "lsd0 32e0", 362134523 , "054-1119621", "http://www.four.com", "zzzi10@gmail.com", 1 , "" );
//	
//	supplierDao.add("parhed 7" , null , "HerTzelia" , 34234 , "hasharon" ,"Germany" ,
//		       1,1,1,1,1,0,0,
//		        1,0,1,0 ,
//		        null , "dekfds 399", 362164523 , "054-2633321", "http://www.five.com", "zzzi10@gmail.com", 1 , "This is my five test" );
//	
//	supplierDao.add("beverly 7" , null , "molak" , 34234 , "hasharon" ,"Germany" ,
//		       1,1,1,1,1,0,0,
//		        1,1,1,0 ,
//		        null , "485 jferfp ", 36216134 , "054-2689621", "http://www.six.com", "zzzi10@gmail.com", 1 , "This is my six test" );
//	
	//supplierDao.Modifyname(1, "Hananya");
		
	}


