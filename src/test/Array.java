package test;
import java.util.*;
public class Array {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int arr[] = new int[4];
		System.out.println("tejesh please enter the 4 value");
		
		for(int k=0;k<arr.length;k++) {
		arr[k] =input.nextInt();
		}
		
		
		for (int a : arr) {
			System.out.println("the value are " + a);
		}
		/*for (int i=0;i<arr.length;i++) {
			System.out.println("enter number are : " + arr[i]);
			
		}*/
		 
		
		
		
		
	}

}
