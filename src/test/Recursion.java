package test; ///recursion means caling the emthod inside the method we need to provide proper stop for it 

public class Recursion {
	
	static int fact(int n) {
		if (n==0)
			return 1;
		else 
			return n *fact(n-1);
		
		
		
	}
public static void main (String arg[]) {
	 int q = 5;
	  System.out.println(fact(q));

	

 
 
 
 

 
}
}
