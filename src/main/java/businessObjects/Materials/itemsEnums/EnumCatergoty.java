package businessObjects.Materials.itemsEnums;

public enum EnumCatergoty {
	
    Amature("GREY"),
    Standart("RED"),
    Pro("professional");
 

    private EnumCatergoty(final String string) {
        this.string = string;
    }

    private final String string;

    public String getColor() {
        return string;
    }
}
