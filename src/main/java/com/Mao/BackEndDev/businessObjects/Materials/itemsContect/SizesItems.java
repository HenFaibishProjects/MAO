package com.Mao.BackEndDev.businessObjects.Materials.itemsContect;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.AdditionalToItemColor;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumColor;
import com.Mao.BackEndDev.businessObjects.Materials.itemsEnums.EnumsizesItems;

@Entity
@Table(name = "SizesItems")
public class SizesItems {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int itemtsColorId;
	private EnumsizesItems color;
	private String  notes;


	public SizesItems() {

	}

	public SizesItems(EnumsizesItems color, String notes) {
		super();
		this.color = color;
		this.notes = notes;
	}
	public int getItemtsColorId() {
		return itemtsColorId;
	}

	public EnumsizesItems getColor() {
		return color;
	}
	public void setColor(EnumsizesItems color) {
		this.color = color;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}







}