package test;
import java.util.*;
public class While {
	
public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.println("please enter the password");
	String entered = input.nextLine().toLowerCase();
	String password ="134hava";
	while(!password.equals(entered)) {
   System.out.println("enbter correct password");
	 entered = input.nextLine().toLowerCase();
	}
	
	System.out.println("you password is correct");
}

}
