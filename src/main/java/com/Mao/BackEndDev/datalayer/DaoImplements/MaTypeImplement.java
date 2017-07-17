package com.Mao.BackEndDev.datalayer.DaoImplements;

import java.util.Date;

import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.MaTypenew;
import com.Mao.BackEndDev.datalayer.DaoInterfaces.MaTypeDao;
import com.Mao.BackEndDev.datalayer.DbConnections.HibernateStructInfo;

public class MaTypeImplement  extends HibernateStructInfo  implements MaTypeDao{
	
	
	@Override
	public void addMaTypenew(int val , String valstring , Date date , String description)
	{
		MaTypenew matype = new MaTypenew (valstring,description);
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
