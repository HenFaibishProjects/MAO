package com.Mao.BackEndDev.datalayer.DaoImplements;

import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.Mao.BackEndDev.businessObjects.Materials.itemsContect.Items;
import com.Mao.BackEndDev.businessObjects.Materials.itemsContect.LenthSize;
import com.Mao.BackEndDev.businessObjects.Materials.itemsContect.Stock;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumCatergoty;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.ItemList;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Employee;
import com.Mao.BackEndDev.businessObjects.hr.PeopleContent.Salary;
import com.Mao.BackEndDev.datalayer.DbConnections.HibernateStructInfo;

public class ItemsImplement extends HibernateStructInfo  {

	static final Logger LOG = LoggerFactory.getLogger(ItemsImplement.class);
	public Items items;
	public LenthSize lenthSize;
	Stock stock;

	public Items getUniqueObjectResultByBarCode(String barCode){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Items.class);
		criteria.add(Restrictions.eq("barCode", barCode));
		return (Items) criteria.uniqueResult();

	}


	public LenthSize getUniqueObjectResultByBarCodeLenthSize(String barCode){  
		beginTranscation();
		Criteria criteria = session.createCriteria(Items.class);
		Criteria criteriaLenthSize = session.createCriteria(LenthSize.class);
		criteria.add(Restrictions.eq("barCode", barCode));
		Items tmp = (Items) criteria.uniqueResult();
		int tmpAddIdInt = tmp.getLenthSize().getLenthSizeID();
		criteriaLenthSize.add(Restrictions.eq("lenthSizeID" ,tmpAddIdInt));
		return (LenthSize) criteriaLenthSize.uniqueResult();

	}
	

	public Stock getUniqueObjectStockResultByItemId(String barCode){  
		beginTranscation();
		Criteria criteriaItems = session.createCriteria(Items.class);
		Criteria criteriaStock = session.createCriteria(Stock.class);
		criteriaItems.add(Restrictions.eq("barCode", barCode));
		Items tmp = (Items) criteriaItems.uniqueResult();
		int tmpAddIdInt = tmp.getItemnumber();
		criteriaStock.add(Restrictions.eq("stockId", tmpAddIdInt));
		return (Stock) criteriaStock.uniqueResult();
                  
	}

	public void addItems(ItemList subitemlist, String name, String model, String manufacturer,
			Date firstArrived, String barCode,  
			float weight, EnumCatergoty category, String comments,
			int mounthsWarrenty, float width, float length, float height, String madeIn)
	{
		LenthSize lenthSize = new LenthSize(width, length, height);
		Items items = new Items(subitemlist, name, model, manufacturer, firstArrived, barCode, weight, category, comments, mounthsWarrenty, lenthSize, madeIn);
		super.saveObject(items);
		items = getUniqueObjectResultByBarCode(barCode);
		Stock stock = new Stock(items, 0, 0);
		super.saveObject(stock);
	}


	public void setsubitemlist(String barCode,ItemList subitemlist){
		items = getUniqueObjectResultByBarCode(barCode);
		items.setSubitemlist(subitemlist);
		saveObject(items);

	}
	public void setName(String barCode, String name){
		items = getUniqueObjectResultByBarCode(barCode);
		items.setName(name);
		saveObject(items);

	}
	public void setModel(String barCode,String model){
		items = getUniqueObjectResultByBarCode(barCode);
		items.setModel(model);
		saveObject(items);

	}
	public void setManufacturer(String barCode,String manufacturer){
		items = getUniqueObjectResultByBarCode(barCode);
		items.setManufacturer(manufacturer);
		saveObject(items);

	}

	public void setMounthsWarrenty(String barCode,int mounthsWarrenty){
		items = getUniqueObjectResultByBarCode(barCode);
		items.setMounthsWarrenty(mounthsWarrenty);
		saveObject(items);
	}
	public void setWeight(String barCode,float weight){
		items = getUniqueObjectResultByBarCode(barCode);
		items.setWeight(weight);
		saveObject(items);

	}
	public void setWidth(String barCode,float width){
		lenthSize = getUniqueObjectResultByBarCodeLenthSize(barCode);
		lenthSize.setWidth(width);
		saveObject(lenthSize);
	}

	public void setLength(String barCode,float length){
		lenthSize = getUniqueObjectResultByBarCodeLenthSize(barCode);
		lenthSize.setLength(length);
		saveObject(lenthSize);
	}

	public void setHeight(String barCode,float height){
		lenthSize = getUniqueObjectResultByBarCodeLenthSize(barCode);
		lenthSize.setHeight(height);
		saveObject(lenthSize);
	}

	public void setCategory(String barCode,EnumCatergoty category){
		items = getUniqueObjectResultByBarCode(barCode);
		items.setCategory(category);
		saveObject(items);
	}

	public void setMadeIn(String barCode, String madeIn){
		items = getUniqueObjectResultByBarCode(barCode);
		items.setMadeIn(madeIn);
		saveObject(items);
	}

	public void setComments(String barCode, String comments){
		items = getUniqueObjectResultByBarCode(barCode);
		items.setComments(comments);
		saveObject(items);

	}

	public void removePurchase(String barCode){
		items = getUniqueObjectResultByBarCode(barCode);
		stock = getUniqueObjectStockResultByItemId(barCode);
		if (stock.getQuantity()>0)
		{
			LOG.debug("trying to delete the current item but Inventory not sold out");
		}
		else {
			session.delete(items);
			LOG.debug("Product is out of stock and has been deleted");
		}
		

	}
}    
