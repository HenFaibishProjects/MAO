import java.sql.SQLException;

import datalayer.SuplierDaoImplement;



public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SuplierDaoImplement supplierDao = new SuplierDaoImplement();
		//supplierDao.seealla(1);
		//supplierDao.deleteByid(2);
	supplierDao.add("ginat Egoz 7" , null , "HerTzelia" , 34234 , "hasharon" ,"Germany" ,
		       1,1,0,0,1,0,0,
		        1,0,1,0 ,
		        null , "Hen f", 216165423 , "050-5589621", "http://www.onw.com", "zzzi10@gmail.com", 1 , "This is my first test" );
	
	
	supplierDao.add("gin" , null , "petah tikva" , 34234 , "hasharon" ,"Germany" ,
		       0,0,1,1,1,0,0,
		        0,1,1,0 ,
		        null , "dan e", 3624523 , "054-2688401", "http://www.two.com", "zzzi10@gmail.com", 1 , "This is my second test" );
	
	supplierDao.add("dsf 7" , null , "neve" , 34234 , "hasharon" ,"Germany" ,
		       0,1,1,1,1,0,0,
		        0,1,1,0 ,
		        null , "elk s", 362435353 , "054-7689621", "http://www.three.com", "zzzi10@gmail.com", 1 , "This " );
	
	supplierDao.add("3345 3" , null , "marin" , 34234 , "hasharon" ,"Germany" ,
		       1,1,0,1,1,0,0,
		        1,1,1,0 ,
		        null , "lsd0 32e0", 362134523 , "054-1119621", "http://www.four.com", "zzzi10@gmail.com", 1 , "" );
	
	supplierDao.add("parhed 7" , null , "HerTzelia" , 34234 , "hasharon" ,"Germany" ,
		       1,1,1,1,1,0,0,
		        1,0,1,0 ,
		        null , "dekfds 399", 362164523 , "054-2633321", "http://www.five.com", "zzzi10@gmail.com", 1 , "This is my five test" );
	
	supplierDao.add("beverly 7" , null , "molak" , 34234 , "hasharon" ,"Germany" ,
		       1,1,1,1,1,0,0,
		        1,1,1,0 ,
		        null , "485 jferfp ", 36216134 , "054-2689621", "http://www.six.com", "zzzi10@gmail.com", 1 , "This is my six test" );
	
	//supplierDao.Modifyname(1, "Hananya");
		
	}

}
