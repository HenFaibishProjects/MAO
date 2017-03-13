package items;

	public enum EnumColor {
	    GREY("GREY"),
	    RED("RED"),
	    GREEN("GREEN"),
	    PURPLE("PURPLE"),
	    LIGHTBLUE ("LIGHTBLUE");    

	    private EnumColor(final String string) {
	        this.string = string;
	    }

	    private final String string;

	    public String getColor() {
	        return string;
	    }
	}


