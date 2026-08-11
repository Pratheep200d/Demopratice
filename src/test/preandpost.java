package test;

public class preandpost {
	public static void main(String args[]) {

       
		int two =1;
		int three = 0;
		int max= (two >three)?two: three;
		System.out.println(max);
		
		int one=3;
		int max1=(two>three && two>one)?two:(three>one&&three>one)?three:one;
		
		System.out.println(max1);

	}

}
