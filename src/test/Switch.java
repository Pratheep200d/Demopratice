package test;

public class Switch {
	public static void main(String args[]) {
	String fruit = "apple";
	switch (fruit) {
	      case "apple":
	    	  System.err.println("a apple keep a droctor awat");
	    	  break;
	      case "orang":
	    	  System.err.println("fruit is fine");
	    	  break;
	    default:
	    	System.err.println("it i fruit");
	    	
	    	
	      
	    	  
	}
	
	
	switch (fruit) {
	case "apple","mango" -> System.err.println("family faviouirte ");
	case "goa"->System.err.println("son");
	default -> System.err.println("none");
	}
	}

}
