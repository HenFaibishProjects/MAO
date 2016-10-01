package people;

import java.util.ArrayList;
import java.util.Scanner;

public enum Curency {


	Dollars("dollars") , Shekel("nis") , Euro("euo") ;
	
	
	   private final String name;
	   public static ArrayList<Curency> curency = new ArrayList<Curency>();
	   

		static ArrayList<Curency> setByScannerCurency() {
			
	    	Scanner in = new Scanner(System.in);
	    	for(int i = 0;i < curency.size(); i++){
	        try {
	            String daysOfTheWeekString = in.next();
	            if( daysOfTheWeekString instanceof String )  
	            	continue;
	            }

	        catch (Exception e) {
	            System.out.println("You must choose a valid working day, Start Over");
	        }
	return curency;
	    	}
			return curency;}
		
		
		
	   
	    private Curency(String name) {
	        this.name = name;
	        
	    }

		public static ArrayList<Curency> getCurency() {
			return curency;
		}

		public static void setCurency(ArrayList<Curency> curency) {
			Curency.curency = curency;
		}

		public String getName() {
			return name;
		}
}
