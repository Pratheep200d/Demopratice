package test;

public class Fibonacci {
	
	
	static int fib(int a) {
		if(a == 0 )
			return 0;
		else if(a==1) {
			return 1;
		}
		return fib(a -1) + fib(a-2);
		
	}
	public static void main(String args[]) {
		int p =6;
		System.out.println(fib(p));
	}

}
