package com.Mao.BackEndDev.businessObjects.Materials.itemsEnums;

public enum ItemList {
	
    Pants("Pants"),
    Shirts("Shirts"),
    Shoes("Shoes"),
	HeadProtectors("Head-Protectors"),
	TeethProtectors("TeethProtectors"),
	ChestProtectors("ChestProtectors"),
	GroinProtectors("GroinProtectors"),
	LegsProtectors("LegsProtectors"),
	Vitamins("Vitamins"),
	PainKillers("PainKillers"),
	Suites("Suites"),
	Belts("Belts"),
    BoxingGloves("BoxingGloves"),
    BagsGloves("BagsGloves"),
    warpsGloves("warpsGloves"),
    MMAGloves("MMAGloves"),
	MMaTrainingGloves("MMaTrainingGloves");
	
 

    private ItemList(final String string) {
        this.string = string;
    }

    private final String string;

    public String getColor() {
        return string;
    }
}


