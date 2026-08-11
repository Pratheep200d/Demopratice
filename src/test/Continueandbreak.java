package test;

public class Continueandbreak {
public static void main(String args[]) {
	outer:
	for (int i = 0;i<10;i++) {
		inner:
		for(int j=0;j<5;j++) {
		   if(j==2) {
			break  ;
		}
		System.out.println("hI" +   i + j);
		}
		
	}
	
	
}
}
