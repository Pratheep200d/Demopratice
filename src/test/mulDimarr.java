package test;
import java.util.*;
public class mulDimarr {
	public static void main (String args[]) {
		int mark[][] =new int[2][4];
		Scanner input = new Scanner(System.in);
		
	
		System.out.println("enter the no. 3 std and  their 5 mamrks");
		for(int i=0;i<mark.length;i++) {
			for(int j=0;j<mark[i].length;j++) {
				System.out.println("enter  mark ");

				mark[i][j]= input.nextInt();
				
			}
			if(i==mark.length-1) {
         		 continue;
			}
			System.out.println("enter for next student");

		}
		
		for(int m[] :mark) {
			System.out.print("the work around ");                                                                                                             
			for(int n:m) {
				System.out.print( n+"," );
			}
			
			System.out.println();
		}
		input.close();
	}

}
