package com.Mao.BackEndDev;

import java.util.Date;

import org.testng.annotations.DataProvider;

import com.Mao.BackEndDev.businessObjects.Materials.itemsContect.ItemtsColors;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.AdditionalToItemColor;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumCatergoty;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumColor;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumItemList;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumsizesItems;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Degree;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.DegreeName;
import com.Mao.BackEndDev.businessObjects.additionalData.otherContents.Stripes;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Durationmembership;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.ParticipateClasses;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.SalTypeEnum;

public class DataPoviderInitialValues {



	@DataProvider(name = "customers")
	public static Object[][] addingCustomers() throws Exception {
		Date date = new Date();
		date.setTime(1497096009);
		Degree degree = new Degree(DegreeName.black, Stripes.None);
		return new Object[][] {
			{
				"Lea-David", "", "Haifa", 2342342, "Haifa-Krayot", "Israel", "234234234423", "Roy.Dekel@solaredge.com", "MR", "Male", "Roy", "TheRock", "Dekel", "052-858745847", degree, Stripes.None, "An exemple Customer", Durationmembership.Semester, date, ParticipateClasses.TwoTimesPerWeek, "An exemple Customer", date, date, 178, 85f, 160, 80, 85, 18f},
		};
	}

	@DataProvider(name = "employees")
	public static Object[][] addingEmployees() throws Exception {
		Date date = new Date();
		date.setTime(1497096009);
		return new Object[][] {

			{"harduf 36", "hatzav", "TelAviv", 34234, "Center", "Israel", "3321414123", "tonimanda@gmail.com", "Miss",   "Femail", "Toni", "Laura", "Manda", "052-52525252", DegreeName.black1,Stripes.None, "Exemple-Employee", "Karate", "test The System",  "GCenter", SalTypeEnum.ByHouer, 85f, date, date, date},
			{"dardan 80", "etzyon", "Haifa",   2232,  "North",  "Israel", "3321414113", "elilevi@gmail.com",   "Mister", "Mail",   "Eli",   " " ,   "Levi",  "052-52525252", DegreeName.black2,Stripes.None, "Exemple-Employee", "Bjj",     "test The System", "GCenter", SalTypeEnum.ByClass, 180f, date, date, date},
		};
	}


	@DataProvider(name = "addItems")
	public static Object[][] addItems() throws Exception {
		Date date = new Date();
		date.setTime(1497096009);
		return new Object[][] {
			{ EnumItemList.BagsGloves,"GlovesPro","DR4","JVX",date,"FSD323SAD",35.5f,EnumCatergoty.Amature,"comment1",36,20f,30f,1.6f,"Israel",EnumColor.PURPLE.toString(),AdditionalToItemColor.logo.toString()}
		};
	}  



	@DataProvider(name = "addAnotherColorToTheItem")
	public static Object[][] addAnotherColorToTheItem() throws Exception {
		return new Object[][] {
			{  "FSD323SAD",AdditionalToItemColor.logo.toString(),EnumColor.GREY.toString()}
		};
	} 

	@DataProvider(name = "addSizeToItem")
	public static Object[][] addSizeToItem() throws Exception {
		return new Object[][] {
			{"FSD323SAD", EnumsizesItems.A4.toString(),"notes",}
		};
	} 
}
