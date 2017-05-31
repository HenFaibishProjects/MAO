package businessObjects.Materials.itemsContect;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import businessObjects.Materials.itemsEnums.EnumCatergoty;
import businessObjects.Materials.itemsEnums.EnumColor;
import businessObjects.Materials.itemsEnums.EnumsizesItems;
import businessObjects.Materials.itemsEnums.ItemList;
import businessObjects.Materials.itemsEnums.SubItemList;

public abstract class Items {

	static int itemnomber;
	SubItemList subitemlist;
	ItemList ietmlist;
	String name;
	String model;
	String manufacturer;
	Date firstArrived;
	String barode;
	float purchesPrice;
	float marketPrice;
	List<Integer> supliyerShops = new ArrayList<Integer>();
	List<EnumColor> colors = new ArrayList<EnumColor>();
	List<EnumsizesItems> size = new ArrayList<EnumsizesItems>();
	float weight;
	EnumCatergoty category;
	String comments;
	int mounthsWarrenty;
	int acceptetPayments;
	LenthSize lenthSize;
	String madeIn;
	boolean onStock;
	
	
	public Items(SubItemList subitemlist, ItemList ietmlist, String name, String model, String manufacturer,
			Date firstArrived, String barode, float purchesPrice, float marketPrice, List<Integer> supliyerShops,
			List<EnumColor> colors, List<EnumsizesItems> size, float weight, EnumCatergoty category, String comments,
			int mounthsWarrenty, int acceptetPayments, LenthSize lenthSize, String madeIn, boolean onStock) {
		super();
		this.subitemlist = subitemlist;
		this.ietmlist = ietmlist;
		this.name = name;
		this.model = model;
		this.manufacturer = manufacturer;
		this.firstArrived = firstArrived;
		this.barode = barode;
		this.purchesPrice = purchesPrice;
		this.marketPrice = marketPrice;
		this.supliyerShops = supliyerShops;
		this.colors = colors;
		this.size = size;
		this.weight = weight;
		this.category = category;
		this.comments = comments;
		this.mounthsWarrenty = mounthsWarrenty;
		this.acceptetPayments = acceptetPayments;
		this.lenthSize = lenthSize;
		this.madeIn = madeIn;
		this.onStock = onStock;
	}


	public static int getItemnomber() {
		return itemnomber;
	}


	public static void setItemnomber(int itemnomber) {
		Items.itemnomber = itemnomber;
	}


	public SubItemList getSubitemlist() {
		return subitemlist;
	}


	public void setSubitemlist(SubItemList subitemlist) {
		this.subitemlist = subitemlist;
	}


	public ItemList getIetmlist() {
		return ietmlist;
	}


	public void setIetmlist(ItemList ietmlist) {
		this.ietmlist = ietmlist;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public Date getFirstArrived() {
		return firstArrived;
	}


	public void setFirstArrived(Date firstArrived) {
		this.firstArrived = firstArrived;
	}


	public String getBarode() {
		return barode;
	}


	public void setBarode(String barode) {
		this.barode = barode;
	}


	public float getPurchesPrice() {
		return purchesPrice;
	}


	public void setPurchesPrice(float purchesPrice) {
		this.purchesPrice = purchesPrice;
	}


	public float getMarketPrice() {
		return marketPrice;
	}


	public void setMarketPrice(float marketPrice) {
		this.marketPrice = marketPrice;
	}


	public List<Integer> getSupliyerShops() {
		return supliyerShops;
	}


	public void setSupliyerShops(List<Integer> supliyerShops) {
		this.supliyerShops = supliyerShops;
	}


	public List<EnumColor> getColors() {
		return colors;
	}


	public void setColors(List<EnumColor> colors) {
		this.colors = colors;
	}


	public List<EnumsizesItems> getSize() {
		return size;
	}


	public void setSize(List<EnumsizesItems> size) {
		this.size = size;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	public EnumCatergoty getCategory() {
		return category;
	}


	public void setCategory(EnumCatergoty category) {
		this.category = category;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public int getMounthsWarrenty() {
		return mounthsWarrenty;
	}


	public void setMounthsWarrenty(int mounthsWarrenty) {
		this.mounthsWarrenty = mounthsWarrenty;
	}


	public int getAcceptetPayments() {
		return acceptetPayments;
	}


	public void setAcceptetPayments(int acceptetPayments) {
		this.acceptetPayments = acceptetPayments;
	}


	public LenthSize getLenthSize() {
		return lenthSize;
	}


	public void setLenthSize(LenthSize lenthSize) {
		this.lenthSize = lenthSize;
	}


	public String getMadeIn() {
		return madeIn;
	}


	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}


	public boolean isOnStock() {
		return onStock;
	}


	public void setOnStock(boolean onStock) {
		this.onStock = onStock;
	}


	
	
}
