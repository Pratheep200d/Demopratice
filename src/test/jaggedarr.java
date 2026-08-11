package test;
import java.util.*;

public class jaggedarr {
public static void main (String args[]) {
	int a[][] = new int[3][];  //we assigning the row and cloumns are not definied 
/* a[0]= new int[2];
	a[1]= new int[3];
	a[2]= new int[4];
	*/
	Scanner input = new Scanner(System.in);
	for(int i=0;i<a.length;i++) {
	       System.out.println( "enter the no.pass sub for student");
	       int clo = input.nextInt();
	       a[i] = new int [clo];
	}
	for(int i=0;i<a.length;i++) {
		
		for(int j=0;j<a[i].length-1;j++) {
			 a[i][j]= (int)(Math.random()*10);
		}
	}
	
	
	for(int arr[]:a) {
			System.out.print(Arrays.toString(arr) + " ");   //		for(int an:arr) {   }

		}
		System.out.println();
	}
	
	
}

