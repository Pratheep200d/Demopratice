package JavaInterviewQ;

public class sumforumal {

	  public static void main(String[] args) {
		  int[] arr = {1,2,3,4,6};
		  int n = 6; //size of the array 
		//int Expectsum = n*(n+1)/2; //1 to n one missing,
		int actualsum = 0;
		
		for(int ar : arr) {
			actualsum += ar;
			
		}
	
		int last =6;
		int first =1;
		
		 int Expectsum = n/2 *(last + first);		 

		
		System.out.println(Expectsum);
		System.out.println(actualsum);
		System.out.println( Expectsum -actualsum);
		//sum without without 1 .
		
	  }
	  

	  
	  
	  
	}


