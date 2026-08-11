package JavaInterviewQ;

import java.util.Collections;
import java.util.HashSet;

public class findnohashset {
	public static void main(String[] args) {
		  int[] arr = {2,3,4,6,7,9};
		
		int last =9;
		int first =2;
		
		HashSet<Integer> set = new HashSet<>();
		
		for( int r :arr) {
			set.add(r);
			
		}
		for(int i =first;i<=last; i++) {
			if(!set.contains(i)) {
				
				System.out.println(i);
				
				
			}
			
		}
		
	 

		
	}

}
