package com.Mao.BackEndDev.businessObjects.Materials.itemsContect;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumColor;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.AdditionalToItemColor;

@Entity
@Table(name = "ItemtsColors")
public class ItemtsColors {

	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int itemtsColorId;
	private EnumColor color;
	private AdditionalToItemColor AdditionalToItemColor;
	
	
	
	
	public ItemtsColors(EnumColor color,AdditionalToItemColor additionalToItemColor) {
		super();
		this.color = color;
		AdditionalToItemColor = additionalToItemColor;
	}
	
	public ItemtsColors() {
		
	}

	public int getItemtsColorId() {
		return itemtsColorId;
	}

	public void setItemtsColorId(int itemtsColorId) {
		this.itemtsColorId = itemtsColorId;
	}

	public EnumColor getColor() {
		return color;
	}

	public void setColor(EnumColor color) {
		this.color = color;
	}

	public AdditionalToItemColor getAdditionalToItemColor() {
		return AdditionalToItemColor;
	}

	public void setAdditionalToItemColor(AdditionalToItemColor additionalToItemColor) {
		AdditionalToItemColor = additionalToItemColor;
	}
	
	
	
}
