package atm;
import java.util.*;

public class Interface {
 public static void main(String args[]) {
	 
	Scanner input = new Scanner(System.in);
	ArrayList<Excuetion> ex = new ArrayList<Excuetion>();
	
	ArrayList<DetailCollection> dc = new ArrayList<DetailCollection>();
	dc.add(new DetailCollection("Pratheep",2002,50000));
	dc.add(new DetailCollection("Subin",2001,30000));
	dc.add(new DetailCollection("dadboy",1234,100000));

	
	Excuetion e = new Excuetion();	
	e.check ( dc) ;
	
	

 }
}
