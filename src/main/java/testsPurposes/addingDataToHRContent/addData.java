package testsPurposes.addingDataToHRContent;
import java.sql.SQLException;
import java.util.Date;
import java.util.Random;

import org.hibernate.HibernateException;

import businessObjects.hr.PeopleContent.SalType;
import businessObjects.hr.PeopleContent.SalTypeEnum;
import datalayer.DaoImplements.EmployeeDaoImpl;
import datalayer.DaoImplements.MaTypeImplement;
import datalayer.DaoImplements.SalaryTypeImlement;
import datalayer.DaoImplements.SuplierDaoImplement;



 public class addData {


	public static void addMAtype() {
		MaTypeImplement maTypeImplement = new MaTypeImplement(); 
		maTypeImplement.addMaTypenew(randNumber(),"faaassf",new Date(),"description");
	}


//
//	public static void addSuppliyer() {
//		SuplierDaoImplement suplierDaoImplement = new SuplierDaoImplement();
//		suplierDaoImplement.addSuppliyerWithHibernate(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, "Hen",  "34534543", "054-2689621", "www.mmm.com" ,"Faibsih@gmail.com", "hmada", null, "Tel-Aviv", "Israel", null, randNumber());
//	}



	public static void addEmployee() {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.addEmployeeWithHibernate("dani", null, null, "036625418", "054-88522151", 1, 3, 1, 3, "just notes", "daniNew@mail.com", "efal", null, "RamatGan", "israel", "Center", randNumber());
	}
		
	public static void deleteByEmpIdExecute(String OfficialId) throws ClassNotFoundException, SQLException {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.deleteByid(OfficialId);
	}
	
//	public static void modifySalary() throws ClassNotFoundException, SQLException {
//		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
//		employeeDaoImpl.ModifySalaryEmployee("036625418", SalTypeEnum.ByHouer, 50);
//		
//	}
	
	public static void setSalType() throws HibernateException, SQLException  {
	    SalaryTypeImlement salaryTypeImlement = new SalaryTypeImlement();
	    salaryTypeImlement.addSalTypeName();
	}
	
public static int  randNumber() {
	
	Random ran = new Random();
	int x = ran.nextInt(100) + 10;
	return x;
}
		
		
	}



