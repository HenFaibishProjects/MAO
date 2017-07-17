package com.Mao.BackEndDev.datalayer.InitialsNecessaryData;

import java.util.ArrayList;
import java.util.List;

import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Arrivefrom;
import com.Mao.BackEndDev.datalayer.DbConnections.HibernateStructInfo;

public class ArriveFromImplement extends HibernateStructInfo{

	public List <String>places = new ArrayList<String>();
	Arrivefrom arrivefrom;

	public void initialData() {
		places.add("Flyer");
		places.add("Friend");
		places.add("InternetGoogle");
		places.add("InternetWebSite");
		places.add("Other");
		places.add("Show");

	}


	   public void addDefaultArriveFromWithHibernate()
    	{		
		for (int counter = 0; counter < places.size(); counter++) {
			arrivefrom = new Arrivefrom(places.get(counter)); 
			super.saveObject(arrivefrom); 
		 }
		}

		public void addSpecificArriveFromWithHibernate(String name)
		{		
			arrivefrom = new Arrivefrom(name); 
			super.saveObject(arrivefrom); 

		}

	}
