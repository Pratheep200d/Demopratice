package test;
import java.util.*;
public class Dowhile {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);
 int password =7;
 int  pass;
do {
	 System.out.println("enter the secret password");
	  pass= input.nextInt();
	  if (pass!=password) {
		  System.out.println("ur password is wrong");
	  }
      
}while (pass != password);
  System.out.println("password is correct");
}
}
