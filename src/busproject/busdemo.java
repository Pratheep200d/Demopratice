package busproject;
import java.util.*;
public class busdemo {
	public static void main(String args[]) {
		ArrayList<bus> buses = new ArrayList<>();
		buses.add(new bus(1,true,5));
		buses.add(new bus(2,true,4));
		buses.add(new bus(3,true,1));
		ArrayList<booking> bookings = new ArrayList<>();
        for(bus b:buses) {
         b.displaybusinfo();
        }
		
		Scanner input = new Scanner(System.in);
		int user =1;
		while(user==1) {
		System.out.println("enter 1 to continue booking or 2 to exit");
	       user = input.nextInt();
	      if(user ==1 ) {
	    	  booking b = new booking();
	    	  if(b.isavialbe(buses,bookings)) {
	    		  bookings.add(b);
	    		  System.out.println("ur booking confirm");
	    	  }
	    	  else System.out.println("soory the ticket is full");
	      }
	      else System.out.println("thanks for booking");
		}

}
}
