package JavaInterviewQ;


import java.util.*;
import java.util.stream.Collectors;

public class sortthenumber {
public static void main(String[] args) {
	int[] arr= {9,6,4,5,63};
	
	List<Integer> intte = Arrays.stream(arr).boxed().collect(Collectors.toList());
	
	// for (int g :arr) {
		// intte.add(g);
		 
	 //}
	int value = Collections.max(intte);
	int min = Collections.min(intte);
//	Collections.sort(intte);
	Collections.reverse(intte);
	//Collections.sort(intte,Collections.reverseOrder());
	
	
	System.out.println(value);
	System.out.println(min);
	
	for(int tt : intte){
		System.out.println(tt);
		
	}
	
}
}
