package busproject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class booking {
 private String name;
 private int busNo;
 private Date date;
              Scanner input = new Scanner(System.in);
        booking () {
    	   System.out.println("enter your name : ");
    	   String name = input.nextLine();
    	   System.out.println("enter your bus number : ");
    	   int busNo = input.nextInt();
    	   System.out.println("enter the date in dd-MM-yyyy");
    	   String dateformat = input.next();
    	   SimpleDateFormat simple = new SimpleDateFormat("dd-MM-yyyy");
    	   
    	  try {
			date  =  simple.parse(dateformat);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
       }
        
       public boolean isavialbe(ArrayList<bus> buses, ArrayList<booking> bookings){
    	   int cap=0;    	   
         for(bus b1:buses){
        	 if(b1.getbusno() == busNo);
        	 cap = b1.getCapactiy();
         }
        	int count =0;
         for(booking b2:bookings) {
        	 if(b2.busNo == busNo && b2.date.equals(date)) {
        		 count++;
         }
        	 
        }
 return count < cap?true:false;
}
}
