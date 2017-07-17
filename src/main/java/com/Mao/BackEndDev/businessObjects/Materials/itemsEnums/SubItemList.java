package com.Mao.BackEndDev.businessObjects.Materials.itemsEnums;

public enum SubItemList {
	
    Pants("Pants"),
    Shirts("Shirts"),
    Shoes("Shoes"),
	Protectors("Head-Protectors"),
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
	
	
 

    private SubItemList(final String string) {
        this.string = string;
    }

    private final String string;

    public String getColor() {
        return string;
    }
}


