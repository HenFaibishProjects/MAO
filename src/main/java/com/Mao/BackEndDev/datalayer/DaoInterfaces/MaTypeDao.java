package com.Mao.BackEndDev.datalayer.DaoInterfaces;

import java.util.Date;

public interface MaTypeDao {
	
	void addMaTypenew(int val , String valstring , Date date , String description);
	
	void changeMaNamebyId(int val,String valstring);
	
	void changeMaDescriptionbyId(int val,String description);
	
	void deleteMAbyId(int val);


}
