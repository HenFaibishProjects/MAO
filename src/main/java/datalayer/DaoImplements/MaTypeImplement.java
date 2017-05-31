package datalayer.DaoImplements;

import java.util.Date;

import businessObjects.additionalData.otherContents.MaTypenew;
import datalayer.DaoInterfaces.MaTypeDao;
import datalayer.DbConnections.HibernateStructInfo;

public class MaTypeImplement  extends HibernateStructInfo  implements MaTypeDao{
	
	
	@Override
	public void addMaTypenew(int val , String valstring , Date date , String description)
	{
		MaTypenew matype = new MaTypenew (val,valstring,date, description);
        super.saveObject(matype); 
	}

	@Override
	public void changeMaNamebyId(int val, String valstring) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeMaDescriptionbyId(int val, String description) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMAbyId(int val) {
		// TODO Auto-generated method stub
		
	}



}
