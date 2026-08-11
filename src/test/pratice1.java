package test;
import java.util.Scanner;
public class pratice1 {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.err.println("enter name the day");
		String day = input.nextLine().toLowerCase();
		switch(day){
			case "monday","tuesday","wednesday","thurday","friday"->
			System.err.println("it is weekday");
			case "saturday","sunday"->System.err.println("it is weekend day");
			default->System.err.println("it is invalid day");
			
		}
	}

}
