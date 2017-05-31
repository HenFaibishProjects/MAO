package datalayer.DaoImplements;


import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.HibernateException;
import businessObjects.hr.PeopleContent.SalType;
import businessObjects.hr.PeopleContent.SalTypeEnum;
import datalayer.DbConnections.HibernateStructInfo;

public class SalaryTypeImlement extends HibernateStructInfo  {
	SalTypeEnum types1 = SalTypeEnum.ByClass;

	SalType salType1 = new SalType(SalTypeEnum.ByClass);
	SalType salType2 = new SalType(SalTypeEnum.ByHouer);
	SalType salType3 = new SalType(SalTypeEnum.ByMounth);
	SalType salType4 = new SalType(SalTypeEnum.ByWeek);
	SalType salType5 = new SalType(SalTypeEnum.ByYear);

	public Set<SalType> allTypes = new HashSet<>();


	public void initialSet() throws HibernateException, SQLException
	{
		allTypes.add(salType1);
		allTypes.add(salType2);
		allTypes.add(salType3);
		allTypes.add(salType4);
		allTypes.add(salType5);
	}

	public void addSalTypeName() throws HibernateException, SQLException
	{
		initialSet();	
		for (SalType salType : allTypes) {
			super.saveObject(salType);
		}
	}
}



