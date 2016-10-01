import java.sql.SQLException;

import datalayer.SuplierDao;
import datalayer.SuplierDaoImpl;
import people.Supplier;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SuplierDaoImpl supplierDao = new SuplierDaoImpl();
		//supplierDao.seealla();
		supplierDao.add("ginat Egoz 5" , null , "pardes hana" , 32234 , "hasharon" ,"Israel" ,
		        1,1,1,1,1,0,0,
		        1,1,1,0 ,
		        null , "Hen Faibish", "036316123" , "054-2689621", "http://www.HenFaibish.com", "zzzi10@gmail.com", 1 , "This is my first test" );
		
	}

}
