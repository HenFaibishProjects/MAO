package businessObjects.Materials.itemsEnums;

public enum ItemList {
	
	
    Pants("Clothes"),
    Shoes("Shoes"),
	Protectors("Protectors"),
	Hrebs("Hrebs"),
	Belts("Belts"),
	Gloves("Gloves");

	
	
 

    private ItemList(final String string) {
        this.string = string;
    }

    private final String string;

    public String getColor() {
        return string;
    }
}


