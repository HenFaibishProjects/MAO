package businessObjects.additionalData.otherContents;

public enum MATypes {

	 Bjj ("Bjj")
	,ThaiBoxing ("ThaiBoxing")
	,Judo ("Judo")
	,Ningitsu ("Ningitsu")
	,Arnis ("Arnis")
	,MMA ("MMA")
	,OpenMath ("OpenMath");

	   private String name;       

	    private MATypes(String s) {
	        name = s;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	
	
	
}
