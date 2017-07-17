package com.Mao.BackEndDev.businessObjects.additionalData.otherContents;

import java.sql.SQLException;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.HibernateException;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.SalType;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.SalTypeEnum;
import com.Mao.BackEndDev.datalayer.DaoImplements.EmployeeDaoImpl;
import com.Mao.BackEndDev.datalayer.DaoImplements.SuplierDaoImplement;
import com.Mao.BackEndDev.datalayer.DbConnections.HibernateStructInfo;

public class InitialValues extends HibernateStructInfo{


	public InitialValues() {
		//log
		initialValuesIntoDB();
	}


	
	


	public void initialValuesIntoDB(){

		try {
			addArivedFrom();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			addSalaryType();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			addClassLevel();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			addDegrees();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			addmatype();
		} catch (Exception e) {
			e.printStackTrace();
		}



	}


	public void addArivedFrom(){
		Arrivefrom arrivefrom1 = new Arrivefrom("Flyer");
		super.saveObject(arrivefrom1);
		Arrivefrom arrivefrom2 = new Arrivefrom("InternetGoogle");
		super.saveObject(arrivefrom2);
		Arrivefrom arrivefrom3 = new Arrivefrom("InternetWebSite");
		super.saveObject(arrivefrom3);
		Arrivefrom arrivefrom4 = new Arrivefrom("Friend");
		super.saveObject(arrivefrom4);
		Arrivefrom arrivefrom5 = new Arrivefrom("Show");
		super.saveObject(arrivefrom5);
		Arrivefrom arrivefrom6 = new Arrivefrom("Other");
		super.saveObject(arrivefrom6);
	}

	public void addClassLevel(){
		ClassLevel classLevel1 = new ClassLevel("Beginners");
		super.saveObject(classLevel1);
		ClassLevel classLevel2 = new ClassLevel("Pro");
		super.saveObject(classLevel2);
		ClassLevel classLevel3 = new ClassLevel("Experct");
		super.saveObject(classLevel3);
		ClassLevel classLevel4 = new ClassLevel("Generic");
		super.saveObject(classLevel4);


	}




	public void addDegrees(){
		Degree degree001 = new Degree(DegreeName.white, Stripes.None);
		super.saveObject(degree001);
		Degree degree002 = new Degree(DegreeName.white, Stripes.One);
		super.saveObject(degree002);
		Degree degree003 = new Degree(DegreeName.white, Stripes.Two);
		super.saveObject(degree003);
		Degree degree004 = new Degree(DegreeName.white, Stripes.Three);
		super.saveObject(degree004);
		Degree degree005 = new Degree(DegreeName.white, Stripes.Four);
		super.saveObject(degree005);

		Degree degree006 = new Degree(DegreeName.gray, Stripes.None);
		super.saveObject(degree006);
		Degree degree007 = new Degree(DegreeName.gray, Stripes.One);
		super.saveObject(degree007);
		Degree degree008 = new Degree(DegreeName.gray, Stripes.Two);
		super.saveObject(degree008);
		Degree degree009 = new Degree(DegreeName.gray, Stripes.Three);
		super.saveObject(degree009);
		Degree degree010 = new Degree(DegreeName.gray, Stripes.Four);
		super.saveObject(degree010);

		Degree degree011 = new Degree(DegreeName.yellow, Stripes.None);
		super.saveObject(degree011);
		Degree degree012 = new Degree(DegreeName.yellow, Stripes.One);
		super.saveObject(degree012);
		Degree degree013 = new Degree(DegreeName.yellow, Stripes.Two);
		super.saveObject(degree013);
		Degree degree014 = new Degree(DegreeName.yellow, Stripes.Three);
		super.saveObject(degree014);
		Degree degree015 = new Degree(DegreeName.yellow, Stripes.Four);
		super.saveObject(degree015);

		Degree degree016 = new Degree(DegreeName.orange, Stripes.None);
		super.saveObject(degree016);
		Degree degree017 = new Degree(DegreeName.orange, Stripes.One);
		super.saveObject(degree017);
		Degree degree018 = new Degree(DegreeName.orange, Stripes.Two);
		super.saveObject(degree018);
		Degree degree019 = new Degree(DegreeName.orange, Stripes.Three);
		super.saveObject(degree019);
		Degree degree020 = new Degree(DegreeName.orange, Stripes.Four);
		super.saveObject(degree020);

		Degree degree021 = new Degree(DegreeName.green, Stripes.None);
		super.saveObject(degree021);
		Degree degree022 = new Degree(DegreeName.green, Stripes.One);
		super.saveObject(degree022);
		Degree degree023 = new Degree(DegreeName.green, Stripes.Two);
		super.saveObject(degree023);
		Degree degree024 = new Degree(DegreeName.green, Stripes.Three);
		super.saveObject(degree024);
		Degree degree025 = new Degree(DegreeName.green, Stripes.Four);
		super.saveObject(degree025);

		Degree degree026 = new Degree(DegreeName.blue, Stripes.None);
		super.saveObject(degree026);
		Degree degree1 = new Degree(DegreeName.blue, Stripes.One);
		super.saveObject(degree1);
		Degree degree027 = new Degree(DegreeName.blue, Stripes.Two);
		super.saveObject(degree027);
		Degree degree028 = new Degree(DegreeName.blue, Stripes.Three);
		super.saveObject(degree028);
		Degree degree029 = new Degree(DegreeName.blue, Stripes.Four);
		super.saveObject(degree029);

		Degree degree030 = new Degree(DegreeName.purple, Stripes.None);
		super.saveObject(degree030);
		Degree degree031 = new Degree(DegreeName.purple, Stripes.One);
		super.saveObject(degree031);
		Degree degree032 = new Degree(DegreeName.purple, Stripes.Two);
		super.saveObject(degree032);
		Degree degree033 = new Degree(DegreeName.purple, Stripes.Three);
		super.saveObject(degree033);
		Degree degree034 = new Degree(DegreeName.purple, Stripes.Four);
		super.saveObject(degree034);

		Degree degree035 = new Degree(DegreeName.brown, Stripes.None);
		super.saveObject(degree035);
		Degree degree036 = new Degree(DegreeName.brown, Stripes.One);
		super.saveObject(degree036);
		Degree degree037 = new Degree(DegreeName.brown, Stripes.Two);
		super.saveObject(degree037);
		Degree degree038 = new Degree(DegreeName.brown, Stripes.Three);
		super.saveObject(degree038);
		Degree degree039 = new Degree(DegreeName.brown, Stripes.Four);
		super.saveObject(degree039);

		Degree degreeb1 = new Degree(DegreeName.black, Stripes.None);
		super.saveObject(degreeb1);
		Degree degreeb2 = new Degree(DegreeName.black1, Stripes.None);
		super.saveObject(degreeb2);
		Degree degreeb3 = new Degree(DegreeName.black2, Stripes.None);
		super.saveObject(degreeb3);
		Degree degreeb4 = new Degree(DegreeName.black3, Stripes.None);
		super.saveObject(degreeb4);
		Degree degreeb5 = new Degree(DegreeName.black4, Stripes.None);
		super.saveObject(degreeb5);
		Degree degreeb6 = new Degree(DegreeName.black5, Stripes.None);
		super.saveObject(degreeb6);
		Degree degreeb7 = new Degree(DegreeName.black6, Stripes.None);
		super.saveObject(degreeb7);
		Degree degreeb8 = new Degree(DegreeName.black7, Stripes.None);
		super.saveObject(degreeb8);
		Degree degreeb9 = new Degree(DegreeName.black8, Stripes.None);
		super.saveObject(degreeb9);
		Degree degreeb10 = new Degree(DegreeName.black9, Stripes.None);
		super.saveObject(degreeb10);


	}


