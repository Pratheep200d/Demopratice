package atm;
import java.util.*;

public class Excuetion {
	private String name;
	private int pin ;
	
	Scanner input = new Scanner(System.in);

	Excuetion(){
		System.out.println("enter the name");
		 name = input.next();
		System.out.println("enter the pin");
		 pin = input.nextInt();
		
	}
	void Excuetionx(){
		System.out.println("enter the name");
		
		
	}
	public  void check( ArrayList<DetailCollection> ED ) {
	 for(DetailCollection D1: ED) {
		 boolean found = false;
		 if(D1.getName().equalsIgnoreCase(name)&& D1.getPassword()== pin) {
		System.out.println("you have this much cash : " + D1.getCash());
		found = true;
		break;
		
		 }
		 if(!found) {
			 System.out.println("your password is wrong");
		 }
		 
	 }
		
		
		
	}

}
