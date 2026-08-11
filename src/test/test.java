package test;
import java.util.Scanner;

import test.Expception.genderexpception;
public class test {
	

    public static void main(String args[]) {
    	String b = "male";
    	String c = "female";

    	Scanner scanner = new Scanner(System.in);
    	System.out.println("enter the name");
    	String name = scanner.next();
    	System.out.println("enter the gender: male or female");
    	String sex = scanner.next();
        try {
    	if(b.equalsIgnoreCase(sex) )
        {
        	System.out.println("your eligible");
        }
        else if(c.equalsIgnoreCase(sex)) {
        	
        	System.out.println("your not eligible");

        }
        else {
        	test.genderexpception()
        	throw new genderexpception("fine");
        }
        	
       
        }
        catch(genderexpception G) {
        	System.out.println(G.getMessage());
        }
        finally {
        	System.out.println("fine");
        }
        
    }
    
}
