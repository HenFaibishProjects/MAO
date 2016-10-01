package people;


import java.util.ArrayList;
import java.util.Scanner;


public enum Continent {


	Eurpo("sunday") , NAmerica("monday") , SAmerica("tuesday") , Asia("tuesday") , Africa("tuesday"), Australia("tuesday");
	
	
	   private final String name;
	   public static ArrayList<Continent> continent = new ArrayList<Continent>();
	   
	   
	   
	 		static String setByScannerContinentString() {
	 			
	 	    	Scanner in = new Scanner(System.in);
	 	    	String continentString;
	 	    	continentString = in.next();  
	 	        return continentString;
	 	}
	 		
	 		
	    private Continent(String name) {
	        this.name = name;
	    }

		public static ArrayList<Continent> getContinent() {
			return continent;
		}

		public static void setContinent(ArrayList<Continent> continent) {
			Continent.continent = continent;
		}

		public String getName() {
			return name;
		}


}
