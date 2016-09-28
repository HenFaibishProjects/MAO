import java.sql.SQLException;

import datalayer.SuplierDao;
import datalayer.SuplierDaoImpl;
import people.Supplier;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SuplierDaoImpl supplierDao = new SuplierDaoImpl();
		//supplierDao.seealla();
		supplierDao.add();
		
	//	supplierDao.save(new Supplier(workingDays, suplyCode, name, id, phone));
	}

}