	public void addmatype(){
		MaTypenew maTypenew1 = new MaTypenew("Karate", null);
		super.saveObject(maTypenew1);

		MaTypenew maTypenew2 = new MaTypenew("Arnis", null);
		super.saveObject(maTypenew2);

		MaTypenew maTypenew3 = new MaTypenew("KravMaga", null);
		super.saveObject(maTypenew3);

		MaTypenew maTypenew4 = new MaTypenew("Boxing", null);
		super.saveObject(maTypenew4);

		MaTypenew maTypenew5 = new MaTypenew("MMA", null);
		super.saveObject(maTypenew5);

		MaTypenew maTypenew6 = new MaTypenew("Bjj", null);
		super.saveObject(maTypenew6);

		MaTypenew maTypenew7 = new MaTypenew("Wresling", null);
		super.saveObject(maTypenew7);

		MaTypenew maTypenew8 = new MaTypenew("Sambo", null);
		super.saveObject(maTypenew8);

		MaTypenew maTypenew9 = new MaTypenew("Karate", null);
		super.saveObject(maTypenew9);

		MaTypenew maTypenew10 = new MaTypenew("Aikido", null);
		super.saveObject(maTypenew10);

		MaTypenew maTypenew11 = new MaTypenew("Judo", null);
		super.saveObject(maTypenew11);

		MaTypenew maTypenew12 = new MaTypenew("Ninjitsu", null);
		super.saveObject(maTypenew12);

		MaTypenew maTypenew13 = new MaTypenew("CMA", null);
		super.saveObject(maTypenew13);

		MaTypenew maTypenew14 = new MaTypenew("KongFu", null);
		super.saveObject(maTypenew14);

		MaTypenew maTypenew15 = new MaTypenew("ThaiBoxing", null);
		super.saveObject(maTypenew15);



	}

	public Set<SalType> allTypes = new HashSet<>();


	public void addSalaryType() throws HibernateException, SQLException {
		SalType salType1 = new SalType(SalTypeEnum.ByClass);
		SalType salType2 = new SalType(SalTypeEnum.ByHouer);
		SalType salType3 = new SalType(SalTypeEnum.ByMounth);
		SalType salType4 = new SalType(SalTypeEnum.ByWeek);
		SalType salType5 = new SalType(SalTypeEnum.ByYear);
		allTypes.add(salType1);
		allTypes.add(salType2);
		allTypes.add(salType3);
		allTypes.add(salType4);
		allTypes.add(salType5);

		for (SalType salType : allTypes) {
			super.saveObject(salType);
		}
	}
	
	public static void addInitialSuppliyer() {
		SuplierDaoImplement suplierDaoImplement = new SuplierDaoImplement();
		suplierDaoImplement.addSuppliyerWithHibernate((short)1,(short) 1,(short) 1,(short) 1,(short) 1,(short) 0,(short) 0,(short) 0,(short) 0,(short) 0,(short) 0, 564, "Hen", "036316123", "0542689621", "http://www.mao.com", "maoservices@mao.com", "ginat egoz", null, "pardes hana", "Israel", "Center", 8854715);
	}
	
	
	public static void addInitiaEmployee() {
		Date date = new Date();
		date.setTime(1497096009);
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		employeeDaoImpl.addEmployee(SalTypeEnum.ByClass, "Vingate", DegreeName.black1,Stripes.None, "Karate", "",343f, date, "harduf36", "hatzav", "23", 34234, "TelAviv", "Israel",date, date, "234234", "Toni Manda", "789789", "tonimanda@gmail.com", "");
	
	}

}


